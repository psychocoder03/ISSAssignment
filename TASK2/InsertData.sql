INSERT INTO Students (FirstName, LastName, BirthDate, Gender)
VALUES
('Mark', 'ab', '2005-09-01', 'M'),
('Shyam', 'bc', '2006-04-15', 'F'),
('Ram', 'cd', '2005-12-22', 'M'),
('Om', 'de', '2007-03-17', 'F');
GO

INSERT INTO Courses (CourseName, Credits)
VALUES
('Mathematics', 4),
('English', 3),
('Biology', 4),
('History', 3);
GO

INSERT INTO Enrollments (StudentID, CourseID)
SELECT s.StudentID, c.CourseID
FROM Students s, Courses c
WHERE s.LastName IN ('Doe', 'Smith') AND c.CourseName = 'Mathematics';
GO
