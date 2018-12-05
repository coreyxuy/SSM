package com.itcorey.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;

/**
 * Created by ：Corey
 * 14:25 2018/12/5
 * 第三方解析数据
 */
public class jsonAnalysis {

    public static void main(String[] args) {
        String json = "{\n" +
                "  \"success\": true,\n" +
                "  \"data\": {\n" +
                "    \"code\": \"0\",\n" +
                "    \"desc\": \"查询成功\",\n" +
                "    \"trans_id\": \"14910304379231213\",\n" +
                "    \"trade_no\": \"201704011507240100057329\",\n" +
                "    \"fee\": \"Y\",\n" +
                "    \"id_no\": \"0783231bcc39f4957e99907e02ae401c\",\n" +
                "    \"id_name\": \"dd67a5943781369ddd7c594e231e9e70\",\n" +
                "    \"versions\": \"1.0.0\",\n" +
                "    \"result_detail\": {\n" +
                "      \"current_order_count\": \"12\",\n" +
                "      \"current_org_count\": \"8\",\n" +
                "      \"current_order_amt\": \"10000-20000\",\n" +
                "      \"current_order_lend_amt\": \"1000-4000\",\n" +
                "      \"totaldebt_detail\": [{\n" +
                "        \"totaldebt_order_count\": \"21\",\n" +
                "        \"totaldebt_date\": \"201711\",\n" +
                "        \"totaldebt_order_amt\": \"20000-40000\",\n" +
                "        \"new_or_old\": \"N\",\n" +
                "        \"totaldebt_org_count\": \"13\",\n" +
                "        \"totaldebt_order_lend_amt\": \"20000-40000\"\n" +
                "      },\n" +
                "        {\n" +
                "          \"totaldebt_order_count\": \"19\",\n" +
                "          \"totaldebt_date\": \"201710\",\n" +
                "          \"totaldebt_order_amt\": \"20000-40000\",\n" +
                "          \"new_or_old\": \"Y\",\n" +
                "          \"totaldebt_org_count\": \"13\",\n" +
                "          \"totaldebt_order_lend_amt\": \"20000-40000\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  },\n" +
                "  \"errorCode\": null,\n" +
                "  \"errorMsg\": null\n" +
                "}";

        JsonRootBean thirdJson = JSONObject.parseObject(json, new TypeReference<JsonRootBean>() {
        });

        JsonRootBean jsonRootBean = JSONObject.parseObject(json, JsonRootBean.class);

        System.out.println(thirdJson);

    }

}
