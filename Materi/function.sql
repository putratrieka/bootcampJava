
select * from produk
select * from prodData('Rie Cooker',
					   'Rice Cooker untuk masak',
					   '550000',
					   '32')
create or replace function prodData(
							p_nama_produk varchar(50),
							p_deskripsi text,
							p_harga_produk money,
							p_stok smallint)
returns table(prod_nama_produk varchar,
			  prod_deskripsi text,
			  prod_harga_produk money,
			  prod_stok smallint) as $$
-- declare kat_count smallint;
-- declare kat_id integer;
begin
-- 	select count(0) into kat_count from kategori where nama = p_nama_kategori;
-- 	if kat_count = 0 then
-- 		insert into kategori(nama) values(p_nama_kategori);
-- 	end if;
	
-- 	select id into kat_id from kategori where nama = p_nama_kategori;
	
	insert into produk(
				nama_produk,
				deskripsi,
				harga_produk,
				stok)
			values(
				p_nama_produk,
				p_deskripsi,
				p_harga_produk,
				p_stok
				);
-- 	insert into kategori(nama)
-- 			values(p_nama_kategori);
	return query
		select --k.nama as nama_kategori,
			p.nama_produk,
			p.deskripsi,
			p.harga_produk,
			p.stok
		from produk p;
-- 		inner join kategori k on (p.id = k.id)
-- 		where p.nama_produk = p_nama_produk; 
end;
$$ language plpgsql;