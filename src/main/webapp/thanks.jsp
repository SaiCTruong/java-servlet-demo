<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>

<body>
    <h1>Thanks for joining our email list</h1>

    <p>Here is the information that you entered:</p>

    <label>Email:</label>
    <span>${user.email}</span><br>
    <label>First Name:</label>
    <span>${user.firstName}</span><br>
    <label>Last Name:</label>
    <span>${user.lastName}</span><br>
    <label>Date Of Birth:</label>
    <span>${dateOfBirth}</span><br>
    
    <h2>How did you hear about us?</h2>
    <label>Heard from:</label>
    <span>${form}</span><br>
    
    <h2>Announcements:</h2>
    <label>YES, I'd like that:</label>
    <span>${like}</span><br>
    
    <label>YES, please send me email announcements:</label>
    <span>${emailOK}</span><br>
    
    <h2>Contact Method:</h2>
    <label>Contact by:</label>
    <span>${contact}</span><br> 
    
    <p>To enter another email address, click on the Back 
    button in your browser or the Return button shown 
    below.</p>
    
    <form action="emailList" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>

</body>
</html>


