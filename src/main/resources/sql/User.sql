create database if not exists study;
use study;
select database();
create table if not exists `user`
(
    id   int(11) auto_increment primary key comment "主键id",
    username varchar(255) comment '姓名',
    password varchar(255) comment '密码',
    age  int(3) comment '年纪'
) engine = InnoDb
  charset = utf8;
insert into user(username,password,age) values("zhangsan","123456",1);
insert into user(username,password,age) values("lisi","123456",2);
insert into user(username,password,age) values("wangwu","123456",3);
insert into user(username,password,age) values("zhaoliu","123456",4);
insert into user(username,password,age) values("dengchao","123456",5);
insert into user(username,password,age) values("sunli","123456",6);
insert into user(username,password,age) values("huangxiaoming","123456",7);
insert into user(username,password,age) values("zhaowei","123456",8);
insert into user(username,password,age) values("haungbo","123456",9);
insert into user(username,password,age) values("shenteng","123456",10);
insert into user(username,password,age) values("gaoyuanyuan","123456",11);
insert into user(username,password,age) values("wanghan","123456",12);