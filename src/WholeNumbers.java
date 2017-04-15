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
        //Objects
        OOPJava car = new OOPJava();
        OOPJava porche = new OOPJava();
        //porche.model = "Career";//violates encapsulation
        porche.setModel("Carera");
        System.out.println(porche.getModel());

        //More classses
        Account account = new Account();
        account.Withdrawal(300);

        account.Deposit(200);
        account.Withdrawal(300);

        account.Deposit(101);
        account.Withdrawal(300);

        Account superAccount = new Account("12345", 140.00, "Jeremy Shefer"
                , "jeremy@sheffmachine.com", "867-5309");
        superAccount.Deposit(100);

        //Inheritance
        Dog doggie = new Dog("Labbie", 20, 20, 1, 4, 1, 10, "fur");
        doggie.Eat();
        doggie.Move(20);
    }
}