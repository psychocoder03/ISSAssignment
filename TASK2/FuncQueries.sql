
SELECT AVG(Credits) AS AverageCredits FROM Courses;
GO

SELECT MAX(BirthDate) AS LatestBirthDate FROM Students;
GO

SELECT MIN(BirthDate) AS EarliestBirthDate FROM Students;
GO

SELECT SUM(Credits) AS TotalCredits FROM Courses;
GO

SELECT * FROM Students WHERE FirstName LIKE '%o%';
GO
