/* Given an array of ints, return true if the sum of all the 2's in the array 
 * is exactly 8.
 */
 
 public boolean sum28(int[] nums) {
  int sum = 0;
  
  for(int n : nums){
    if(n == 2) sum += n;
  }
  
  return sum == 8;
}
