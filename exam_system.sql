/*
Navicat MySQL Data Transfer

Source Server         : localhost3306
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : exam_system

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-09-10 20:21:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for class_room
-- ----------------------------
DROP TABLE IF EXISTS `class_room`;
CREATE TABLE `class_room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_no` varchar(255) DEFAULT NULL,
  `room_place` varchar(255) DEFAULT NULL,
  `room_capacity` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class_room
-- ----------------------------
INSERT INTO `class_room` VALUES ('1', '东A001', '东馆', '80');
INSERT INTO `class_room` VALUES ('2', '东A002', '东馆', '120');
INSERT INTO `class_room` VALUES ('3', '东B001', '东馆', '80');
INSERT INTO `class_room` VALUES ('4', '东B002', '东馆', '120');

-- ----------------------------
-- Table structure for clazs
-- ----------------------------
DROP TABLE IF EXISTS `clazs`;
CREATE TABLE `clazs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(255) DEFAULT NULL,
  `class_grade` int(11) DEFAULT '0' COMMENT '班级人数',
  `class_count` int(11) DEFAULT NULL,
  `dep_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of clazs
-- ----------------------------
INSERT INTO `clazs` VALUES ('1', '软件162班', '2016', '15', '1');
INSERT INTO `clazs` VALUES ('2', '软件172班', '2017', '16', '2');
INSERT INTO `clazs` VALUES ('3', '计算机162班', '2016', '18', '1');
INSERT INTO `clazs` VALUES ('4', '计算机172班', '2017', '19', '1');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(255) DEFAULT NULL,
  `grade_id` int(11) DEFAULT '0',
  `course_gpa` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', 'Java基础', '1', '3');
INSERT INTO `course` VALUES ('2', 'C语言程序设计', '1', '3');
INSERT INTO `course` VALUES ('4', '数据库基础', '2', '4');

-- ----------------------------
-- Table structure for course_time
-- ----------------------------
DROP TABLE IF EXISTS `course_time`;
CREATE TABLE `course_time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11) DEFAULT NULL,
  `time_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_time
-- ----------------------------

-- ----------------------------
-- Table structure for course_time_room
-- ----------------------------
DROP TABLE IF EXISTS `course_time_room`;
CREATE TABLE `course_time_room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11) NOT NULL,
  `time_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_time_room
-- ----------------------------

-- ----------------------------
-- Table structure for date_time
-- ----------------------------
DROP TABLE IF EXISTS `date_time`;
CREATE TABLE `date_time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `week` int(11) DEFAULT NULL,
  `day` int(11) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of date_time
-- ----------------------------
INSERT INTO `date_time` VALUES ('6', null, null, '2019-09-17 00:00:00');
INSERT INTO `date_time` VALUES ('7', null, null, '2019-09-15 00:00:00');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dep_name` varchar(255) DEFAULT '0',
  `dep_leader` varchar(255) DEFAULT NULL,
  `dep_phone` varchar(255) DEFAULT NULL,
  `dep_detail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '计算机工程学院', '陈老师', '1599153165156', '优秀');
INSERT INTO `department` VALUES ('2', '通信工程学院', '很老师', '156153216', '良好');

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES ('8', '1');

-- ----------------------------
-- Table structure for exam_room
-- ----------------------------
DROP TABLE IF EXISTS `exam_room`;
CREATE TABLE `exam_room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `exam_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam_room
-- ----------------------------
INSERT INTO `exam_room` VALUES ('3', '8', '1');
INSERT INTO `exam_room` VALUES ('4', '8', '2');

-- ----------------------------
-- Table structure for exam_teacher
-- ----------------------------
DROP TABLE IF EXISTS `exam_teacher`;
CREATE TABLE `exam_teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `exam_id` int(11) NOT NULL,
  `teacher_id` int(11) NOT NULL COMMENT '监考老师',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam_teacher
-- ----------------------------
INSERT INTO `exam_teacher` VALUES ('11', '8', '1');
INSERT INTO `exam_teacher` VALUES ('12', '8', '2');
INSERT INTO `exam_teacher` VALUES ('13', '8', '3');
INSERT INTO `exam_teacher` VALUES ('14', '8', '4');

-- ----------------------------
-- Table structure for exam_time
-- ----------------------------
DROP TABLE IF EXISTS `exam_time`;
CREATE TABLE `exam_time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `exam_id` int(11) DEFAULT NULL,
  `time_id` int(11) DEFAULT NULL COMMENT '考试时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam_time
-- ----------------------------
INSERT INTO `exam_time` VALUES ('10', '8', '11');
INSERT INTO `exam_time` VALUES ('11', '8', '12');

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `grade` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('1', '2019', '1');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_no` varchar(255) NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `student_sex` varchar(255) DEFAULT NULL,
  `student_phone` varchar(255) DEFAULT NULL,
  `student_address` varchar(255) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `student_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '202161100', '123', '男', '15151515131', 'chinaa', '1', null);
INSERT INTO `student` VALUES ('2', '202161109', '257173', '男', '15996351114', 'china', '1', null);
INSERT INTO `student` VALUES ('3', '202161111', '123', '女', '999999999', 'chinn', '3', null);
INSERT INTO `student` VALUES ('4', '202161125', '123', '女', '999999999', 'chinn', '2', null);
INSERT INTO `student` VALUES ('5', '20216110119', 'aaa', null, '15561651-', 'china', '1', '123456');

-- ----------------------------
-- Table structure for stu_course
-- ----------------------------
DROP TABLE IF EXISTS `stu_course`;
CREATE TABLE `stu_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `course_id` int(11) DEFAULT NULL,
  `score` double DEFAULT '-1' COMMENT '分数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu_course
-- ----------------------------
INSERT INTO `stu_course` VALUES ('1', '1', '1', '-1');
INSERT INTO `stu_course` VALUES ('2', '2', '2', '-1');
INSERT INTO `stu_course` VALUES ('3', '3', '1', '-1');
INSERT INTO `stu_course` VALUES ('4', '2', '1', '-1');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_no` varchar(255) NOT NULL,
  `teacher_name` varchar(255) DEFAULT NULL,
  `teacher_prof` varchar(255) NOT NULL,
  `teacher_phone` varchar(255) DEFAULT NULL,
  `teacher_password` varchar(255) NOT NULL,
  `dep_id` int(11) DEFAULT NULL COMMENT '教师所属院系',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', 't001', 'C老师', '高级', '151651315616', '123456', '1');
INSERT INTO `teacher` VALUES ('2', 't001', 'A老师', '高级教师', '1321', '123456', '1');
INSERT INTO `teacher` VALUES ('3', '123', 'B老师', '中级教师', '1231', '1231', '2');
INSERT INTO `teacher` VALUES ('4', '123', 'D老师', '中级教师', '31132', '123', '2');
INSERT INTO `teacher` VALUES ('5', '11123', 'E老师', '中级教师', '1231561564654', '121', '3');
INSERT INTO `teacher` VALUES ('6', '1231', 'F老师', '初级教师', '1231', '1321', '1');

-- ----------------------------
-- Table structure for teach_plan
-- ----------------------------
DROP TABLE IF EXISTS `teach_plan`;
CREATE TABLE `teach_plan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teach_plan
-- ----------------------------
INSERT INTO `teach_plan` VALUES ('1', '1', '1');
INSERT INTO `teach_plan` VALUES ('2', '1', '2');
INSERT INTO `teach_plan` VALUES ('4', '3', '1');

-- ----------------------------
-- Table structure for time
-- ----------------------------
DROP TABLE IF EXISTS `time`;
CREATE TABLE `time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `grade_id` int(11) NOT NULL DEFAULT '2019',
  `date_id` int(11) NOT NULL,
  `time_order` int(11) NOT NULL DEFAULT '0' COMMENT '第order节课',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of time
-- ----------------------------
INSERT INTO `time` VALUES ('11', '1', '7', '6');
INSERT INTO `time` VALUES ('12', '1', '7', '5');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `no` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `identity` varchar(255) NOT NULL COMMENT '用户身份',
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `no` (`no`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '202161109', '123456', 'student-user', 'CCC');
INSERT INTO `user` VALUES ('2', '000001', '123456', 'teacher-user', 'teacher');
INSERT INTO `user` VALUES ('3', '000002', '123456', 'admin-user', 'admin');
