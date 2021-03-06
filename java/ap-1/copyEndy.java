/* We'll say that a positive int n is "endy" if it is in the range 
 * 0..10 or 90..100 (inclusive). Given an array of positive ints, return a 
 * new array of length "count" containing the first endy numbers from the 
 * original array. Decompose out a separate isEndy(int n) method to test if a 
 * number is endy. The original array will contain at least "count" endy 
 * numbers.
 */
 
 public int[] copyEndy(int[] nums, int count) {
  int[] arr = new int[count];
  int j = 0;
  
  for(int i = 0; i < nums.length; i++) {
    int a = nums[i];
    
    if(j >= count) break;
    
    if((a >= 0 && a <= 10) || (a >= 90 && a <= 100)) {
      arr[j] = a;
      j++;
    }
  }
  
  return arr;
}
