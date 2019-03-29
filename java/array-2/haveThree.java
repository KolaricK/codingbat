/* Given an array of ints, return true if the value 3 appears in the array 
 * exactly 3 times, and no 3's are next to each other.
 */
 
 public boolean haveThree(int[] nums) {
  int count3 = 0;
  boolean next3 = false;
  
  for(int n : nums) {
    if(next3 && n == 3) return false;
    
    if(n == 3) {
      count3++;
      next3 = true;
    }
    
    if(n != 3) next3 = false;
  }
  
  return count3 == 3;
}
