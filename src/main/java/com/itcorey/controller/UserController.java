package com.itcorey.controller;

import com.itcorey.Service.IUserService;
import com.itcorey.domain.User;
import org.apache.commons.io.FileUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by ：Corey
 * 20:53 2018/11/5
 */
@Controller
@RequestMapping("/corey")
public class UserController {

    private static org.slf4j.Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService iUserService;
    // /corey/text?id=1
    @RequestMapping(value = "/text",method= RequestMethod.GET)
    public String getUserId(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        log.info("======>"+userId);
        User user = null;
        if (userId == 1){
            user = new User();
            user.setPassword(147288);
            user.setUserName("你瞅啥");
            user.setAge(18);
        }
        log.debug(user.toString());
        model.addAttribute("user", user);
        return "index";
    }

    //查询用户为1的用户
    @RequestMapping(value = "/show" ,method = RequestMethod.GET)
    public String toShowUser(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        log.info("用户信息id为"+userId);
        User userById = iUserService.getUserById(userId);
        log.debug(userById.toString());
        model.addAttribute("user", userById);
        return "showUser";
    }

    // /corey/showUser2?id=1
    @RequestMapping(value = "/showUser2", method = RequestMethod.GET)
    public String toIndex2(@RequestParam("id") String id, Model model) {
        int userId = Integer.parseInt(id);
        System.out.println("userId:" + userId);
        User user = iUserService.getUserById(userId);
        log.debug(user.toString());
        model.addAttribute("user", user);
        return "showUser";
    }

    // /corey/showUser3/{id}
    @RequestMapping(value = "/showUser3/{id}", method = RequestMethod.GET)
    public String toIndex3(@PathVariable("id") String id, Map<String, Object> model) {
        int userId = Integer.parseInt(id);
        System.out.println("userId:" + userId);
        User user = iUserService.getUserById(userId);
        log.debug(user.toString());
        model.put("user", user);
        return "showUser";
    }

    // /corey/{id}
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    User getUserInJson(@PathVariable String id, Map<String, Object> model) {
        int userId = Integer.parseInt(id);
        System.out.println("userId:" + userId);
        User user = iUserService.getUserById(userId);
        log.info(user.toString());
        return user;
    }

    // /user/jsontype/{id}
    @RequestMapping(value = "/jsontype/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserInJson2(@PathVariable String id, Map<String, Object> model) {
        int userId = Integer.parseInt(id);
        System.out.println("userId:" + userId);
        User user = iUserService.getUserById(userId);
        log.info(user.toString());
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }


    /**
     * 文件上传
     * @return
     */
    @RequestMapping(value = "/upload")
    public String showUploadPage() {
        return "user_admin/file";
    }


    /**
     * @param file
     * @returndoUploadFile
     * @throws IOException
     */
    @RequestMapping(value = "/doUpload", method = RequestMethod.POST)
    public String doUploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            log.info("Process file:{}", file.getOriginalFilename());
        }
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File("D:\\", System.currentTimeMillis() + file.getOriginalFilename()));
        return "succes";
    }

}
