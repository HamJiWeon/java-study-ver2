package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입이 결정
        integerBox.set(10);
        // integerBox.set("문자100"); Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>(); // 생성하는 제네릭 타입 생략 가능 -> 타입 추
        doubleBox.set(10.12);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue); 

        GenericBox<Boolean> booleanBox = new GenericBox<>();
        booleanBox.set(true);
        Boolean booleanValue = booleanBox.get();
        System.out.println("booleanValue = " + booleanValue);

        GenericBox<Long> longBox = new GenericBox<>();
        longBox.set(1L);
        Long longValue = longBox.get();
        System.out.println("longValue = " + longValue);
    }
}
