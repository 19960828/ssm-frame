/*
SQLyog Professional v12.09 (64 bit)
MySQL - 5.7.24 : Database - base_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`base_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `base_db`;

/*Table structure for table `collect_info` */

DROP TABLE IF EXISTS `collect_info`;

CREATE TABLE `collect_info` (
  `id` varchar(32) NOT NULL,
  `datetime` datetime DEFAULT NULL,
  `title` longtext,
  `url` longtext,
  `userId` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `activeCode` varchar(255) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `gender` varchar(2) DEFAULT NULL,
  `introduce` varchar(200) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `registTime` datetime DEFAULT NULL,
  `role` varchar(5) DEFAULT NULL,
  `state` int(11) NOT NULL,
  `telephone` varchar(11) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
