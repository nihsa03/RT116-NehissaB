-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Dtamodel Homework #2!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
-- 1. Which product did we sell the most of?

SELECT p.product_name, COUNT(od.order_id) AS order_count, SUM(od.quantity_ordered * od.price_each) AS total_amount_sold 
FROM orderdetails AS od, products AS p, orders AS o 
WHERE od.product_id = p.id AND od.order_id = o.id 
GROUP BY p.product_name 
ORDER BY order_count DESC 
LIMIT 1;

-- 2. Which product generated the most profit by year?
SELECT YEAR(o.order_date) AS year, p.product_name, SUM((od.price_each * od.quantity_ordered) - (p.buy_price * od.quantity_ordered)) AS total_profit 
FROM orderdetails AS od, products AS p, orders AS o 
WHERE od.product_id = p.id AND od.order_id = o.id AND o.order_date IS NOT NULL 
GROUP BY year, p.product_name 
ORDER BY year DESC, total_profit DESC;

-- 3. Which office is the most profitable? (Optional)

SELECT o.city AS office_name, SUM((od.price_each * od.quantity_ordered) - (p.buy_price * od.quantity_ordered)) AS total_profit 
FROM offices AS o, employees AS e, customers AS c, orders AS o, orderdetails AS od, products AS p 
WHERE e.office_id = o.id AND e.id = c.sales_rep_employee_id AND c.id = o.customer_id AND o.id = od.order_id AND od.product_id = p.id 
GROUP BY o.city 
ORDER BY total_profit DESC 
LIMIT 1;

-- 4. Show me all the customers that have an outstanding balance due (Optional)

SELECT c.customer_name, SUM(od.quantity_ordered * od.price_each) AS total_purchased, 
COALESCE(SUM(p.amount), 0) AS total_paid, (SUM(od.quantity_ordered * od.price_each) - COALESCE(SUM(p.amount), 0)) AS outstanding_balance 
FROM customers AS c, orders AS o, orderdetails AS od, payments AS p 
WHERE c.id = o.customer_id AND o.id = od.order_id AND c.id = p.customer_id 
GROUP BY c.id 
HAVING outstanding_balance > 0;


