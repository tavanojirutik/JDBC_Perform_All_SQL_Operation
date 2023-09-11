package Service;
import DAO.DAOStudent;
import DTO.DTOStudent;
public class StudentService {
	
	DAOStudent daostudent = new DAOStudent();
	
	public void getAllData() {
		daostudent.getAll();
	}
	
	public DTOStudent addData(DTOStudent student) {
		return daostudent.AddData(student);
	}
	
	public boolean updateDatax(int id) {
		boolean b= daostudent.updateData(id);
		return b;
	}
	
	public boolean DeleteTable(int id) {
		boolean x= daostudent.DeleteData(id);
		return x;
	}
}
