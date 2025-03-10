package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List studentList = new ArrayList();
		
		studentList.add(new Student(1,"abc",600));
		studentList.add(new Student(2,"def",400));
		studentList.add(new Student(3,"ghj",554));
		studentList.add(new Student(4,"klm",200));
		studentList.add(new Student(5,"nop",400));
		
		List studentFilterList = new ArrayList();
		
		
		Iterator itr = studentList.iterator();
		
		while(itr.hasNext()) {
			Student st = (Student) itr.next();
			if(st.getTotalmarks() > 553)
				studentFilterList.add(st);
		}
		System.out.println(studentFilterList);
		studentList.remove(0);
		System.out.println(studentList);
	}

}