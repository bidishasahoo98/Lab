package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
//Store the text file content line by line into an array
public class StoreText {

	public static void main(String[] args) {
try {
	ArrayList<String> arrayList=new ArrayList<>();
	FileReader fr=new FileReader("D://test1.txt"); //location of file
	BufferedReader br=new BufferedReader(fr);//obj of BufferedReader
	String line;
	while((line=br.readLine())!=null) { //condition
		arrayList.add(line);}
		br.close(); //close
		System.out.println(arrayList);
	}catch(Exception e) {
		System.out.println(e);
	}

	}}
