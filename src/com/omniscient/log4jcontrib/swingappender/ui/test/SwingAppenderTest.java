package com.omniscient.log4jcontrib.swingappender.ui.test;

import java.util.logging.Logger;

import com.omniscient.log4jcontrib.swingappender.ui.SwingAppenderUI;

/**Test class for SwingAppenderUI.
 * This is NOT a unit test class. It creates a SwingAppenderUI
 * and sends log statements to it. The target class has to be
 * tested manually.
 * @author pshah
 */
public class SwingAppenderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("name");
		//SwingAppenderUI loggerWin = new SwingAppenderUI();
		//test
		for(int i=0;;i++) {
			try {Thread.sleep(100);} catch(InterruptedException ie) {}
			//loggerWin.doLog("message " + i);
			logger.info("message  " + i);
		}
	}
}
