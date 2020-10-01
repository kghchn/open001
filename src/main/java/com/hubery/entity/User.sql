-- auto Generated on 2020-05-26
-- DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
	user_id BIGINT (15) UNIQUE NOT NULL AUTO_INCREMENT COMMENT '自增主键，系统内的用户ID',
	user_name VARCHAR (50) NOT NULL COMMENT 'userName',
	user_password VARCHAR (50) NOT NULL COMMENT 'userPassword',
	user_birthday DATETIME NOT NULL COMMENT '生日',
	id_type TINYINT (3) NOT NULL COMMENT '身份证件类型：1中国大陆身份证，2护照',
	user_id_no VARCHAR (50) NOT NULL COMMENT 'userIdNo',
	user_email VARCHAR (50) NOT NULL COMMENT 'userEmail',
	user_mobile VARCHAR (50) NOT NULL COMMENT 'userMobile',
	address_id BIGINT (15) NOT NULL COMMENT '地址记录ID',
	mini_open_id VARCHAR (50) NOT NULL COMMENT 'miniOpenId',
	mini_union_id VARCHAR (50) NOT NULL COMMENT 'miniUnionId',
	mini_nick_name VARCHAR (50) NOT NULL COMMENT 'miniNickName',
	user_profile_photo VARCHAR (50) NOT NULL COMMENT 'userProfilePhoto',
	last_login_time TIMESTAMP NOT NULL COMMENT '最后登录时间',
	user_status TINYINT (3) NOT NULL COMMENT '用户状态， -1:删除,01:正常,02:冻结',
	create_time TIMESTAMP NOT NULL COMMENT '记录生成的时间',
	update_time TIMESTAMP NOT NULL COMMENT '记录最近修改的时间',
	INDEX(user_birthday),
	PRIMARY KEY (user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'user';
