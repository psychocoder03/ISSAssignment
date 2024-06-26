CREATE VIEW StudentFullNames AS
SELECT StudentID, FirstName + ' ' + LastName AS FullName FROM Students;
GO

SELECT * FROM StudentFullNames;
GO