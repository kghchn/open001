package com.hubery.sevice;

import com.hubery.dao.NewsCenterMapper;
import com.hubery.dao.UserMapper;
import com.hubery.entity.NewsCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program hubery
 * @description: 文件路径操作
 * @author: kgh
 * @create: 2019/07/22 17:51
 */

@Service
public class NewsCenterService {
    private final NewsCenterMapper newsCenterMapper;

    @Autowired
    public NewsCenterService(NewsCenterMapper newsCenterMapper) {
        this.newsCenterMapper = newsCenterMapper;
    }

    public Integer addNewsCenter(NewsCenter newsCenter) {
        Integer i = newsCenterMapper.addNewsCenter(newsCenter);
        return i;
    }

    public Integer updNewsCenter(NewsCenter newsCenter) {
        Integer i = newsCenterMapper.updNewsCenter(newsCenter);
        return i;
    }
}