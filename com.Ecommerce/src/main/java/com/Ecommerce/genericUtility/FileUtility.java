package com.Ecommerce.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.InvalidArgumentException;

public class FileUtility {
	public String retriveDataFromProperty(String FilePath, String key) {
		try {
			FileInputStream file = new FileInputStream(FilePath);
			Properties p = new Properties();
			p.load(file);
			return p.getProperty(key);
		} catch (Exception e) {
			throw new InvalidArgumentException("Data is Wrong" + e.getMessage());

		}

	}
}
