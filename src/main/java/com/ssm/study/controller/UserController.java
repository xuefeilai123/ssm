package com.ssm.study.controller;
import com.alibaba.fastjson.JSON;
import com.ssm.study.domain.User;
import com.ssm.study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user-manage")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/query/{id}")
    @ResponseBody
    public Object query(@PathVariable("id") int id) {
        return JSON.toJSONString(userService.getUserById(id));
    }

    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        userService.deleteUserById(id);
    }
    @RequestMapping(value = "/update")
    public void update(@RequestBody User user) {
        userService.updateUserById(user);
    }
    @RequestMapping(value = "/add")
    public void add(@RequestBody User user) {
        userService.addUser(user);

    }

}
