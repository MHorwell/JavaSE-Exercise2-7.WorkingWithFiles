package workingWithFiles;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Write wrote = new Write();
		Read read = new Read();
		String personFile = "C:\\Users\\Admin\\Documents\\people.txt";
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Jasmine", "Student", 18));
		personList.add(new Person("Adam", "Head of Operations", 33));
		personList.add(new Person("Jacqueline", "Events Manager", 27));
		personList.add(new Person("Tom", "Chef", 28));
		personList.add(new Person("Angie", "Patissier", 29));

		try {
			wrote.bufferedWriter(personFile, personList);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("---------------------------------------");

		try {
			for (Person p : read.bufferedReader(personFile)) {
				System.out.println(p);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
 
}
