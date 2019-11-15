/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : games

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-11-15 15:14:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `membersinfo`
-- ----------------------------
DROP TABLE IF EXISTS `membersinfo`;
CREATE TABLE `membersinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mname` varchar(50) DEFAULT NULL,
  `mgender` varchar(4) DEFAULT NULL,
  `mage` int(11) NOT NULL,
  `maddress` varchar(100) DEFAULT NULL,
  `memail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of membersinfo
-- ----------------------------
INSERT INTO `membersinfo` VALUES ('1', '张三', '男', '26', '北京市丰台区', 'zsan@qq.com');
INSERT INTO `membersinfo` VALUES ('2', '李芳', '女', '20', '杭州市西湖区', 'lf@net.com');
INSERT INTO `membersinfo` VALUES ('3', '张飞', '男', '22', '天津市', 'zf@163.com');
INSERT INTO `membersinfo` VALUES ('4', '李白', '男', '29', '北京市崇文区', 'lb@163.com');
INSERT INTO `membersinfo` VALUES ('5', '王丽', '女', '22', '北京市丰台区', 'll@163.com');
