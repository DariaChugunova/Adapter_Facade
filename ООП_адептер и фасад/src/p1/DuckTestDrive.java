package p1;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();//объект duck
        Turkey turkey = new WildTurkey();//объект turkey
        //turkey упаковывается в turkeyAdapter и выглядит как duck
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck) {//метод получается объекты duck и реализует его методы
        duck.quack();
        duck.fly();
    }
}