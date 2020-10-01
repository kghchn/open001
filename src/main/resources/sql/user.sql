CREATE TABLE `user` (
    user_id bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键，系统内的用户ID',
    user_name varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
    user_password varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
    user_birthday datetime DEFAULT NULL COMMENT '生日',
    user_sex tinyint(1) DEFAULT '0' COMMENT '性别:0-保密,1-男,2-女',
    id_type tinyint(4) DEFAULT NULL COMMENT '身份证件类型：1中国大陆身份证，2护照',
    user_id_no varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
    user_email varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
    user_mobile varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
    address_id bigint(20) DEFAULT NULL COMMENT '地址记录ID',
    mini_open_id varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
    mini_union_id varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
    mini_nick_name varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
    user_profile_photo varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
    last_login_time datetime DEFAULT NULL COMMENT '最后登录时间',
    user_status tinyint(10) DEFAULT NULL COMMENT '用户状态， -1:删除,01:正常,02:冻结',
    create_time datetime DEFAULT CURRENT_TIMESTAMP COMMENT '记录生成的时间',
    update_time datetime DEFAULT CURRENT_TIMESTAMP COMMENT '记录最近修改的时间',
    PRIMARY KEY (user_id),
    KEY open_id (mini_open_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户表';

SET FOREIGN_KEY_CHECKS = 1;