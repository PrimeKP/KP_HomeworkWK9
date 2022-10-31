package week9homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P08_HashSetTest {

    public static void main(String[] args) {

        Set<Integer> Objects = new HashSet();

        Objects.add(4);
        Objects.add(7);
        Objects.add(8);
        Objects.add(11);
        Objects.add(15);

        System.out.println(Objects);

        int num = Objects.size();
        System.out.println(num);

        Iterator itr = Objects.iterator();



        while (itr.hasNext()){

            System.out.println(itr.next());



        }

    }
}
