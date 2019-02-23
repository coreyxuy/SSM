package com.itcorey.utils;

/**
 * Created by ：Corey
 * 17:47 2019/2/15
 * 潘多拉Utils
 */
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Daniel Wang
 * @date 2018/2/2
 */
public class panduolaUtils {
    private static final String URL_HOST = "http://dev-t.dpandora.cn/pandoraH5/#/op";
    private static final int URL_PORT = 443;
    private static final String APPLICATION_METHOD = "/application/op?code=";
    private static final String AUTH_METHOD = "/auth";

    /**
     * 发送post请求
     * @param path 访问url
     * @param authToken 授权码
     * @param paramJson 参数
     * @return string
     * @throws IOException e
     */
    private static String sendPost(String path, String authToken, String paramJson) throws IOException {
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.setUseCaches(false);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Connection", "Keep-Alive");
        conn.setRequestProperty("Charset", "UTF-8");
        byte[] data = paramJson.getBytes();
        conn.setRequestProperty("Content-Length", String.valueOf(data.length));
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Authorization", authToken);
        conn.connect();
        OutputStream out = conn.getOutputStream();
        out.write((data));
        out.flush();
        out.close();
        System.out.println(conn.getResponseCode());
        if(conn.getResponseCode() != 200){
            return null;
        }
        InputStream in = conn.getInputStream();
        byte[] dataRead = new byte[in.available()];
        int i = in.read(dataRead);
        String s = new String(dataRead);
        JSONObject resJson = JSON.parseObject(s);
        String re = resJson.toJSONString();
        System.out.println("i=["+i+"]re="+re);
        return re;
    }

    public static void main(String[] argv) throws IOException {
        String authToken = "<token>";
        String mobile = "13697773813";
        String idCardNo = "460003198401094652";
        String name = "麦梁优";
        String password = "123456";

        String appUrl = "https://"+URL_HOST+":"+URL_PORT+APPLICATION_METHOD+mobile;
        JSONObject appJsonObject = new JSONObject();
        appJsonObject.put("mobile", mobile);
        appJsonObject.put("id_card_no", idCardNo);
        appJsonObject.put("name", name);

        // 访问/application/<service_type>
        String appRe = sendPost(appUrl, authToken, appJsonObject.toString());
        if(appRe == null){
            return;
        }
        JSONObject jsonObject = JSON.parseObject(appRe);
        // 判断是否有业务逻辑错误
        if(jsonObject.containsKey("err_code")){
            System.out.println("err_code=["+jsonObject.get("err_code")+"]");
            System.out.println("err_msg=["+jsonObject.get("err_msg")+"]");
            return;
        }
        // 获取seq_no
        String seqNo = jsonObject.getString("seq_no");
        System.out.println("seq_no[" + seqNo + "]");
        if(seqNo == null || "".equals(seqNo)){
            return;
        }
        // 访问/auth
        String authUrl = "https://" + URL_HOST + ':' + URL_PORT + AUTH_METHOD;
        JSONObject authJsonObject = new JSONObject();
        authJsonObject.put("mobile", mobile);
        authJsonObject.put("password", password);
        authJsonObject.put("seq_no", seqNo);
        sendPost(authUrl, authToken, authJsonObject.toString());
    }
}
