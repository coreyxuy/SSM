package com.itcorey;

import static org.junit.Assert.assertTrue;

import com.itcorey.Service.IUserService;
import com.itcorey.model.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class AppTest {

    private static Logger logger = org.apache.log4j.Logger.getLogger(AppTest.class);
    @Autowired
    private IUserService userService;

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
