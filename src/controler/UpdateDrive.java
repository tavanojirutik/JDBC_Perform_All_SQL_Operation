package controler;

import DTO.DTOStudent;
import Service.StudentService;
public class UpdateDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DTOStudent ds=new DTOStudent();
		
		StudentService ss=new StudentService();
		ss.updateDatax(104);
		
		System.out.println("Data Update");
		
	}

}
