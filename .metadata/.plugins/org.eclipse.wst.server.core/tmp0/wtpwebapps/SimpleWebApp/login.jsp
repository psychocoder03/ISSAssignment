<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <script>
        function validateForm() {
            var username = document.forms["loginForm"]["username"].value;
            var password = document.forms["loginForm"]["password"].value;
            if (username == "" || password == "") {
                alert("Username and Password must be filled out");
                return false;
            }
        }
    </script>
</head>
<body>
    <h2>Login</h2>
    <form name="loginForm" action="login" method="post" onsubmit="return validateForm()">
        Username: <input type="text" name="username"><br>
        Password: <input type="password" name="password"><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
