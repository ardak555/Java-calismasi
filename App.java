public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        String mesaj = "Öğreci saysısı: ";
        int sayi = 10;

        System.out.println(mesaj + sayi);

        sayi += 1;
        System.out.println(mesaj + sayi);

        int a = 200;

        if (a < 20) {
            System.out.println("Sayı 20 den küçüktür.");
        }

        else if (a == 20) {
            System.out.println("Sayı 20 ye eşittir.");
        }

        else {
            System.out.println("Sayı 20 den büyüktür.");
        }

        System.out.println("En büyük bulma");

        int sayi1 = 24;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük:" + enBuyuk);

        System.out.println("Switch");

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Perfect");
                break;
            case 'B':
                System.out.println("Nice");
                break;
            case 'C':
                System.out.println("Not bad!");
                break;
            case 'D':
                System.out.println("you should study a little more ");
                break;
            case 'F':
                System.out.println("FAILD!!!");
                break;
            default:
                System.out.println("Undifind");

        }
        // for
        int i = 1;
        for (i = 1; i < 10; i++) {
            System.out.println(i);
        }

        int j = 1;
        // while
        while (j < 30) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
            j++;
        }

        // do-while
        int k = 1;
        do {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        } while (k < 10);

        // diziler

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Arda";
        ogrenciler[1] = "Engin";
        ogrenciler[2] = "Eymen";

        for (int l = 0; l < ogrenciler.length; l++) {
            System.out.println(ogrenciler[l]);
        }

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

        double[] myList = { 1.1, 2.4, 4.3, 7.3, 5.6 };
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam:" + total);
        System.out.println("Max:" + max);

        String[][] sehirler = new String[2][3];

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "Samsun";
        sehirler[1][0] = "Trabzon";
        sehirler[1][1] = "Rize";
        sehirler[1][2] = "San Fransico";

        for (int m = 0; m <= 1; m++) {
            System.out.println("-----");
            for (int n = 0; n <= 2; n++) {
                System.out.println(sehirler[m][n]);
            }
        }

        String mesaji = "bugun hava çok güzel";

        System.out.println(mesaji);
        System.out.println("Eleman sayısı:"+mesaji.length());//uzunluğunu gözterir
        System.out.println("5.eleman:"+ mesaji.charAt(4) );//n. indexini gösterir
        System.out.println(mesaji.concat(".Ama yağmurlu"));//birleştirir. başa yerde kullanmak için yeni değişkene at.
        System.out.println(mesaji.startsWith("A"));//başlangıcındaki harf kontrol etme
        System.out.println(mesaji.endsWith("l"));

        char[]karakterler=new char[5];
        mesaji.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaji.indexOf("a"));//belirtilen karakteri kaçıncı eleman olduğunu söyler.
        System.out.println(mesaji.lastIndexOf("e"));//aramay sondan başlar.

        String yeniMesaj=mesaji.replace(' ', '-');//"..." yerine " ..." koy. yeniden kullnamk içimn değişkene at 
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2,4));//...-... arsını keser yev yazdırır.
        
        for(String kelime:mesaji.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaji.toLowerCase());
        System.out.println(mesaji.toUpperCase());
        System.out.println(mesaji.trim());//baştaki ve sondaki boşlukları atar.
        
    }

}
