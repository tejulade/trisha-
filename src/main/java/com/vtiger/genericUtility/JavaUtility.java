package com.vtiger.genericUtility;

import java.time.LocalDateTime;
/**@author ladeh
*/

public class JavaUtility {
	/**
	 * this method will capture system date and time return
		
	 * @return system date and time
	 */
	public String getSystemTime() {
		
		return LocalDateTime.now().toString().replace(":", "-");
	}

}
