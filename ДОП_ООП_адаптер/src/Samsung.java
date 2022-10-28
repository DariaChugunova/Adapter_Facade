public class Samsung implements  USB_TypeC{
    @Override
    public void name() {
        System.out.print("Самсунг");
    }
    @Override
    public void connector() {
        System.out.println("USB Type-C разъем");
    }
}
