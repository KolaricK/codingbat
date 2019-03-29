/* Given an array of ints, return true if the number of 1's is greater than 
 * the number of 4's
 */
 
 public boolean more14(int[] nums) {
  int count1 = 0;
  int count4 = 0;
  
  for(int n : nums) {
    if(n == 1) count1++;
    if(n == 4) count4++;
  }
  
  return count1 > count4;
}
