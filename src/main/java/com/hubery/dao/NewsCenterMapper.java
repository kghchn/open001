package com.hubery.dao;

import com.hubery.entity.NewsCenter;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program hubery
 * @description: 新闻内容管理
 * @author: kgh
 * @create: 2019/07/24 17:41
 */

@Mapper
public interface NewsCenterMapper {

    /**
     * 新增新闻
     *
     * @param newsCenter
     * @return
     */
    Integer addNewsCenter(NewsCenter newsCenter);

    /**
     * 新闻修改
     *
     * @param newsCenter
     * @return
     */
    Integer updNewsCenter(NewsCenter newsCenter);

}
