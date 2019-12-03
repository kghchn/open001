package com.hubery.controller;

import com.hubery.entity.ResulMsg;
import com.hubery.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

/**
 * @program xyfy
 * @description: 文件上传
 * @author: kgh
 * @create: 2019/07/22 22:50
 */

@RestController
@RequestMapping("/upload")
public class UploadController {

    @Value("${uploadFile.path}")
    private String uploadPath;
    private Long uploadSizeMax = 1100000000L;
    private Logger logger = LoggerFactory.getLogger(UploadController.class);

    @ResponseBody
    @PostMapping("/singleFile")
    public ResulMsg singleFileUpload(MultipartFile file) {
        /**String fileSize = file.getSize()/1000/1000/1000 + "G" ;
         System.err.println("文件大小"+fileSize);*/

        /**logger.debug("传入的文件参数：{}", JSON.toJSONString(file, true));*/

        if (Objects.isNull(file) || file.isEmpty()) {
            logger.error("上传文件为空");
            return ResultUtil.error(400,"文件为空，请选择文件后再上传重新上传");
        }

        if (file.getSize() > uploadSizeMax) {
            return ResultUtil.error(400,"文件大于1.1G 上传失败 ");
        }

        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(uploadPath + file.getOriginalFilename());
            /*如果没有files文件夹，则创建*/
            if (!Files.isWritable(path)) {
                Files.createDirectories(Paths.get(uploadPath));
            }
            /*文件写入指定路径*/
            Files.write(path, bytes);
            /** logger.debug("上传文件文件写入成功");*/
            return ResultUtil.success("上传文件成功");
        } catch (IOException e) {
            e.printStackTrace();
            return ResultUtil.error(500,"后端处理异常...");
        }
    }
}
