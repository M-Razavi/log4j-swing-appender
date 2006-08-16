package com.omniscient.log4jcontrib.swingappender.ui.test;

import java.net.URL;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

/**Test class for SwingAppenderUI.
 * This is NOT a unit test class. It creates a SwingAppenderUI
 * and sends log statements to it. The target class has to be
 * tested manually.
 * @author pshah
 */
public class SwingAppenderTest {

	static{
		URL configFileUrl = ClassLoader.getSystemResource("log4j.properties");
		System.out.println("Config File - "+configFileUrl);
		PropertyConfigurator.configure(configFileUrl.getPath());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("name");
		//SwingAppenderUI loggerWin = new SwingAppenderUI();
		//test
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
			}
			// loggerWin.doLog("message " + i);
			logger.info("message  " + i);
		}
	}
}
