package com.dani;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWriteSample {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("./src/main/resources/test.txt");
			String fileContent = null;
				fileContent = Files.readString(path);
			System.out.println(fileContent);
			
			String newFileContent = fileContent.replace("test", "newTest");
	
			Path newPath = Paths.get("./src/main/resources/test2.txt");
			Files.writeString(newPath, newFileContent);
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
