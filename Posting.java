package diary;
import java.util.*;
import junit.framework.*;
import java.util.ArrayList;
import java.lang.*;
import java.io.*;
import java.sql.*;

public class Posting {
    String author;
    String comment;
    java.sql.Date date;
    Connection conn;
    public Posting(){
        author = null;
        comment = null;
    }
    public Posting(String authorName, String content, java.sql.Date date){
		this.author = authorName;
		this.comment = content;
		this.date = date;
    }    
    public void setAuthor(String authorName){
        this.author = authorName;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    
    public String getAuthor(){
        return author;
    }
    public String getComment(){
        return comment;
    }
}
