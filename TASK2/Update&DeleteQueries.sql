UPDATE Students
SET LastName = 'fg'
WHERE StudentID = 1;
GO

DELETE FROM Courses
WHERE CourseID = 4;
GO

DROP TABLE Enrollments;
GO

ALTER TABLE Students ADD Email VARCHAR(100);
GO