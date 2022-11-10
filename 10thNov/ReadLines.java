package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//read 3 lines of file
public class ReadLines {

	public static void main(String[] args){  //main method
	        try {
	        	FileReader fr=new FileReader("D://test.txt"); //location of file
	        	BufferedReader br=new BufferedReader(fr);//obj of BufferedReader
	        	String line=br.readLine();
	        	int i = 0; //initialize
	        	while((br!=null &&(i<3))) {  //condition
	        		System.out.println(line);
	        		line=br.readLine();
	        		i++;
	            }
	           fr.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file.");
	        } }}
