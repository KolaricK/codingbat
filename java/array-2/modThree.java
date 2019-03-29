/* Given an array of ints, return true if the array contains either 3 even 
 * or 3 odd values all next to each other.
 */
 
 public boolean modThree(int[] nums) {
  int len = nums.length;
  if(len < 3) return false;
  
  for(int i = 0; i < len-2; i++) {
    if(i+2 < len) {
      
      int a = nums[i];
      int b = nums[i+1];
      int c = nums[i+2];
      
      if(a % 2 == 0 && b % 2 == 0 && c % 2 == 0) return true;
         
      if(a % 2 == 1 && b % 2 == 1 && c % 2 == 1) return true;
          
    } 
  }
  
  return false;
}
