/* Return true if the array contains, somewhere, three increasing adjacent 
 * numbers like .... 4, 5, 6, ... or 23, 24, 25.
 */
 
 public boolean tripleUp(int[] nums) {
  if(nums.length < 3) return false;
  
  for(int i = 0; i < nums.length-2; i++) {
    int ab = nums[i+1] - nums[i];
    int bc = nums[i+2] - nums[i+1];
    
    if(ab == 1 && bc == 1) return true;
  }
  
  return false;
}
