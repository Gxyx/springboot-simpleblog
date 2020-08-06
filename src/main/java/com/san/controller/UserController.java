package com.san.controller;


import com.san.common.lang.Result;
import com.san.entity.User;
import com.san.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sanqi
 * @since 2020-08-03
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Result test(@PathVariable("id") Long id){
        User user = userService.getById(id);
        return Result.succ(user);
    }


    @PostMapping("/save")
    public Object testUser(@Validated @RequestBody User user) {
        return user.toString();
    }

}
