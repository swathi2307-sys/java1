package pkg1;
import java.util.Scanner;

public class S2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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
