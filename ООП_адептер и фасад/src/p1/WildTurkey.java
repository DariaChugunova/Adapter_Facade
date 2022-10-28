package p1;

public class WildTurkey implements Turkey {//конкретная реализация Turkey
    public void gobble() {
        System.out.println("Gobble gobble");
    }
    public void fly() {
        System.out.println("I’m flying a short distance");
    }
}