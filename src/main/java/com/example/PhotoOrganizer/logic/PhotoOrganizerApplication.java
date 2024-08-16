package com.example.PhotoOrganizer.logic;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PhotoOrganizerApplication {
	static Logger logger = LoggerFactory.getLogger(PhotoOrganizerApplication.class);
	
	public static void main(String[] args) {
		
		logger.info("Application started...");
		
		// Gets pathway from user
		System.out.println("What is the pathway of the root folder of photos?");
		Scanner scanner = new Scanner(System.in);
		final String pathway = scanner.nextLine();
		Path rootDirectory = Paths.get(pathway);
		
		// Exit out of the program if unable to find the root folder
		if (!verifyDirectoryExists(rootDirectory)) {
			System.out.println("ERROR: Unable to find the root folder. Program terminating.");
			return;
		}

		// Gets destination where organized files will be
		System.out.println("Where would you like to deposit the folders? "
				+ "A folder will be created there which will contain all the subfolders.");
		final String destinationPathway = scanner.nextLine();
		Path destinationDirectory = Paths.get(destinationPathway);
		
		// Exit out of program if unable to find the destination folder
		if (!verifyDirectoryExists(destinationDirectory)) {
			System.out.println("ERROR: Unable to find the destination folder. Program terminating.");
		}
		
		
		// Loop thru the files in the directory
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(rootDirectory)) {
			
		} catch (IOException e) {
			logger.error("Unable to process thru directory");
		}
		
		// Try to access the pathway
		// Get pathway to create organized folders
		// Analyze each file's metadata THEN file name if metadata does NOT exist
		// Create new folders based off date 
		// Put file in the specific folder
	}
	
	/**
	 * Verifies that the given pathway exists as a directory in the computer .
	 * @param directory Path to check if it is a directory that exists.
	 * @return returns boolean letting caller know if folder exists
	 */
	private static boolean verifyDirectoryExists(Path directory) {
		if (!Files.exists(directory)) {
			logger.error("Unable to find the directory!");
			logger.error("Address used: " + directory.toString());
			return false;
		} 

		logger.info("Directory was found.");
		logger.info("Address used: " + directory.toString());
		return true;
	}
	
	private static void analyzeFile() {
		
	}
}
