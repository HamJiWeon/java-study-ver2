package collection.utils;

import java.util.*;

public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Object> list2 = new LinkedList<>();

        // 빈 불변 리스트 생성
        List<Object> list3 = Collections.emptyList();
        List<Object> list4 = List.of();

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr);
        arrList.set(0, 100);
        System.out.println("arr: " + Arrays.toString(arr) );
        System.out.println("arrList: " + arrList);
    }
}
