package io.salon.util;

import java.util.Scanner;

public class Logger {
	public static String log;
	public static String error;
	public static String[] stacktrace;
	public static boolean isDebugEnabled;

	public static void debug(String log) {
		if(isDebugEnabled) System.out.println(log);
	}
	
	public static void error(String error) {
		if(isDebugEnabled) System.out.println(error);
	}
	
	public boolean isDebugEnabled() {
		return Logger.isDebugEnabled;
	}
	
	public static void setDebugEnabled(boolean isDebugEnabled) {
		Logger.isDebugEnabled = isDebugEnabled;
	}
	public static void promptDebugLogging() {
		Scanner debug = new Scanner(System.in);
		System.out.println("Enable Debug Logging?");
		String debugSwitch = null;
		boolean isReplyYes; 
		boolean isReplyNo;
		do {
			debugSwitch = debug.next();
			isReplyYes = debugSwitch.equalsIgnoreCase("Y") || debugSwitch.equalsIgnoreCase("yes");
			isReplyNo  = debugSwitch.equalsIgnoreCase("N") || debugSwitch.equalsIgnoreCase("no");
			if(isReplyYes) {
				setDebugEnabled(true);
			} else if(isReplyNo) {
				setDebugEnabled(false);
			} else {
				System.out.println("Please enter a valid repsonse.");
			}
		} while(!isReplyYes && !isReplyNo);
		
		debug.close();
	}
	
}
