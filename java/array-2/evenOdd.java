/* Return an array that contains the exact same numbers as the given array, 
 * but rearranged so that all the even numbers come before all the odd 
 * numbers. Other than that, the numbers can be in any order. You may modify 
 * and return the given array, or make a new array.
 */
 
 public int[] evenOdd(int[] nums) {
  int[] arr = new int[nums.length];
  int odd = nums.length -1;
  int even = 0;
  
  for(int n : nums) {
    if(n % 2 == 0) {
      arr[even] = n;
      even++;
    } else {
      arr[odd] = n;
      odd--;
    }
  }
  
  return arr;
}
