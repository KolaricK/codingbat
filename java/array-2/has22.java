/* Given an array of ints, return true if the array contains a 2 next to a 2 
 * somewhere.
 */
 
public boolean has22(int[] nums) {
  boolean has2 = false;
  
  for(int n : nums) {
    if(has2 && n == 2) return true;
    if(n == 2) has2 = true;
    if(n != 2) has2 = false;
  }
  
  return false;
} 
