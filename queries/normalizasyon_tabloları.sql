INSERT INTO public.tbl_customer_orders(
	customer_name, customer_email, order_id, order_date, order_total_amount)
	VALUES ( 'Alperen', 'alperen@gmail.com', 1, 123456789, 1753.65);
	
	SELECT * FROM tbl_customer_orders;
	
INSERT INTO public.tbl_customer(
	customer_name, customer_email)
	VALUES ( 'Muhammet', 'muhammet@gmail.com');
	
	SELECT * FROM tbl_customer;
	
	
INSERT INTO public.tbl_orders(
	order_date, order_total_amount,customer_id)
	VALUES (123456789, 175873.675,2);
	
	
	SELECT * FROM tbl_orders;
	
	
	
	