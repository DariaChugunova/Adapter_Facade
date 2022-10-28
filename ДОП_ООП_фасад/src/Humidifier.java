public class Humidifier {
    String description = "Увлажнитель";

    public void on() {
        System.out.println("Включить");
    }

    public void off() {
        System.out.println("Выключить");
    }


    public String toString() {
        return description;
    }
}
