/* Given a non-empty array of ints, return a new array containing the 
 * elements from the original array that come before the first 4 in the 
 * original array. The original array will contain at least one 4. Note that 
 * it is valid in java to create an array of length 0.
 */
 
 public int[] pre4(int[] nums) {
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 4)
      return Arrays.copyOfRange(nums, 0, i);
  }
  
  return new int[0];
}
