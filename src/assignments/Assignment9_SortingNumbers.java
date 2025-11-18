package assignments;

public class Assignment9_SortingNumbers {

	public static void main(String[] args) {

		int [] nums = {12 ,34,11,36,87,98,93};

		int temp=0;

		for(int i=0 ; i<nums.length ;i++) {

			for(int j = i+1 ; j<nums.length ;j++) {

				if(nums[i]<nums[j]) {

					/*	temp = nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
					 */

					nums[i]=nums[i]+nums[j];  //a=5;b=10
					nums[j]=nums[i]-nums[j];   //a=a+b;15
					//b=a-b;5
					nums[i]=nums[i]-nums[j]; //a=a-b;10
				}

			}
		}

		System.out.println("the second largest number of nums " +nums[1]);
		System.out.println("the third largest number of nums " +nums[2]);

	}

}




