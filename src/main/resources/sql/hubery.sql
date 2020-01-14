

CREATE TABLE IF NOT EXISTS `t_user`(
   `id` INT UNSIGNED AUTO_INCREMENT COMMENT '主键id',
   `name` VARCHAR(30) NOT NULL COMMENT '用户名',
   `password` VARCHAR(40) NOT NULL COMMENT '密码',
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `t_file_path`(
    `id` INT UNSIGNED AUTO_INCREMENT COMMENT '主键id',
    `path` VARCHAR(100) NOT NULL COMMENT '文件路径',
    `fileType` TINYINT NULL DEFAULT 3 COMMENT '文件类型 1-图片 2-视频 3-其他',
    `fileStatus` TINYINT NULL DEFAULT 1 COMMENT '状态 1-正常 4-删除',
    `creationTime` datetime NOT NULL COMMENT '创建时间',
	`updateTime` datetime NOT NULL COMMENT '修改时间',
    PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE IF NOT EXISTS `t_news_center`(
    `id` INT UNSIGNED AUTO_INCREMENT COMMENT '新闻内容主键id',
    `title` VARCHAR(100) NOT NULL COMMENT '新闻标题',
    `content` text(65535) NOT NULL COMMENT '新闻内容',
    `ncType` TINYINT NULL DEFAULT 1 COMMENT '新闻类型 1-文字图片新闻  2-视频新闻 3-其他新闻',
    `filepath` VARCHAR(100) NOT NULL COMMENT '图片视频路径',
    `ncStatus` TINYINT NULL DEFAULT 1 COMMENT '状态 1-正常 4-删除',
    `creationTime` datetime NOT NULL COMMENT '创建时间',
	`updateTime` datetime NOT NULL COMMENT '修改时间',
    PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;





------ test  sql ------

INSERT INTO `hubery`.`t_file_path` (`path`, `fileType`, `fileStatus`,`creationTime`,`updateTime`)
VALUES ('/test/test.txt', 1, 1,NOW(),NOW());

INSERT INTO `hubery`.`t_news_center` (`title`, `content`, `ncType`,`filepath`,`ncStatus`,`creationTime`,`updateTime`)
VALUES ('标题', '内容',1, '11,19',1,NOW(),NOW());

update  `hubery`.`t_news_center`