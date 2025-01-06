package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(3);
        list2.add(5);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(9);
        vector.add(19);
        System.out.println(vector);
    }
}
