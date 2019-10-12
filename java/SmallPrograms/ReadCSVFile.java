package SmallPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
	public String[][] getLoginDataFromCSVFile() throws IOException {
		String fileName = "C:/Users/User/Contacts/Desktop/kiran.txt";
		File File = new File(fileName);

		FileReader fr = new FileReader(File);
		BufferedReader br = new BufferedReader(fr);
		String line;
		String[][] data = new String[3][0];
		int i = 0;
		while ((line = br.readLine()) != null) {

			// process the line
			System.out.println(line);
			String[] tempdata = line.split(",");
			data[i] = tempdata;
			i = i + 1;

		}
		System.out.println(data);
		return data;

	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	ReadCSVFile rcf =new ReadCSVFile();
	rcf.getLoginDataFromCSVFile();
	}

}
