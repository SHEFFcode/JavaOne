package LinkedListsExample;

import java.util.ArrayList;

/**
 * Created by jeremy.shefer on 4/20/17.
 */
public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {

        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    ArrayList<Integer> arrayList = new ArrayList<>();
    
    public void ManipulateArrayList() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);

        for (int arrayListItem :
                arrayList) {
            System.out.println(arrayListItem);
        }
    }
    

    


}
