INSERT INTO cars (brand, model, year)
('Nissan','Silvia',1999),

SELECT * FROM cars;

SELECT * FROM cars
WHERE brand ='Nissan'; -- Markası Nissan olanları getirir


SELECT * FROM cars
WHERE year < 1975 ; -- Yılı 1975 den küçük olanları getir


SELECT * FROM cars
WHERE year > 1975 ; -- Yılı 1975 den büyük olanları getir


SELECT * FROM cars
WHERE year <= 1999 ; -- Yılı 199 den küçük veya eşit olanları getir


SELECT * FROM cars
WHERE year >= 1999 ; -- Yılı 1999 den büyük veya eşit olanları getir


SELECT * FROM cars
where brand <> 'Cobra'; --Markası 'Cobra' olmayanları getirir 


SELECT * FROM cars
where brand != 'Cobra'; --Markası 'Cobra' olmayanları getirir.Yukardakiyle aynı işi yapar 



-- % İşareti sıfır, bir veya birden fazla karakteri temsil eden bir wildcard'dır.
SELECT * FROM cars
WHERE model LIKE 'R%'; -- Modeli 'R' ile başlayanları getirir.


SELECT * FROM cars
WHERE model LIKE '%r'; -- Modeli 'r' ile bitenleri getirir.



SELECT * FROM cars
WHERE model LIKE '%a%'; -- Markasının içinde 'a' harfi geçenleri getirir.


SELECT * FROM cars
WHERE model LIKE '%ra%'; -- Markasının içinde 'ra'  geçenleri getirir.


--_wildcard karakteri tek bir karakteri temsil eder. Herhangi bir sayı veya karakter olabilir
SELECT * FROM cars
WHERE brand LIKE 'F__ra_i';  
--'F' ile başlayan ardından iki adet wildcard karakter alan(__),
-- ardından 'ra' ve ardından yine bir wildcard karakter alan markayı döndürür.


--Birdeb fazla koşulu kontrol etmek istediğimizde AND operatörü kıllanılır.
SELECT * FROM cars
WHERE brand = 'Nissan'
AND model 'Silvia'; -- Markası 'Nissan' ve modeli 'Silvia' olanları getirir


--Birden fazla koşuldan herhangi birisini kontrol etmek için OR operatörü kullanılır
SELECT * FROM cars
WHERE brand = 'Nissan'
OR model 'Enzo'; -- Markası 'Nissan' olan VEYA modeli 'Enzo' olanları getirir

--IN Operatörü, bir sütunun değeri listedeki değerlerden herhangi 
--biri/birileriyle eşleştiğinde kullanılır. Bir liste verileceği zaman çok kullanışlıdır
SELECT * FROM cars
WHERE brand IN ('Nissan', ('Aston Martin'), 'Ford');  -- Markası {Nissan, Aston Martin, Ford} olanları getir


SELECT * FROM cars
WHERE year BETWEEN 1950 AND 2000;  -- Yılı 1950 İLE 2000 yılları arasında olan bütün kayıtları getirir.


SELECT *FROM cars
WHERE model IS NULL; --Modeli NULL olan bütün kayıtları döndürür.


--NOT operatörü operatörün doğrulğunu tersine çevirmek için LIKE, ILIKE, IN, BETWEEN, NULL operatörleri ile 
--birlikte kullanılabilir
SELECT * FROM cars
WHERE brand NOT LIKE  --F ile başlamayan kayıtları döndürür -> LIKE case sensitive(büyük-küçük harf duyarlı)
'F%';


SELECT * FROM cars
WHERE brand NOT ILIKE  --F veya f ile başlamayan kayıtları döndürür -> ILIKE case sensitive değil (büyük-küçük harf duyarsız)
'f%';



SELECT * FROM cars
WHERE brand NOT IN('Cobra','Ford','Ferrari'); --Markanın bu listede olmadığı bütün kayıtları dödürür.


SELECT * FROM cars
WHERE year NOT BETWEEN 1950 AND 2000;  -- Yılı 1950 İLE 2000 yılları arasında olmayan bütün kayıtları getirir.


SELECT * FROM cars
WHERE model IS NOT NULL; --Model null olmayan bütün kayıtları dödürür.















                        


