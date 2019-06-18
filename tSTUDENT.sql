/*
Navicat MySQL Data Transfer

Source Server         : LocalConnection
Source Server Version : 50719
Source Host           : 127.0.0.1:3306
Source Database       : dbTEST

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2019-06-18 14:54:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tSTUDENT`
-- ----------------------------
DROP TABLE IF EXISTS `tSTUDENT`;
CREATE TABLE `tSTUDENT` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(50) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `coursename` varchar(50) NOT NULL,
  `yrofstudy` varchar(50) NOT NULL,
  `dateCreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tSTUDENT
-- ----------------------------
INSERT INTO `tSTUDENT` VALUES ('1', 'Andrew', 'Simiyu', 'BSC.Computer Science', 'fourth', '2019-06-18 11:11:25');
INSERT INTO `tSTUDENT` VALUES ('2', 'George', 'Kibira', 'BSC. Computer Technology', 'second', '2019-06-18 11:11:25');
INSERT INTO `tSTUDENT` VALUES ('3', 'Edina', 'Nyaboke', 'IT', 'third', '2019-06-18 11:11:25');
INSERT INTO `tSTUDENT` VALUES ('10', 'Esther', 'Maina', 'It', 'first', '2019-06-18 13:54:44');
