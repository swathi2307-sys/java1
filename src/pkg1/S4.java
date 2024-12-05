package pkg1;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class S4 {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		S1 s1=new S1();
		File f1=new File("in2.txt");
		FileWriter fw1=new FileWriter("out1.txt");
		Scanner sc=new Scanner(f1);
		String line1=sc.nextLine();
		String output1="";
		String[] arr1 = line1.split(",");
		int start= Integer.parseInt(arr1[0]);
		int end=Integer.parseInt(arr1[1]);
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++)
			{ 
				output1=j+"*"+i+"="+j*i;
				fw1.write(output1);
				fw1.write("\n");
				System.out.println(output1);
			}
			System.out.println();
			fw1.write("\n");
			
		}
		
		fw1.close();
		
	}

}
