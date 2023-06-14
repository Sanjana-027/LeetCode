SELECT Sales.product_id, Product.product_name FROM Product, Sales
WHERE Sales.product_id = Product.product_id 
GROUP BY Sales.product_id 
HAVING MIN(sale_date) >= '2019-01-01' AND MAX(sale_date) <= '2019-03-31';
