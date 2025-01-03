package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class ExercicioResolvidoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter with the file path: ");
		String path = sc.nextLine();
		

		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<LogEntry> set = new HashSet<>(); // set é um conjunto
			// não uma lista, mas é bem parecido
		// a diferença é que o set não aceita repetiç~eos
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				set.add(new LogEntry(username, moment));
				line = br.readLine();
			}
			System.out.println("Total users:" + set.size());
			
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
						
				
		sc.close();
	}

}
