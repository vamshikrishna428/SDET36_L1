package org.yantra.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Vamshi
 *
 */
public class FileUtility {
	/**
	 * this method is used to initialize the property file
	 * 
	 * @param propertypath
	 */
	Properties properties;

	public void InitializePropertyFile(String propertypath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		properties = new Properties();
		try {
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * this method is used to get data from excel file
	 * 
	 * @param args
	 * @return
	 */
	public String getDatafromPropertyFile(String key) {
		String data = properties.getProperty(key);
		return data;
	}

}
