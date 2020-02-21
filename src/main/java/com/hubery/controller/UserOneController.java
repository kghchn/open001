package com.hubery.controller;

import com.hubery.common.ResultUtil;
import com.hubery.entity.ResulMsg;
import com.hubery.entity.UserOne;
import com.hubery.sevice.Impl.FilePathServiceImpl;
import com.hubery.sevice.Impl.UserOneServiceImpl;
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
@Api("请求方法")
public class UserOneController {

    private final UserOneServiceImpl userServiceImpl;
    private final FilePathServiceImpl filePathServiceImpl;

    @Autowired
    public UserOneController(UserOneServiceImpl userServiceImpl, FilePathServiceImpl filePathServiceImpl) {
        this.userServiceImpl = userServiceImpl;
        this.filePathServiceImpl = filePathServiceImpl;
    }

    @ResponseBody
    @PostMapping(value = "/login")
    @ApiOperation(value = "接口管理", httpMethod = "POST")
    public ResulMsg login(@RequestBody UserOne user) {
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
        return ResultUtil.success("请求成功",user);
    }

    @ResponseBody
    @GetMapping(value = "/test")
    /** @RequestMapping(value = "/test",method= RequestMethod.GET)*/
//    @ApiOperation(value = "接口管理", httpMethod = "GET")
    public ResulMsg test(String name) {
//        sleep(2000);
        String test = "Mapping : " + name;
        System.err.println(test);
        return ResultUtil.success("请求成功...",test);
        //SqlSessionFactory
    }

}
