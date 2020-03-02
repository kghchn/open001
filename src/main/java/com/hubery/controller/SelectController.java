package com.hubery.controller;

import com.hubery.common.swagger.ResultCode;
import com.hubery.common.swagger.ResultMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program test
 * @description: 查询接口 （所有的查询都从这儿开始）
 * @author: kgh
 * @create: 2019/07/24 14:49
 */

@RestController
@RequestMapping("/sel")
@Api(tags = "查询管理API")

public class SelectController {

    @ResponseBody
    @GetMapping(value = "/video", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "selVideo", httpMethod = "GET")
    public ResultMessage selVideo() {
        System.out.println("test");
        return ResultMessage.success("查询成功");
    }

    @ResponseBody
    @GetMapping(value = "/news", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "selNews", httpMethod = "GET")
    public ResultMessage selNews() {
        return ResultMessage.failure(ResultCode.RESULE_DATA_NONE);
    }


}
