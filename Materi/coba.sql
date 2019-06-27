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
select * from employee


create type status as enum ('Aktif','Non-Aktif')
create table produk(
	id smallint,
	nama_produk varchar(50),
	deskripsi text,
	harga_produk money,
	stok smallint,
	status_aktif status
)
alter table
	kategorri
rename to kategori
select * from kategori
create table kategorri(
	id serial PRIMARY KEY,
	nama varchar(50),
	status_aktif status
)
INSERT INTO kategori(  
	    nama  
	    )  
	    values  
	        ('Handphone & Aksesories'),  
	        ('Komputer & Aksesories'),  
	        ('Elektronik'),  
	        ('Fashion')  


INSERT INTO produk(
	id,
	nama_produk,
	deskripsi,
	harga_produk,
	stok
	)
	values
		(1,
		 'Xiaomi Redmi 6A',
		 'Xiaomi Redmi 6A 2GB Internal 16GB',
		 '1149000',
		20),
		(1,
		 'Apple Watch',
		 'Apple Watch Series 3 42mm GPS CEll Nike',
		 '5749000',
		8),
		(1,
		 'Xiaomi Redmi Note 7',
		 '3/4 RAM,32/64 ROM GAransi TAM',
		 '1999000',
		0),
		(2,
		 'Asus A407MA',
		 'Asus A407MA 14 inch, 4GB RAM, 1TB',
		 '4749000',
		6),
		(2,
		 'Sony vaio svf14216sgw',
		 'Sony vaio svf14216sgw touchscreen',
		 '3350000',
		2),
		(2,
		 'Logitech M330',
		 'Logitech M330 Wireless Silent Mouse',
		 '299000',
		73),
		(3,
		 'LG LED TV',
		 'LG LED TV 43 Inch Digital TV',
		 '3599000',
		7),
		(3,
		 'LG LED TV',
		 'LG LED TV 43 Inch Digital TV',
		 '3599000',
		7),
		(
		5,
		'Rak TV',
		'Metropolis Rak TV/Meja TV',
		'593000',
		17
		),
		(6,
		'Yamaha Gitar Akustik',
		'Gitar Akustik Natural Merk Yamaha',
		'1999300',
		23
		)
select * from kategori
ALTER TABLE 
	produk
ADD COLUMN 
	modified_date date
-- ======= add column =======
ALTER TABLE
	produk
ADD COLUMN 
	id_kategori  smallint REFERENCES kategori(id)
SELECT * from produk
-- ===== add constraint =====
ALTER TABLE
	produk
ADD CONSTRAINT
	prod_mod_date check (modified_date >= created_date)


UPDATE produk p
set stok = 0
where p.nama_produk = 'Sony Vaio'


SELECT
	e.name,
	e.dob,
	e.address,
	b.name as division_name
FROM employee e
left Join division b on b.id =e.id_div 
	and b.name = 'Finance'

	
select * from produk
select * from kategori
select 
	p.nama_produk,
	p.harga_produk,
	p.stok,
	k.nama,
	p.status_aktif
from produk as p
right join kategori k on (k.id = p.id_kategori)
where p.status_aktif = 'Aktif' and p.stok != 0 

