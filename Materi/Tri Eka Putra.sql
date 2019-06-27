--================================================================
--						Create table							
--================================================================

create table TriEkaPutra_Anggota(
	id serial primary key,
	NIK varchar(16) not null,
	Nama varchar(40) not null,
	Tanggal_Lahir date not null,
	Tempat_lahir varchar(100) not null,
	Alamat varchar(100) not null,
	Jenis_Kelamin jk,
--	varchar(10) not null,
	Tanggal_Aktif date not null,
	Status_Aktif boolean not null
)
create type jk as enum('Laki-Laki', 'Perempuan') -- fix choice
--===============================================================
--						Insert Data
--===============================================================
insert into TriEkaPutra_Anggota(
	nik, 
	nama, 
	tanggal_lahir, 
	tempat_lahir, 
	alamat, 
	jenis_kelamin, 
	tanggal_aktif, 
	status_aktif
)
values(
	'1306070308960001',
	'Nova',
	'1996-08-03',
	'Bandung',
	'Bandung',
	'Wanita',
	'2019-01-13',
	false),
	(
	'1306070811960001',
	'Wyna',
	'1996-11-08',
	'Bandung',
	'Padang',
	'Wanita',
	'2019-01-13',
	false
	),
	(
	'1306071502960001',
	'Anto',
	'1990-09-30',
	'Padang',
	'Padang',
	'Wanita',
	'2016-03-20',
	false
)
--===============================================================
--						Update Database
--===============================================================
select * from TriEkaPutra_Anggota
update triekaputra_anggota
set alamat = 'Semarang'
where id = 6;
--_______________________________________________________________
update triekaputra_anggota
set alamat = 'Bandung'
where id = 5
--_______________________________________________________________
update triekaputra_anggota
set status_aktif = false
where id = 8;
--_______________________________________________________________
--===============================================================
--					Delete from Database
--===============================================================
delete from triekaputra_anggota
where id = 8
--_______________________________________________________________
delete from triekaputra_anggota
where id = 10
--_______________________________________________________________
--===============================================================
--				Select data with conditional
--===============================================================
select nama from triekaputra_anggota
where id = 6
--_______________________________________________________________
select alamat from triekaputra_anggota
where tanggal_lahir < '01-01-1998'
--_______________________________________________________________
select alamat from triekaputra_anggota
where alamat != 'Jakarta'
--_______________________________________________________________
select status_aktif from triekaputra_anggota
where tanggal_lahir > '01-01-1997'
--_______________________________________________________________
select alamat from triekaputra_anggota
where tempat_lahir like '%ng'

--===============================================================
--					Select Data using limit
--===============================================================
--_______________________________________________________________
select * from triekaputra_anggota 
where tanggal_lahir > '1996-01-01'
limit 4
--_________________________________________________________________

select * from triekaputra_anggota 
where jenis_kelamin = 'Wanita'
limit 6
--_______________________________________________________________
--===============================================================
--				Select Data using limit & offset
--===============================================================
select * from triekaputra_anggota 
where alamat = 'Semarang'
limit 2 offset 1
--_______________________________________________________________
select * from triekaputra_anggota 
where status_aktif = true
limit 6 offset 1
--_______________________________________________________________
--===============================================================
--				Select Data using group
--===============================================================
select tanggal_lahir from triekaputra_anggota
group by tanggal_lahir
--_______________________________________________________________
select nama from triekaputra_anggota
where status_aktif = true
order by nama asc
--_______________________________________________________________
select * from triekaputra_anggota
where status_aktif = false
order by tanggal_lahir desc
--_______________________________________________________________
--===============================================================
--					Select query using distinct
--===============================================================
--select distinct nama, alamat from triekaputra_anggota
--_______________________________________________________________
-- -- === K as allias "karyawan"===
-- select 
-- 	K.*
-- from karyawan K;
-- -- === Joint table ===
select 
	K."NIK",
	K."Nama",
	K."Gaji",
	D."Nama"
from karyawan as K
join departemen D on K."Kode Dept" = D."Kode Dept"
--inner join departemen D on K."Kode Dept" = D."Kode Dept"-- inner = irisan
--right join departemen D on K."Kode Dept" = D."
--left join departemen D on K."Kode Dept" = D."
where K."Nama" like 'l%'
	or K."Gaji">5000
	or D."Nama" like 'S%'
order by K."Gaji" desc
;
--=====================================================================

Select
	e.*
from employee e;
-- ===== add column =====
alter table
	employee
add column
	salary bigint default 3000;
-- ===== change data type =====
alter table
	employee
alter column
	address type varchar(50);
-- ===== rename column =====
alter table
	employee
rename column
	tempat_lahir
to	pob;
-- ===== add constraint =====
alter table
	employee
add constraint
	emp_name_dop_pk primary key ("name",dob);
-- ===== drop constraint =====
alter table
	employee
drop constraint
	employee_pkey;
alter table
	employee
add constraint
	emp_id_unq unique(id);
alter table
	employee
add constraint
	emp_id_unq unique(id,ph);

-- ===== create foreign key=====  
create table 
	subdivision(
		id serial PRIMARY KEY,
		id_div int REFERENCES division(id),--foreign key
		name VARCHAR(50) UNIQUE NOT null
	)
	
ALTER TABLE
	employee
DROP CONSTRAINT emp_name_dob_pk UNIQUE ("name",dob)

-- ===== check constraint =====
ALTER TABLE
	employee
ADD constraint emp_salary_check CHECK (salary > 200)

-- ===== Inner Join =====
SELECT
	e.name,
	e.dob,
	e.address,
	b.name as division_name
FROM employee e
inner Join division b on b.id =e.id_div 
	and b.name = 'Finance'

-- ========== full join ========
SELECT
	e.id_div,
	e.name,
	e.dob,
	e.address,
	b.name as division_name
FROM employee e
full Join division b on e.id_div =b.id 

-- ========== UNION ===================================================
SELECT
	e.id_div,
	e.name,
	e.pob,
	e.address,
	e.phone
from employee e
where pob = 'Bootcamp'
union
SELECT
	e.id_div,
	e.name,
	e.pob,
	e.address,
	e.phone
from employee e
where pob = 'Metro City'
union
SELECT
	e.id_div,
	e.name,
	e.pob,
	e.address,
	e.phone
from employee e
where age > 21

-- ========= View ====================================================
create VIEW 
	empdiv_viewT 
as
SELECT
	a.name,
	a.dob,
	a.pob,
	b.name as division_name
from employee a
inner join division b on (a.id_div = b.id)

SELECT * FROM empdiv_view

____________________TEMPORARY VIEW________________________________
create TEMPORARY VIEW 
	empdiv_viewT 
as
SELECT
	a.name,
	a.dob,
	a.pob,
	b.name as division_name
from employee a
inner join division b on (a.id_div = b.id)

SELECT * FROM empdiv_view -- select view

-- ===================== Sub Query ======================================
SELECT 
	e.* 
FROM employee e
where e.id_div 
	in (SELECT 
			d.id
		FROM division d
	)
-- ====================== function ======================================
create function getEmployeeByID(p_Id integer)	
	returns table(name varchar,
				dob date,
				address varchar,
				phone varchar) as $$
	begin
		return query select
							a.name,
							a.dob,
							a.address,
							a.phone
					from employee a
					where id = p_Id;
	end;
	$$ language plpgsql;
select * from getEmployeeById(12)

=========================================================================================
create table produk(
		id serial primary key,
		nama_produk varchar(50) not null,
		deskripsi TEXT,
		harga_produk money,
		stok SMALLINT,
		status_aktif varchar(20)
);
select * from produk


ALTER TABLE 
	produk
add column 
	created_date date default current_date
	
ALTER TABLE 
	produk
add column 
	modified_date date

ALTER TABLE 
	produk
add constraint 
	prod_mod_date  check (modified_date >= created_date)

ALTER TABLE 
	produk
add column 
	id_kategori int REFERENCES kategori(id)
	
	
ALTER TABLE
	kategori
add COLUMN 
	status_aktif varchar(20) default 'Aktif'
select * from kategori






ALTER TABLE
	produk
ADD COLUMN 
	status_aktif varchar(20) DEFAULT 'Aktif'

insert into kategori(
	nama
)values
	('Handphone'),
	('Laptop'),
	('Pakaian')
select * from produk
alter table
	produk
add id smallint

insert into produk(
	id_kategori,
	nama_produk,
	deskripsi,
	harga_produk,
	stok,
	status_aktif,
	created_date,
	modified_date
	
)values
	(1,'Xiomi','Handphone murah meriah','1999000','6','Aktif','2019-05-21','2019-06-26'),
	(1,'Nokia','Handphone murah meriah lagi','999000','2','Aktif','2018-05-21','2018-06-26'),
	(2,'Sony Vaio','Laptop murah meriah lagi lagi','5999000','2','Aktif','2018-09-01','2019-01-26'),
	(2,'Lenovo','Laptop murah meriah lagi lagi','5699000','0','Non Aktif','2019-02-01','2019-05-26'),
	(3,'Sweater','Sweater kece murah meriah lagi lagi','569000','2','Aktif','2019-03-01','2019-06-20'),
	(3,'Celana Cargo','Celana Cargo murah meriah lagi lagi','369900','0','Non Aktif','2019-03-01','2019-05-26')
select * from kategori


	
select * from produk

select 
	p.nama_produk,
	p.harga_produk,
	k.nama
from produk as p
inner join kategori k on p.status_aktif = k.status_aktif
where p.status_aktif = 'Aktif'

