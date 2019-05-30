create database learnssm;

use learnssm;

create table category (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(30),
  PRIMARY KEY (id)
) DEFAULT CHARSET=UTF8;

insert into category values(null,"category1");
insert into category values(null,"category2");
insert into category values(null,"category3");
insert into category values(null,"category4");
insert into category values(null,"category5");
 
select * from category;
