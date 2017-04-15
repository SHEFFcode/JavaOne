public class WholeNumbers {
    public static void main(String[] args) {
        //width of 32
        int myValue = 1000; // pretty big
        //width of 8
        byte myByte = 10; //about 128 to - 128
        byte newByte = (byte)(myByte / 2); //specific type casting in java
        //width of 16
        short myShortVaule = 32; //twice the space of a byte
        //long has a width of 64
        long myLongValue = 100L;


        //Floating point numbers
        FloatingPointNumbers.Run();
        //Text
        Text.Run();
        //Operators
        Operators.Run();
        //Keywords and Expresisons
        KeywordsAndExpressions.Run();
        //Control flow statements
        ControlFlowStatements.Run();
    }
}