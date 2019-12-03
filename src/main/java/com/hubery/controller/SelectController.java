package com.hubery.controller;

import com.hubery.entity.ResulMsg;
import com.hubery.utils.ResultUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program xyfy
 * @description: 查询接口 （所有的查询都从这儿开始）
 * @author: kgh
 * @create: 2019/07/24 14:49
 */

@RestController
@RequestMapping("/sel")
public class SelectController {

    @ResponseBody
    @GetMapping(value = "/video", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "接口管理", httpMethod = "GET")
    public ResulMsg selVideo() {
        System.out.println("test");
        return ResultUtil.success("查询成功");
    }

    @ResponseBody
    @GetMapping(value = "/news", produces = {"application/json;charset=UTF-8"})
    public ResulMsg selNews() {
        return ResultUtil.error(404,"查询失败");
    }


}
