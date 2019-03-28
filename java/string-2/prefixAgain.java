/* Given a string, consider the prefix string made of the first N chars of 
 * the string. Does that prefix string appear somewhere else in the string? 
 * Assume that the string is not empty and that N is in the range 
 * 1..str.length().
 */
 
 public boolean prefixAgain(String str, int n) {
  int len = str.length();
  String prefix = str.substring(0,n);
  
  for (int i = n; i < len; i++) {
    if(n+i <= len) { 
      if (prefix.equals(str.substring(i,n+i)))
        return true;
    }
  }
  return false;
}
