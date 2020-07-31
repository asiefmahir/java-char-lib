public class HelloJava {
    public static void main(String[] args) {
        char ch = 'z';
        System.out.println((int)ch);
        System.out.println(CharacterLibrary.isLowerCase('A'));
        System.out.println(CharacterLibrary.isLowerCase('h'));
        System.out.println(CharacterLibrary.isUpperCase('A'));
        System.out.println(CharacterLibrary.isUpperCase('z'));
        System.out.println(CharacterLibrary.getUnicode('A'));
        System.out.println(CharacterLibrary.toLowerCase('A'));
        System.out.println(CharacterLibrary.toUpperCase('a'));
        System.out.println(CharacterLibrary.getHex('A'));
        System.out.println(CharacterLibrary.getBinary('A'));
        System.out.println(CharacterLibrary.getDecimal('A'));
        System.out.println(CharacterLibrary.getOctal('A'));
        System.out.println(CharacterLibrary.isAlpha('A'));
        System.out.println(CharacterLibrary.isAlpha('9'));
        System.out.println(CharacterLibrary.isAlphaNumeric('-'));
        System.out.println(CharacterLibrary.isAlphaNumeric('9'));
        System.out.println(CharacterLibrary.isAlphaNumeric('a'));
        System.out.println(CharacterLibrary.isNumeric('-'));
        System.out.println(CharacterLibrary.isNumeric('a'));
        System.out.println(CharacterLibrary.isNumeric('5'));
        System.out.println(CharacterLibrary.IsSpecial('-'));
        System.out.println(CharacterLibrary.IsSpecial('a'));
    }
}
