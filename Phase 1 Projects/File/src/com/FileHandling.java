package com;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		
		
		
		try {
			File f=new File("MyFile.txt");
			FileWriter writer = new FileWriter("MyFile.txt");//this is for writing to a file
            BufferedWriter bd = new BufferedWriter(writer);
            bd.write("i am in training ");
            bd.newLine();
            bd.write("I am learning oops ");
            bd.close();
            BufferedWriter ap = new BufferedWriter(new FileWriter("MyFile.txt",true));//this is for appending to a file
            ap.write(" Now i am going to class ");
            ap.newLine();
            ap.write(" In emergency message me ");
            ap.close();
            
            BufferedReader br=new BufferedReader(new FileReader(f));
            String character;
 
            while ((character = br.readLine()) != null) {
                System.out.print(character);
            }
            br.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}

