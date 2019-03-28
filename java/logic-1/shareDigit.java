/* Given two ints, each in the range 10..99, return true if there is a digit 
 * that appears in both numbers, such as the 2 in 12 and 23.
 */
 
 public boolean shareDigit(int a, int b) {
  int la = a / 10;
  int ra = a % 10;
  int lb = b / 10;
  int rb = b % 10;
  
  return la == lb || la == rb || ra == lb || ra == rb;
}
