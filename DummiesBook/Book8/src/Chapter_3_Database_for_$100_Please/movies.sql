drop database if exists movies;   --delete any existing database with the same name

create table movie (              --creates a table named movie with columns	
    id int not null,	          --not null indicates that it must have a value for every row
    title varchar(50),	          --i.e. like a string in Java
    year int,	                  --year column’s data type is int
    price decimal(8,2),	          --price column’s data type is decimal
    primary key(id)	              --PK for the table (A primary key is a column containing a unique value for each row in a table)
);

DROP TABLE movie;

insert into movie (id, title, year, price)	               --The insert statements add data to the database. You first list colums names
 values ('00', 'Its a Wonderful Life', '1946', '14.95'),   --Then the data you want to insert into the columns
 ('01','Young Frankenstein', '1974', '16.95'),
 ('02','Star Wars', '1977', '17.95'),
 ('03','The Princess Bride', '1987', '16.95'),
 ('04','Glory', '1989', '14.95'),
 ('05','The Game','1997','14.95'),
 ('06','Shakespeare in Love','1998','19.95'),
 ('07','Zombieland','2009','18.95'),
 ('08','The Kings Speech','2010','17.85'),
 ('09','Star Trek Into Darkness','2013','19.95');
 
-------------------------------------------------------------------------------------------
--Querying a Database
--lists all the movies in the movie table

select * from movie;

select title, year
from movie
order by year;

select * from movie order by year;
----------------------------------------------------------------------------------------------
--Narrowing the query
--Using the where clause to find information about one particular video title

select title, year from movie
where year <= 1980
order by year;

------------------------------------------------------------------------------------------------
--Excluding rows
--retrieving all rows except those that match certain criteria. Here’s a query that ignores movies made in the 1970s

select title, year from movie
where year < 1970 or year > 1979
order by year;

---------------------------------------------------------------------------------------------------
--Using singleton selects
--retrieve information for a specific row, mention the primary key column in the where clause

select title, year from movie where id = 7;

------------------------------------------------------------------------------------------------------
--Finding what something sounds like
--search rows using wildcards. Here’s an example in which the percent sign (%) is a wildcard character:

select title, year from movie
where title like '%Princess%';

---------------------------------------------------------------------------------------------------------
--Using column functions

--calculates the number of rows in the table and the year of the oldest movie

select count(*), min(year) from movie;

--finds out how many movies in the table were made before 1970

select count(*) from movie where year < 1970;
----------------------------------------------------------------------------------------------------------
--Selecting data from more than one table

create table friend (
lastname varchar(50),
firstname varchar(50),
movieid int
);

insert into friend (lastname, firstname, movieid)
values ('Haskell', 'Eddie', 3),
('Haskell', 'Eddie', 5),
('Cleaver', 'Wally', 9),
('Mondello', 'Lumpy', 2),
('Cleaver', 'Wally', 3);


-------------------------------------------------------------------------------------------------------------
--using both the friend and movie tables in a single select statement
--All you have to do is list both tables in the from clause and then provide a condition in the where clause that correlates the tables, as follows:

select lastname, firstname, title
from movie, friend
where movie.id = friend.movieid;

--------------------------------------------------------------------------------------------------------------
--Here’s a select statement that lists all the movies Eddie Haskell has borrowed

select title from movie, friend
where movie.id = friend.movieid
and lastname = 'Haskell';

------------------------------------------------------------------------------------------------------------------
--Eliminating duplicates
--If you want to know just the names of all your friends who have a movie checked out, you can do a simple select from the friend table, like this:

select lastname, firstname from friend;

--You can eliminate duplicate rows by adding the distinct keyword in the select statement, as follows:

select distinct lastname, firstname from friend;

-------------------------------------------------------------------------------------------------------------------------
--Updating and Deleting Rows
--Here’s a statement that deletes the movie whose id is 10:

delete from movie where id = 10;

--------------------------------------------------------------------------------------------------------------------------
--Using the update statement
--The set expressions resemble Java assignment statements. Here’s a statement that changes the price of movie 8 to 18.95:

update movie set price = 18.95 where id = 8;

--use a quick select statement to verify that the price was changed

select id, price from movie;

----------------------------------------------------------------------------------------------------------------------------














