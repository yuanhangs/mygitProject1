/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : games

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-11-15 14:29:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `hero`
-- ----------------------------
DROP TABLE IF EXISTS `hero`;
CREATE TABLE `hero` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `heroName` varchar(255) NOT NULL COMMENT '名字',
  `heroRole` varchar(255) NOT NULL COMMENT '角色',
  `vitality` float NOT NULL COMMENT '战力值',
  `powerValue` float NOT NULL COMMENT '生命值',
  `mana` float NOT NULL COMMENT '法术值',
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hero
-- ----------------------------
INSERT INTO `hero` VALUES ('1', '乌龟', '战士', '1000', '200', '110', '1');
INSERT INTO `hero` VALUES ('2', '小白兔', '法师', '500', '100', '400', '1');
INSERT INTO `hero` VALUES ('3', '狮子', '坦克', '1000', '200', '100', '2');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `userName` varchar(50) NOT NULL COMMENT '姓名',
  `userPassword` varchar(10) NOT NULL COMMENT '密码',
  `userLoginName` varchar(50) NOT NULL COMMENT '账号',
  `userId` varchar(30) NOT NULL COMMENT '身份证号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张飞', '0123', 'mike', '987654321987654');
INSERT INTO `user` VALUES ('2', '刘芳', '123', 'angle', '987564565544');
