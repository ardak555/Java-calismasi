public class findNumber {
    public static void main(String[] args) throws Exception {

        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int aranacaksayi = 5;
        boolean varmi = false;

        for (int i : numbers) {
            if (i == aranacaksayi) {
                varmi = true;
                break;
            }
        }
        if (varmi) {
            System.out.println("Sayı mevcuttur.");
        }
        else
        System.out.println("Sayı mevcut Değildir.");
    }
}
