package jdbc;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestConnection {
	public static void main(String [] args) throws Exception, IOexceptoion, SQLException{
		ConnectDB connectDB = new ConnectDB();
		connectDB.connectToDatabase();
//		List<String> list = new ArrayList<String>();		
//		list = connectDB.readDataBase("students", "first_name");
//		System.out.println("Data is reading from the Table and displaying to the console");
//		for(String st:list){
//			System.out.println(st);
//		}
	}

}
