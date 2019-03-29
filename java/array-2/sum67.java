/* Return the sum of the numbers in the array, except ignore sections of 
 * numbers starting with a 6 and extending to the next 7 (every 6 will be 
 * followed by at least one 7). Return 0 for no numbers.
 */
 
 public int sum67(int[] nums) {
  boolean state = false;
  int sum = 0;
  
  for(int n : nums) {
    if(n == 6) state = true;
    if(!state) sum += n;
    if(state && n == 7) state = false;
  }
  
  return sum;
}
