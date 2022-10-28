public class test {
    public static void main(String[] args) {
        Lightning phone = new Iphone();
        phone.name();
        System.out.println();
        phone.connector();

        Aux headphones = new Headphones();
        headphones.name();
        headphones.connector();
        System.out.println("Невозможно подключить");

        Aux adapter1 = new Lightning_Adapter(phone);
        adapter1.name();
        adapter1.connector();
        System.out.println("Можно использовать");
        System.out.println();
        System.out.println();


        USB_TypeC phone2 = new Samsung();
        phone2.name();
        System.out.println();
        phone2.connector();

        headphones.name();
        headphones.connector();
        System.out.println("Невозможно подключить");

        Aux adapter2 = new USB_TypeC_Adapter(phone2);
        adapter2.name();
        adapter2.connector();
        System.out.println("Можно использовать");
    }
}





