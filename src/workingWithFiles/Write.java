package workingWithFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Write {

	public void bufferedWriter(String outFile, List<Person> people) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));

		try {
			for (Person person : people) {
				bw.write(person.toString());
				bw.newLine();
				System.out.println(person.toString());
			}
		}

		catch (Exception e) {

		} finally {

			bw.close();

		}
	}

}
