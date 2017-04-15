/**
 * Created by jeremy.shefer on 4/14/17.
 */
public class KeywordsAndExpressions {
    public static void Run() {
        double kilometers = 100 * 1.609344; // expression
        System.out.println(kilometers);
        int myVariable = 50; //entire line is a statement. Expression is myVariable = 50.

        //Whitespace and indenting
        System.out.println("This is " +
            "an example of " +
            "a multilne string.");


        //Code blocks
        boolean gameOver = true;
        int score = 9001;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 9001) {
            System.out.println("Your score was " + score);
        } else {
            System.out.println("You are a weak sauce!");
        }

        if (gameOver) {
            int finalScore = score + bonus; //we can access variables outside the code block
            System.out.println("Your final score is " + finalScore);
        }
//        int savedFinalScore = finalScore; this cannot happen, because vars created in code block are not accessible

        //Methods
        calculateScore(score, bonus);
        calculateScore("jeremy", score, bonus);
    }

    public static void calculateScore(int score, int bonus) {
        System.out.println(score + bonus);
    }

    //Method Overloading
    public static void calculateScore(String name, int score, int bonus) {
        System.out.println(name + " has won with a score of " + score + bonus);
    }
}
