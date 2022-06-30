public class asalSayi {
    public static void main(String[] args) throws Exception {
        
        int number=25;
        boolean isPrime=true;
        if(number==1){
            System.out.println("Sayı asal değildir.");
            return;
        }
        if(number<1){
            System.out.println("Sayı geçersiz.");
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Sayı Asaldır.");
        }
        else
            System.out.println("Sayı  Asal Değildir.");
        
        

    }
}
