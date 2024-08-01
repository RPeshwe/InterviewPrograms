package Collections;

import java.util.*;

public class ArrayListExamples {

    public static void main(String[] args) {

        Queue<String> que = new ArrayDeque<>();
        que.add("Neha");
        que.add("Neha");
        que.add("Rushieksh");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("how");
        linkedList.add("are");
        linkedList.add("you");

        linkedList.addLast("Neha");
        linkedList.offerLast("?");
        System.out.println(linkedList.remove());
        System.out.println(linkedList);


        List<Integer> listOfnum = Arrays.asList(1,2,5,66,8,0);
        int num = Collections.min(listOfnum);
        System.out.println(num);
    }
}
