public class DatabaseLogger extends Baselogger {
    
    
    @Override
    public void log(String message){
        System.out.println("Databse Mesajı:"+ message);
    }
}
