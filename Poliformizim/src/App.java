public class App {
    public static void main(String[] args) throws Exception {
        
        /*Baselogger[] loggers =new Baselogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()};

        for(Baselogger logger:loggers){
            logger.log("Log mesajı.");
        }*/
        CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
