package test.t01.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import test.t01.Service.UserService;
import test.t01.entity.User;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation(value = "test",notes = " this is my test")
    @RequestMapping(value ="/test",method = RequestMethod.POST)
    public List<User> getSth(){
        System.out.println("controller的结果："+userService.getSomething().get(0).getPassword());
        return userService.getSomething();
    }
}
