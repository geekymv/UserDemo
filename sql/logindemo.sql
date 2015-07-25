
create database logindemo;
 
create table t_users(
	id int primary key auto_increment,
	username varchar(30),
	password varchar(20)
);

insert into t_users(username, password) values('miying', '123');