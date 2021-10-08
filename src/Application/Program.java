package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List <String> listNames = new ArrayList<>();
		
		String path = "C:\\temp\\names.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			String name = br.readLine();
			while (name != null) {
				listNames.add(name);
				name = br.readLine();
			}
			
			Collections.sort(listNames);
			for(String s : listNames) {
				System.out.println(s);
			}
			
			br.close();
		}catch(IOException e) {
			System.out.println("Error "+ e.getMessage());
		}

		
	}

}
