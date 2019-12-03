package com.hubery.entity;

import java.util.List;

/**
 * @program hubery
 * @description: 新闻动态
 * @author: kgh
 * @create: 2019/05/24 19:08
 */

public class NewsCenter {

    private Integer id;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 新闻内容
     */
    private String content;

    /**
     * 新闻类型 1-文字图片新闻  2-视频新闻 3-其他新闻
     */
    private Integer ncType;

    /**
     * 图片视频路径 查询时使用
     */
    private List<FilePath> filePath;

    /**
     * 图片视频路径String类型 新增时使用
     */
    private String filePathString;

    /**
     * 状态 1-正常 4-删除
     */
    private Integer ncStatus;

    /**
     * 创建时间
     */
    private String creationTime;

    /**
     * 修改时间
     */
    private String updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getNcType() {
        return ncType;
    }

    public void setNcType(Integer ncType) {
        this.ncType = ncType;
    }

    public List<FilePath> getFilePath() {
        return filePath;
    }

    public void setFilePath(List<FilePath> filePath) {
        this.filePath = filePath;
    }

    public String getFilePathString() {
        return filePathString;
    }

    public void setFilePathString(String filePathString) {
        this.filePathString = filePathString;
    }

    public Integer getNcStatus() {
        return ncStatus;
    }

    public void setNcStatus(Integer ncStatus) {
        this.ncStatus = ncStatus;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "NewsCenter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", ncType=" + ncType +
                ", filePath=" + filePath +
                ", filePathString='" + filePathString + '\'' +
                ", ncStatus=" + ncStatus +
                ", creationTime='" + creationTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
