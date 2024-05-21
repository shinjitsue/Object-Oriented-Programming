<?php
$fullname = $_POST['fullname'];
$email = $_POST['email'];
$dob = $_POST['dob'];
$gender = $_POST['gender'];
$country = $_POST['country'];
$tickets = $_POST['tickets'];
$session = $_POST['session'];
$diet = $_POST['diet'];
$contact = $_POST['contact'];
$comments = $_POST['comments'];

echo "Full Name: $fullname<br>";
echo "Email: $email<br>";
echo "Date of Birth: $dob<br>";
echo "Gender: $gender<br>";
echo "Country: $country<br>";
echo "Number of Tickets: $tickets<br>";
echo "Preferred Session: ";
print_r($session);
echo "<br>Dietary Preferences: ";
print_r($diet);
echo "<br>Contact Number: $contact<br>";
echo "Comments or Special Requests: $comments<br>";
?>