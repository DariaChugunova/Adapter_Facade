public class Light {
    String description = "Свет";

    public void on() {
        System.out.println("Включить");
    }

    public void off() {
        System.out.println("Выключить");
    }

    public void brightness(int b){
        System.out.println("Уровень яркости - "+b);
    }


    public String toString() {
        return description;
    }
}
