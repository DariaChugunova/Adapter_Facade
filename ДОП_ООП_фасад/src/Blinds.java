public class Blinds {//жалюзи
    String description = "Жалюзи";

    public void on() {
        System.out.println("Открыть");
    }

    public void off() {
        System.out.println("Закрыть");
    }

    public  void  level(int l){
        System.out.println("Уровень открытия - "+l);
    }

    public String toString() {
        return description;
    }
}
