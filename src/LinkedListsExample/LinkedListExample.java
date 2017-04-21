package LinkedListsExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);//0 is match
            if (comparison == 0) {
                //equal do not add
                System.out.println(newCity + " is already a destination.");
                return false;
            } else if (comparison > 0) {
                //new city should appear before this one
                //Brisbane > Adalae, would return a number greater then 0, because B is greater then A
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //Just move on to the next city, this is not the place to add the new city.
            }
        }
        //we went through the whole list, so we need to add it to the end
        stringListIterator.add(newCity);
        return true;
    }
}
