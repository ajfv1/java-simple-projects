import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		Scanner in = new Scanner(System.in);

		System.out.println("enter numbers consecutively::]>");
		String nums = in.next();
		int p=0;

		
		String temp="";
		for(int i = 0; i< nums.length()-4; i++){
			int x=i;
			while(x<i+5){
				temp+=nums.charAt(x);
				x++;
			}
			if(Integer.parseInt(temp)>p){
				p=Integer.parseInt(temp);
			}
			temp="";
		}
		
		System.out.println(p);
	}
}
