import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		if(str.length()==1&&str.charAt(0)==' ')
			{
			System.out.println(0);
			return;
			}
		
		str=str.trim();
		
		int count=1;
		
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==' ')
				count++;
		System.out.println(count);
				
	}
}