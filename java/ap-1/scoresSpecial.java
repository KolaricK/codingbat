/* Given two arrays, A and B, of non-negative int scores. A "special" score 
 * is one which is a multiple of 10, such as 40 or 90. Return the sum of 
 * largest special score in A and the largest special score in B. To practice 
 * decomposition, write a separate helper method which finds the largest 
 * special score in an array.
 */
 
 public int scoresSpecial(int[] a, int[] b) {
  int maxA = maxMod10(a);
  int maxB = maxMod10(b);
  
  return maxA + maxB;
}

public int maxMod10(int[] nums) {
  int max = 0;
  
  for(int i : nums) {
    if(i % 10 == 0 && i >= max) {
      max = i;
    }
  }
  
  return max;
}
