/* We'll say that an element in an array is "alone" if there are values 
 * before and after it, and those values are different from it. Return a 
 * version of the given array where every instance of the given value which 
 * is alone is replaced by whichever value to its left or right is larger.
 */
 
 public int[] notAlone(int[] nums, int val) {
  int len= nums.length;
  
  if(len<3) return nums;
  
  for(int i=1; i<len-1;i++) {
    if(nums[i]==val && nums[i-1]!=nums[i] && nums[i+1]!=nums[i] ){
        int bigger=Math.max(nums[i-1],nums[i+1]);
        nums[i]=bigger;
    }
  }
  
  return nums;
}
