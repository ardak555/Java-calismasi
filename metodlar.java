public class metodlar {
    
    public static void sayiBulma(){
            int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int aranacaksayi = 5;
        boolean varmi = false;

        for (int i : numbers) {
            if (i == aranacaksayi) {
                varmi = true;
                break;
            }
        }
        String mesaj="";
        if (varmi) {
            mesaj="Sayı mevcuttur."+aranacaksayi;
           mesajVer(mesaj);
        }
        else
        mesajVer("Sayı mevcut Değildir."+aranacaksayi);
        }

        public static void mesajVer(String mesaj) {
            System.out.println(mesaj);
        }

    public static void main(String[] args) throws Exception {

        
        sayiBulma();
        
    }
}