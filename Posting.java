package diary;
import java.util.*;
import junit.framework.*;
import java.util.ArrayList;
import java.lang.*;
import java.io.*;
import java.sql.*;

public class Posting implements Serializable {
    String author;
    String comment;
    java.sql.Date date;
    Connection conn;
    //initialize constructor with no args
    public Posting() throws ClassNotFoundException, SQLException{
        author = null;
        comment = null;
    }
    //constructor with args
    public Posting(String authorName, String content, java.sql.Date date) throws SQLException{
		this.author = authorName;
		this.comment = content;
		this.date = date;
    }    
    //sets author
    public void setAuthor(String authorName){
        this.author = authorName;
    }
    //sets comment
    public void setComment(String comment){
        this.comment = comment;
    }
    //sets the current date
    public void setDate(java.sql.Date date){
	this.date = date;
    }
    //returns author's name
    public String getAuthor(){
        return author;
    }
    //returns the content written
    public String getComment(){
        return comment;
    }
    //returns the current date
    public java.sql.Date getDate(){
	return date;
    }
}


