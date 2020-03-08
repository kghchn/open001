package com.hubery.controller;

import com.alibaba.fastjson.JSONObject;
import com.hubery.common.swagger.ResultCode;
import com.hubery.common.swagger.ResultMessage;
import com.hubery.entity.User;
import com.hubery.sevice.Impl.FilePathServiceImpl;
import com.hubery.sevice.TokenService;
import com.hubery.sevice.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program hubery
 * @description: 用户管理
 * @author: kgh
 * @create: 2019/07/22 14:16
 */

@RestController
@Api(tags = "用户信息管理API")
public class UserController {

    private final UserService userService;
    private final TokenService tokenService;
    private final FilePathServiceImpl filePathServiceImpl;
    @Autowired
    public UserController(UserService userService,TokenService tokenService,FilePathServiceImpl filePathServiceImpl){
        this.userService=userService;
        this.tokenService=tokenService;
        this.filePathServiceImpl=filePathServiceImpl;
    }

    @ResponseBody
    @PostMapping(value = "/login")
//    @ApiOperation(value = "接口管理", httpMethod = "POST")
    @ApiOperation("根据id获取用户信息")
    public JSONObject login(@RequestBody User user) {
        JSONObject jsonObject=new JSONObject();
        User userForBase=userService.selectByPrimaryKey(user.getUserId());
        if(userForBase==null){
            jsonObject.put("message","登录失败,用户不存在");
            return jsonObject;
        }else {
            if (!userForBase.getUserPassword().equals(user.getUserPassword())){
                jsonObject.put("message","登录失败,密码错误");
                return jsonObject;
            }else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return jsonObject;
            }
        }

    }

//    @UserLoginToken
    @ApiOperation("根据id获取用户信息")
    @ResponseBody
    @RequestMapping(value = "/test",method= RequestMethod.GET)
    /** @RequestMapping(value = "/test",method= RequestMethod.GET)*/
//    @ApiOperation(value = "接口管理", httpMethod = "GET")
    public ResultMessage test(Long id) {
        User user = userService.selectByPrimaryKey(id);
        if(user != null){
            return ResultMessage.success(user);
        }else {
            return ResultMessage.failure(ResultCode.RESULE_DATA_NONE);
        }

    }

}
