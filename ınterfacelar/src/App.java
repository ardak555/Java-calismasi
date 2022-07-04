public class App {
    public static void main(String[] args) throws Exception {
        //interfaceler referans tutabilirler , new lenezler.
        
        CustomerManager customerManager =new CustomerManager(new OracleCustomerDal());
        customerManager.add();
        
    }
}
