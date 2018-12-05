package com.itcorey;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.itcorey.Service.IUserService;
import com.itcorey.dao.XyTotaldebtMapper;
import com.itcorey.model.User;
import com.itcorey.utils.JsonRootBean;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class AppTest {

    private static Logger logger = org.apache.log4j.Logger.getLogger(AppTest.class);
    @Autowired
    private IUserService userService;
    @Autowired
    private XyTotaldebtMapper xyTotaldebtMapper;


    /**
     * 查询用户信息
     */
    @Test
    public void getUserId() {
        int userId = 1;
        User userById = userService.getUserById(userId);
        System.out.println("用户"+userById.toString());
    }

    //添加用户信息
    @Test
    public void  addUser(){
        User user = new User();
        user.setAge(18);
        user.setPassword(123455);
        user.setUserName("小老弟..");
        int i = userService.insterUser(user);
        booleanUser(i);

    }

    //修改用户信息
    @Test
    public void updateUser(){
        User user = new User();
        user.setId(3);
        user.setUserName("徐勇平");
        user.setPassword(123434556);
        int i = userService.updateUser(user);
        booleanUser(i);
    }

    //删除用户信息
    @Test
    public void delUser(){
        int userId = 1;
        int i = userService.delUser(userId);
        booleanUser(i);
    }

    @Test
    public void jsonTest(){
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

        JsonRootBean thirdJson = JSONObject.parseObject(json, new TypeReference<JsonRootBean>() {});



    }










    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }


    private void booleanUser(int i) {
        if (i>0){
            System.out.println("成功-success......!");
        }else {
            System.out.println("失败.....");
        }
    }
}
