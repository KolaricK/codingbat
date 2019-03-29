/* Given an array of ints, return true if it contains no 1's or it contains 
 * no 4's.
 */
 
 public boolean no14(int[] nums) {
  boolean has1 = false;
  boolean has4 = false;
  
  if(nums.length < 2) return true;
  
  for(int n : nums) {
    if(n == 1) has1 = true;
    if(n == 4) has4 = true;
  }
  
  return (has1 && !has4) || (!has1 && has4);
}
