package aridi.myCollection;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int rand = random.nextInt(999);
            myArrayList.add(rand);
        }
        System.out.println(myArrayList);
        for (int i = 0; i < 100; i++) {
            int rand = random.nextInt(998);
            System.out.print(rand + " ");
            System.out.print(myArrayList.get(rand) + " ");
        }
        myArrayList.bubbleSort();
        System.out.println("\n" + myArrayList);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 100; i++) {
            myLinkedList.add(i);
        }
        System.out.println(myLinkedList.get(1));
    }
}
