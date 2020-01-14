package com.hubery.controller;


import com.hubery.entity.ResulMsg;
import com.hubery.entity.NewsCenter;
import com.hubery.sevice.Impl.FilePathServiceImpl;
import com.hubery.sevice.Impl.NewsCenterServiceImpl;
import com.hubery.sevice.Impl.UserServiceImpl;
import com.hubery.utils.ResultUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program
 * @description: 修改内容（所有的修改都从这儿开始）
 * @author: 
 * @create: 2019/07/24 14:49
 */

@RestController
@RequestMapping("/edit")
public class EditController {

    private final UserServiceImpl userServiceImpl;
    private final FilePathServiceImpl filePathServiceImpl;
    private final NewsCenterServiceImpl newsCenterServiceImpl;

    @Autowired
    public EditController(UserServiceImpl userServiceImpl, FilePathServiceImpl filePathServiceImpl, NewsCenterServiceImpl newsCenterServiceImpl) {
        this.userServiceImpl = userServiceImpl;
        this.filePathServiceImpl = filePathServiceImpl;
        this.newsCenterServiceImpl = newsCenterServiceImpl;
    }

    @ResponseBody
    @GetMapping(value = "/editNewsCenter", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "接口管理", httpMethod = "GET")
    public ResulMsg editNewsCenter() {
        NewsCenter newsCenter = new NewsCenter();
        newsCenter.setId(3);
        newsCenter.setTitle("3标题修改");
        newsCenter.setContent("update修改内容");
        newsCenter.setNcType(1);
        newsCenter.setFilePathString("11");
        /*Integer returnNewsCenter = newsCenterService.addNewsCenter(newsCenter);*/
        Integer integer = newsCenterServiceImpl.updNewsCenter(newsCenter);
        System.err.println(integer.toString());
        return ResultUtil.success("请求成功");
    }

}
