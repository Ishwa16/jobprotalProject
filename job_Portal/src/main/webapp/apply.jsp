<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Apply Form</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<style>
body {
	background-color: #f0f1f2;
}

.container {
	margin-top: 100px;
	text-align: center;
}

.form-container {
	background-color: #fff;
	padding: 50px;
}
</style>
</head>
<body>
	<div class="container">
		<div class="form-container">
			<h1>Apply Form</h1>
			<form action="sucessfully_applied.jsp">
				<div class="form-group">
					<label for="name">Name</label>
					<input type="text" class="form-control" id="name" name="name" placeholder="Enter your name" required>
				</div>
				<div class="form-group">
					<label for="email">Email</label>
					<input type="email" class="form-control" id="email" name="email" placeholder="Enter your email" pattern="[a-zA-Z0-9._%+-]+@gmail.com" required>
				</div>
				<div class="form-group">
					<label for="contact">Contact Number</label>
					<input type="text" class="form-control" id="contact" name="contact" placeholder="Enter your contact number" pattern="[0-9]+" title="Enter your contact number" required>
				</div>
				<div class="form-group">
					<label for="message">Cover letter</label>
					<textarea class="form-control" id="message" name="message" rows="5" placeholder="Enter your message" required></textarea>
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>
