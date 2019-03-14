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

相关商品：
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
update product set date="20180217130205" where id=1;
update product set date="20180217130205" where id=2;
update product set date="20180217130205" where id=4;
update product set date="20180217130205" where id=5;
update product set date="20180217130205" where id=6;
update product set date="20180217130205" where id=7;
update product set date="20180217130205" where id=8;
update product set date="20180217130205" where id=9;
insert into product values(null,'面膜',100,"20180225120535",12);
update product set name='卫龙辣条',no=5 where id=10;

外键约束 foreign key
给product中的num添加一个外键约束
alter table product add foreign key(no) references category(id);
insert into product values(null,'面膜',100,"20180225120535",12);(wrong)
delete from category where id=5;//delete failed

建数据库原则
一个项目建一个数据库

多表建表原则
一对多：商品和分类 在多的一方添加外键到一的一方
多对多：学生和老师 学生和课程
多建一张中间表，将多对多的关系建为一对多的关系
一对一：公民和身份证
实际用途：拆表，将重要信息和非重要信息拆开

商城案例：用户表 订单表 商品表 商品分类表
用户表：用户名ID 用户名 密码 手机码
用户ID：用户ID 地址（可能有多个）
订单表：订单编号 订单总价 创建时间 收货地址 外键uno指向用户ID
商品表：编号 名称 价格 外键cno指向商品分类ID
商品分类：ID 名称 描述
订单表和商品表多对多，建立新表订单项：外键ono指向订单表ID ，外键pno指向商品表ID

用户表：ID 用户名 密码 手机号
create table user(
	uid int primary key auto_increment,
	username varchar(31),
	password varchar(31),
	phone varchar(11)
);
insert into user values (1,'zhangsan','123456','111');

订单表：编号 总价 订单时间 地址 外键用户的ID
create table orders(
	oid int primary key auto_increment,
	sum int,
	otime timestamp,
	address varchar(100),
	uno int,
	foreign key(uno) references user(uid) 
);
insert into orders values(1,200,'20180217130205','nanjing',1);
insert into orders values(2,200,'20180217130205','nanjing',1);

商品表 ID 名称 价格 外键cno
create table commodity(
	cid int primary key auto_increment,
	cname varchar(10),
	cprice double,
	cno int,
	foreign key(cno) references classify(id)
);
insert into commodity values(1,'小米9',3999,1);
insert into commodity values(null,'亚瑟士gt2000',955,2);
insert into commodity values(null,'中华',60,3);
insert into commodity values(null,'光明如实',9,4);
insert into commodity values(null,'泡椒凤爪',3,5);
insert into commodity values(null,'iPhone X',10000,1);
insert into commodity values(null,'联想电脑包',70,2);
insert into commodity values(null,'可口可乐',3,3);
insert into commodity values(null,'旺旺大饼',2,5);

商品分类表 ID 名称 描述
create table classify(
	id int primary key auto_increment,
	name varchar(20),
	dis varchar(100)
);
insert into classify values(null,'手机数码','小米9发布');
insert into classify values(null,'鞋靴箱包','耐克、阿迪等品牌入驻');
insert into classify values(null,'香烟酒水','新上市古巴雪茄');
insert into classify values(null,'酸奶饼干','不是每一种牛奶，都叫特仑苏');
insert into classify values(null,'馋嘴零食','五香瓜子欢迎品尝');

订单项：中间表 订单ID 商品ID 商品数量 订单项总价 
create table item_orders(
	ioid int ,
	cid int,
	sum int,
	sum_price double,
	foreign key(ioid) references orders(oid),
	foreign key(cid) references commodity(cid)
);
insert into item_orders values(1,16,100,200);
insert into item_orders values(2,14,1,70);
insert into item_orders values(2,16,65,130);

多表查询
交叉连接查询 笛卡尔积
select * from commodity,classify;(笛卡尔积)
过滤出有意义的数据
select * from commodity,classify where cno=id;
隐式内连接:在查询结果的基础上去做where条件过滤
select * from commodity co,classify cl where co.cno=cl.id;
显式内连接：带着条件去查询结果，执行效率更高
select * from commodity co inner join classify cl on co.cno=cl.id;

左外连接：会将左表的所有数据都查询出来，若右表没数据，用null替代
select * from commodity co left outer join classify cl on co.cno=cl.id;
右外连接：
select * from commodity co right outer join classify cl on co.cno=cl.id;

insert into commodity values(null,'apple',10,null);
insert into classify values(100,"健身保养","面膜");

分页查询：
select * from commodity limit 0,5;
select * from commodity limit 8,3;

子查询
查询分类名称为手机数码的所有商品
select * from commodity 
where cno=(select id from classify where name='手机数码');

查询出（商品名称，商品分类名称）信息
左连接
select p.cname,cl.name from commodity p left outer join classify cl 
on p.cno=cl.id;
子查询
select cname as 商品名称,(select name from classify cl where p.cno=cl.id) 
as 商品分类名称 from commodity p;

员工信息表
CREATE TABLE emp(
	empno INT,
	ename VARCHAR(50),
	job VARCHAR(50),
	mgr	INT,
	hiredate DATE,
	sal	DECIMAL(7,2),
	comm DECIMAL(7,2),
	deptno INT
);

INSERT INTO emp values(7369,'SMITH','CLERK',7902,'1980-12-17',800,NULL,20);
INSERT INTO emp values(7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO emp values(7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30);
INSERT INTO emp values(7566,'JONES','MANAGER',7839,'1981-04-02',2975,NULL,20);
INSERT INTO emp values(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
INSERT INTO emp values(7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,NULL,30);
INSERT INTO emp values(7782,'CLARK','MANAGER',7839,'1981-06-09',2450,NULL,10);
INSERT INTO emp values(7788,'SCOTT','ANALYST',7566,'1987-04-19',3000,NULL,20);
INSERT INTO emp values(7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
INSERT INTO emp values(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
INSERT INTO emp values(7876,'ADAMS','CLERK',7788,'1987-05-23',1100,NULL,20);
INSERT INTO emp values(7900,'JAMES','CLERK',7698,'1981-12-03',950,NULL,30);
INSERT INTO emp values(7902,'FORD','ANALYST',7566,'1981-12-03',3000,NULL,20);
INSERT INTO emp values(7934,'MILLER','CLERK',7782,'1982-01-23',1300,NULL,10);
INSERT INTO emp values(7981,'MILLER','CLERK',7788,'1992-01-23',2600,500,20);

部门信息表
CREATE TABLE dept(
	deptno		INT,
	dname		varchar(14),
	loc		varchar(13)
);

INSERT INTO dept values(10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO dept values(20, 'RESEARCH', 'DALLAS');
INSERT INTO dept values(30, 'SALES', 'CHICAGO');
INSERT INTO dept values(40, 'OPERATIONS', 'BOSTON');

最高工资：
select max(sal) from emp;
最低工资
select min(sal) from emp;
最高工资员工信息
select* from emp where sal=(select max(sal) from emp);
最低工资员工信息
select * from emp where sal=(select min(sal) from emp);