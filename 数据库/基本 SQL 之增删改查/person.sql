/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2019-02-21 18:03:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `name` varchar(16) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `address` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'yang', '22', '231232132', '中国上海');
INSERT INTO `person` VALUES ('2', 'cao', null, null, '浙江杭州');
INSERT INTO `person` VALUES ('3', 'li', '23', '34567894', '江苏南京');
INSERT INTO `person` VALUES ('4', 'huang', '33', '34567894', '湖北武汉');
INSERT INTO `person` VALUES ('5', 'zhang', '30', '4567890', '中国北京');
INSERT INTO `person` VALUES ('6', 'yang', '24', '2343435353', '山东青岛');
