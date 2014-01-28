SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `testing`
-- ----------------------------
DROP TABLE IF EXISTS `testing`;
CREATE TABLE `testing` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL DEFAULT '',
  `address` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`Id`),
  UNIQUE KEY `ix` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of testing
-- ----------------------------
INSERT INTO `testing` VALUES ('1', 'edwin', 'Ciledug');
INSERT INTO `testing` VALUES ('2', 'kamplenk', 'Cikokol');
INSERT INTO `testing` VALUES ('3', 'nugi', 'Pamulang');
INSERT INTO `testing` VALUES ('4', 'tebek', 'Karawaci');