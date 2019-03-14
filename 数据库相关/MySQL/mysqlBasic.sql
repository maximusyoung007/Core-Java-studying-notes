登陆mysql：
mysql -u root -p 之后输入密码

创建数据库： 
create database feb;

创建数据库指定字符集： 
create database feb1 character set utf8;

创建数据库指定字符集和校对规则： 
create database feb2 character set utf8 collate utf8_bin;

查看数据库：
show databases;

查看数据库定义的语句：
show create database feb;

修改数据的字符集：
alter database feb character set gbk;

删除数据库：
drop database feb2;

切换/选中数据库：
use feb1;

查看当前正在使用的数据库：
select database();

创建表：（列名 列的类型 约束）
create table student(
    name varchar(10) ,
    sex int,
    age int,
    id int primary key 
);

查看所有的表：
show tables;

查看表的定义：
show create table student;

查看表的结构：
desc student;

添加列（add）：
alter table student add score int not null;

修改列（modify）：
alter table student modify sex varchar(2);

修改列名（change）：
alter table student change sex gender varchar(2);

删除列（drop）：
alter table student drop age;

修改表名（rename）：
rename table student to teacher;

插入数据（insert）：
insert into 表名（列名1，列名2，列名3）values(值1，值2，值3）
insert into student(name,gender,id,score) values('nancy','female',11,90);
insert into student values('mike','男',12,90);
insert into student(name,id,score) values('杨允书',13,90);

批量插入：
insert into student values('mike','男',14,90),('mike','男',15,90),('mike','男',16,90);

删除表中数据：
delete from student where id=13;
delete from student;（全删）
delete：DML 一条一条删除表中的数据
truncate：DDL 先删除表再重建表
哪个执行效率高，要看表中具体的数据量，数据少，delete高效，数据多，truncate高效

更新表记录
update student set name="max" where id=16;
update student set name="batman",gender="female" where id=15;

查询表中数据：
select * from student;
select[distinct] [*]{列名，列名2} from表名{where 条件}

商品分类：
1.ID 2.名称 3.描述
create table category(
    id int primary key auto_increment,
    name varchar(20),
    discription varchar(200)
);
insert into category values(null,'手机数码','小米9发布');
insert into category values(null,'鞋靴箱包','耐克、阿迪等品牌入驻');
insert into category values(null,'香烟酒水','新上市古巴雪茄');
insert into category values(null,'酸奶饼干','不是每一种牛奶，都叫特仑苏');
insert into category values(null,'馋嘴零食','五香瓜子欢迎品尝');
select * from category;
select name,discription from category;

相关商品
1.ID 2.名称 3.价格 4.生产日期 5.商品分类ID
create table product(
    id int primary key auto_increment,
    name varchar(10),
    price double,
    date timestamp,
    no int
);
insert into product values(null,'小米9',3999,null,1);
insert into product values(null,'亚瑟士gt2000',955,null,2);
insert into product values(null,'中华',60,null,3);
insert into product values(null,'光明如实',9,null,4);
insert into product values(null,'泡椒凤爪',3,null,5);
insert into product values(null,'iPhone X',10000,null,1);
insert into product values(null,'联想电脑包',70,null,2);
insert into product values(null,'可口可乐',3,null,3);
insert into product values(null,'旺旺大饼',2,null,5);
update product set date="20180217130205" where id=3;

查询商品名称和商品价格
select name,price from product;

别名查询
select p.name,p.price from product as p;
as关键字可省略
select name as 商品名称 ,price as 商品价格 from product;

删除重复
查询商品价格
select price from product;
select distinct price from product;

select运算查询，仅仅在查询结果上做了运算
select *,price*1.5 from product;
select *,price*0.5 as 折后价 from product;

条件查询where
select * from product where price>60;
select * from product where price!=70;
select * from product where price>10 and price<100;
select * from product where price between 10 and 100;(前小后大)
select * from product where price>9000 or price<100;

模糊查询
查出名字中带有饼的商品
select * from product where name like '%饼%';
查询第二个字是园的商品
select * from product where name like '_园%';
查询商品分类ID在1,4,5的商品
select * from product where num in (1,4,5);

排序
asc:升序 desc:降序
select * from product order by price;
select * from product order by price desc;
select * from product where name like '%小%' order by price desc;

聚合函数sum() avg() count() max() min() where后不能使用
select sum(price) from product;
select avg(price) from product;
select count(*) from product;
select * from product where price > (select avg(price) from product);

分组group by
根据num字段分组，分组后统计商品的个数
select num,count(*) from product group by num;
select name,avg(price) from product group by num having avg(price)>60;
having出现在分组之后