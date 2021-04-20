package com.examples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException {
			readFile("C:\\tools\\eclipse\\eclipse.ini");

	}

	public static void readFile(String fileName) throws FileNotFoundException {

		try {
			// Exceptions could be thrown below
			FileInputStream fis = new FileInputStream(fileName);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			String tmp = null;
			while ((tmp = in.readLine()) != null) {
				System.out.println(tmp);
			}
			in.close();
			fis.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}