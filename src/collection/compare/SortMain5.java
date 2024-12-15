package collection.compare;

import java.util.Set;
import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        Set<MyUser> treeSet = new TreeSet<>();
        treeSet.add(user1);
        treeSet.add(user2);
        treeSet.add(user3);

        System.out.println("Comparable 정렬");
        System.out.println(treeSet);

        Set<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(user1);
        treeSet2.add(user2);
        treeSet2.add(user3);
        System.out.println(treeSet2);
    }
}
