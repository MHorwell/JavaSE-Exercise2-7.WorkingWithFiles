package workingWithFiles;

public class Person {
	
	//Attributes
	private String name;
	private String occupation;
	private int age;
	
	//Constructors
	public Person(String name, String occupation, int age) {
		this.name = name;
		this.occupation = occupation;
		this.age = age;
	}
	
	public Person(String[] ar) {
		this.name = ar[1];
		this.occupation = ar[2];
		this.age = Integer.parseInt(ar[3]);
	}
	
	//Method
	@Override
	public String toString() {
		return "Name: " + name + ", Occupation: " + occupation + ", Age: " + age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getOccupation() {
		return this.occupation;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	

	

}
