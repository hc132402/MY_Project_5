/*
Navicat MySQL Data Transfer

Source Server         : hc
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : user

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2021-11-03 04:50:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('123', '777', 'male', '11');
INSERT INTO `user` VALUES ('132', '222', 'male', '24');
INSERT INTO `user` VALUES ('141', '111', 'male', '11');
INSERT INTO `user` VALUES ('177', '111', 'female', '11');
INSERT INTO `user` VALUES ('999', '111', 'female', '11');
