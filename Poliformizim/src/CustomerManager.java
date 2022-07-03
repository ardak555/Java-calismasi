public class CustomerManager  {

    private Baselogger baselogger;

    public CustomerManager(Baselogger logger){
        this.baselogger=logger;
    }

    public void add() {
        System.out.println("Müşteri eklendi.");
        this.baselogger.log("Log mesajı");
    }

    
}
