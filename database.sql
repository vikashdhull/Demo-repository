create table myTable(name varchar(10),age int(3),city varchar(20),pin int (6),mobile int (10));
insert into myTable values("Hello",20,"rohtak",124001,1234567890);
insert into myTable values("vikash",25,"hisar",124002,0987654321);
insert into myTable(name,age,city)
values('vivek',15,'delhi');
insert into myTable(name,age)
values('sunil',24),
('sunny',11),
('papsi',20);
select name,age from myTable;