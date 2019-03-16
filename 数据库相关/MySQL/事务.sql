开启事务：
start transaction;

查询事务隔离级别：
select @@transaction_isolation;

修改事务隔离级别为不提交可读：
set session transaction isolation level read uncommitted;

修改事务隔离级别为提交可读：
set session transaction isolation level read committed;

修改事务隔离级别为可重复读：
 set session transaction isolation level repeatable read;