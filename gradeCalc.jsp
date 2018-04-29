<DOCTYPE html>
<html>
	<head>
		<title>Grade Calculator</title>
		<meta charset="UTF-8">
		
		<style></style>
		<script>
		/*
		 * Calculate Average Grade.
		 */
		function calcAvg( ) {
			
			var weights = document.getElementsByClassName("weight");
			var grades = document.getElementsByClassName("grade");
			
			var pointsEarned = 0; //individual weighted grade
			var total = 0; //total points earned
			
			for(var i = 0; i < weights.length; i++){
				if(parseInt(weights[i].value) && parseInt(grades[i].value)){
					pointsEarned = ((parseInt(weights[i].value))/100)*parseInt(grades[i].value);
					total += pointsEarned;
				}	
			}
			document.getElementById("result").value = total;
		}
	</script>
	</head>
	<body>
	
	<form> 
		Class Name: <input type="text" name="Class Name"><br>
		<br><br><br>
		<h2>Enter Grades Below:</h2><br>
		<label>Weight:</label> <input class="weight" type="text" value="${weight[0]}">&nbsp
		<label>Grade:</label> <input class="grade" type="text" value="${grade[0]}"><br>
		<label>Weight:</label> <input class="weight" type="text" value="${weight[1]}">&nbsp
		<label>Grade:</label><input class="grade" type="text" value="${grade[1]}"><br>
		<label>Weight:</label> <input class="weight" type="text" value="${weight[2]}">&nbsp
		<label>Grade:</label><input class="grade" type="text" value="${grade[2]}"><br>
		<label>Weight:</label> <input class="weight" type="text" value="${weight[3]}">&nbsp
		<label>Grade:</label><input class="grade" type="text" value="${grade[3]}"><br>
		<label>Weight:</label> <input class="weight" type="text" value="${weight[4]}">&nbsp
		<label>Grade:</label><input class="grade" type="text" value="${grade[4]}"><br>
		<label>Weight:</label> <input class="weight" type="text" value="${weight[5]}">&nbsp
		<label>Grade:</label><input class="grade" type="text" value="${grade[5]}"><br>
		<br>
		<input type="submit" onclick="calcAvg(); return false" value="Calculate My Grade"><br>
	</form>
	<br>
		Average: <input type="text" name="result" id="result" value="" disabled>
	<br>
	</body>
</html>
