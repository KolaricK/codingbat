/* Given an array of ints, return true if the array contains no 1's and 
 * no 3's.
 */
 
 public boolean lucky13(int[] nums) {
  for(int n : nums) {
    if(n == 1 || n == 3) return false;
  }
  return true;
}
