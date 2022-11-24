use First;
create table CUSTOMER3(Cust_id varchar(5), Fname varchar(15),Lname varchar(15),Area char(20),Phone_number bigint(10),DOB date,Payment float(6,2));
insert into CUSTOMER3 values
('A01','Ivan','Ross','SA',6125467,'1986-01-15',800.50),
('A02','Vandana','Ray','MU', 5560379,'1987-12-20', 1000.75),
('A03',' Pramada', 'Jauguste', 'DA', 4560389,'1967-07-25', 500.00),
('A04',' Basu',' Navindi',' BA', 6125401,'1956-02-28', 860.00),
('A05', 'Ravi',' Shridhar', 'NA', null, '1989-02-15', 500.50),
('A06', 'Rukmini',' Aiyer',' GH', 5125274,'1987-07-23', 1500.50);
#4. Insert a row which will accept system date.
#INSERT INTO CUSTOMER3 (System_date) VALUES(2005-07-25);  
#Update the phone numbers of customer A02 and A04.
select  Phone_number from CUSTOMER3 where Cust_id='A02' and Cust_id='A04';
#Update the date of birth of customer A03 and A05.
select DOB from CUSTOMER3 where Cust_id='A03' and Cust_id='A05';
#9. Delete 2 rows from the table for customers A01 and A05.
DELETE from CUSTOMER3  where Cust_id='A01' and Cust_id='A05';
#10. Delete all the rows from the table.
truncate table CUSTOMER3;
#. Insert 5 records according to your own wish.
insert into CUSTOMER3 values
('A07','Ivani','Roy','SA',61254005,'1976-10-15',1800.50),
('A08','Virat','Dey','MU', 5560309,'1987-12-20', 1200.75),
('A09',' Koholi', 'Sarkar', 'DA', 8520389,'1969-09-25', 1500.00),
('A010','Rohit','Maity',' BA', 6120001,'1977-12-28', 1860.00),
('A011', 'Raju',' Sen', 'NA', null, '1980-02-25',1500.50);
#Update one record based on any criteria according to your own wish.
update CUSTOMER3 set DOB='1998-05-30'where Cust_id='A09';
# Delete any 1 record from the table based on particular criteria.
DELETE from CUSTOMER3  where Cust_id='A010' ;
