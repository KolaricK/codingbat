/* Given a string and a non-negative int n, return a larger string that is n 
 * copies of the original string.
 */
 
 public String stringTimes(String str, int n) {
  String res = "";
  
  for (int i = 0; i < n; i++) {
    res += str;
  }
  
  return res;
}
