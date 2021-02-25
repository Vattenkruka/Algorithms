package Oscar;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList input = new LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        LinkedList output = removeDuplicatesFromLinkedList(input);
        while(output != null){
            System.out.println(output.value);
            output = output.next;
        }
    }

    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList current = linkedList;
        while (current != null){
            LinkedList next = current.next;
            while (next != null && next.value == current.value){
                next = next.next;
            }
            current.next = next;
            current = next;
        }

        return linkedList;
    }

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public static LinkedList addMany(LinkedList ll, List<Integer> values) {
        LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new LinkedList(value);
            current = current.next;
        }
        return ll;
    }

}
