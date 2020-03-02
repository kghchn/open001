package com.hubery.controller;

import com.hubery.common.RedisUtil;
import com.hubery.common.swagger.ResultCode;
import com.hubery.common.swagger.ResultMessage;
import com.hubery.entity.User;
import com.hubery.sevice.Impl.FilePathServiceImpl;
import com.hubery.sevice.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program hubery
 * @description: 用户管理
 * @author: kgh
 * @create: 2019/07/22 14:16
 */

@RestController
@Api(tags = "用户信息管理API")
public class UserController {
    @Resource
    private RedisUtil redisUtil;


    private final UserService userService;
    private final FilePathServiceImpl filePathServiceImpl;
    @Autowired
    public UserController(UserService userService,FilePathServiceImpl filePathServiceImpl){
        this.userService=userService;
        this.filePathServiceImpl=filePathServiceImpl;
    }

    @ResponseBody
    @PostMapping(value = "/login")
//    @ApiOperation(value = "接口管理", httpMethod = "POST")
    @ApiOperation("根据id获取用户信息")
    public ResultMessage login(@RequestBody String user) {
//        User loginUser = userServiceImpl.login(user);
        String test = "PostMapping :" + user;
        System.err.println(test);
        /** System.err.println(test);*/

        /** FilePath add  */
//        FilePath filePath = new FilePath();
//        filePath.setPath("/home/data/xy/2019/07/test.mp4");
//        filePath.setFileType(2);
//        filePath.setFileStatus(1);
        /* Integer integer = filePathService.addFilePath(filePath);*/
        /*System.err.println("integer:"+integer);*/
        return ResultMessage.success(user);
    }

    @ResponseBody
    @GetMapping(value = "/test")
    /** @RequestMapping(value = "/test",method= RequestMethod.GET)*/
//    @ApiOperation(value = "接口管理", httpMethod = "GET")
    @ApiOperation("根据id获取用户信息")
    public ResultMessage test(Long id) {
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name"));
//        System.out.println(System.getProperty("java.vendor.url"));
//        System.out.println("test");
//        boolean set = redisUtil.set("id_lisi", "lisi", 10);
//        System.out.println(set);
        String test = "Long : " + id;
        User user = userService.selectByPrimaryKey(id);
//        System.out.println("用户修改之前:"+user);
//        user.setUserEmail("test@hubery.com");
//        int i = userService.updateByPrimaryKeySelective(user);
//        System.out.println("修改条数"+"-----用户修改之后:"+user);
        if(user != null){
            return ResultMessage.success(user);
        }else {
            return ResultMessage.failure(ResultCode.RESULE_DATA_NONE);
        }

        //SqlSessionFactory
    }

}
