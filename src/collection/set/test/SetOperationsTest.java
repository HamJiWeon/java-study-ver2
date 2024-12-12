package collection.set.test;

import java.util.HashSet;
import java.util.List;

public class SetOperationsTest {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        // 합집합
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합 = " + union);

        // 교집합
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("교집합 = " + intersection);

        // 차칩합
        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("차집합 = " + difference);
    }
}
