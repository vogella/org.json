import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String readTextFile = readTextFile("test.json");
			JSONObject jsonArray = new JSONObject(readTextFile);
			System.out.println(jsonArray.get("company"));
			System.out.println(jsonArray.get("comment"));
			System.out.println(jsonArray.get("name"));
			System.out.println(jsonArray.get("street"));
			System.out.println(jsonArray.get("zipcode"));
			System.out.println(jsonArray.get("city"));
			System.out.println(jsonArray.get("email"));
			System.out.println(jsonArray.get("phone"));
			System.out.println(jsonArray.get("fax"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String readTextFile(String fileName) {
		String returnValue = "";
		FileReader file;
		String line = "";
		try {
			file = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(file);
			while ((line = reader.readLine()) != null) {
				returnValue += line + "\n";
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("File not found");
		} catch (IOException e) {
			throw new RuntimeException("IO Error occured");
		}
		return returnValue;

	}
	
	

}
