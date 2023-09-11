package controler;

import Service.StudentService;
import DTO.DTOStudent;
public class getAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DTOStudent ds=new DTOStudent();
		ds.setSid(104);
		ds.setSname("Poonam");
		ds.setRoll(98);
		
		System.out.println(ds.getSid());
		System.out.println(ds.getSname());
		System.out.println(ds.getRoll());
		
		StudentService ss=new StudentService();
		DTOStudent dt=ss.addData(ds);
		
		if(ds!=null) {
			System.out.println("Data Add in DataBase");
		}else {
			System.out.println("Some is Wrong");
		}
		
		
		
	}

}
