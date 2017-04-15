/**
 * Created by jeremy.shefer on 4/14/17.
 */
public class ControlFlowStatements {
    public static void Run() {
        //switch statement
        int switchNumber = 1;
        switch (switchNumber) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("It was either 3, 4 or 5");
                break;
            default:
                System.out.println("Hello");
                break;
        }

        //
    }
}
