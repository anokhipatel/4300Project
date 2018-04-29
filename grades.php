<html>
<head>
<title>Your Grade:</title>
</head>

<body>
	<h2>Your Final Grade Is...</h2>

	<?php
	//gather variables

	//minimum & maxmimum values for letter grades
	$AMin = $_POST["AMin"];
	$BMax = $_POST["BMax"];
	$BMin = $_POST["BMin"];
	$CMax = $_POST["CMax"];
	$CMin = $_POST["CMin"];
	$DMax = $_POST["DMax"];
	$DMin = $_POST["DMin"];
	$FMax = $_POST["FMax"];

	//find average for each section
	if($_POST["s1w"] != 0) {
			 $Sect1 = $_POST["s1g"]/$_POST["s1w"];
			 } else {
			 $Sect1 = 0;
			 }
	if($_POST["s2w"] != 0) {
			 $Sect2 = $_POST["s2g"]/$_POST["s2w"];
			 } else {
			 $Sect2 = 0;
			 }
	if($_POST["s3w"] != 0) {
			 $Sect3 = $_POST["s3g"]/$_POST["s3w"];
			 } else {
			 $Sect3 = 0;
			 }
	if($_POST["s4w"] != 0) {
			 $Sect4 = $_POST["s4g"]/$_POST["s4w"];
			 } else {
			 $Sect4 = 0;
			 }
	if($_POST["s5w"] != 0) {
			 $Sect5 = $_POST["s5g"]/$_POST["s5w"];
			 } else {
			 $Sect5 = 0;
			 }
	if($_POST["s6w"] != 0) {
			 $Sect6 = $_POST["s6g"]/$_POST["s6w"];
			 } else {
			 $Sect6 = 0;
			 }
	if($_POST["s7w"] != 0) {
			 $Sect7 = $_POST["s7g"]/$_POST["s7w"];
			 } else {
			 $Sect7 = 0;
			 }
	if($_POST["s8w"] != 0) {
			 $Sect8 = $_POST["s8g"]/$_POST["s8w"];
			 } else {
			 $Sect8 = 0;
			 }
	if($_POST["s9w"] != 0) {
			 $Sect9 = $_POST["s9g"]/$_POST["s9w"];
			 } else {
			 $Sect9 = 0;
			 }
	if($_POST["s10w"] != 0) {
			  $Sect10 = $_POST["s10g"]/$_POST["s10w"];
			  } else {
			  $Sect10 = 0;
			  }
	
	//calculate average
	$totalPts = $Sect1 + $Sect2 + $Sect3 + $Sect4 + $Sect5 + $Sect6 + $Sect7 + $Sect8 + $Sect9 + $Sect10;

	echo "$totalPts" ?> <b>%</b>

	<h2> Letter Grade: </h2>

	<?php
	   //find letter grade
	   if ($AMin <= $totalPts) echo "A";
	   else if ($BMin <= $totalPts && $totalPts <= $BMax ) echo "B";
	   else if ($CMin <= $totaPts && $totalPts <= $CMax ) echo "C";
	   else if ($DMin <= $totalPts && $totalPts <= $DMax ) echo "D";
	   else if ($totalPts <= $FMax ) echo "F";  ?>
</body>
</html>
