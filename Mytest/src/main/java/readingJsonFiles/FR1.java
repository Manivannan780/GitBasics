package readingJsonFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filelocation="E:\\Mani bckup\\L&P\\Automation LP\\sample2.json";
		File myObj = new File(filelocation);
		try {
			FileReader reader=new FileReader(myObj);
			Scanner myReader = new Scanner(reader);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
