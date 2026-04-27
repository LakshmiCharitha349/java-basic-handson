// StringUtils
class StringUtils {
  static boolean containsChar(String word,char letter) {
    for(int i = 0; i< word.length();i++) {
       if(word.charAt(i) == letter){
        return true;
       }
    }

    return false;
  }

  static char[] reverse(String word) {
    char[] reversed = new char[word.length()];

    for(int index=word.length()-1;index >= 0;index--){
      reversed[index] = word.charAt(index);
    }

    return reversed;
  }

  static String replaceAll(String word, char oldChar, char newChar) {
    return word.replace(oldChar,newChar);
  }
}