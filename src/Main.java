
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
//        task 1
        Predicate<Integer> isPositive = integer -> integer > 0;
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-5));

        Predicate predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(predicate.test(45));
        System.out.println(predicate.test(-45));

//        task 2
        Consumer sayHello = name -> System.out.println(name + ", привет!!!");
        sayHello.accept("Руслан");

        Consumer consumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name + ", привет!!!");
            }
        };
        consumer.accept("Оля");

//        task 3
        Function<Double, Long> num = x -> Math.round(x);
        Number a = num.apply(50.54);
        System.out.println(a);


        Function function = new Function<Double, Long>() {
            @Override
            public Long apply(Double x) {
                return Math.round(x);
            }
        };
        System.out.println(function.apply(452.525));

//        task 4
        Supplier random = () -> Math.round(Math.random() * 100);
        System.out.println(random.get());
        System.out.println(random.get());


        Supplier supplier = new Supplier<Long>() {
            @Override
            public Long get() {
                return Math.round(Math.random() * 100);
            }
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }


}