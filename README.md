# NoteSite
Java learning project

```mysql
create database note_site;
use note_site;
create table user(
id int primary key auto_increment,
name varchar(20),
password varchar(20),
gender char(1)
);
insert into user values(1, 'Edge51', 'Edge123', 'M');
insert into user values(2, 'ManMan', 'Manman123', 'F');
```

```bash
# compile error:
.mvn/wrapper/maven-wrapper.properties: No such file
# solution
mvn wrapper:wrapper
```