package pkg1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class S3 {

	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("in1.txt");
		Scanner sc=new Scanner(f1);
		int start= sc.nextInt();
		int end=sc.nextInt();
		for(int j=start;j<end+1;j++) {
			for(int i=1;i<11;i++)
			{
				System.out.println(j+"*"+i+"="+j*i);
			}
			System.out.println();
		}
		
		
		
	}

}
