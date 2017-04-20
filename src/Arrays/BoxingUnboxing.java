package Arrays;

import java.util.ArrayList;

/**
 * Created by jeremy.shefer on 4/19/17.
 */
public class BoxingUnboxing {
    public void Run() {
        String[] strArray = new String[10];
        ArrayList<Integer> intArrayLst = new ArrayList<>();
        //ponint is auto boxing and unboxing is available only to primative wrappers like Integer for int


        intArrayLst.add(5);
        intArrayLst.get(0);

        Integer myIntValue = 56; //Java compiler is doing Integer.valueOf(56);
    }
}
