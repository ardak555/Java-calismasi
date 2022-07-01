public class mukemmelSayi {
    public static void main(String[] args) throws Exception {
        int number=6;
        int sum=0;

        for(int i=1;i<number;i++){
            if(number % i==0){
                sum +=i;
            }
        }

        if(sum == number){
            System.out.println("Mükemmel Sayıdır.");
        }
        else
        System.out.println("Mükemmel Sayı değildir.");
    }
}
