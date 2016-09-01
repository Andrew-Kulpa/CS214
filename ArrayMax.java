public class ArrayMax
{
	public static void main(String[] args)
	{
		int[] nums = new int[10];
		for (int i=0;i<nums.length;i++)
		{
			System.out.print("Enter number " + (i+1)+ ":");
			nums[i] = StdIn.readInt();
			
		}
		//int[] nums = {13, 572, 123, 1234, 1, 62871, 4167, 374, 12, 75};
		
		int min = nums[0]; //int max = nums[0];
		for (int i=0;i<nums.length;i++)
		{
			if(nums[i] < min) //(nums[i] > max)
			{
				min = nums[i];  //max = nums[i];
			}
		}
		
		System.out.println(min); //System.out.println(max);
	}
}