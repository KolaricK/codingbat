/* Given a string, if one or both of the first 2 chars is 'x', return the 
 * string without those 'x' chars, and otherwise return the string unchanged. 
 * This is a little harder than it looks.
 */
 
 public String withoutX2(String str) {
  String res = str;
  
  if (str.length() > 1 && str.charAt(1) == 'x')
        res = str.substring(0,1) + str.substring(2);
        
  if (str.length() > 0 && str.charAt(0) == 'x')
        res = res.substring(1);
  
  return res; 
}
