
CREATE TABLE Students (
    StudentID INT IDENTITY(1,1) PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    BirthDate DATE NOT WNULL,
    Gender CHAR(1) CHECK (Gender IN ('M', 'F')),
    UNIQUE (FirstName, LastName, BirthDate)
);
GO

CREATE TABLE Courses (
    CourseID INT IDENTITY(1,1) PRIMARY KEY,
    CourseName VARCHAR(100) NOT NULL,
    Credits INT CHECK (Credits > 0)
);
GO

CREATE TABLE Enrollments (
    EnrollmentID INT IDENTITY(1,1) PRIMARY KEY,
    StudentID INT FOREIGN KEY REFERENCES Students(StudentID),
    CourseID INT FOREIGN KEY REFERENCES Courses(CourseID),
    EnrollmentDate DATE DEFAULT GETDATE()
);
GO

CREATE INDEX idx_lastname ON Students(LastName);
GO
