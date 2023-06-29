### 回顾

```
1.连接数据库
	mysql -uroot -p123456
show databases;
create database java2309;
use java2309;
show tables;
create table person(id int, name varchar(32));


对数据进行增删改查:  开发中增删改查是必用！！！
insert into
delete
update
select

select * from person;
select id, name,age from person;

加条件  用where关键字
where  列（字段） 运算符 值;

```



### 1.查询【重点】

> 使用逻辑运算符
>
> &&  || 
>
> 在SQL语句里面可以使用 and   or 关键字

```mysql

#查找年龄是25岁的并且名字为世豪的
mysql> select * from person where age = 25 && name="世豪";
+------+--------+------+--------+--------+---------------------+
| id   | name   | age  | salary | gender | regTime             |
+------+--------+------+--------+--------+---------------------+
|    5 | 世豪   |   25 | 900.00 |      0 | 2023-06-28 16:16:11 |
+------+--------+------+--------+--------+---------------------+
1 row in set (0.01 sec)
#使用and关键字
mysql> select * from person where age = 25 and name="世豪";
+------+--------+------+--------+--------+---------------------+
| id   | name   | age  | salary | gender | regTime             |
+------+--------+------+--------+--------+---------------------+
|    5 | 世豪   |   25 | 900.00 |      0 | 2023-06-28 16:16:11 |
+------+--------+------+--------+--------+---------------------+
#查找年龄是56岁的或者薪资为900
mysql> select * from person where age = 56 || salary=900;
+------+--------+------+---------+--------+---------------------+
| id   | name   | age  | salary  | gender | regTime             |
+------+--------+------+---------+--------+---------------------+
|    4 | 李聪   |   25 |  900.00 |      0 | 2023-06-28 16:15:16 |
|    5 | 世豪   |   25 |  900.00 |      0 | 2023-06-28 16:16:11 |
|    6 | 阿豪   |   56 | 8292.00 |      1 | 2023-06-28 17:01:13 |
+------+--------+------+---------+--------+---------------------+
3 rows in set (0.01 sec)

mysql> select * from person where age = 56 or salary=900;
+------+--------+------+---------+--------+---------------------+
| id   | name   | age  | salary  | gender | regTime             |
+------+--------+------+---------+--------+---------------------+
|    4 | 李聪   |   25 |  900.00 |      0 | 2023-06-28 16:15:16 |
|    5 | 世豪   |   25 |  900.00 |      0 | 2023-06-28 16:16:11 |
|    6 | 阿豪   |   56 | 8292.00 |      1 | 2023-06-28 17:01:13 |
+------+--------+------+---------+--------+---------------------+
```

> 排序
>
> ORDER BY 语句用于根据指定的列对结果集进行排序。
>
> ORDER BY 语句默认按照升序对记录进行排序。
>
> 如果您希望按照降序对记录进行排序，可以使用 DESC 关键字。

```mysql
#按照薪资进行排序  默认的是升序排
mysql> select * from person;

mysql> select * from person order by salary;
#  asc 的话是默认升序的  是可以省略的
mysql> select * from person order by salary asc;
#按照薪资来排序，按照降序来排
mysql> select * from person order by salary desc;

#找出来年龄小于40岁的数据，然后降序来排  
mysql> select * from person where age < 40 order by salary desc;
+------+--------+------+-----------+--------+---------------------+
| id   | name   | age  | salary    | gender | regTime             |
+------+--------+------+-----------+--------+---------------------+
|    7 | 老邢   |   29 | 289229.00 |      1 | 2023-06-29 09:36:16 |
|    5 | 世豪   |   22 |    900.00 |      0 | 2023-06-28 16:16:11 |
|    4 | 李聪   |   25 |     90.00 |      0 | 2023-06-28 16:15:16 |
+------+--------+------+-----------+--------+---------------------+
#先按照薪资排升序排，如果薪资一样再按照年龄降序排
mysql> select * from person order by salary asc, age desc;
+------+--------+------+------------+--------+---------------------+
| id   | name   | age  | salary     | gender | regTime             |
+------+--------+------+------------+--------+---------------------+
|    4 | 李聪   |   25 |      90.00 |      0 | 2023-06-28 16:15:16 |
|    9 | 世奇   |   29 |     900.00 |      0 | 2023-06-29 09:47:02 |
|   10 | 永杰   |   25 |     900.00 |      1 | 2023-06-29 09:47:57 |
|    5 | 世豪   |   22 |     900.00 |      0 | 2023-06-28 16:16:11 |
|    6 | 阿豪   |   56 |    8292.00 |      1 | 2023-06-28 17:01:13 |
|    8 | 世达   |   98 |   27783.00 |      1 | 2023-06-29 09:37:48 |
|    7 | 老邢   |   29 |  289229.00 |      1 | 2023-06-29 09:36:16 |
|    3 | 豪哥   |   78 | 2637363.45 |      0 | 2023-06-28 15:31:31 |
+------+--------+------+------------+--------+---------------------+
#先按照薪资排序，如果薪资一样再按照年龄降序排，找出来年龄小于40岁的
mysql> select * from person where age < 40 order by salary asc, age desc;
+------+--------+------+-----------+--------+---------------------+
| id   | name   | age  | salary    | gender | regTime             |
+------+--------+------+-----------+--------+---------------------+
|    4 | 李聪   |   25 |     90.00 |      0 | 2023-06-28 16:15:16 |
|    9 | 世奇   |   29 |    900.00 |      0 | 2023-06-29 09:47:02 |
|   10 | 永杰   |   25 |    900.00 |      1 | 2023-06-29 09:47:57 |
|    5 | 世豪   |   22 |    900.00 |      0 | 2023-06-28 16:16:11 |
|    7 | 老邢   |   29 | 289229.00 |      1 | 2023-06-29 09:36:16 |
+------+--------+------+-----------+--------+---------------------+
5 rows in set (0.00 sec)

#注意事项：order by  只能跟在where的后面，不能放在where的前面

```

> limit  中文意思  限制输出
>
> 分页的时候需要使用到
>
> 语法格式：
>
> ​	
>
> ```
> limit  数字
> limit  数字1，数字2
> ```
>
> 

```mysql
mysql> select * from person;
+------+--------+------+------------+--------+---------------------+
| id   | name   | age  | salary     | gender | regTime             |
+------+--------+------+------------+--------+---------------------+
|    3 | 豪哥   |   78 | 2637363.45 |      0 | 2023-06-28 15:31:31 |
|    4 | 李聪   |   25 |      90.00 |      0 | 2023-06-28 16:15:16 |
|    5 | 世豪   |   22 |     900.00 |      0 | 2023-06-28 16:16:11 |
|    6 | 阿豪   |   56 |    8292.00 |      1 | 2023-06-28 17:01:13 |
|    7 | 老邢   |   29 |  289229.00 |      1 | 2023-06-29 09:36:16 |
|    8 | 世达   |   98 |   27783.00 |      1 | 2023-06-29 09:37:48 |
|    9 | 世奇   |   29 |     900.00 |      0 | 2023-06-29 09:47:02 |
|   10 | 永杰   |   25 |     900.00 |      1 | 2023-06-29 09:47:57 |
+------+--------+------+------------+--------+---------------------+
8 rows in set (0.00 sec)

#前三条
mysql> select * from person limit 3;
+------+--------+------+------------+--------+---------------------+
| id   | name   | age  | salary     | gender | regTime             |
+------+--------+------+------------+--------+---------------------+
|    3 | 豪哥   |   78 | 2637363.45 |      0 | 2023-06-28 15:31:31 |
|    4 | 李聪   |   25 |      90.00 |      0 | 2023-06-28 16:15:16 |
|    5 | 世豪   |   22 |     900.00 |      0 | 2023-06-28 16:16:11 |
+------+--------+------+------------+--------+---------------------+
mysql> select * from person limit 0,3;
+------+--------+------+------------+--------+---------------------+
| id   | name   | age  | salary     | gender | regTime             |
+------+--------+------+------------+--------+---------------------+
|    3 | 豪哥   |   78 | 2637363.45 |      0 | 2023-06-28 15:31:31 |
|    4 | 李聪   |   25 |      90.00 |      0 | 2023-06-28 16:15:16 |
|    5 | 世豪   |   22 |     900.00 |      0 | 2023-06-28 16:16:11 |
+------+--------+------+------------+--------+---------------------+
3 rows in set (0.00 sec)

mysql> select * from person limit 3,3;
+------+--------+------+-----------+--------+---------------------+
| id   | name   | age  | salary    | gender | regTime             |
+------+--------+------+-----------+--------+---------------------+
|    6 | 阿豪   |   56 |   8292.00 |      1 | 2023-06-28 17:01:13 |
|    7 | 老邢   |   29 | 289229.00 |      1 | 2023-06-29 09:36:16 |
|    8 | 世达   |   98 |  27783.00 |      1 | 2023-06-29 09:37:48 |
+------+--------+------+-----------+--------+---------------------+
3 rows in set (0.00 sec)

mysql> select * from person limit 6,3;
+------+--------+------+--------+--------+---------------------+
| id   | name   | age  | salary | gender | regTime             |
+------+--------+------+--------+--------+---------------------+
|    9 | 世奇   |   29 | 900.00 |      0 | 2023-06-29 09:47:02 |
|   10 | 永杰   |   25 | 900.00 |      1 | 2023-06-29 09:47:57 |
+------+--------+------+--------+--------+---------------------+
2 rows in set (0.00 sec)

#扩展:     
当前页 1
分页:  limit (当前页 - 1) * 每页显示的数据,  每页显示的数据; 
java代码中会给当前页和每页显示的数据  这两个变量，算出来  偏移量！！！
```

> 
>
> **SQL 拥有很多可用于计数和计算的内建函数。**
>
> ##### 函数的语法
>
> 内建 SQL 函数的语法是：
>
> ```
> SELECT function(列) FROM 表
> ```

```mysql
#SQL的内置函数
#一般不建议使用 除非没办法了采用
#语法格式：select  sql函数 from person;
#获取年龄这一列的最大值
mysql> select max(age) from person;
+----------+
| max(age) |
+----------+
|       98 |
+----------+
#获取年龄这一列最小值
mysql> select min(age) from person;
+----------+
| min(age) |
+----------+
|       23 |
+----------+
#求薪资这一类数据的平均值
mysql> select avg(salary) from person;
+-------------+
| avg(salary) |
+-------------+
|  696.848000 |
+-------------+
#求薪资这一列数据的和
mysql> select sum(salary) from person;
+-------------+
| sum(salary) |
+-------------+
|     6968.48 |
+-------------+
#开发用的函数，用来统计数据库里面有多少条数据的 count(*)
mysql> select count(*) from person;
+----------+
| count(*) |
+----------+
|        8 |
+----------+
1 row in set (0.00 sec)
#开发中还有一种写法 count(1)
mysql> select count(1) from person;
+----------+
| count(1) |
+----------+
|       11 |
#方法 查看官方手册看一下这些方法即可，不需要记的  我没有讲的就不需要记的！@！@！！

```

练习：

```mysql
#找出年龄最大的这条数据  查询所有的字段信息


#先按照年龄排序降序，limit取第一条数据
mysql> select * from person order by age desc limit 1;
+------+--------+------+----------+--------+---------------------+
| id   | name   | age  | salary   | gender | regTime             |
+------+--------+------+----------+--------+---------------------+
|    8 | 世达   |   98 | 27783.00 |      1 | 2023-06-29 09:37:48 |
+------+--------+------+----------+--------+---------------------+
1 row in set (0.00 sec)
#咱们嵌套sql 一个SQL语句结果当成另外一个SQL语句条件来使用了，开发有这种的写法，但是很少用，效率太低了
#使用max函数找到年龄最大的值，然后这个值会当成另外一个sql语句的条件来使用
mysql> select max(age) from person;
+----------+
| max(age) |
+----------+
|       98 |
+----------+
1 row in set (0.00 sec)

mysql> select * from person where age = 98;
+------+--------+------+----------+--------+---------------------+
| id   | name   | age  | salary   | gender | regTime             |
+------+--------+------+----------+--------+---------------------+
|    8 | 世达   |   98 | 27783.00 |      1 | 2023-06-29 09:37:48 |
+------+--------+------+----------+--------+---------------------+
1 row in set (0.00 sec)
mysql> select * from person where age = (select max(age) from person);
+------+--------+------+----------+--------+---------------------+
| id   | name   | age  | salary   | gender | regTime             |
+------+--------+------+----------+--------+---------------------+
|    8 | 世达   |   98 | 27783.00 |      1 | 2023-06-29 09:37:48 |
+------+--------+------+----------+--------+---------------------+

#扩展的知识点
#一个SQL语句的结果当成了另外一个SQL语句的条件来看待了！！！

```

> 分组统计：
>
> GROUP BY 语句用于结合合计函数，根据一个或多个列对结果集进行分组。
>
> 

```mysql
#1.按照性别进行分组统计
#注意事项  select和from中间是查询的字段，如果用了group by 以后不能胡乱写了，只能写
#当前分组的字段或者是SQL内置函数得到的结果
mysql> select gender from person group by gender;
+--------+
| gender |
+--------+
|      0 |
|      1 |
+--------+
#2.分组以后进行统计，统计出来 0 有几个数据  1  有几个数据

mysql> select gender, count(*) from  person group by gender;
+--------+----------+
| gender | count(*) |
+--------+----------+
|      0 |        4 |
|      1 |        4 |
+--------+----------+

#3.按照性别进行分组，分组以后统计个数大于4的性别数
#注意事项：分组以后的条件 用where？可以吗？不行的。使用having   分组以后的条件使用having关键
#在 SQL 中增加 HAVING 子句原因是，WHERE 关键字无法与合计函数一起使用。
mysql> select gender,count(*) from person  group by gender having count(*) > 4;
+--------+----------+
| gender | count(*) |
+--------+----------+
|      0 |        5 |
+--------+----------+
#4.找出来年龄小于30岁的信息，然后按照性别分组统计，统计出来的结果的个数大于2的数据
#先找年龄小于30岁的
mysql> select gender, count(*)   #查什么
    -> from person               #从哪查
    -> where age < 30			#查询条件是啥
    -> group by gender			#分组
    -> having count(*) > 2;     #分组之后的条件
+--------+----------+
| gender | count(*) |
+--------+----------+
|      0 |        3 |
+--------+----------+
1 row in set (0.00 sec))

```

需要你们练习的:

https://www.w3school.com.cn/sql/sql_distinct.asp

##### DISTINCT   去重

https://www.w3school.com.cn/sql/sql_between.asp

**BETWEEN 操作符在 WHERE 子句中使用，作用是选取介于两个值之间的数据范围。**

https://www.w3school.com.cn/sql/sql_in.asp

IN 操作符允许我们在 WHERE 子句中规定多个值。

```
总结:
	1.where 字段 运算符 值
		运算符  =   >  <   >=  <=   !=   between  like
	2.and 或者  or
	where age > 20 and age < 30;
	3.order by  
	4.group by... having
	5.limit
	6.内置函数
```

### 2.数据的约束

> 在创建表的时候，一定要对字段进行设置约束，这样咱们在插入数据的时候，才是比较规范的
>
> 所以数据约束是创建表的时候对字段进行约束的。

#### 2.1默认值

```mysql
# default
#用户在插入的数据时候，如果没有给当前字段赋值，会给当前字段赋值一个默认值
mysql> create table person1(
    -> id int,
    -> name varchar(25),
    #想对一个字段加约束，在这个字段后面加default关键字  跟一个默认的值即可
    -> country char(20) default "PRC"
    -> );
Query OK, 0 rows affected (0.21 sec)


mysql> insert into person1(id, name) values(1, "老邢");
Query OK, 1 row affected (0.01 sec)

mysql> select * from person1;
+------+--------+---------+
| id   | name   | country |
+------+--------+---------+
|    1 | 老邢   | PRC     |
+------+--------+---------+
1 row in set (0.02 sec)

mysql> insert into person1(id, name, country) values(2, "骚磊", "中国");
Query OK, 1 row affected (0.01 sec)


mysql> select * from person1;
+------+--------+---------+
| id   | name   | country |
+------+--------+---------+
|    1 | 老邢   | PRC     |
|    2 | 骚磊   | 中国    |
+------+--------+---------+
```

#### 2.2非空

> not null：如果给字段设置了非空，在添加数据的时候，必须给当前字段设置值。如果不设置会报错的额

```mysql
mysql> create table person2 (
    -> id int not null,
    -> name varchar(32)
    -> );
Query OK, 0 rows affected (0.06 sec)

mysql> desc person2;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| id    | int(11)     | NO   |     | NULL    |       |
| name  | varchar(32) | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
2 rows in set (0.02 sec)

mysql> insert into person2 (name) values("土狗");
ERROR 1364 (HY000): Field 'id' doesnot have a default value
mysql> insert into person2 (id,name) values(1,"土狗");
Query OK, 1 row affected (0.01 sec)

mysql> select * from person2;
+----+--------+
| id | name   |
+----+--------+
|  1 | 土狗   |
+----+--------+
1 row in set (0.04 sec)
```

#### 2.3唯一

> 设置字段的值是唯一的，如果添加数据的时候重复数据的话会报错
>
> unique

```mysql
mysql> create table person3 (
    -> id int ,
    -> name varchar(25) unique
    -> );
Query OK, 0 rows affected (0.07 sec)

mysql> insert into person3(id, name) values(1, "浩然");
Query OK, 1 row affected (0.02 sec)

mysql> insert into person3(id, name) values(2, "浩然");
ERROR 1062 (23000): Duplicate entry '浩然' for key 'name'
```

#### 2.4主键【重点】

> 是唯一和非空的组合
>
> primary key
>
> 主键必须包含唯一的值。
>
> 主键列不能包含 NULL 值。
>
> 每个表都应该有一个主键，并且每个表只能有一个主键。

```mysql
#在设计数据库的时候，一定要有一个字段是主键的，而且主键的字段一般和业务逻辑无关。name和age能不能设置为主键？不能的的！！！ 开发中一般将id设置为主键
mysql> create table person4(
    -> id int primary key,
    -> name varchar(32)
    -> );
Query OK, 0 rows affected (0.08 sec)

mysql> insert into person4(name) values("狗蛋");
ERROR 1364 (HY000): Field 'id' doesno
t have a default value
mysql> insert into person4(id,name) values(1,l"狗蛋");
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near '"狗蛋
")' at line 1
mysql> insert into person4(id,name) values(1,"狗蛋");
Query OK, 1 row affected (0.03 sec)

mysql> insert into person4(id,name) values(1,"猫单");
```

#### 2.5自增长

> 在插入数据的时候有些字段是可以实现自增长的，自己增加1的意思
>
> auto_increment   一般在开发中  主键设置为自增长

```mysql
mysql> create table person5(
    -> id int primary key auto_increment,
    -> name varchar(20)
    -> );
Query OK, 0 rows affected (0.11 sec)

#在插入数据的时候，如果主键设置自增长，就可以不对主键进行赋值了，会从1开始一直往下加1
mysql> insert into person5 (name) values("狗蛋");
Query OK, 1 row affected (0.05 sec)

mysql> select * from person5;
+----+--------+
| id | name   |
+----+--------+
|  1 | 狗蛋   |
+----+--------+
1 row in set (0.00 sec)

mysql> insert into person5 (name) values("hanran");
Query OK, 1 row affected (0.06 sec)

mysql> insert into person5 (name) values("nanhang");
Query OK, 1 row affected (0.04 sec)

mysql> select * from person5;
+----+---------+
| id | name    |
+----+---------+
|  1 | 狗蛋    |
|  2 | hanran  |
|  3 | nanhang |
+----+---------+
mysql> delete from person5 where id = 3;
Query OK, 1 row affected (0.09 sec)
#在这删除最后一条数据的时候，然后再插入一条数据，这条数据的记录还是在原来基础上自己增加1
mysql> insert into person5 (name) values("machi");
Query OK, 1 row affected (0.02 sec)
mysql> insert into person5(id, name) values(10, "嘻嘻哒");
Query OK, 1 row affected (0.00 sec)
#插入数据局的时候，只看最后一个条数id值，在你这值上面增加1
#你们自己下去自己演示一下记住就行了，我只讲对的！！  在开发中吗，只要你的主键是自增的，那么
#从此以后插入数据的时候，就不用管主键了，因为自己可以自增，为啥还有复制呢额？是不是傻呢？
mysql> insert into person5 (name) values("全飞");
Query OK, 1 row affected (0.01 sec)

mysql> select * from person5;

```

```
mysql> create table person6(
    -> id int primary key auto_increment,
    -> name varchar(32) not null,
    -> age int not null,
    -> info text not null
    -> );
```

### 3.外键的约束

```mysql
#创建一个员工表  id  员工名  属于哪个部门   时间
mysql> create table employee (
    -> id int primary key auto_increment,
    -> empName varchar(32) not null,
    -> deptName varchar(32) not null,
    -> regTime timestamp default current_timestamp
    -> );
Query OK, 0 rows affected (0.09 sec)

mysql> insert into employee (empName, deptName) values("老邢", "教学部");
Query OK, 1 row affected (0.03 sec)

mysql> insert into employee (empName, deptName) values("雪珂", "品保部");
Query OK, 1 row affected (0.04 sec)

mysql> insert into employee (empName, deptName) values("骚磊", "教学部");
Query OK, 1 row affected (0.07 sec)

mysql> insert into employee (empName, deptName) values("凯旗", "技术部");
Query OK, 1 row affected (0.04 sec)

mysql> insert into employee (empName, deptName) values("老吕", "总经办");
Query OK, 1 row affected (0.02 sec)

mysql> select * from employee;
+----+---------+-----------+---------------------+
| id | empName | deptName  | regTime             |
+----+---------+-----------+---------------------+
|  1 | 老邢    | 教学部    | 2022-04-24 15:35:45 |
|  2 | 雪珂    | 品保部    | 2022-04-24 15:36:06 |
|  3 | 骚磊    | 教学部    | 2022-04-24 15:36:17 |
|  4 | 凯旗    | 技术部    | 2022-04-24 15:36:35 |
|  5 | 老吕    | 总经办    | 2022-04-24 15:36:51 |
+----+---------+-----------+---------------------+
5 rows in set (0.04 sec)
#你们感觉这样建表合适不合适？不合适。部门数据会出现冗余，这样不好的
#咋解决？分开建两个表  一个是部门表  一个员工表
mysql> drop table employee;
Query OK, 0 rows affected (0.31 sec)

mysql> create table employee (
    -> id int primary key auto_increment,
    -> empName varchar(32) not null,
    -> deptId int not null,
    -> regTime timestamp default current_timestamp
    -> );
Query OK, 0 rows affected (0.08 sec)

mysql> create table dept (
    -> id int primary key auto_increment,
    -> deptName varchar(32) not null
    -> );
Query OK, 0 rows affected (0.12 sec)

mysql> insert into dept(deptName) values("总经办");
Query OK, 1 row affected (0.01 sec)

mysql> insert into dept(deptName) values("教学部");
Query OK, 1 row affected (0.00 sec)

mysql> insert into dept(deptName) values("品保部");
Query OK, 1 row affected (0.00 sec)

mysql> insert into dept(deptName) values("技术部");
Query OK, 1 row affected (0.00 sec)

mysql> insert into employee (empName, deptId) values("老邢", 2);
Query OK, 1 row affected (0.13 sec)

mysql> insert into employee (empName, deptId) values("骚磊", 2);
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee (empName, deptId) values("帅栋", 2);
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee (empName, deptId) values("雪珂", 3);
Query OK, 1 row affected (0.03 sec)

mysql> insert into employee (empName, deptId) values("老吕", 1);
Query OK, 1 row affected (0.00 sec)

mysql> insert into employee (empName, deptId) values("凯旗", 4);
Query OK, 1 row affected (0.04 sec)

mysql> select * from dept;
+----+-----------+
| id | deptName  |
+----+-----------+
|  1 | 总经办    |
|  2 | 教学部    |
|  3 | 品保部    |
|  4 | 技术部    |
+----+-----------+
4 rows in set (0.00 sec)

mysql> select * from employee;
+----+---------+--------+---------------------+
| id | empName | deptId | regTime             |
+----+---------+--------+---------------------+
|  1 | 老邢    |      2 | 2022-04-24 15:48:41 |
|  2 | 骚磊    |      2 | 2022-04-24 15:48:49 |
|  3 | 帅栋    |      2 | 2022-04-24 15:48:57 |
|  4 | 雪珂    |      3 | 2022-04-24 15:49:12 |
|  5 | 老吕    |      1 | 2022-04-24 15:49:20 |
|  6 | 凯旗    |      4 | 2022-04-24 15:49:32 |
+----+---------+--------+---------------------+
6 rows in set (0.04 sec)

#插入一条员工数据，员工的部门id为8,能不能插入成功！能！！！ 一个不存在的部门，招了一个人  合适不？
mysql> insert into employee (empName, deptId) values("浩然", 8);
Query OK, 1 row affected (0.05 sec)
#删除一个部门 常规来讲：删除一个部门，那么部门下面的员工存在不？不能存在
mysql> delete from dept where id = 1;
Query OK, 1 row affected (0.07 sec)
#以上两种情况都是不符合咱们开发的实际需求的！！ 咋办？  加外键约束  把两张表变成一个绳上的蚂蚱
#
mysql> create table employee (
    -> id int primary key auto_increment,
    -> empName varchar(32) not null,
    -> deptId int not null,
    -> regTime timestamp default current_timestamp,
    #constraint  约束的意思
    #fk_emp_dep  外键的名字可以随便起，但是一般起做  fk_一张表名_另外一张表
    
    #foreign key(deptId) 外键   本表里面的一个字段 要去关联另外一张表中一个字段的
    #references  关联   dept(id)  dept  另外一张表的名字  (id)  另外一张表中的的字段
    #两张表得有关系
    -> constraint fk_emp_dep foreign key(deptId) references dept(id)
    -> );
Query OK, 0 rows affected (0.09 sec)

mysql> insert into employee (empName, deptId) values("老邢", 2);
Query OK, 1 row affected (0.04 sec)

mysql> insert into employee (empName, deptId) values("骚磊", 2);
Query OK, 1 row affected (0.06 sec)

mysql> insert into employee (empName, deptId) values("帅栋", 2);
Query OK, 1 row affected (0.00 sec)

mysql> insert into employee (empName, deptId) values("雪珂", 3);
Query OK, 1 row affected (0.05 sec)

mysql> select * from dept;
+----+-----------+
| id | deptName  |
+----+-----------+
|  2 | 教学部    |
|  3 | 品保部    |
|  4 | 技术部    |
+----+-----------+
3 rows in set (0.06 sec)
#为啥插入不进去老吕和浩然呢？ 因为deptId这个字段和dept(id) 进行绑定了
mysql> insert into employee (empName, deptId) values("老吕", 1);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint f
ails (`java2204`.`employee`, CONSTRAINT `fk_emp_dep` FOREIGN KEY (`deptId`) REFE
RENCES `dept` (`id`))
mysql> insert into employee (empName, deptId) values("浩然", 8);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint f
ails (`java2204`.`employee`, CONSTRAINT `fk_emp_dep` FOREIGN KEY (`deptId`) REFE
RENCES `dept` (`id`))
#为啥不让我删除id 为3的部门
mysql> delete from dept where id = 3;
ERROR 1451 (23000): Cannot delete or update a parent row: a foreign key constrai
nt fails (`java2204`.`employee`, CONSTRAINT `fk_emp_dep` FOREIGN KEY (`deptId`)
REFERENCES `dept` (`id`))
#但是发现一个问题，关联以后增加数据和删除数据弄不弄就报错，咋办？
#总结：
	#如果两张表添加了外键约束之后，这两张表就有关系了
	#添加数据：先添加主表【部门表】，再添加从表【员工】
	#删除数据: 先删除从表【员工】，在删除主表【部门】
	#修改数据:先修改从表【员工】，再修改主表【部门】
	#外键的约束支队增删改有效果的！！！
	#我要疯啊，删除数据还要记这些东西，增加外键约束以后咱的数据就变成了一坨，在做增删改的时候
	#一不小心就报错，有没有方案来解决以上的问题！！！有的
	#级联操作  加上级联操作以后，以后再也不用去管主表从表，随时随地删除即可
	#也是在设计表的时候添加的
	mysql> create table employee (
    -> id int primary key auto_increment,
    -> empName varchar(32) not null,
    -> deptId int not null,
    -> regTime timestamp default current_timestamp,
    -> constraint fk_emp_dep foreign key(deptId) references dept(id)
    -> on delete cascade
    -> on update cascade
    -> );
Query OK, 0 rows affected (0.23 sec)

mysql> select * from det;
ERROR 1146 (42S02): Table 'java2204.det' doesnot exist
mysql> select * from dept;
+----+-----------+
| id | deptName  |
+----+-----------+
|  2 | 教学部    |
|  4 | 技术部    |
+----+-----------+
2 rows in set (0.04 sec)

mysql> insert into employee (empName, deptId) values("老邢", 2);
Query OK, 1 row affected (0.07 sec)

mysql> insert into employee (empName, deptId) values("骚磊", 2);
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee (empName, deptId) values("帅栋", 2);
Query OK, 1 row affected (0.07 sec)

mysql> insert into employee (empName, deptId) values("浩然", 4);
Query OK, 1 row affected (0.03 sec)

mysql> select * from employee;
+----+---------+--------+---------------------+
| id | empName | deptId | regTime             |
+----+---------+--------+---------------------+
|  1 | 老邢    |      2 | 2022-04-24 16:24:44 |
|  2 | 骚磊    |      2 | 2022-04-24 16:24:45 |
|  3 | 帅栋    |      2 | 2022-04-24 16:24:46 |
|  4 | 浩然    |      4 | 2022-04-24 16:24:56 |
+----+---------+--------+---------------------+
4 rows in set (0.12 sec)

mysql> delete from dept where id = 4;
Query OK, 1 row affected (0.02 sec)

mysql> select * from employee;
+----+---------+--------+---------------------+
| id | empName | deptId | regTime             |
+----+---------+--------+---------------------+
|  1 | 老邢    |      2 | 2022-04-24 16:24:44 |
|  2 | 骚磊    |      2 | 2022-04-24 16:24:45 |
mysql> update dept set id =4 where id = 2;
Query OK, 1 row affected (0.12 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from employee;
+----+---------+--------+---------------------+
| id | empName | deptId | regTime             |
+----+---------+--------+---------------------+
|  1 | 老邢    |      4 | 2022-04-24 16:24:44 |
|  2 | 骚磊    |      4 | 2022-04-24 16:24:45 |
|  3 | 帅栋    |      4 | 2022-04-24 16:24:46 |
+----+---------+--------+---------------------+
3 rows in set (0.02 sec)

mysql> select * from dept;
+----+-----------+
| id | deptName  |
+----+-----------+
|  4 | 教学部    |
+----+-----------+
```

创建两个表有约束关系的时候，只需要写如下的代码即可

由浅入深

```mysql
mysql> create table dept (
    -> id int primary key auto_increment,
    -> deptName varchar(32) not null
    -> );
```



```mysql
mysql> create table employee (
    -> id int primary key auto_increment,
    -> empName varchar(32) not null,
    -> deptId int not null,
    -> regTime timestamp default current_timestamp,
    -> constraint fk_emp_dep foreign key(deptId) references dept(id)
    -> on delete cascade
    -> on update cascade
    -> );
```



























































作业：

```
01.查询每个雇员的编号、姓名、职位。

　　select e.empno as "雇员编号",e.ename as "雇员姓名",e.job as "雇员职位" from emp e

02.查询每个雇员的职位，职位。

　　select e.job as "雇员职位" ,e.* from emp e;

03.查询每个雇员的职位，使用DISTINCT消除掉显示的重复行记录。

　　select DISTINCT e.job as "雇员职位",e.* from emp e;

04.计算出每个雇员的基本年薪，同时查询出雇员的编号、姓名。

　　select e.empno as "雇员编号",e.ename as "雇员姓名",(e.sal+IFNULL(comm,0)*12) as "基本年薪" from emp e

05.每个雇员每个月公司会补贴饭食200元，交通补助300元，计算年薪（年薪=(工资+奖金)*12）。

　　select e.empno as "雇员编号",e.ename as "雇员姓名",(e.sal+IFNULL(comm,0)+200+300)*12 as "基本年薪" from emp e;

06.查询基本工资高于2000的全部雇员信息。

　　select e.* from emp e where e.sal>2000;

07.查询出smith的信息。

　　select e.* from emp e where e.ename="SMITH";

08.查询出所有不是CLERK的详细信息。

　　select e.* from emp e where e.job != "CLERK";

　　select e.* from emp e where e.job <> "CLERK";

　　select e.* from emp e WHERE e.job not in("CLERK");

09.查询出所有销售人员(SALESMAN)的基本信息，并且要求销售人员的工资高于1300。

　　select e.* from emp e where e.job = "SALESMAN" && e.sal>1300;

　　select e.* from emp e where e.job in ("SALESMAN") and e.sal>1300;

10.查询出工资范围在1500~3000之间的全部雇员信息（包含1500和3000）。

　　select e.* from emp e where e.sal>=1500 and e.sal<= 3000;

　　select e.* from emp e where e.sal BETWEEN 1500 and 3000;

11.查询出所有经理或者是销售人员的信息，并且要求这些人的基本工资高于1500

　　select e.* from emp e WHERE (e.job='SALESMAN' or e.job='manager') and e.sal>1500;

12.要求查询出所有在1981年雇佣的雇员信息。

　　select * from emp e where e.HIREDATE between('1981-1-01') and('1981-12-31');

　　select * from emp e where e.hiredate >= '1981-1-01' and e.hiredate <= '1981-12-31';

13.查询所有领取奖金的雇员信息（comm不为空）

　　select * from emp e where e.comm is not null;

　　select * from emp e where e.comm="";

14.查询所有领取奖金高于100的雇员信息

　　select e.* from emp e WHERE e.comm > 100;

15.查询出雇员编号是7369、7566、9999的雇员信息。

　　select e.* from emp e where e.empno in (7369,7566,9999);

16.查询出所有雇员姓名是以A开头的全部雇员信息。

　　select * from emp e where e.ename like "A%";

17.查询出雇员姓名第二个字母是M的全部雇员信息。

　　select * from emp e where SUBSTR(e.ename,2,1)='m';

　　select * from emp e where e.ename like "%_m";

18.查询出雇员姓名任意位置上包含字母A的全部雇员信息。

　　select * from emp e WHERE e.ename like "%a%";

　　select * from emp e where regexp_like(first_name,'[,a]+');（正则表达式）

19.查询出所有雇员的信息，要求按照工资排序。

　　select * from emp e order by e.sal asc;（默认是asc,是升序）

　　select * from emp e order by e.sal desc;（desc,是降序）

20.要求查询所有雇员的信息，按照雇佣日期由先后排序。

　　select * from emp e order by e.HIREDATE asc;

　　select * from emp e order by e.HIREDATE

21.查询全部雇员信息，按照工资由高到低排序，如果工资相同，则按照雇佣日期由先后排序。

　　select * from emp e order by e.sal desc,e.hiredate asc;

22.查询部门30中的所有员工。

　　select * from emp e where e.deptno = 30;

23.查询出所有办事员（CLERK）的姓名，编号和部门编号。

　　select * from emp e where e.job = "CLERK";

24.查询出奖金高于薪金的员工。

　　select * from emp e where e.comm > e.sal;

25.查询出奖金高于薪金的60%的员工。

　　select * from emp e where e.comm > 0.6*e.sal

```

