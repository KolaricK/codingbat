/* Given an array length 1 or more of ints, return the difference between the 
 * largest and smallest values in the array.
 */
 
 public int bigDiff(int[] nums) {
  int max = nums[0];
  int min = nums[0];
  
  for(int n : nums) {
    if(n > max) max = n;
    if(n < min) min = n;
  }
  
  return max-min;
}
 
