/* Given an array of ints, return true if there is a 1 in the array with a 
 * 2 somewhere later in the array.
 */
 
 public boolean has12(int[] nums) {
  boolean has1 = false;
  
  for (int n : nums) {
    if(n == 1) has1 = true;
    if(has1 && n == 2) return true;
  }
  
  return false;
}
