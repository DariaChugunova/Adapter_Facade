public class Iphone implements Lightning{
    @Override
    public void name() {
        System.out.print("Айфон");
    }

    @Override
    public void connector() {
        System.out.println("Lightning разъем");
    }
}
