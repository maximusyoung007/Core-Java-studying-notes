create database mb

use mb; 
create table category (
  id int(11) not null AUTO_INCREMENT,
  name varchar(32) default null,
  primary key (id)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

insert into category values (null,'category1');
insert into category values (null,'category2');

create table product (
  id int(11) not null AUTO_INCREMENT,
  name varchar(32) default null,
  price float(11) default null,
  primary key (id)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

insert into product values(null,'product1',12);
insert into product values(null,'product2',22);

drop table product;

create table product(
id int NOT NULL AUTO_INCREMENT,
name varchar(30)  DEFAULT NULL,
price float  DEFAULT 0,
cid int ,
PRIMARY KEY (id)
)AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO category VALUES (1,'category1');
INSERT INTO category VALUES (2,'category2');
INSERT INTO product VALUES (1,'product a', 88.88, 1);
INSERT INTO product VALUES (2,'product b', 88.88, 1);
INSERT INTO product VALUES (3,'product c', 88.88, 1);
INSERT INTO product VALUES (4,'product x', 88.88, 2);
INSERT INTO product VALUES (5,'product y', 88.88, 2);
INSERT INTO product VALUES (6,'product z', 88.88, 2);