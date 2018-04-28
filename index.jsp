<html>
<head>
	<title>Grade Calculator</title>
	<meta charset="UTF-8">

	<style>
	  .p{
	  
	  }
	</style>
	<script>

	/**
	* Calculate Average Grade.
	*/
	function calcAvg() {
		 <%--define variables--%>
		 var s1 = parseFloat(document.getElementById('s1g').value)/parseFloat(document.getElementById('s1w').value);
		 var s2 = parseFloat(document.getElementById('s2g').value)/parseFloat(document.getElementById('s2w').value);
		 var s3 = parseFloat(document.getElementById('s3g').value)/parseFloat(document.getElementById('s3w').value);
		 var s4 = parseFloat(document.getElementById('s4g').value)/parseFloat(document.getElementById('s4w').value);
		 var s5 = parseFloat(document.getElementById('s5g').value)/parseFloat(document.getElementById('s5w').value);
		 var s6 = parseFloat(document.getElementById('s6g').value)/parseFloat(document.getElementById('s6w').value);
		 var s7 = parseFloat(document.getElementById('s7g').value)/parseFloat(document.getElementById('s7w').value);
		 var s8 = parseFloat(document.getElementById('s8g').value)/parseFloat(document.getElementById('s8w').value);
		 var s9 = parseFloat(document.getElementById('s9g').value)/parseFloat(document.getElementById('s9w').value);
		 var s10 = parseFloat(document.getElementById('s10g').value)/parseFloat(document.getElementById('s10w').value);

		 <%--calculate sum--%>
		 var totalPts = s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10;
		 document.getElementById('total').value = totalPts;

		 <%--get letter grade--%>
		 if (totalPts >= document.getElementById('AMin').value){
		    document.getElementById('finalLetterGrade').value = "A";
		 }//A
		 else if (totalPts >= document.getElementById('BMin').value && totalPts <= document.getElementById('BMax').value){
		    document.getElementById('finalLetterGrade').value = "B";
		 }//B
		 else if (totalPts >= document.getElementById('CMin').value && totalPts <= document.getElementById('CMax').value){
		    document.getElementById('finalLetterGrade').value = "C";
		 }//C
		 else if (totalPts >= document.getElementById('DMin').value && totalPts <= document.getElementById('DMax').value){
		    document.getElementById('finalLetterGrade').value = "D";
		 }//D
		 else if (totalPts <= document.getElementById('FMax').value){
		    document.getElementById('finalLetterGrade').value = "F";
		 }//F
	}
		 
	</script>
</head>
<body>

  <jsp:useBean id="gradeCalc" class="gradeCalc.Calc" scope="session"></jsp:useBean>
  <jsp:setProperty name="gradeCalc" property="*" />
  
  <form method="POST" action="172.17.149.143:8080/GradeCalc/index.jsp">
    <p>Class Name: <input type="text" name="Class Name"><br>
      <br><br><br>
      <h2>Enter Grades Below:</h2><br>
      <h3>These are the cumulatative grades for each section,</h3>
      <h3>not individual grades.</h3>
      <h3>If you have less sections than below, put 0 wherever asked for "Weight".</h3>
      <br><br><br>
      <h4>First things first. What are the Letter Grade Dispersments in your class?</h4>
    <p>
      <b>A</b>
      <p>Above:<input type="text" id="AMin" value="${gradeCalc.AMin}"/></p>
    </p>
    <p>
      <b>B</b>
      <p>From:<input type="text" id="BMax" value="${gradeCalc.BMax}"/>To:<input type="text" id="BMin" value="${gradeCalc.BMin}"/></p>
    <p>
      <b>C</b>
      <p>From:<input type="text" id="CMax" value="${gradeCalc.CMax}"/>To:<input type="text" id="CMin" value="${gradeCalc.CMin}"/></p>
    <p>
      <b>D</b>
      <p>From:<input type="text" id="DMax" value="${gradeCalc.DMax}"/>To:<input type="text" id="DMin" value="${gradeCalc.DMin}"/></p>
    <p>
      <b>F</b>
      <p>Below:<input type="text" id="FMax" value="${gradeCalc.FMax}"/></p>
    </p>
    
    <br>
    <br>
    <br>
    <h3>Okay, now you can put your section grades!</h3>
    
    <p>
    <p>Grade:<input id="s1g" type="text" value="${gradeCalc.sect1Grade}"/>Weight:<input id="s1w" type="text" value="${gradeCalc.sect1Weight}"/></p>
    <p>Grade:<input id="s2g" type="text" value="${gradeCalc.sect2Grade}"/>Weight:<input id="s2w" type="text" value="${gradeCalc.sect2Weight}"/></p>
    <p>Grade:<input id="s3g" type="text" value="${gradeCalc.sect3Grade}"/>Weight:<input id="s3w" type="text" value="${gradeCalc.sect3Weight}"/></p>
    <p>Grade:<input id="s4g" type="text" value="${gradeCalc.sect4Grade}"/>Weight:<input id="s4w" type="text" value="${gradeCalc.sect4Weight}"/></p>
    <p>Grade:<input id="s5g" type="text" value="${gradeCalc.sect5Grade}"/>Weight:<input id="s5w" type="text" value="${gradeCalc.sect5Weight}"/></p>
    <p>Grade:<input id="s6g" type="text" value="${gradeCalc.sect6Grade}"/>Weight:<input id="s6w" type="text" value="${gradeCalc.sect7Grade}"/></p>
    <p>Grade:<input id="s7g" type="text" value="${gradeCalc.sect7Grade}"/>Weight:<input id="s7w" type="text" value="${gradeCalc.sect7Weight}"/></p>
    <p>Grade:<input id="s8g" type="text" value="${gradeCalc.sect8Grade}"/>Weight:<input id="s8w" type="text" value="${gradeCalc.sect8Grade}"/></p>
    <p>Grade:<input id="s9g" type="text" value="${gradeCalc.sect9Grade}"/>Weight:<input id="s9w" type="text" value="${gradeCalc.sect9Weight}"/></p>
    <p>Grade:<input id="s10g" type="text" value="${gradeCalc.sect10Grade}"/>Weight:<input id="s10w" type="text" value="${gradeCalc.sect10Weight}"/></p>
    </p>
    
    <input type="reset" value="Clear Fields"/>
    <input type="submit" value="Show Me My Grade!"/>
    
  </form>
  
  <p><u>FINAL GRADES:</u></p>
  <p>
  <p>Total Points: <input type="text" id="total" value="${gradeCalc.totalPts}"/></p>
  <p>Letter Grade: <input type="text" id="${gradeCalc.finalLetterGrade}"/></p>
  </p>
  
</body>
</html>
