/*
 * Created by jeremy.shefer on 4/14/17.
 */
public class Text {
    public static void Run() {
        char myChar = 'a';
        char unicodeChar = '\u00A9';
        System.out.println(unicodeChar);

        boolean myBoolean = false;
        String myString = "hey, im a string!";
        System.out.println(myString);

        int myInt = 10;
        String stringTest = "5";
        int sum = myInt + Integer.parseInt(stringTest);
        System.out.println(sum);
    }
}
