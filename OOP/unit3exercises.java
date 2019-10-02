package edu.vtc.oop.bmoreinis;

public class unit3exercises {
	
	private static int[] nums = new int[] {1,2,3,4,5,4,3,2,1};
	
	public static void main(String[] args) {
		System.out.println(countValues(nums, 6, 4));
		System.out.println(findFirst(nums, 6, 4));
		System.out.println(findNext(nums, 6, 4, 3));
		System.out.println(findLast(nums, 6, 4));
		System.out.println(findPrev(nums, 3, 4, 5));
	}
	
	/**
	* count the number of occurrences of value in the first count elements of nums
	* @param nums the array of numbers to search, never null
	* @param count the number of elements in array to consider,
	*    must be >= 0, must be <= nums.length
	* @param value the value being searched for in nums
	* @return returns the number of occurrences of value in nums, always >= 0.
	*/
	public static int countValues(int[] nums, int count, int value) {
		int instances = 0;
		for (int i=0;i<count;i++) {
			if (nums[i]==value) {
				instances++;
			}
		}
		return instances;
	}

	/**
	* find the first occurrence of value in nums
	* @param nums the array of numbers to search, never null
	* @param count the number of elements in array to consider,
	*    must be >= 0, must be <= nums.length
	* @param value the value being searched for in nums
	* @return the index of the occurrence (>= 0) or -1 if not found.
	*/
	public static int findFirst(int[] nums, int count, int value) {
		int index = -1;
		for (int i=0;i<count;i++) {
			if (nums[i]==value) {
				index=i;
				break;
			}
		}
		return index;
	}

	/**
	* find the next occurrence of value in the range num[after+1 .. count-1]
	* @param nums the array of numbers to search, never null
	* @param count the number of elements in array to consider,
	*    must be >= 0, must be <= nums.length
	* @param value the value being searched for in nums
	* @param after the earliest value not to consider, must be >= 0, < count
	* @return the index of the occurrence (> after, < count) or -1 if not found.
	*/
	public static int findNext(int[] nums, int count, int value, int after) {
		int index = -1;
		for (int i=after+1;i<count;i++) {
			if (nums[i]==value) {
				index=i;
				break;
			}
		}
		return index;
	}

	/**
	* find the last occurrence of value in nums
	* @param nums the array of numbers to search
	* @param count the number of elements in array to consider,
	*    must be >= 0, must be <= nums.length
	* @param value the value being searched for in nums
	* @return the index of the occurrence (>= 0, < count) or
	*    -1 if not found.
	*/
	public static int findLast(int[] nums, int count, int value) {
		int index = -1;
		for (int i=0;i<count;i++) {
			if (nums[i]==value) {
				index=i;
			}
		}
		return index;
	}

	/**
	* find the previous occurrence of value in nums before before
	* @param nums the array of numbers to search
	* @param count the number of elements in array to consider,
	* must be >= 0, must be <= nums.length
	* @param value the value being searched for in nums
	* @param before consider only elements in nums between 0 and before -1,
	* must be <= count * 
	* @return the index of the occurrence (>= 0, < count) or -1 if not found.
	* 
	*/
	public static int findPrev(int[] nums, int count, int value, int before) {
		int index = -1;
		int lowEnd = before - count;
		for (int i=before;i>lowEnd;i--) {
			if (nums[i]==value) {
				index=i;
			}
		}
		return index;
	}
	
}
