-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Homework on Data Model!!!!!!!!!!!!!!

-- 1. Product Line and Product Names:

SELECT pl.product_line, p.product_name
FROM   productlines AS pl
JOIN   products AS p ON pl.id = p.productline_id
ORDER BY pl.product_line, p.product_name;

-- 2.Order Number, Product Name, and Quantity Ordered:

SELECT o.id AS order_number, p.product_name, od.quantity_ordered
FROM   orders AS o
JOIN   orderdetails AS od ON o.id = od.order_id
JOIN   products AS p ON od.product_id = p.id
ORDER BY o.id DESC, p.product_name ASC, od.quantity_ordered ASC;

-- 3.Payments Made by Customers:

SELECT c.customer_name, p.check_number, p.payment_date, p.amount
FROM   payments AS p
JOIN   customers AS c ON p.customer_id = c.id
ORDER BY c.customer_name ASC, p.payment_date DESC;

-- 4.Orders and Products:

SELECT o.id AS order_number, p.product_name
FROM   orders AS o
JOIN   orderdetails AS od ON o.id = od.order_id
JOIN   products AS p ON od.product_id = p.id
ORDER BY o.id ASC, p.product_name DESC;

-- 5.Number of Products in Each Order:

SELECT od.order_id, COUNT(od.product_id) AS product_count
FROM   orderdetails AS od
GROUP BY od.order_id
ORDER BY product_count DESC;

-- 6.Customer with Most Payments:

SELECT p.customer_id, COUNT(*) AS payment_count
FROM   payments AS p
GROUP BY p.customer_id
ORDER BY payment_count DESC
LIMIT 1;

-- 7.Office with Most Orders:

SELECT e.office_id, COUNT(o.id) AS order_count
FROM classic_models.orders AS o
JOIN classic_models.customers AS c ON o.customer_id = c.id
JOIN classic_models.employees AS e ON c.sales_rep_employee_id = e.id
GROUP BY e.office_id
ORDER BY order_count DESC
LIMIT 1;

-- 8.Order with Most Products:

SELECT od.order_id, COUNT(od.product_id) AS product_count
FROM   orderdetails AS od
GROUP BY od.order_id
ORDER BY product_count DESC
LIMIT 1;

-- 9.Total Quantity Ordered for Each Order (Bonus):

SELECT od.order_id, SUM(od.quantity_ordered) AS total_quantity
FROM   orderdetails AS od
GROUP BY od.order_id;

-- 10.Employee Names and Customer Names:

SELECT e.firstname, e.lastname, c.customer_name
FROM   employees AS e
JOIN   customers AS c ON e.id = c.sales_rep_employee_id
ORDER BY c.customer_name;

-- 11.Count of All Orders by Office:

SELECT e.office_id, COUNT(o.id) AS order_count
FROM orders AS o
JOIN customers AS c ON o.customer_id = c.id
JOIN employees AS e ON c.sales_rep_employee_id = e.id
GROUP BY e.office_id;



