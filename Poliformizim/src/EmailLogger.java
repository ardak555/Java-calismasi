public class EmailLogger extends Baselogger {
    
    @Override
    public void log(String message){
        System.out.println("Email Mesajı:"+ message);
    }
}
