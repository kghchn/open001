package com.hubery.sevice.Impl;

import com.hubery.dao.FilePathMapper;
import com.hubery.entity.FilePath;
import com.hubery.sevice.FilePathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program hubery
 * @description: 文件路径操作
 * @author: kgh
 * @create: 2019/07/22 17:51
 */

@Service
public class FilePathServiceImpl implements FilePathService {
    private final FilePathMapper filePathMapper;

    @Autowired
    public FilePathServiceImpl(FilePathMapper filePathMapper) {
        this.filePathMapper = filePathMapper;
    }

    public Integer addFilePath(FilePath filePath) {
        Integer integer = filePathMapper.addFilePath(filePath);

        return integer;
    }


}
