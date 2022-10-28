public class Test {
    public static void main(String[] args) {
        Blinds blinds = new Blinds();
        Electricity electricity = new Electricity();
        Humidifier humidifier = new Humidifier();
        Light light = new Light();
        Сonditioner conditioner = new Сonditioner();
        Smart_House smart_house = new Smart_House(blinds,electricity,humidifier,light,conditioner);
        smart_house.Coming();
        System.out.println("/////////////////////////////////////");
        System.out.println("Спустя время");
        System.out.println("/////////////////////////////////////");
        smart_house.Care();
    }
}
