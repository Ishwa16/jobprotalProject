<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Successfully Applied</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f0f1f2;
        }

        .container {
            margin-top: 100px;
            text-align: center;
        }

        h1 {
            color: #007bff;
            font-weight: bold;
        }

        .jumbotron {
            background-color: #fff;
            padding: 50px;
        }
    </style>
    <script>
        function redirectToHome() {
            window.location.href = "<%= request.getContextPath() %>/home.jsp";
        }
    </script>
</head>
<body>
    <div class="container">
        <div class="jumbotron">
            <h1>Successfully Applied!</h1>
            <br><br><br><button type="button" class="btn btn-primary" onclick="redirectToHome()">OK</button>
        </div>
    </div>
</body>
</html>
