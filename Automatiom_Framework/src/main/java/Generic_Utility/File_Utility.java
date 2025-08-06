package Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Siddhesh Jain
 */

public class File_Utility {

	/**
	 * This Method will read Data from Property file and return value to the caller
	 * @param key
	 * @return value
	 * @throws IOException (Becoz Whom so ever will come in this project will get to know about this method)
	 */
	
	public String getDataFromProperty(String key) throws IOException  {
		//String key becoz which key(url,email,password) we need we call that
		//key and get that particular value

		FileInputStream fls = new FileInputStream("./src/test/resources/Test_Data/CommonData.properties");
		Properties prop = new Properties();
		prop.load(fls);
		return prop.getProperty(key);  //here we will call that particular value with that help of key
	}
}
