/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50724
Source Host           : 192.168.196.74:3306
Source Database       : rbac-basket

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2020-03-28 17:32:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for action
-- ----------------------------
DROP TABLE IF EXISTS `action`;
CREATE TABLE `action` (
  `action_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `action_name` varchar(128) NOT NULL,
  `action_type` tinyint(2) NOT NULL COMMENT '可以是匹配或者是单个，单个是全路径，匹配是书写url前缀或者url后缀',
  `action_url` varchar(512) NOT NULL,
  `menu_id` bigint(20) NOT NULL,
  `caption` varchar(128) DEFAULT NULL,
  `disabled` tinyint(2) DEFAULT '0' COMMENT '禁用 0 正常 1 禁用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `create_person` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_person` varchar(255) DEFAULT NULL COMMENT '更新人',
  `delete_person` varchar(255) DEFAULT NULL COMMENT '删除人',
  PRIMARY KEY (`action_id`),
  UNIQUE KEY `menuid` (`menu_id`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='请求地址表';

-- ----------------------------
-- Records of action
-- ----------------------------

-- ----------------------------
-- Table structure for action_operate_power
-- ----------------------------
DROP TABLE IF EXISTS `action_operate_power`;
CREATE TABLE `action_operate_power` (
  `action_power_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `action_id` bigint(20) NOT NULL,
  `operate_power_id` bigint(20) NOT NULL,
  PRIMARY KEY (`action_power_id`),
  KEY `operate_power_id` (`operate_power_id`),
  KEY `action_id` (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='请求权限关系表\r\n';

-- ----------------------------
-- Records of action_operate_power
-- ----------------------------

-- ----------------------------
-- Table structure for app_system
-- ----------------------------
DROP TABLE IF EXISTS `app_system`;
CREATE TABLE `app_system` (
  `app_system_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `app_system_name` varchar(128) DEFAULT NULL COMMENT '系统名称',
  `app_system_icon` varchar(512) DEFAULT NULL COMMENT '系统logo',
  `app_system_url` varchar(512) DEFAULT NULL COMMENT '系统首页URL',
  `order_code` tinyint(3) DEFAULT NULL COMMENT '排序',
  `disabled` tinyint(2) DEFAULT '0' COMMENT '禁用 0 正常 1 禁用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `create_person` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_person` varchar(255) DEFAULT NULL COMMENT '更新人',
  `delete_person` varchar(255) DEFAULT NULL COMMENT '删除人',
  PRIMARY KEY (`app_system_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='应用系统表';

-- ----------------------------
-- Records of app_system
-- ----------------------------

-- ----------------------------
-- Table structure for element
-- ----------------------------
DROP TABLE IF EXISTS `element`;
CREATE TABLE `element` (
  `element_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `element_type` varchar(16) DEFAULT NULL COMMENT '元素类型 ',
  `element_name` varchar(11) DEFAULT NULL COMMENT '元素名称',
  `element_flag` varchar(255) DEFAULT NULL COMMENT '元素标识',
  `disabled` tinyint(2) DEFAULT '0' COMMENT '禁用 0 正常 1 禁用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `create_person` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_person` varchar(255) DEFAULT NULL COMMENT '更新人',
  `delete_person` varchar(255) DEFAULT NULL COMMENT '删除人',
  PRIMARY KEY (`element_id`),
  KEY `page_element_id` (`element_name`),
  KEY `operate_power_id` (`element_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='元素表';

-- ----------------------------
-- Records of element
-- ----------------------------

-- ----------------------------
-- Table structure for file_base
-- ----------------------------
DROP TABLE IF EXISTS `file_base`;
CREATE TABLE `file_base` (
  `file_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(128) DEFAULT NULL,
  `file_url` varchar(512) DEFAULT NULL,
  `file_size` double(16,2) DEFAULT NULL,
  `file_type` varchar(16) DEFAULT NULL COMMENT '文件类型',
  `file_memo` varchar(512) DEFAULT NULL,
  `disabled` tinyint(2) DEFAULT '0' COMMENT '禁用 0 正常 1 禁用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `create_person` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_person` varchar(255) DEFAULT NULL COMMENT '更新人',
  `delete_person` varchar(255) DEFAULT NULL COMMENT '删除人',
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文件表\r\n';

-- ----------------------------
-- Records of file_base
-- ----------------------------

-- ----------------------------
-- Table structure for groups
-- ----------------------------
DROP TABLE IF EXISTS `groups`;
CREATE TABLE `groups` (
  `group_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(128) NOT NULL DEFAULT 'NULL' COMMENT '分组名称',
  `group_parent_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '父分组id',
  `group_memo` varchar(512) DEFAULT 'NULL' COMMENT '分组说明',
  `disabled` tinyint(2) DEFAULT '0' COMMENT '禁用 0 正常 1 禁用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `create_person` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_person` varchar(255) DEFAULT NULL COMMENT '更新人',
  `delete_person` varchar(255) DEFAULT NULL COMMENT '删除人',
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='分组表\r\n';

-- ----------------------------
-- Records of groups
-- ----------------------------

-- ----------------------------
-- Table structure for anMenu
-- ----------------------------
DROP TABLE IF EXISTS `anMenu`;
CREATE TABLE `anMenu` (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(128) DEFAULT NULL COMMENT '菜单名称',
  `menu_url` varchar(512) DEFAULT NULL COMMENT '菜单地址',
  `menu_type` tinyint(2) DEFAULT NULL COMMENT '菜单类型',
  `menu_parent_id` bigint(20) DEFAULT NULL COMMENT '父菜单id',
  `menu_icon` varchar(512) DEFAULT NULL COMMENT '菜单图标',
  `page_url` varchar(512) DEFAULT NULL,
  `app_system_id` bigint(20) DEFAULT NULL COMMENT '系统id',
  `order_code` varchar(6) DEFAULT NULL,
  `disabled` tinyint(2) DEFAULT '0' COMMENT '禁用 0 正常 1 禁用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `create_person` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_person` varchar(255) DEFAULT NULL COMMENT '更新人',
  `delete_person` varchar(255) DEFAULT NULL COMMENT '删除人',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜单表\r\n';

-- ----------------------------
-- Records of anMenu
-- ----------------------------

-- ----------------------------
-- Table structure for menu_element
-- ----------------------------
DROP TABLE IF EXISTS `menu_element`;
CREATE TABLE `menu_element` (
  `menu_element_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `menu_id` bigint(20) NOT NULL,
  `element_id` bigint(20) NOT NULL,
  `display` tinyint(2) DEFAULT '0' COMMENT '0 显示 1 隐藏',
  PRIMARY KEY (`menu_element_id`),
  KEY `menu_id` (`menu_id`),
  KEY `element_id` (`element_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜单元素关联表';

-- ----------------------------
-- Records of menu_element
-- ----------------------------

-- ----------------------------
-- Table structure for operate_power
-- ----------------------------
DROP TABLE IF EXISTS `operate_power`;
CREATE TABLE `operate_power` (
  `operate_power_id` int(11) NOT NULL AUTO_INCREMENT,
  `operate_power_name` varchar(128) DEFAULT NULL COMMENT '操作名称',
  `operate_power_type` tinyint(4) DEFAULT NULL COMMENT '操作权限类型 1 读写 2 读 3 写 4 无权限',
  `disabled` tinyint(2) DEFAULT '0' COMMENT '禁用 0 正常 1 禁用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `create_person` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_person` varchar(255) DEFAULT NULL COMMENT '更新人',
  `delete_person` varchar(255) DEFAULT NULL COMMENT '删除人',
  PRIMARY KEY (`operate_power_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='操作权限表';

-- ----------------------------
-- Records of operate_power
-- ----------------------------

-- ----------------------------
-- Table structure for organ
-- ----------------------------
DROP TABLE IF EXISTS `organ`;
CREATE TABLE `organ` (
  `organ_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `organ_name` varchar(128) DEFAULT NULL,
  `organ_type` tinyint(2) DEFAULT NULL,
  `order_code` tinyint(3) DEFAULT NULL,
  `organ_parent_id` int(11) DEFAULT NULL,
  `caption` varchar(128) DEFAULT NULL,
  `disabled` tinyint(2) DEFAULT '0' COMMENT '禁用 0 正常 1 禁用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `create_person` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_person` varchar(255) DEFAULT NULL COMMENT '更新人',
  `delete_person` varchar(255) DEFAULT NULL COMMENT '删除人',
  PRIMARY KEY (`organ_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='组织表';

-- ----------------------------
-- Records of organ
-- ----------------------------

-- ----------------------------
-- Table structure for organ_groups
-- ----------------------------
DROP TABLE IF EXISTS `organ_groups`;
CREATE TABLE `organ_groups` (
  `organ_group_id` bigint(20) NOT NULL,
  `organ_id` bigint(20) DEFAULT NULL COMMENT '组织id',
  `group_id` bigint(20) DEFAULT NULL COMMENT '分组id',
  PRIMARY KEY (`organ_group_id`),
  KEY `organ_id` (`organ_id`),
  KEY `group_id` (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='组织分组关系表\r\n';

-- ----------------------------
-- Records of organ_groups
-- ----------------------------

-- ----------------------------
-- Table structure for organ_user
-- ----------------------------
DROP TABLE IF EXISTS `organ_user`;
CREATE TABLE `organ_user` (
  `organ_user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `x_number` bigint(20) NOT NULL COMMENT '用户唯一标示',
  `organ_id` bigint(20) NOT NULL COMMENT '组织id',
  PRIMARY KEY (`organ_user_id`),
  KEY `organ_id` (`organ_id`),
  KEY `user_id` (`x_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户组织管理表\r\n';

-- ----------------------------
-- Records of organ_user
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `role_type` tinyint(4) DEFAULT NULL COMMENT '角色类型',
  `role_code` varchar(16) DEFAULT NULL,
  `disabled` tinyint(4) DEFAULT '0' COMMENT '禁用 0 正常 1 禁用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `create_person` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_person` varchar(255) DEFAULT NULL COMMENT '更新人',
  `delete_person` varchar(255) DEFAULT NULL COMMENT '删除人',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='角色表\r\n';

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员', '1', 'ADMIN', '0', '2020-03-28 17:30:31', null, null, 'admin', null, null);

-- ----------------------------
-- Table structure for role_groups
-- ----------------------------
DROP TABLE IF EXISTS `role_groups`;
CREATE TABLE `role_groups` (
  `role_groups_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL COMMENT '角色id',
  `group_id` bigint(20) NOT NULL COMMENT '分组id',
  PRIMARY KEY (`role_groups_id`),
  KEY `role_id` (`role_id`),
  KEY `group_id` (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='角色分组关系表';

-- ----------------------------
-- Records of role_groups
-- ----------------------------

-- ----------------------------
-- Table structure for role_operate_power
-- ----------------------------
DROP TABLE IF EXISTS `role_operate_power`;
CREATE TABLE `role_operate_power` (
  `role_power_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `operate_power_id` bigint(20) NOT NULL COMMENT '操作权限id',
  `role_id` bigint(20) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`role_power_id`),
  KEY `operate_power_id` (`operate_power_id`),
  KEY `role_id` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='角色操作权限表';

-- ----------------------------
-- Records of role_operate_power
-- ----------------------------

-- ----------------------------
-- Table structure for role_user
-- ----------------------------
DROP TABLE IF EXISTS `role_user`;
CREATE TABLE `role_user` (
  `role_user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) NOT NULL COMMENT '角色id',
  `x_number` bigint(20) NOT NULL COMMENT '用户标识',
  PRIMARY KEY (`role_user_id`),
  KEY `user_id` (`x_number`),
  KEY `role_id` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='角色用户关系表\r\n';

-- ----------------------------
-- Records of role_user
-- ----------------------------
INSERT INTO `role_user` VALUES ('1', '1', '10000');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` bigint(11) NOT NULL AUTO_INCREMENT,
  `x_number` bigint(20) DEFAULT NULL COMMENT '唯一标识码',
  `phone` varchar(11) DEFAULT NULL COMMENT '用户名称',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `user_type` tinyint(2) DEFAULT NULL COMMENT '用户类型',
  `online_status` tinyint(2) DEFAULT NULL COMMENT '在线状态',
  `salt` varchar(255) DEFAULT NULL COMMENT '加密盐值',
  `disabled` tinyint(2) DEFAULT '0' COMMENT '禁用 0 正常 1 禁用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `create_person` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_person` varchar(255) DEFAULT NULL COMMENT '更新人',
  `delete_person` varchar(255) DEFAULT NULL COMMENT '删除人',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户基本表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '10000', '18668927276', '$2a$10$FZu6PHIDV1YdszEgTMxQ..RBjb0hscUg7fzTI6WQd7ZqqlcnnYpRa', '1', '1', null, '0', '2020-03-28 17:05:13', null, null, 'admin', null, null);

-- ----------------------------
-- Table structure for user_detail
-- ----------------------------
DROP TABLE IF EXISTS `user_detail`;
CREATE TABLE `user_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `x_number` bigint(20) NOT NULL,
  `real_name` varchar(32) DEFAULT NULL COMMENT '真实姓名',
  `introduction` varchar(255) DEFAULT NULL COMMENT '简介',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别 M 女 F 男',
  `birthday` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '生日',
  `auth` tinyint(2) DEFAULT '0' COMMENT '认证状态 0 未认证 1 认证',
  `domain` varchar(255) DEFAULT '',
  `disabled` tinyint(2) DEFAULT '0' COMMENT '禁用 0 正常 1 禁用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `create_person` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_person` varchar(255) DEFAULT NULL COMMENT '更新人',
  `delete_person` varchar(255) DEFAULT NULL COMMENT '删除人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user_detail
-- ----------------------------

-- ----------------------------
-- Table structure for user_file
-- ----------------------------
DROP TABLE IF EXISTS `user_file`;
CREATE TABLE `user_file` (
  `user_file_id` bigint(11) NOT NULL AUTO_INCREMENT,
  `file_id` bigint(11) DEFAULT NULL COMMENT '文件id',
  `x_number` bigint(11) DEFAULT NULL,
  PRIMARY KEY (`user_file_id`),
  KEY `file_id` (`file_id`),
  KEY `user_id` (`x_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户文件表\r\n';

-- ----------------------------
-- Records of user_file
-- ----------------------------

-- ----------------------------
-- Table structure for user_groups
-- ----------------------------
DROP TABLE IF EXISTS `user_groups`;
CREATE TABLE `user_groups` (
  `user_group_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `x_number` bigint(20) NOT NULL COMMENT '用户唯一编号',
  `group_id` bigint(20) NOT NULL COMMENT '分组id',
  PRIMARY KEY (`user_group_id`),
  KEY `group_id` (`group_id`),
  KEY `user_id` (`x_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户分组表\r\n';

-- ----------------------------
-- Records of user_groups
-- ----------------------------
