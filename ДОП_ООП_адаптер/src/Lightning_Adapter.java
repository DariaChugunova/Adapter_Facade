public class Lightning_Adapter implements  Aux{

    Lightning lightning;
    public Lightning_Adapter(Lightning lightning){
        this.lightning = lightning;
    }

    @Override
    public void name() {
        System.out.println("Переходник Lightning - Aux ");
    }

    @Override
    public void connector() {
        lightning.connector();

    }
}
