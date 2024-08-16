package com.example.PhotoOrganizer.logic;

import java.io.IOException
import java.nio.file.DirectoryStream;;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PhotoOrganizerApplication {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(PhotoOrganizerApplication.class);
		logger.info("Application started...");
		
		// Gets pathway from user
		System.out.println("What is the pathway of the root folder of photos?");
		Scanner scanner = new Scanner(System.in);
		final String pathway = scanner.nextLine();
		Path rootFolder = Paths.get(pathway);
		
		// Verify that a folder was given
		if (!Files.exists(rootFolder)) {
			logger.error("Root folder unable to be found!");
			return;
		} else {
			logger.info("Root folder was found.");
			logger.info("Address used: " + rootFolder.toString());
		}
		
		// Loop thru the files in the directory
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(rootFolder)) {
			
		} catch (IOException e) {
			logger.error("Unable to process thru directory");
		}
		
		/*
		try {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		
		// Try to access the pathway
		// Get pathway to create organized folders
		// Analyze each file's metadata THEN file name if metadata does NOT exist
		// Create new folders based off date 
		// Put file in the specific folder
	}
	
	private void analyzeFile() {
		
	}
}
