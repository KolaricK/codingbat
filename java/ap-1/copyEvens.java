/* Given an array of positive ints, return a new array of length "count" 
 * containing the first even numbers from the original array. The original 
 * array will contain at least "count" even numbers.
 */
 
 public int[] copyEvens(int[] nums, int count) {
  int[] arr = new int[count];
  int j = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 2 == 0 && j < count) {
      arr[j] = nums[i];
      j++;
    }
  }
  
  return arr;
}
