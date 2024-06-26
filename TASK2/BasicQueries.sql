
SELECT * FROM Students;
GO

SELECT * FROM Courses;
GO

SELECT DISTINCT CourseName FROM Courses;
GO

SELECT * FROM Students WHERE BirthDate > '2006-01-01';
GO

SELECT * FROM Courses WHERE Credits > 3;
GO

SELECT TOP 2 * FROM Students ORDER BY BirthDate DESC;
GO

SELECT * FROM Students WHERE LastName LIKE 'O%';
GO

SELECT * FROM Students WHERE FirstName IN ('Om', 'Ram');
GO

SELECT * FROM Students WHERE BirthDate BETWEEN '2005-01-01' AND '2006-12-31';
GO

SELECT FirstName AS FName, LastName AS LName FROM Students;
GO

SELECT FirstName, LastName FROM Students
UNION
SELECT 'Om', 'de';
GO

INSERT INTO Students (FirstName, LastName, BirthDate, Gender)
SELECT FirstName, LastName, '2000-01-01', 'M' FROM Students WHERE StudentID = 1;
GO

SELECT Gender, COUNT(*) AS Count
FROM Students
GROUP BY Gender
HAVING COUNT(*) > 1;
GO