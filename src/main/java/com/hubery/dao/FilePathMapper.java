package com.hubery.dao;

import com.hubery.entity.FilePath;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program hubery
 * @description: 文件路径处理
 * @author: kgh
 * @create: 2019/07/22 17:41
 */

@Mapper
public interface FilePathMapper {

    /**
     * 添加 文件路径
     *
     * @param filePath 文件路径对象
     * @return
     */
    Integer addFilePath(FilePath filePath);

    /* FilePath selFilePath(FilePath filePath);*/

}
