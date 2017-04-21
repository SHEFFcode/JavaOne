package LinkedListsExample;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by jeremy.shefer on 4/20/17.
 */
public class LinkedListExample {
    public void Run() {
        LinkedList<String> placesInAustralia = new LinkedList<>();
        placesInAustralia.add("Sydney");
        placesInAustralia.add("Melbourne");
        placesInAustralia.add("Alice Springs");
        placesInAustralia.add("Perth");
        placesInAustralia.add("Tasmania");
        placesInAustralia.add("Outback");
        placesInAustralia.add("Auckland");
        printList(placesInAustralia);

        placesInAustralia.add("Europea");
        printList(placesInAustralia);

        placesInAustralia.remove(3);
        printList(placesInAustralia);
    }

    private static void printList(LinkedList<String> stringList) {
        Iterator<String> i = stringList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=============================");
    }
}
