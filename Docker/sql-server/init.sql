-- データベース作成
DROP DATABASE IF EXISTS todo;
CREATE DATABASE todo;
GO

-- データベース設定
USE todo;

-- ユーザー
drop table if exists users;

create table users (
 id INT IDENTITY (1,1) not null primary key
 , name varchar(100) not null
 , email varchar(255) not null unique
 , password text not null
 , created_at datetime not null
 , updated_at datetime not null
) ;


--ユーザー登録(pass:morimori)
insert into users(name, email, password, created_at, updated_at) values('テストユーザ', 'test@test.co.jp', '$2a$10$Utoo6nr3XIFEh4xOZ9Zr1.n/PtEYBb8HhlLDDklaJwsj.T3uux4kq', GETDATE(), GETDATE());

-- 商品
drop table if exists todos;

create table todos (
  id varchar(255) primary key
  , title varchar(255) not null
  , content text not null
  , start_date date not null
  , end_date date
  , due_date date not null
  , created_at datetime not null
  , updated_at datetime not null
) ;

insert into todos values('1', 'じゃがバターベーコン', 'ホクホクのポテトと旨味が凝縮されたベーコンを特製マヨソースで味わって頂く商品です。バター風味豊かなキューブチーズが食材の味を一層引き立てます。', GETDATE(), GETDATE(), GETDATE(), GETDATE(), GETDATE());