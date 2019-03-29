/* Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns 
 * {2, 5, 3, 6}. You may modify and return the given array, or return a new 
 * array.
 */
 
 public int[] shiftLeft(int[] nums) {
  int temp;
  
  for(int i = 0; i < nums.length-1; i++) {
    temp = nums[i];
    nums[i] = nums[i+1];
    nums[i+1] = temp;
  }
  
  return nums;
}
