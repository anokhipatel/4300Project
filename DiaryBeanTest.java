package diary;
import java.util.*;
import junit.framework.*;
import java.sql.*;

public class DiaryBeanTest extends TestCase{
    //test for constructor to check if null or not    
    public void testConstructor() throws ClassNotFoundException, SQLException{
	Posting instance = new Posting();
	assertEquals(null, instance.getAuthor());
	assertEquals(null, instance.getComment());
        
    }
    //tests the insert entry to check if the same or not
    public void testInsert() throws SQLException, ClassNotFoundException{
	DiaryBean instance = new DiaryBean();
	ArrayList <Posting> postObjList = instance.getPostingList();
	instance.insertEntry("Anokhi", "Worked on making java classes");
	Posting post1 = postObjList.get(0);
	assertEquals("Anokhi", post1.getAuthor());
	assertEquals("Worked on making java classes", post1.getComment());
    }
}


