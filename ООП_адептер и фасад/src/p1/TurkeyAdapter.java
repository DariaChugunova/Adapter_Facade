package p1;

public class TurkeyAdapter implements Duck {
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {//ссылка на адаптированый объект
        this.turkey = turkey;
    }

    public void quack() {//адаптер должен реалтзовать все методы интерфейса
        turkey.gobble();
    }

    public void fly() {//т.к. индюшка может летать только маленькое расстояние\
        for(int i=0; i < 5; i++) {//запускаем 5 раз
            turkey.fly();
        }
    }
}