/* Given a string, return true if the first instance of "x" in the string is 
 * immediately followed by another "x".
 */
 
 boolean doubleX(String str) {
  int i = str.indexOf('x');
  if(i == -1) return false;
  
  str = str.substring(i);
  return str.startsWith("xx");
}
