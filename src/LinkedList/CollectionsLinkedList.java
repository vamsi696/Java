package LinkedList;

import java.util.LinkedList;

public class CollectionsLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 100);
        list.addFirst(30);
        list.remove();
        System.out.println(list.get(1));
        System.out.println(list.size());

        int i = 0;
        while (i < list.size()){
            System.out.println(list.get(i));
            i++;
        }
    }
}
