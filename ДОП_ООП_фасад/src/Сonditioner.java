public class Сonditioner {
    String description = "Кондиционер";

    public void on() {
        System.out.println("Включить");
    }

    public void off() {
        System.out.println("Выключить");
    }

    public void temperature(int t){
        System.out.println("Температура - "+t);
    }


    public String toString() {
        return description;
    }
}
