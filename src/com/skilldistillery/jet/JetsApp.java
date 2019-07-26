package com.skilldistillery.jet;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class JetsApp {
	AirField af;
	Scanner scanner;

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.launch();
	}
	
	public JetsApp() {
		af = new AirField();
		scanner = new Scanner(System.in);
	}

	public void launch() {
		
	}
	
	public void dispayUserMenu() {
		System.out.println("1. List Fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all cargo jets");
		System.out.println("6. Dogfight");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
	}
	
	public void parseJets() {
		try(BufferedReader br = new BufferedReader(new FileReader("jets.txt"))){
			String jet;
			while((jet = br.readLine()) != null) {
				String[] jetAttrs = jet.split("'");
				Double speed = Double.parseDouble(jetAttrs[1]);
				int range = Integer.parseInt(jetAttrs[1]);
				long price = Long.parseLong(jetAttrs[1]);
				
				af.getJets().add(new JetImpl(jetAttrs[0], speed, range, price));
			}
		} catch (IOException e) {
			System.err.println("Could not find file");
		}
	}
	
	public void listFleet() {
		List<Jet> jets = af.getJets();
		for(Jet jet: jets) {
			System.out.println(jet);
		}
	}
	
	public void fly() {
		
	}

	public void viewFastestJet() {
		Jet fastest = null;
		for(Jet jet: af.getJets()) {
			if(fastest == null) {
				fastest = jet;
			} else if (jet.getSpeed() > fastest.getSpeed()) {
				fastest = jet;
			}
		}
	}
	
	public void viewLongestRange() {
		Jet longestRange = null;
		for(Jet jet: af.getJets()) {
			if(longestRange == null) {
				longestRange = jet;
			} else if (jet.getRange() > longestRange.getRange()) {
				longestRange = jet;
			}
		}	
	}
}
