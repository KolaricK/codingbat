/* Given three ints, a b c, return true if one of b or c is "close" 
 * (differing from a by at most 1), while the other is "far", differing from 
 * both other values by 2 or more. Note: Math.abs(num) computes the absolute 
 * value of a number.
 */
 
 public boolean closeFar(int a, int b, int c) {
  int ab = Math.abs(a-b);
  int ac = Math.abs(a-c);
  int bc = Math.abs(b-c);
  
  return (ab <= 1 && ac >= 2 && bc >= 2) ||
         (ac <= 1 && ab >= 2 && bc >= 2);
}
