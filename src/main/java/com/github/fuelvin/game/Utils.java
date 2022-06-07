package com.github.fuelvin.game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Utils {
	
	public static String loadReaderAsString(Reader reader) {
		StringBuilder builder = new StringBuilder();
		
		try {
			BufferedReader br = new BufferedReader(reader);
			System.out.println("BR: " + br);
			String line;
			while((line = br.readLine()) != null){
				builder.append(line + "\n");
			}
			
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return builder.toString();
	}
	
	public static int parseInt(String number) {
		try {
			return Integer.parseInt(number);
		}catch(NumberFormatException e) {
			e.printStackTrace();
			return 0;
		}
	}

}













