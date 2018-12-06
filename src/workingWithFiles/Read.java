package workingWithFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {

	public ArrayList<Person> bufferedReader(String inFile) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(inFile));
		String line = "";
		ArrayList<Person> people = new ArrayList<Person>();

		try {
			while ((line = br.readLine()) != null) {
				String[] parts = line.split("Name: |\\, Occupation: |\\, Age: ");
				Person person = new Person(parts);
				people.add(person);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			br.close();
		}
		return people;
	}
}
