/* Given two strings, A and B, create a bigger string made of the first char 
 * of A, the first char of B, the second char of A, the second char of B, 
 * and so on. Any leftover chars go at the end of the result.
 */
 
 public String mixString(String a, String b) {
  int len = Math.max(a.length(), b.length());
  String result = "";
  
  for(int i = 0; i < len; i++) {
    if( i < a.length()) result += a.charAt(i);
    if( i < b.length()) result += b.charAt(i);
  }
  
  return result;
}
