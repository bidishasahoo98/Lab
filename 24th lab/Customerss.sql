use First;
drop table Customerss;
create table Customerss(Cust_id varchar(10) primary Key,Fname varchar(15) not null, Lname varchar(15), Area char(20) not null, Phone bigint(10));
insert into Customerss values
('A01','Ivan','Ross','SA',6125467),
('A02','Vandana','Ray','MU', 5560379),
('A03',' Pramada', 'Jauguste', 'DA', 4560389),
('A04',' Basu',' Navindi',' BA', 6125401),
('A05', 'Ravi',' Shridhar', 'NA', null),
('A06', 'Rukmini',' Aiyer',' GH', 5125274);
create table Movie(Mv_no int Primary Key, Cust_id int primary key, Title varchar(20), Star varchar(20), Price int);
insert into Movie values
(1, 'A02', 'Bloody', 'JC', 181),
(2, 'A04', 'The Firm', 'TC', 200),
(3, 'A01', 'Pretty Woman', 'RG', 151),
(4, 'A06', 'Home Alone', 'MC', 150),
(5, 'A05', 'The Fugitive', 'MF', 200),
(6, 'A03', 'Coma', 'MD', 100),
(7, 'A02', 'Dracula ', 'GO', 150),
(8, 'A06', 'Quick Change', 'BM', 100),
(9, 'A03', ' Gone with the Wind', 'CB', 200),
(10, 'A05', ' Carry on Doctor', 'LP', 100);

create table Movie(Mv_no int Primary Key, Cust_id varchar(10), Title varchar(20), Star varchar(20), Price int);
drop table Movie;
insert into Movie values
(1, 'A02', 'Bloody', 'JC', 181),
(2, 'A04', 'The Firm', 'TC', 200),
(3, 'A01', 'Pretty Woman', 'RG', 151),
(4, 'A06', 'Home Alone', 'MC', 150),
(5, 'A05', 'The Fugitive', 'MF', 200),
(6, 'A03', 'Coma', 'MD', 100),
(7, 'A02', 'Dracula ', 'GO', 150),
(8, 'A06', 'Quick Change', 'BM', 100),
(9, 'A03', ' Gone with the Wind', 'CB', 200),
(10, 'A05', ' Carry on Doctor', 'LP', 100);
alter table Movie add foreign key (Cust_id) references Customerss (Cust_id);
select Title from Movie where Price between 100 and 200;
select Cust_id from Movie where( Star ='JC' OR Star='MC'OR Star='TC');
SELECT Fname from Customerss where Fname like '%A%';
select Title from Movie  where price <=180 and length(Title) =6;
select Title , Price ,Price+(price*10)/100 as 'Incremented_Price' from Movie;
select concat (Fname ,concat ('Stays in ',concat  ('his Phone no is ' , concat(Phone)))) from Customerss where Fname='Ivan';
ALTER table Customerss modify Fname varchar(25) not null;
SELECT Fname from Customerss where Phone=null;
update Customerss set Phone =54745383 ;
select  distinct Cust_id from Customerss; 
ALTER table Movie modify Star varchar(6) ;
delete from Movie where Title='Bloody';
drop table Customerss;
drop table Movie;