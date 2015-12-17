INSERT INTO `courseswitch`.`student` (`email`, `firstName`, `lastName`, `password`, `studentid`, `username`) VALUES ('eyob@mum.com', 'Eyob', 'Mokria', '1234', '984767', 'eyob');
INSERT INTO `courseswitch`.`student` (`email`, `firstName`, `lastName`, `password`, `studentid`, `username`) VALUES ('ted@mum.com', 'Ted', 'Malk', '1234', '987625', 'ted');
INSERT INTO `courseswitch`.`student` (`email`, `firstName`, `lastName`, `password`, `studentid`, `username`) VALUES ('lydia@mum.com', 'Lydia', 'john', '1234', '984324', 'lydia');

INSERT INTO `courseswitch`.`course` (`name`) VALUES ('Algorithm');
INSERT INTO `courseswitch`.`course` (`name`) VALUES ('ASD');
INSERT INTO `courseswitch`.`course` (`name`) VALUES ('Software Engineering');
INSERT INTO `courseswitch`.`course` (`name`) VALUES ('DBMS');
INSERT INTO `courseswitch`.`course` (`name`) VALUES ('WAA');
INSERT INTO `courseswitch`.`course` (`name`) VALUES ('EA');
INSERT INTO `courseswitch`.`course` (`name`) VALUES ('Parrallel Programming');
INSERT INTO `courseswitch`.`course` (`name`) VALUES ('Compilers');

UPDATE `courseswitch`.`course` SET `endDate`='2015-07-01', `startDate`='2015-07-29' WHERE `id`='1';
UPDATE `courseswitch`.`course` SET `endDate`='2015-08-01', `startDate`='2015-08-29' WHERE `id`='2';
UPDATE `courseswitch`.`course` SET `endDate`='2015-09-01', `startDate`='2015-09-29' WHERE `id`='3';
UPDATE `courseswitch`.`course` SET `endDate`='2015-10-01', `startDate`='2015-10-29' WHERE `id`='4';

UPDATE `courseswitch`.`course` SET `endDate`='2015-07-01', `startDate`='2015-07-29' WHERE `id`='5';
UPDATE `courseswitch`.`course` SET `endDate`='2015-08-01', `startDate`='2015-08-29' WHERE `id`='6';
UPDATE `courseswitch`.`course` SET `endDate`='2015-09-01', `startDate`='2015-09-29' WHERE `id`='7';
UPDATE `courseswitch`.`course` SET `endDate`='2015-10-01', `startDate`='2015-10-29' WHERE `id`='8';



INSERT INTO `courseswitch`.`registeredcourse` (`registeredCourse_id`, `student_id`) VALUES ('1', '1');
INSERT INTO `courseswitch`.`registeredcourse` (`registeredCourse_id`, `student_id`) VALUES ('2', '1');
INSERT INTO `courseswitch`.`registeredcourse` (`registeredCourse_id`, `student_id`) VALUES ('3', '1');
INSERT INTO `courseswitch`.`registeredcourse` (`registeredCourse_id`, `student_id`) VALUES ('4', '1');


INSERT INTO `courseswitch`.`registeredcourse` (`registeredCourse_id`, `student_id`) VALUES ('5', '2');
INSERT INTO `courseswitch`.`registeredcourse` (`registeredCourse_id`, `student_id`) VALUES ('6', '2');
INSERT INTO `courseswitch`.`registeredcourse` (`registeredCourse_id`, `student_id`) VALUES ('7', '2');
INSERT INTO `courseswitch`.`registeredcourse` (`registeredCourse_id`, `student_id`) VALUES ('8', '2');
