package diary;
import java.util.ArrayList;
import java.lang.*;
import java.io.*;
import java.sql.*;

public class DiaryBean implements Serializable {
    Connection conn;
    String author;
    String content;
    //constructor of bean; calls driver and initializes variables
    public DiaryBean() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/Diary?user=root&password=csci4300&useSSL=false");
        author = null;
        content = null;

    }
    //inserts new comments into mysql
    public void insertEntry(String author, String comment) throws SQLException{
        PreparedStatement stmt=conn.prepareStatement("insert into diaryEntry (author, comment, date) " + " values(?, ?, NOW())");
        stmt.setString(1,author);
        stmt.setString(2, comment);
    }

    //returns the diaryEntry list		
    public ArrayList<Posting> getPostingList() throws SQLException{
        ArrayList<Posting> postingList = new ArrayList<Posting>();
        PreparedStatement stmt = conn.prepareStatement("select author, comment, date from diaryEntry");
        ResultSet rs = stmt.executeQuery();
	//repeats and prints every entry until done
        while(rs.next()){
            String authorName = rs.getString(1);
            String content = rs.getString(2);
            java.sql.Date date = rs.getDate(3);
            postingList.add(new Posting(authorName, content, date));
        }
        return postingList;
    }
}


