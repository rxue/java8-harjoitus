package ruixue.practice.ocpkasi.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.DateTimeException;

public class DemoMultiCatchExceptions {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("non_exist.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);
			System.out.println(date);
		} catch(DateTimeException | IOException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

}
