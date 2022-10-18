--Select
--ANSII
Select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers

Select * from Customers where City = 'Berlin'

--case insensitive
Select * from Products where CategoryID=1 or CategoryID=3

Select * from Products where CategoryID=1 and UnitPrice>=10

select * from Products where CategoryID=1 order by UnitPrice desc     --ascending  --descending

Select COUNT(*) Adet from Products

Select CategoryID, COUNT(*) from Products where UnitPrice>20 group by CategoryID having COUNT(*)<10

Select City, COUNT(*) from Customers group by City having COUNT(*)>1

Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10

--DTO Data Transformation Object

Select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on OrderID = od.OrderID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null