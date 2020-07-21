import java.util.*;

public class BinSearch
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int arr[] = {2,4,55,66,77,888,999};
		System.out.println("2 4 5 66 77 888 999");
		System.out.println("[]> ");
		int s = in.nextInt();
		
		System.out.println("the object is found on index "+binSerch(arr, s));

		
	}
	
	static int binSerch(int nums[], int target){
		
		int left = 0, right = nums.length-1;
		
		while(left <= right){
			
			int mid = (left + right) /2;
			
			if(nums[mid] == target){
				
				return mid;
			}
			else if(nums[mid] < target){
				left = mid +1;
				
			}
			else if(nums[mid] > target){
				right = mid -1;
			}
			
			
		}
		
		return -1;
	}
}
