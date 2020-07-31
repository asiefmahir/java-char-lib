public class CharacterLibrary {
    public static boolean isAlpha(char ch){
         if((int)ch >=65 && (int)ch <=122){
             return true;
         }
         return false;
    }
    public static boolean isLowerCase(char ch){
        if((int)ch >= 97 && (int)ch <=122){
            return true;
        }
        return false;
    }
    public static boolean isUpperCase(char ch){
        if((int)ch >= 65 && (int)ch <=90){
            return true;
        }
        return false;
    }
    public static boolean isNumeric(char ch){
        if((int)ch >= 48 && (int)ch <=57){
            return true;
        }
        return false;
    }
    public static boolean isAlphaNumeric(char ch){
        if(isAlpha(ch) == true || isNumeric(ch) == true){
            return true;
        }
        return false;
    }
    public static boolean IsSpecial(char ch){
        if(!isAlphaNumeric(ch)){
            return true;
        }
        return false;
    }
    public static String getUnicode(char ch) {
        return String.format("\\u%04x", (int) ch);
    }
    public static int getDecimal(char ch){
        return (int)ch;
    }
    public static String getOctal(char ch) {
        return Integer.toOctalString(getDecimal(ch));
    }
    public static String getHex(char ch) {
        return Integer.toHexString(getDecimal(ch));
    }
    public static String getBinary(char ch) {
        return Integer.toBinaryString(getDecimal(ch));
    }
    public static char toLowerCase(char ch){
        char lower = ch+= 32;
        return lower;
    }
    public static char toUpperCase(char ch){
        return ch-=32;
    }
}
