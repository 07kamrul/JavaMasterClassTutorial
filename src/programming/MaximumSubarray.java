package programming;

import java.util.Scanner;

public class MaximumSubarray {

	public static void main(String[] args) {

//		int[] array = {-2,1,-3,4,-1,2,1,-5,4};

//		int[] array = {1};

//		int[] array = {5,4,-1,7,8};

//		This is dynamically input if your want to static please remove comment this block section

		int arraySize = 0;

		Scanner inputArray = new Scanner(System.in);

		System.out.print("Enter the number of elements : ");

		arraySize = inputArray.nextInt();
		int[] array = new int[arraySize];

		System.out.println("Enter the elements of the array : ");

		for (int i = 0; i < arraySize; i++) {
			array[i] = inputArray.nextInt();
		}

		System.out.println("Contiguous subarray sum is " + maximumSubarraySum(array));

	}

	static int maximumSubarraySum(int a[]) {

		int maxValue = Integer.MIN_VALUE;
		int maxFinish = 0;

		for (int i = 0; i < a.length; i++) {

			maxFinish = maxFinish + a[i];

			if (maxValue < maxFinish) {
				maxValue = maxFinish;
			}

			if (maxFinish < 0) {
				maxFinish = 0;
			}

		}
		return maxValue;
	}

}