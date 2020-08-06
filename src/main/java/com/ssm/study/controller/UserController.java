package com.ssm.study.controller;
import com.alibaba.fastjson.JSON;
import com.ssm.study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

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
}
