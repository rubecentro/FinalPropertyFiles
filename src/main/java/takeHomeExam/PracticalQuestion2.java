package takeHomeExam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

import org.junit.Test;



public class PracticalQuestion2 {
	
	String word1;	
	String Meaning1;
	String Meaning2;
	String word2;
	String Meaning3;
	String Meaning4;
	String word3;
	String Meaning5;

	@Test
public void doesFileExist() throws IOException {
		
	
	String path= "src\\main\\java\\propertyFile\\config.properties";
	Properties prop= new Properties();
	
	FileInputStream file= new FileInputStream(path);
	prop.load(file);
	
	System.out.println(prop.getProperty("word1"));
	System.out.println(prop.getProperty("Meaning1"));
	System.out.println(prop.getProperty("Meaning2"));
	System.out.println(prop.getProperty("word2"));
	System.out.println(prop.getProperty("Meaning3"));
	System.out.println(prop.getProperty("Meaning4"));
	System.out.println(prop.getProperty("word3"));
	System.out.println(prop.getProperty("Meaning5"));	

	

		
		}
	

	
}
	

