package com.hubery.sevice;

import com.hubery.dao.FilePathMapper;
import com.hubery.entity.FilePath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program hubery
 * @description: 文件路径操作
 * @author: kgh
 * @create: 2019/07/22 17:51
 */

@Service
public class FilePathService {
    private final FilePathMapper filePathMapper;

    @Autowired
    public FilePathService(FilePathMapper filePathMapper) {
        this.filePathMapper = filePathMapper;
    }

    public Integer addFilePath(FilePath filePath) {
        Integer integer = filePathMapper.addFilePath(filePath);

        return integer;
    }


}
