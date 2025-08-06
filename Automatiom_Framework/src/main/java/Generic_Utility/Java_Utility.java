package Generic_Utility;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Siddhesh Jain
 */

public class Java_Utility {

	/**
	 * This Method will give Current SystemDateAndTime and return to the Caller
	 * @return String
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	
	
	/**
	 * This Method will give Random Number within 1000 and return to the Caller
	 * @return int
	 */
	public int getRandomNumber() {
		Random ran = new Random();
		return ran.nextInt(1000);
	}
}
