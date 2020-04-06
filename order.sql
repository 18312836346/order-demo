drop table if exists shop;
create table shop(
id int not null auto_increment,
product_name varchar (32) not null,
price integer(32) default null,
count integer(32) default null,
primary key (id)
)engine=InnoDB auto_increment=1 default  charset=utf8