public class WholeNumbers {
    public static void main(String[] args) {

    }
}


//
//        //width of 32
//        int myValue = 1000; // pretty big
//        //width of 8
//        byte myByte = 10; //about 128 to - 128
//        byte newByte = (byte)(myByte / 2); //specific type casting in java
//        //width of 16
//        short myShortVaule = 32; //twice the space of a byte
//        //long has a width of 64
//        long myLongValue = 100L;
//
//
//        //Floating point numbers
//        FloatingPointNumbers.Run();
//        //Text
//        Text.Run();
//        //Operators
//        Operators.Run();
//        //Keywords and Expresisons
//        KeywordsAndExpressions.Run();
//        //Control flow statements
//        ControlFlowStatements.Run();
//        //Objects
//        OOPJava car = new OOPJava();
//        OOPJava porche = new OOPJava();
//        //porche.model = "Career";//violates encapsulation
//        porche.setModel("Carera");
//        System.out.println(porche.getModel());
//
//        //More classses
//        Account account = new Account();
//        account.Withdrawal(300);
//
//        account.Deposit(200);
//        account.Withdrawal(300);
//
//        account.Deposit(101);
//        account.Withdrawal(300);
//
//        Account superAccount = new Account("12345", 140.00, "Jeremy Shefer"
//                , "jeremy@sheffmachine.com", "867-5309");
//        superAccount.Deposit(100);
//
//        //Inheritance
//        Dog doggie = new Dog("Labbie", 20, 20, 1, 4, 1, 10, "fur");
//        doggie.Eat();
//        doggie.Move(20);
//
//        //Composition
//        Composition.Run();
//
//        //CompositionExample
//        Case newCase = new Case("220B", "Dell", "Supower"
//                , new Dimensions(20,20,20));
//        Monitor newMonitor = new Monitor("27 inch beast", "ASUS", 20
//                , new Resolution(20, 20));
//
//        Motherboard newMotherboard = new Motherboard("Super", "ASUS", 2, 2, "2.2");
//        PC newPC = new PC(newCase, newMonitor, newMotherboard);
//        newPC.PowerUp();
//        newPC.getMonitors().DrawPixelAt(2, 2, "red");
//        newPC.getMotherboard().LoadProgram("Excel");
//
//        //Encapulation Example
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 20;
//        player.health = 200; // Here is the problem, someone can override health inadvertantly.
//        player.LoseHealth(damage);
//        System.out.println("Remaining health is " + player.HealthRemaining());
//
//        EncapsulatedPlayer superPlayer = new EncapsulatedPlayer("Tim", 5000, "Sword");
//        //Can't edit the health field because it is private and only has a getter.
//        superPlayer.LoseHealth(100);
//        System.out.println(superPlayer.getHealth());
//
//        //Polymorphism Example
//        for (int i = 0; i < 11; i++) {
//            System.out.println(randomMovie().Plot());
//        }
//        //Testing static
//        TestingStatic.Run();
//        //Arrays
//        Arrays array = new Arrays();
//        array.Run();
//        array.Run(6);
//        System.out.println(array.Average(new int[] {1, 2, 3, 4}));
//
//        //Linked Lists
//        Customer customer = new Customer("John", 300);
//        Customer anotherCustomer = customer;
//        anotherCustomer.setBalance(20);
//        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
//
//        customer.ManipulateArrayList();
//
//        LinkedListExample linkedListExample = new LinkedListExample();
//        linkedListExample.Run();



//    }
//    //Polymorphism Example
//    public static Movie randomMovie() {
//        int randomNumber = (int)(Math.random() * 3) + 1;
//        System.out.println("Random number generated was " + randomNumber);
//        switch (randomNumber) {
//            case 1:
//                return new Jaws();
//            case 2:
//                return new IndependenceDay();
//            case 3:
//                return new MazeRunner();
//            default:
//                return null;
//        }
//    }
//}