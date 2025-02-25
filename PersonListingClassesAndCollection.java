package collectionsInJava;

import java.util.LinkedList;

class Person{
	String name;
	int experience;
	double salary;
	Person(String name, int experience,	double salary){
		this.name = name;
		this.experience = experience;
		this.salary = salary;
	}
	
	public void incrementSalary() {
		if(experience > 5) {
			salary += 5000;
		}
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", experience=" + experience + ", salary= Rs." + salary + "]";
	}

}



public class PersonListingClassesAndCollection {
	public static void main(String[] args) {
		LinkedList<Person> obj = new LinkedList<Person>();
		obj.add(new Person("John",9,450000));
		obj.add(new Person("Roman",1,450000));
		obj.add(new Person("Seth",5,450000));
		obj.add(new Person("CM",6,450000));
		
		for(Person p : obj) {
			p.incrementSalary();
		}
		
		System.out.println("The new salaries are: ");
		for(Person p: obj) {
			System.out.println(p);
		}
	}
	
}
