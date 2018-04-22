package diary;
import java.util.*;
import junit.framework.*;
import java.sql.*;

public class DiaryBeanTest extends TestCase{
    
    public void testConstructor() throws ClassNotFoundException, SQLException{
		Posting instance = new Posting();
		assertEquals(null, instance.getAuthor());
		assertEquals(null, instance.getComment());
        
    }
	public void testInsert() throws SQLException, ClassNotFoundException{
		DiaryBean instance = new DiaryBean();
		ArrayList <Posting> postObjList = instance.getPostingList();
		instance.insertEntry("Anokhi", "test");
		Posting post1 = postObjList.get(0);
		assertEquals("Anokhi", post1.getAuthor());
		assertEquals("test", post1.getComment());
	}
}
