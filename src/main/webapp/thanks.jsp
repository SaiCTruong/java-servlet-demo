
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ include file="/includes/header.jsp" %> 


<h1>Thanks for joining our survey</h1>
<p>Here is the information that you entered:</p>

<label>Email:</label>
<span>${user.email}</span><br>

<label>First Name:</label>
<span>${user.firstName}</span><br>

<label>Last Name:</label>
<span>${user.lastName}</span><br>

<label>Date Of Birth:</label>
<span>${dateOfBirth}</span><br>

<label>Heard From:</label>
<span>${form}</span><br>


<label>Contact for Offers:</label>
<span>${like}</span><br> 


<label>Send Email Announcements:</label>
<span>${emailOK}</span><br>


<span>${contact}</span><br> 

<p>To enter another email address, click on the Back 
button in your browser or the Return button shown 
below.</p>

<form action="emailList" method="get">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
</form>

<%@ include file="/includes/footer.jsp" %>