package com.hubery.entity;

/**
 * @program Open
 * @description: 图片 视频 文件 路径
 * @author: kgh
 * @create: 2019/07/22 15:54
 */

public class FilePath {

    private Integer id;

    private String path;

    /**
     * 文件类型 1-图片 2-视频 3-其他
     */
    private Integer fileType;

    /**
     * 状态 1-正常 4-删除
     */
    private Integer fileStatus;

    private String creationTime;

    private String updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public Integer getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(Integer fileStatus) {
        this.fileStatus = fileStatus;
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
        return "FilePath{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", fileType=" + fileType +
                ", fileStatus=" + fileStatus +
                ", creationTime='" + creationTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
