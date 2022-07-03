public class FileLogger extends Baselogger {
    
    @Override
    public void log(String message){
        System.out.println("File Mesajı:"+ message);
    }
}
