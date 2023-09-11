package controler;
import Service.StudentService;
public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService ss= new StudentService();
		ss.DeleteTable(104);
		System.out.println("Data has Been Delete");
		
	}

}
