<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, <%= request.getAttribute("username") %></h2>
    <form action="logout" method="post">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
