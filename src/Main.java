public class Main {
    interface Predicate {
        boolean func(Integer integer);
    }

    interface Consumer {
        void sayHallo(String name);
    }

    interface Function {
        Long around(Double x);
    }

    interface Supplier {
        float random();
    }

    public static void main(String[] args) {
//        task 1
        Predicate isPositive = (integer) -> integer > 0;
        System.out.println(isPositive.func(5));
        System.out.println(isPositive.func(-5));

        Predicate predicate = new Predicate() {
            @Override
            public boolean func(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(predicate.func(45));
        System.out.println(predicate.func(-45));

//        task 2
        Consumer hello = name -> System.out.println(name + ", привет!!!");
        hello.sayHallo("Руслан");

        Consumer consumer = new Consumer() {
            @Override
            public void sayHallo(String name) {
                System.out.println(name + ", привет!!!");
            }
        };
        consumer.sayHallo("Оля");

//        task 3
        Function num = x -> Math.round(x);
        Number a = num.around(50.54);
        System.out.println(a);
        System.out.println(a.getClass());

        Function function = new Function() {
            @Override
            public Long around(Double x) {
                return Math.round(x);
            }
        };
        System.out.println(function.around(452.525));

//        task 4
        Supplier random = () -> Math.round(Math.random() * 100);
        System.out.println(random.random());
        System.out.println(random.random());


        Supplier supplier = new Supplier() {
            @Override
            public float random() {
                return Math.round(Math.random() * 100);
            }
        };
        System.out.println(supplier.random());
        System.out.println(supplier.random());
    }


}