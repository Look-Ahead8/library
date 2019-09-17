/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 8.0.15 : Database - library
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`library` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `library`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_username` varchar(16) NOT NULL,
  `admin_password` varchar(50) NOT NULL,
  `admin_name` varchar(50) NOT NULL,
  `admin_gender` int(1) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

/*Table structure for table `answer` */

DROP TABLE IF EXISTS `answer`;

CREATE TABLE `answer` (
  `answer_id` int(11) NOT NULL AUTO_INCREMENT,
  `forum_id` int(11) NOT NULL,
  `stu_id` int(11) NOT NULL,
  `answer_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `answer_content` varchar(255) NOT NULL,
  PRIMARY KEY (`answer_id`),
  KEY `fk_answer_student` (`stu_id`),
  KEY `fk_answer_forum` (`forum_id`),
  CONSTRAINT `fk_answer_forum` FOREIGN KEY (`forum_id`) REFERENCES `forum` (`forum_id`),
  CONSTRAINT `fk_answer_student` FOREIGN KEY (`stu_id`) REFERENCES `student` (`stu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `answer` */

insert  into `answer`(`answer_id`,`forum_id`,`stu_id`,`answer_time`,`answer_content`) values (1,1,2,'2019-06-25 16:14:09','成为一个厉害的人，曾副教授推荐'),(2,1,1,'2019-06-26 13:26:30','sdfgsdgsg');

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '书本id',
  `book_name` varchar(50) NOT NULL COMMENT '书本名字',
  `book_author` varchar(50) NOT NULL COMMENT '书本作者',
  `book_gist` varchar(255) NOT NULL COMMENT '书本简介',
  `book_pub_date` date DEFAULT NULL COMMENT '书本出版时间',
  `book_pro_date` date DEFAULT NULL COMMENT '书本生产时间',
  `book_pro_price` decimal(18,2) NOT NULL COMMENT '书本加个',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `book` */

insert  into `book`(`book_id`,`book_name`,`book_author`,`book_gist`,`book_pub_date`,`book_pro_date`,`book_pro_price`) values (1,'华研外语 英语六级听力专项训练书备考2019','潘晓燕','1.大学英语六级听力改革新题型听力长对话10套+听力篇章10套+讲座讲话听力5套+20套新题型综合模拟训练；3.强化英语六级词汇，30篇主题听力记六级单词，总结大学英语六级听力主题词汇与短语；4.解析详细，综合训练部分注释听力篇章的词汇；5.附录包括英语六级听力常考同音词、近音词及习语；6.另赠300篇新闻+50篇英美文化背景听力的音频和电子版文本。','2018-01-01',NULL,'39.80'),(2,'天才在左 疯子在右：国内第一本精神病人访谈手记','高铭（著）','本书以访谈录的形式记载了生活在另一个角落的人群（精神病患者、心理障碍者等边缘人）深刻、视角独特的所思所想，让人们可以了解到疯子抑或天才真正的内心世界。此书是国内第一本具有人文情怀的精神病患谈访录。内容涉及生理学、心理学、佛学、宗教、量子物理、符号学以及玛雅文明和预言等众多领域','2018-01-01',NULL,'56.80');

/*Table structure for table `borrow` */

DROP TABLE IF EXISTS `borrow`;

CREATE TABLE `borrow` (
  `borrow_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) NOT NULL,
  `book_id` int(11) NOT NULL,
  `borrow_date` datetime NOT NULL,
  `return_date` datetime NOT NULL,
  `return_state` tinyint(2) NOT NULL DEFAULT '0' COMMENT '0未还1已还',
  PRIMARY KEY (`borrow_id`),
  UNIQUE KEY `stu_id` (`stu_id`,`book_id`),
  KEY `fk_borrow_book` (`book_id`),
  CONSTRAINT `fk_borrow_book` FOREIGN KEY (`book_id`) REFERENCES `book` (`book_id`),
  CONSTRAINT `fk_borrow_student` FOREIGN KEY (`stu_id`) REFERENCES `student` (`stu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `borrow` */

insert  into `borrow`(`borrow_id`,`stu_id`,`book_id`,`borrow_date`,`return_date`,`return_state`) values (1,1,1,'2019-06-25 16:11:50','2019-07-01 16:12:05',0),(9,1,2,'2019-06-25 19:30:12','2019-07-25 19:30:12',0);

/*Table structure for table `forum` */

DROP TABLE IF EXISTS `forum`;

CREATE TABLE `forum` (
  `forum_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) NOT NULL,
  `forum_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `forum_title` varchar(100) NOT NULL,
  `forum_content` varchar(255) NOT NULL,
  PRIMARY KEY (`forum_id`),
  KEY `fk_forum_student` (`stu_id`),
  CONSTRAINT `fk_forum_student` FOREIGN KEY (`stu_id`) REFERENCES `student` (`stu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `forum` */

insert  into `forum`(`forum_id`,`stu_id`,`forum_date`,`forum_title`,`forum_content`) values (1,1,'2019-06-25 16:13:24','求推荐好书','如题'),(2,1,'2019-06-26 12:46:36','呜呜呜呜呜呜呜呜无无无无无无无无无无无无呜呜呜呜呜呜呜无无无无无无无无无无无无呜呜呜呜呜呜呜呜无无无无无无无无无无无无呜呜呜呜呜呜呜呜无无无无无无无无无无无无呜呜呜呜呜呜呜呜无无无无无无无无无无无无a','呜呜呜呜呜呜呜呜无无无无无无无无无无无无');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `stu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生id',
  `stu_number` char(12) NOT NULL COMMENT '学号',
  `stu_name` varchar(50) NOT NULL COMMENT '学生姓名',
  `stu_gender` tinyint(2) NOT NULL COMMENT '学生性别0是男1是女',
  `stu_class` varchar(100) NOT NULL COMMENT '学生班级',
  `stu_dept` varchar(50) NOT NULL COMMENT '学生学院',
  `stu_major` varchar(50) NOT NULL COMMENT '学生专业',
  `stu_password` varchar(50) NOT NULL COMMENT '学生密码（MD5）',
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`stu_id`,`stu_number`,`stu_name`,`stu_gender`,`stu_class`,`stu_dept`,`stu_major`,`stu_password`) values (1,'201711701120','蒙家辉',0,'软件卓越1171','数学与计算机','软件工程','123456'),(2,'201711701202','曾智杰',0,'软件卓越1171','数学与计算机','软件工程','123456');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
