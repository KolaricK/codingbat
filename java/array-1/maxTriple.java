/* Given an array of ints of odd length, look at the first, last, and middle 
 * values in the array and return the largest. The array length will be a 
 * least 1.
 */

public int maxTriple(int[] nums) {
  int max = Math.max(nums[0], nums[nums.length/2]);
  max = Math.max(max, nums[nums.length-1]);
  return max;
}
