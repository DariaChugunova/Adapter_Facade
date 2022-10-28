public class Smart_House {
    Blinds blinds;
    Electricity electricity;
    Humidifier humidifier;
    Light light;
    Сonditioner conditioner;

    public Smart_House(Blinds blinds,
    Electricity electricity,
    Humidifier humidifier,
    Light light,
    Сonditioner conditioner){
        this.blinds = blinds;
        this.electricity = electricity;
        this.humidifier = humidifier;
        this.light = light;
        this.conditioner = conditioner;
    }

    public  void Coming(){
        System.out.println("Добро пожаловать домой!");
        System.out.println(light.toString());
        light.on();
        light.brightness(85);
        System.out.println();
        System.out.println(blinds.toString());
        blinds.on();
        blinds.level(70);
        System.out.println();
        System.out.println(electricity.toString());
        electricity.on();
        System.out.println();
        System.out.println(humidifier.toString());
        humidifier.on();
        System.out.println();
        System.out.println(conditioner.toString());
        conditioner.on();
        conditioner.temperature(22);
    }
    public  void Care(){
        System.out.println("До свидания");
        System.out.println(light.toString());
        light.off();
        System.out.println(blinds.toString());
        blinds.off();
        System.out.println(electricity.toString());
        electricity.off();
        System.out.println(humidifier.toString());
        humidifier.off();
        System.out.println(conditioner.toString());
        conditioner.off();

    }
}
