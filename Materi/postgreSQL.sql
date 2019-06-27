-- create table employee(
-- 	id serial primary key not null,
-- 	name varchar(100) not null,
-- 	dob date not null,
-- 	address text,
-- 	phone varchar(15),
-- 	age smallint default 17,
-- 	salary money
-- );

-- =========insert value to table=========
-- select * from employee
-- order by id
-- insert into 
-- 	employee(
-- 			name,
-- 			dob,
-- 			address,
-- 			phone,
-- 			age,
-- 			salary) 
-- 	values(
-- 		'Robin',
-- 		'1983-11-30',
-- 		'Depok',
-- 		'6285289649123',
-- 		21,
-- 		220
-- 	);
-- select * from employee
-- where age>20

-- ========order data======== 

-- order by address desc;

-- ========Update table========

-- update employee 
-- set name='Andrew', address='Bogor'
-- where id = 1 

-- ========Delete table========

-- delete from employee
-- where id in (1,2);


-- select * from employee
-- select id, name dob, address, phone age, salary from employee
-- where address like '%g';--mengandung huruf 'g' di belakang
-- where address like 'J%';--mengandung huruf 'j' di depan
-- where address like '%u%';-- mengandung huruf 'u' di tengah
-- where address like '__n%'; huruf ke-3 mengandung huruf 'n'


-- update employee set name 'John Page'
-- where phone like '$12%' and address like '%g'-- ==== limit ====
-- menampilkan data dengan jumlah yang dibatasi

-- select * from employee 
-- where address = 'Jakarta'
-- order by id
-- limit 2 offset 0

-- ======Group By========
--  count jumlah data
-- select name, address, count(address) from employee
-- group by name, addrSekec

select 
	sum(salary) as jumlah_salary,
	count(*) as Jumlah_data,
	min(salary) as salary_terendah,
	max(salary) as salary_tertinggi
from employee where address = 'Jakarta';

select round(avg(age),2) ratarata_umur -- round untu pembulatan bilangan
from employee where address = 'Jakarta'
