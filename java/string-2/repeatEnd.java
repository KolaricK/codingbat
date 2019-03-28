/* Given a string and an int N, return a string made of N repetitions of the 
 * last N characters of the string. You may assume that N is between 0 and 
 * the length of the string, inclusive.
 */
 
 public String repeatEnd(String str, int n) {
  str = str.substring(str.length()- n);
  String result = "";
  
  for(int i = 0; i < n; i++) {
    result += str;
  }
  
  return result;
}
