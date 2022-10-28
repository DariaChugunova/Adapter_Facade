public class Headphones implements Aux{
    @Override
    public void name() {
        System.out.println("Наушники");
    }

    @Override
    public void connector() {
        System.out.println("AUX разъем");
    }
}
