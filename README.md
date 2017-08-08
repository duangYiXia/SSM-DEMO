# SSM-DEMO
spring+springMVC+mybatis   
使用数据库版本：5.7.17 对应驱动版本：5.1.17   数据库表格脚本：

DROP TABLE IF EXISTS emps;
CREATE TABLE emps (id int(10) NOT NULL, name varchar(30) NOT NULL, age int(10) NOT NULL, salary float NOT NULL, PRIMARY KEY (id) ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into emps(id,name,age,salary) values (1,'zjx',21,100); 
insert into emps(id,name,age,salary) values (2,'zht',22,110); 
insert into emps(id,name,age,salary) values (3,'qqq',23,120); 
insert into emps(id,name,age,salary) values (4,'www',24,130); 
insert into emps(id,name,age,salary) values (5,'aaa',25,140); 
insert into emps(id,name,age,salary) values (6,'qzzzqq',26,150)   

dao mapping model由本地自动生成   
详情参考博客： http://blog.csdn.net/qq_23489303/article/details/76890406
