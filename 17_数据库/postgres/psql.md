# useradd postgre (自动建立 postgre 组)

　　安装的过程并不复杂和其他源码版本的安装方法类似：

　　解压到 /usr/local/src：

　　# tar xvfz postgresql-7.1.3.tar.gz

　　# cd postgresql-7.1.3

　　# ./configure --prefix=/usr/local/pgsql

　　# make

　　# make install

　　# chown -R postgre.postgre /usr/local/pgsql

　　这样安装完毕后，并不是万事大吉了，还有一些收尾工作要做：

　　# vi ~postgre/.bash_profile

　　添加：

　　PGLIB=/usr/local/pgsql/lib

　　PGDATA=$HOME/data

　　PATH=$PATH:/usr/local/pgsql/bin

　　MANPATH=$MANPATH:/usr/local/pgsql/man

　　export PGLIB PGDATA PATH MANPATH

　　以 postgres 用户登录，

　　# su - postgre

　　建立数据库目录：

　　$ mkdir data

　　启动数据库引擎：

　　$ initdb

　　[postgre@www postgre]$ initdb

　　This database system will be initialized with username "postgre".

　　This user will own all the data files and must also own the server process.

　　Fixing permissions on pre-existing data directory /home/postgre/data

　　Creating database system directory /home/postgre/data/base

　　Creating database XLOG directory /home/postgre/data/pg_xlog

　　Creating template database in /home/postgre/data/base/template1

　　Creating global relations in /home/postgre/data/base

　　Adding template1 database to pg_database

　　Creating view pg_user.

　　Creating view pg_rules.

　　Creating view pg_views.

　　Creating view pg_tables.

　　Creating view pg_indexes.

　　Loading pg_description.

　　Vacuuming database.

　　Success. You can now start the database server using:

　　/usr/local/pgsql/bin/postmaster -D /home/postgre/data

　　or

　　/usr/local/pgsql/bin/pg_ctl -D /home/postgre/data start

　　$ postmaster -i -D ~/data &

　　[1] 22603

　　[postgre@www postgre]$ DEBUG: Data Base System is starting up at Thu Jan 31 02:00:44 2002

　　DEBUG: Data Base System was shut down at Thu Jan 31 01:57:58 2002

　　DEBUG: Data Base System is in production state at Thu Jan 31 02:00:44 2002

　　这样 PostgreSQL 使用位于 /usr/local/pgsql/data 的数据库，允许 Internet 用户的连接( -i ) ，并在后台运行。

　　建立数据库

　　$createdb mydb

　　PostgreSQL 会返回 “ CREATED DATABASE”的信息，表明数据库建立完成。

　　$psql mydb

　　进入交互 psql 工具，建立表：

　　CREATE TABLE mytable(
　　	id varchar(20),
　　	name varchar(30)
		);

　　建立完成后，会得到一条 “CREATED” 的信息，表示建立成功。现在插入一条数据：

　　INSERT INTO mytable values(Author, Xu Yongjiu);

　　psql 返回 INSERT 18732 1，查询插入是否成功：

　　SELECT * FROM MYTABLE;

　　退出 psql ，用 q 命令。

