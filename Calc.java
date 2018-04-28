package gradeCalc;

import java.io.*;

/**
 * Handles the calculation of Grades.
 */
public class Calc implements Serializable{

    //integer and letter final grades
    int totalPts;
    String finalLetterGrade;

    //minimum and maximum grade values
    int AMin;
    int BMax;
    int BMin;
    int CMax;
    int CMin;
    int DMax;
    int DMin;
    int FMax;

    //weight for sections
    int sect1Weight, sect2Weight, sect3Weight, sect4Weight, sect5Weight;
    int sect6Weight, sect7Weight, sect8Weight, sect9Weight, sect10Weight;
    
    //grades for sections
    int sect1Grade, sect2Grade, sect3Grade, sect4Grade, sect5Grade;
    int sect6Grade, sect7Grade, sect8Grade, sect9Grade, sect10Grade;
    
    /**
     * No-Arg Constructor. Sets all data to minimum values.
     */
    public Calc() {
	totalPts = 0;
	finalLetterGrade="F";

	AMin = 0;
	BMax = 0;
	BMin = 0;
	CMax = 0;
	CMin = 0;
	DMax = 0;
	DMin = 0;
	FMax = 0;
	
	sect1Weight = 0;
	sect1Grade = 0;
	
	sect2Weight = 0;
	sect2Grade = 0;

	sect3Weight = 0;
	sect3Grade = 0;

	sect4Weight = 0;
	sect4Grade = 0;

	sect5Weight = 0;
	sect5Grade = 0;

	sect6Weight = 0;
	sect6Grade = 0;

	sect7Weight = 0;
	sect7Grade = 0;

	sect8Weight = 0;
	sect8Grade = 0;

	sect9Weight = 0;
	sect9Grade = 0;

	sect10Weight = 0;
	sect10Grade = 0;
    }//Calc

    /**
     * Return Total Points.
     */
    public int getTotalPts(){

	if(sect1Weight != 0)totalPts = sect1Grade/sect1Weight; //add section 1
	if(sect2Weight != 0)totalPts+= sect2Grade/sect2Weight; //add section 2
	if(sect3Weight != 0)totalPts+= sect3Grade/sect3Weight; //add section 3
	if(sect4Weight != 0)totalPts+= sect4Grade/sect4Weight; //add section 4
	if(sect5Weight != 0)totalPts+= sect5Grade/sect5Weight; //add section 5
	if(sect6Weight != 0)totalPts+= sect6Grade/sect6Weight; //add section 6
	if(sect7Weight != 0)totalPts+= sect7Grade/sect7Weight; //add section 7
	if(sect8Weight != 0)totalPts+= sect8Grade/sect8Weight; //add section 8
	if(sect9Weight != 0)totalPts+= sect9Grade/sect9Weight; //add section 9
	if(sect10Weight != 0)totalPts+= sect10Grade/sect10Weight; //add section10

	return totalPts;
    }

    /**
     * Set Total Points.
     */
    public void setTotalPoints(int totalPts){totalPts = totalPts;}

    /**
     * Return Final Letter Grade.
     */
    public String getFinalLetterGrade(){

	if (totalPts >= AMin) finalLetterGrade = "A";
	if (totalPts >= BMin && totalPts <= BMax) finalLetterGrade = "B";
	if (totalPts >= CMin && totalPts <= CMax) finalLetterGrade = "C";
	if (totalPts >= DMin && totalPts <= DMax) finalLetterGrade = "D";
	if (totalPts <= FMax) finalLetterGrade = "F";
	
	return finalLetterGrade;}

    /**
     * Set Final Letter Grade.
     */
    public void setFinalLetterGrade(String finalLetterGrade){finalLetterGrade = finalLetterGrade;}

    /**
     * Get the minumum grade for an A.
     */
    public int getAMin(){return AMin;}

    /**
     * Set the minumum grade for an A.
     */
    public void setAMin(int a){AMin = a;}

    /**
     * Get the maximum grade for an B.
     */
    public int getBMax(){return BMax;}

    /**
     * Set the maximum grade for an B.
     */
    public void setBMax(int b){BMax = b;}

    /**
     * Get the minumum grade for an B.
     */
    public int getBMin(){return BMin;}

    /**
     * Set the minumum grade for an B.
     */
    public void setBMin(int b){BMin = b;}

    /**
     * Get the maximum grade for an C.
     */
    public int getCMax(){return CMax;}

    /**
     * Set the maximum grade for an C.
     */
    public void setCMax(int c){CMax = c;}

    /**
     * Get the minumum grade for an C.
     */
    public int getCMin(){return CMin;}

    /**
     * Set the minumum grade for an C.
     */
    public void getCMin(int c){CMin = c;}

    /**
     * Get the maximum grade for an D.
     */
    public int getDMax(){return DMax;}

    /**
     * Set the maximum grade for an D.
     */
    public void setDMax(int d){DMax = d;}

    /**
     * Get the minumum grade for an D.
     */
    public int getDMin(){return DMin;}

    /**
     * Set the minumum grade for an D.
     */
    public void setDMin(int d){DMin = d;}

    /**
     * Get the maximum grade for an F.
     */
    public int getFMax(){return FMax;}

    /**
     * Set the maximum grade for an F.
     */
    public void setFMax(int f){FMax = f;}

    /**
     * Get the weight for Section 1.
     */
    public int getSect1Weight(){return sect1Weight;}

    /**
     * Set the weight for Section 1.
     */
    public void setSect1Weight(int weight){sect1Weight = weight;}

    /**
     * Get the grade for Section 1.
     */
    public int getSect1Grade(){return sect1Grade;}

    /**
     * Set the grade for Section 1.
     */
    public void setSect1Grade(int grade){sect1Grade = grade;}

    /**
     * Get the weight for Section 2.
     */
    public int getSect2Weight(){return sect2Weight;}

    /**
     * Set the weight for Section 2.
     */
    public void setSect2Weight(int weight){sect2Weight = weight;}

    /**
     * Get the grade for Section 2.
     */
    public int getSect2Grade(){return sect2Grade;}

    /**
     * Set the grade for Section 2.
     */
    public void setSect2Grade(int grade){sect2Grade = grade;}
    
    /**
     * Get the weight for Section3.
     */
    public int getSect3Weight(){return sect3Weight;}

    /**
     * Set the weight for Section 3.
     */
    public void setSect3Weight(int weight){sect3Weight = weight;}

    /**
     * Get the grade for Section 3.
     */
    public int getSect3Grade(){return sect3Grade;}

    /**
     * Set the grade for Section 3.
     */
    public void setSect3Grade(int grade){sect3Grade = grade;}

    /**
     * Get the weight for Section 2.
     */
    public int getSect4Weight(){return sect4Weight;}

    /**
     * Set the weight for Section 4.
     */
    public void setSect4Weight(int weight){sect4Weight = weight;}

    /**
     * Get the grade for Section 4.
     */
    public int getSect4Grade(){return sect4Grade;}

    /**
     * Set the grade for Section 4.
     */
    public void setSect4Grade(int grade){sect4Grade = grade;}

    /**
     * Get the weight for Section 5.
     */
    public int getSect5Weight(){return sect5Weight;}

    /**
     * Set the weight for Section 5.
     */
    public void setSect5Weight(int weight){sect5Weight = weight;}

    /**
     * Get the grade for Section 5.
     */
    public int getSect5Grade(){return sect5Grade;}

    /**
     * Set the grade for Section 5.
     */
    public void setSect5Grade(int grade){sect5Grade = grade;}

    /**
     * Get the weight for Section 6.
     */
    public int getSect6Weight(){return sect6Weight;}

    /**
     * Set the weight for Section 6.
     */
    public void setSect6Weight(int weight){sect6Weight = weight;}

    /**
     * Get the grade for Section 6.
     */
    public int getSect6Grade(){return sect6Grade;}

    /**
     * Set the grade for Section 6.
     */
    public void setSect6Grade(int grade){sect6Grade = grade;}

    /**
     * Get the weight for Section 7.
     */
    public int getSect7Weight(){return sect7Weight;}

    /**
     * Set the weight for Section 7.
     */
    public void setSect7Weight(int weight){sect7Weight = weight;}

    /**
     * Get the grade for Section 7.
     */
    public int getSect7Grade(){return sect7Grade;}

    /**
     * Set the grade for Section 7.
     */
    public void setSect7Grade(int grade){sect7Grade = grade;}

    /**
     * Get the weight for Section 8.
     */
    public int getSect8Weight(){return sect8Weight;}

    /**
     * Set the weight for Section 8.
     */
    public void setSect8Weight(int weight){sect8Weight = weight;}

    /**
     * Get the grade for Section 8.
     */
    public int getSect8Grade(){return sect8Grade;}

    /**
     * Set the grade for Section 8.
     */
    public void setSect8Grade(int grade){sect8Grade = grade;}

    /**
     * Get the weight for Section 9.
     */
    public int getSect9Weight(){return sect9Weight;}

    /**
     * Set the weight for Section 9.
     */
    public void setSect9Weight(int weight){sect9Weight = weight;}

    /**
     * Get the grade for Section 9.
     */
    public int getSect9Grade(){return sect9Grade;}

    /**
     * Set the grade for Section 9.
     */
    public void setSect9Grade(int grade){sect9Grade = grade;}

    /**
     * Get the weight for Section 10.
     */
    public int getSect10Weight(){return sect10Weight;}

    /**
     * Set the weight for Section 10.
     */
    public void setSect10Weight(int weight){sect10Weight = weight;}

    /**
     * Get the grade for Section 10.
     */
    public int getSect10Grade(){return sect10Grade;}

    /**
     * Set the grade for Section 10.
     */
    public void setSect10Grade(int grade){sect10Grade = grade;}
}//Calc
