package com.hubery.controller;

import com.hubery.common.swagger.ResultMessage;
import com.hubery.entity.User;
import com.hubery.sevice.FilePathService;
import com.hubery.sevice.NewsCenterService;
import com.hubery.sevice.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program
 * @description: 修改内容（所有的修改都从这儿开始）
 * @author: 
 * @create: 2019/07/24 14:49
 */

@RestController
@RequestMapping("/edit")
public class EditController {

    private final UserService userService;
    private final FilePathService filePathService;
    private final NewsCenterService newsCenterService;

    @Autowired
    public EditController(UserService userService , FilePathService  filePathService , NewsCenterService  newsCenterService ) {
        this.userService = userService ;
        this.filePathService  = filePathService ;
        this.newsCenterService  = newsCenterService ;
    }

    @ResponseBody
//    @GetMapping(value = "/editNewsCenter", produces = {"application/json;charset=UTF-8"})
    @RequestMapping(value = "/editNewsCenter" , method = RequestMethod.PUT)
    @ApiOperation(value = "Test-PUT-接口管理", httpMethod = "PUT")
    public ResultMessage editNewsCenter(@RequestBody User user) {
        System.out.println("user:"+user);
//        NewsCenter newsCenter = new NewsCenter();
//        newsCenter.setId(3);
//        newsCenter.setTitle("3标题修改");
//        newsCenter.setContent("update修改内容");
//        newsCenter.setNcType(1);
//        newsCenter.setFilePathString("11");
        /*Integer returnNewsCenter = newsCenterService.addNewsCenter(newsCenter);*/
//        Integer integer = newsCenterService .updNewsCenter(newsCenter);
//        System.err.println(integer.toString());
        return ResultMessage.success(user);
    }

}
