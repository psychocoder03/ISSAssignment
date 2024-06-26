SELECT s.FirstName, s.LastName, e.EnrollmentDate
FROM Students s
INNER JOIN Enrollments e ON s.StudentID = e.StudentID;
GO

SELECT s.FirstName, s.LastName, e.EnrollmentDate
FROM Students s
LEFT JOIN Enrollments e ON s.StudentID = e.StudentID;
GO

SELECT s.FirstName, s.LastName, e.EnrollmentDate
FROM Students s
RIGHT JOIN Enrollments e ON s.StudentID = e.StudentID;
GO

SELECT s.FirstName, s.LastName, e.EnrollmentDate
FROM Students s
FULL JOIN Enrollments e ON s.StudentID = e.StudentID;
GO
