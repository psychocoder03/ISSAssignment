CREATE PROCEDURE GetStudentsByLastName
    @LastName NVARCHAR(50)
AS
BEGIN
    SELECT * FROM Students WHERE LastName = @LastName;
END;
GO

EXEC GetStudentsByLastName @LastName = 'cd';
GO
