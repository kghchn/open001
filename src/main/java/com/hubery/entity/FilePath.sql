-- auto Generated on 2020-05-26
-- DROP TABLE IF EXISTS file_path;
CREATE TABLE file_path(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	`path` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'path',
	file_type INT (11) NOT NULL DEFAULT -1 COMMENT '文件类型 1-图片 2-视频 3-其他',
	file_status INT (11) NOT NULL DEFAULT -1 COMMENT '状态 1-正常 4-删除',
	creation_time VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'creationTime',
	update_time VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'updateTime',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'file_path';
