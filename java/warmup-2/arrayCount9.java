/* Given an array of ints, return the number of 9's in the array.
 */
 
 public int arrayCount9(int[] nums) {
  int count = 0;
  
  for(int n : nums ) {
    if(n == 9) count++;
  }
  
  return count;
}
