/* Given two strings, word and a separator, return a big string made of count 
 * occurences of the word, separated by the separator string.
 */
 
 public String repeatSeparator(String word, String sep, int count) {
  String result = "";
  
  for(int i = 0; i < count; i++) {
    result += word;
    if(i < count-1) result += sep;
  }
  
  return result;
}
