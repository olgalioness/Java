/*
Создать таблицу книг со следующими полями
- id ключ
- title- наименование книги
- author - автор книги
- date_added - дата добавления книги
 */
--DDL - Data Definition Language (создание таблиц/сиквенсов и тп)

create table public.books
(
    id          serial primary key, --первичный ключ, делает значение уникальным
    title       varchar(30) not null,
    author      varchar(30) not null,
    date_added  timestamp   not null

);

