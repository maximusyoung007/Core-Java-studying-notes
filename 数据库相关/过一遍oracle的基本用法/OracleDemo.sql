select * from hr.employees
select salary*12 "年薪" from hr.employees
select salary*12 as "年薪" from hr.employees
select salary*12 as 年薪 from hr.employees
select salary*12 年薪 from hr.employees
select last_name,first_name from hr.employees
select last_name || first_name 姓名 from hr.employees
select last_name ||' ' || first_name 姓名 from hr.employees
select department_id from hr.employees
select distinct department_id from hr.employees
select * from hr.employees where salary > 5000
select * from hr.employees where salary between 3000 and 5000
select * from hr.employees where salary in (3000,6000)
select * from hr.employees where first_name like '%a_'
select * from hr.employees where department_id is null
select * from hr.employees where salary >= 3000 and salary <= 5000
select * from hr.employees where first_name like '%a_' or first_name like '_a%'
select * from hr.employees where first_name not like '%a_'
select * from hr.employees order by salary desc

select e.first_name,e.department_id from hr.employees e

select d.department_id,d.department_name from hr.departments d

select e.first_name,d.department_name from hr.employees e left join hr.departments d on e.department_id = d.department_id

select count(*) from hr.employees e where e.salary > 5000

select max(salary),min(salary) from hr.employees e where e.department_id=100

select avg(salary) from hr.employees e

select avg(salary) from hr.employees e where e.department_id = 90

select avg(salary) from hr.employees e where e.department_id = 100

select avg(salary) from hr.employees e where e.department_id = 110

select department_id from hr.employees

分组查询，分组的时候查询字段只能是统计函数或者被分组的字段
select avg(salary),e.department_id from hr.employees e group by e.department_id
select avg(salary),e.department_id from hr.employees e group by e.department_id

以部门分组，找出部门平均薪资高于5000的数据
select avg(salary),e.department_id from hr.employees e group by e.department_id having avg(salary) > 5000


以部门分组，找出部门平均薪资高于5000的数据
select avg(salary),e.department_id from hr.employees e group by e.department_id having avg(salary) > 5000

select e.salary from hr.employees e where e.first_name='Bruce'

select count(*) from hr.employees e where e.salary > 6000.00

子查询，查询出工资高于Bruce的人有多少个
select count(*) from hr.employees e where e.salary > 
(
 select e.salary from hr.employees e where e.first_name= 'Bruce'
)

使用rownum进行分页查询
只查出5条数据
select * from hr.employees e where rownum <= 5

查询出薪水最高的5-10条数据
select * from
(select rownum r, e1.* from
  (
   select e.* from hr.employees e  order by e.salary desc
  ) e1
) e2 where e2.r >=5 and e2.r<=10

create table hero(
       id number,
       name varchar2(30),
       hp number,
       mp number,
       damage number,
       armor number,
       speed number
)

insert into hero (id,name,hp,mp,damage,armor,speed) values(1,'炸弹人',450,200,45,3,300);
commit

创建sequence
create sequence hero_seq increment by 1 start with 1 maxvalue 9999999

获取hero_seq的下一个值
select hero_seq.nextval from dual

获取hero_seq的当前值
select hero_seq.currval from dual

用hero_seq设置id自增
insert into hero (id,name,hp,mp,damage,armor,speed) values(hero_seq.nextval,'炸弹人',450,200,45,3,300);

update hero set damage = 100 where id = 1;

update hero set damage = 120, armor=4 where id = 5;

delete from hero where id = 1

舍去表(清空表的内容)，且不能回滚
truncate table hero

修改表结构，新增列
alter table hero add (kills number)

修改列
alter table hero modify(name varchar2(300))

删除列（需要权限才能执行）
alter table hero drop column kills

删除表
drop table hero

unique表示唯一约束，name不能重复
create table hero(
   id number,
   name varchar2(30) unique,
   hp number,
   mp number,
   damage number,
   armor number,
   speed number
)

insert into hero (id,name,hp,mp,damage,armor,speed) values(hero_seq.nextval,'炸弹',450,200,45,4,30);

constraint自定义约束名
create table hero(
   id number,
   name varchar2(30),
   hp number,
   mp number,
   damage number,
   armor number,
   speed number,
   constraint uk_hero_name unique (name)
)

给已经存在的表增加约束
alter table hero add constraint pk_hero_id primary key (id)

删除约束
alter table hero drop constraint uk_hero_name

创造外键约束,保证插入数据的一致性
killerid 存放击杀英雄的id
killedid 存放被击杀英雄的id
number_ 存放击杀了多少次（因为number是关键字，所以使用number_作为字段名）
试图插入insert into kill_record (id,killerid,killedid,number_) values(1,2,300,1);会失败，
hero没有id=300的记录，违反了外键约束
create table kill_record(
   id number,
   killerid number,
   killedid number,
   number_ number,
   constraint fk_killer_hero foreign key (killerid) references hero(id),
   constraint fk_killed_hero foreign key (killedid) references hero(id)
)
       
创建视图
create view herosimple as(
    select id,name from hero
)
select * from herosimple;

修改table会导致视图的变化
update hero set name = '暗夜猎手' where id = 1;

修改视图,也会导致表的改变
update herosimple set name='戏命师' where id = 21;

select * from hero
 
