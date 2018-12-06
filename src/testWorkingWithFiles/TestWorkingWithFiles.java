package testWorkingWithFiles;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import workingWithFiles.Person;
import workingWithFiles.Read;
import workingWithFiles.Write;

public class TestWorkingWithFiles {

	Person testPerson = new Person("Matt", "Software Engineer", 22);

	@Test
	public void testGetName() {
		assertEquals("The name doesn't match", "Matt", testPerson.getName());
	}

	@Test
	public void testGetOccupation() {
		assertEquals("The occupation doesn't match", "Software Engineer", testPerson.getOccupation());
	}

	@Test
	public void testGetAge() {
		assertEquals("The age doesn't match", 22, testPerson.getAge());
	}

	@Test
	public void testArrayPerson() {
		String[] testArray = new String[] { "", "Matt", "Software Engineer", "22" };
		Person testArrayPerson = new Person(testArray);
		assertEquals("These statements do not match", "Name: Matt, Occupation: Software Engineer, Age: 22",
				testArrayPerson.toString());
	}

	@Test
	public void testReader() {
		Read testread = new Read();
		String testFile = "C:\\Users\\Admin\\Documents\\testReadPeople.txt";
		try {
			Person filePerson = testread.bufferedReader(testFile).get(0);
			assertEquals("These people don't match", testPerson.toString(), filePerson.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	public void testWriter() {
		Write testWrite = new Write();
		Read testread = new Read();
		List<Person> testPeople = new ArrayList<Person>();
		testPeople.add(testPerson);
		String testFile = "C:\\Users\\Admin\\Documents\\testReadPeople.txt";
		try {
			testWrite.bufferedWriter(testFile, testPeople);
			Person filePerson = testread.bufferedReader(testFile).get(0);
			assertEquals("These people don't match", testPerson.toString(), filePerson.toString());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
		}
	}

}
