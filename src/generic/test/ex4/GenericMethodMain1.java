package generic.test.ex4;

public class GenericMethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objectMethod(i);
        //Integer result = (Integer) GenericMethod.objectMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");

        Integer result = GenericMethod.<Integer>genericMethod(i);

        Double result1 = GenericMethod.genericMethod(209.3);

        Integer integerValue = GenericMethod.<Integer>numberMethod(20);

        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
    }
}
