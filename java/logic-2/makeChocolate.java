/* We want make a package of goal kilos of chocolate. We have small bars 
 * (1 kilo each) and big bars (5 kilos each). Return the number of small bars 
 * to use, assuming we always use big bars before small bars. Return -1 if it 
 * can't be done.
 */
 
public int makeChocolate(int small, int big, int goal) {
  int rem = goal % 5;
  
  if (big * 5 + small < goal || small < rem) return -1;
  if (big * 5 <= goal) return goal - big * 5;
  
  return rem;
}
