public class USB_TypeC_Adapter implements Aux{
    USB_TypeC usb_typeC;
    public USB_TypeC_Adapter(USB_TypeC usb_typeC){
        this.usb_typeC = usb_typeC;
    }

    @Override
    public void name() {
        System.out.println("Переходник Usb type-C - Aux");
    }

    @Override
    public void connector() {
        usb_typeC.connector();
    }
}
