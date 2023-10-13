package org.example.week01.lecture05.acloops;

public class Main {

}

/*----------------------------------------------------------------------------------------------------------------------
	 Döngü deyimleri (loop statements):
	 Bir işin yinelemeli olarak yapılması için kullanılan kontrol deyimlerine denir:
	 1. while döngü deyimleri
	 	- Kontrolün başta yapıldığı while döngü deyimi (while döngüsü)
	 	- Kontrolün sonra yapıldığı while döngü deyimi (do-while döngüsü)
	 2. for döngü deyimi
	 3. for-each döngü deyimi (enhanced for loop, range based loop)

	 Anahtar Notlar: Bu aşamadan itibaren tüm dosya içerisinde "while döngü deyimi" ya da "while döngüsü" dendiğinde
	 "kontrolün başta yapıldığı while döngü deyimi" anlaşılmalıdır. "Kontrolün sonra yapıldığı while döngü deyimi" için
	 kısada "do-while döngüsü" veya "do-while döngü deyimi" denilecektir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	 Kontrolün başta yapıldığı while döngü deyiminin genel biçimi:

	 while (<koşul ifadesi>)
	 	 <deyim>

	 Koşul ifadesi boolean türden olmalıdır. Bu döngü koşul ifadesi true olduğu sürece yinelenir. Akış while döngü
	 deyimine geldiğinde koşul kontrolü yapılır ve koşul gerçeklenmezse (yani true değeri üretilmezse) döngüye girilmez
----------------------------------------------------------------------------------------------------------------------*/

class DemoWhile01 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        int i = 0;

        while (i < n) {
            System.out.printf("%d ", i);
            ++i;
        }

        System.out.printf("%ni = %d%n", i);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	while döngü deyiminde yanlışlıkla noktalı virgül kullanılması durumu
----------------------------------------------------------------------------------------------------------------------*/

class DemoWhile02 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        int i = 0;

        while (i < n); {
        System.out.printf("%d ", i);
        ++i;
    }

        System.out.printf("%ni = %d%n", i);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	while döngüsü ile n-kez dönen kalıp (dizi uyumlu)
----------------------------------------------------------------------------------------------------------------------*/

class DemoWhile03 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        int i = 0;

        while (i < n) {
            System.out.printf("%d ", i);
            ++i;
        }

        System.out.printf("%ni = %d%n", i);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	while döngüsü ile n-kez dönen kalıp
----------------------------------------------------------------------------------------------------------------------*/

class DemoWhile04 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        int i = 1;

        while (i <= n) {
            System.out.printf("%d ", i);
            ++i;
        }

        System.out.printf("%ni = %d%n", i);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	while döngüsü ile n-kez dönen kalıp (dizi uyumlu)
----------------------------------------------------------------------------------------------------------------------*/

class DemoWhile05 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        int i = n - 1;

        while (i >= 0) {
            System.out.printf("%d ", i);
            --i;
        }

        System.out.printf("%ni = %d%n", i);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	while döngüsü ile n-kez dönen kalıp:
 	n = 3 olsun
 	Döngünün içindeyken basılacak n değeri:2, 1, 0
 	Sayaç: 1, 2, 3
 	Döngü sonunda n değeri: -1
 	Dikkat bu kalıpta n-nin döngüden sonra değerinin değiştiğine dolayısıyla döngü öncesindeki değeri kaybetteiğimize
 	dikkat ediniz. Bu kalıp kullanılacaksa ve döndgüden n değerine ihtiyaç varsa döngü öncesinde saklanmalıdır
----------------------------------------------------------------------------------------------------------------------*/

class DemoWhile06 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        while (n-- > 0)
            System.out.printf("n = %d%n", n);

        System.out.printf("Döngü sonrası n = %d%n", n);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	while döngüsünün parantezi içerisinde bir değişkene bir metodun geri dönüş değeri atanıp atanan değerin kontrolüne
 	ilişkin algoritmalar yazılabilmektedir. Okunabilirliği etkilemediği sürece aşağıdaki gibi bir kod yazılabilir.
 	Aşağıdaki örnekte klavyeden sıfır girilene kadar alınan sayıların toplamı bulunmuştur. while döngüsünün parantezi
 	içerisinde atama işleminin öncelik parantezine alındığına dikkat ediniz
----------------------------------------------------------------------------------------------------------------------*/

class DemoWhile07 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Sayıları girmeye başlayınız:");
        int sum = 0;
        int val;


        while ((val = Integer.parseInt(kb.nextLine())) != 0)
            sum += val;

        System.out.printf("Toplam: %d%n", sum);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	while döngüsünün parantezi içerisinde bir değişkene bir metodun geri dönüş değeri atanıp atanan değerin kontrolüne
 	ilişkin algoritmalar yazılabilmektedir. Okunabilirliği etkilemediği sürece aşağıdaki gibi bir kod yazılabilir.
 	Aşağıdaki örnekte klavyeden sıfır girilene kadar alınan sayıların toplamı bulunmuştur. while döngüsünün parantezi
 	içerisinde atama işleminin öncelik parantezine alındığına dikkat ediniz
----------------------------------------------------------------------------------------------------------------------*/

class DemoWhile08 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Sayıları girmeye başlayınız:");
        int sum = 0;
        int val;


        System.out.print("Bir sayı giriniz:");

        while ((val = Integer.parseInt(kb.nextLine())) != 0) {
            sum += val;
            System.out.print("Bir sayı giriniz:");
        }

        System.out.printf("Toplam: %d%n", sum);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan sayıların pozitif ve negatif olanlarının ayrı ayrı toplamını
 	bulan programı yazınız. Programda hiç negatif veya pozitif sayı girilmemişse uygun mesajlar verilmelidir.
----------------------------------------------------------------------------------------------------------------------*/
class ClassWork01 {
    public static void main(String [] args)
    {
        FindPosNegSumApp.run();
    }

    class FindPosNegSumApp {
        public static void displayResult(int posSum, int negSum)
        {
            if (posSum != 0)
                System.out.printf("Pozitif sayıların toplamı:%d%n", posSum);
            else
                System.out.println("Hiç pozitif sayı girmediniz");

            if (negSum != 0)
                System.out.printf("Negatif sayıların toplamı:%d%n", negSum);
            else
                System.out.println("Hiç negatif sayı girmediniz");
        }

        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.println("Sayıları girmeye başlayınız:");

            int posSum = 0, negSum = 0;
            int val;

            while ((val = Integer.parseInt(kb.nextLine())) != 0)
                if (val > 0)
                    posSum += val;
                else
                    negSum += val;

            displayResult(posSum, negSum);
        }
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Yukarıdaki örnekte pozitif negatif sayılardan kaç tane girildiğini de bulan şekilde programı
 	güncelleyiniz
----------------------------------------------------------------------------------------------------------------------*/
class ClassWork02 {
    public static void main(String [] args)
    {
        FindPosNegSumApp.run();
    }


    class FindPosNegSumApp {
        public static void displayResult(int posSum, int posCount, int negSum, int negCount)
        {
            if (posSum != 0)
                System.out.printf("%d tane pozitif sayının toplamı:%d%n", posCount, posSum);
            else
                System.out.println("Hiç pozitif sayı girmediniz");

            if (negSum != 0)
                System.out.printf("%d tane negatif sayının toplamı:%d%n", negCount, negSum);
            else
                System.out.println("Hiç negatif sayı girmediniz");
        }

        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.println("Sayıları girmeye başlayınız:");

            int posSum = 0, negSum = 0;
            int posCount = 0, negCount = 0;
            int val;

            while ((val = Integer.parseInt(kb.nextLine())) != 0)
                if (val > 0) {
                    posSum += val;
                    ++posCount;
                }
                else {
                    negSum += val;
                    ++negCount;
                }

            displayResult(posSum, posCount, negSum, negCount);
        }
    }

}

/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren countDigits isimli metodu
 	NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz.
----------------------------------------------------------------------------------------------------------------------*/
class ClassWork03 {
    public static void main(String [] args)
    {
        CountDigitsTest.run();
    }

    class CountDigitsTest {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);

            System.out.print("Bir sayı giriniz:");
            int val;

            while ((val = Integer.parseInt(kb.nextLine())) != 0) {
                int count = NumberUtil.countDigits(val);

                System.out.printf("%d sayısının basamak sayısı:%d%n", val, count);
                System.out.print("Bir sayı giriniz:");
            }

            System.out.printf("0 sayısının basamak sayısı:%d%n", NumberUtil.countDigits(0));
            System.out.println("Tekrar yapıyor musunuz?");
        }
    }

    class NumberUtil {
        public static int countDigits(int val)
        {
            if (val == 0)
                return 1;

            int count = 0;

            while (val != 0) {
                ++count;
                val /= 10;
            }

            return count;
        }
    }


}

/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamakları toplamını döndüren sumDigits isimli metodu
 	NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz. Metot negatif sayılar için basamakları
 	toplamını pozitif olarak döndürecektir
----------------------------------------------------------------------------------------------------------------------*/
class ClassWork04 {
    public static void main(String [] args)
    {
        SumDigitsTest.run();
    }

    class SumDigitsTest {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);

            System.out.print("Bir sayı giriniz:");
            int val;

            while ((val = Integer.parseInt(kb.nextLine())) != 0) {
                int count = NumberUtil.sumDigits(val);

                System.out.printf("%d sayısının basamakları toplamı:%d%n", val, count);
                System.out.print("Bir sayı giriniz:");
            }

            System.out.printf("0 sayısının basamakları toplamı:%d%n", NumberUtil.sumDigits(0));
            System.out.println("Tekrar yapıyor musunuz?");
        }
    }

    class NumberUtil {
        public static int sumDigits(int val)
        {
            int sum = 0;

            val = Math.abs(val);

            while (val != 0) {
                sum += val % 10;
                val /= 10;
            }

            return sum;
        }
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamakları toplamını döndüren sumDigits isimli metodu
 	NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz. Metot negatif sayılar için basamakları
 	toplamını pozitif olarak döndürecektir
----------------------------------------------------------------------------------------------------------------------*/
class ClassWork05 {
    public static void main(String [] args)
    {
        SumDigitsTest.run();
    }

    class SumDigitsTest {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);

            System.out.print("Bir sayı giriniz:");
            int val;

            while ((val = Integer.parseInt(kb.nextLine())) != 0) {
                int count = NumberUtil.sumDigits(val);

                System.out.printf("%d sayısının basamakları toplamı:%d%n", val, count);
                System.out.print("Bir sayı giriniz:");
            }

            System.out.printf("0 sayısının basamakları toplamı:%d%n", NumberUtil.sumDigits(0));
            System.out.println("Tekrar yapıyor musunuz?");
        }
    }

    class NumberUtil {
        public static int sumDigits(int val)
        {
            int sum = 0;

            while (val != 0) {
                sum += val % 10;
                val /= 10;
            }

            return Math.abs(sum);
        }
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının tersini döndüren reversed isimli metodu NUmberUtil
 	sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.

 	123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
----------------------------------------------------------------------------------------------------------------------*/
class ClassWork06 {
    public static void main(String [] args)
    {
        ReversedTest.run();
    }

    class ReversedTest {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);

            System.out.print("Bir sayı giriniz:");
            int val;

            while ((val = Integer.parseInt(kb.nextLine())) != 0) {
                int count = NumberUtil.reversed(val);

                System.out.printf("%d sayısının tersi:%d%n", val, count);
                System.out.print("Bir sayı giriniz:");
            }

            System.out.printf("0 sayısının tersi:%d%n", NumberUtil.reversed(0));
            System.out.println("Tekrar yapıyor musunuz?");
        }
    }

    class NumberUtil {
        public static int reversed(int val)
        {
            int result = 0;

            while (val != 0) {
                result = result * 10 + val % 10;
                val /= 10;
            }

            return result;
        }
    }
}



/*----------------------------------------------------------------------------------------------------------------------
 	Kontrolün sonda yapıldığı while döngü deyimi (do-while döngüsü):
 	do
 		<deyim>
 	while (<boolean türden ifade>);

 	Bu döngü deyiminde akış döngü deyimine geldiğinde kontrol yapılmaz. İlk adım çalıştırıldıktan sonra kontrol yapılmaya
 	başlar. Yani bu döngü deyiminin en az bir yineleneceği garanti altındadır. while döngü deyimi kadar sık
 	kullanılmasa da okunabilirliği/algılanabilirliği artırmak ve algoritmanın sadeleştirilmesi için gerektiğinde
 	kullanılır
----------------------------------------------------------------------------------------------------------------------*/
class DemoDoWhile01 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        int i = 0;

        do {
            System.out.printf("%d ", i);
            ++i;
        } while (i < n);

        System.out.printf("%nDöngü sonrası:i = %d%n", i);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren countDigits isimli metodu
 	NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz.
----------------------------------------------------------------------------------------------------------------------*/
class ClassWork07 {
    public static void main(String [] args)
    {
        CountDigitsTest.run();
    }

    class CountDigitsTest {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);

            System.out.print("Bir sayı giriniz:");
            int val;

            while ((val = Integer.parseInt(kb.nextLine())) != 0) {
                int count = NumberUtil.countDigits(val);

                System.out.printf("%d sayısının basamak sayısı:%d%n", val, count);
                System.out.print("Bir sayı giriniz:");
            }

            System.out.printf("0 sayısının basamak sayısı:%d%n", NumberUtil.countDigits(0));
            System.out.println("Tekrar yapıyor musunuz?");
        }
    }

    class NumberUtil {
        public static int countDigits(int val)
        {
            int count = 0;

            do {
                ++count;
                val /= 10;
            } while (val != 0);

            return count;
        }
    }

}

/*----------------------------------------------------------------------------------------------------------------------
 	do-while döngüsünün deyimi içerisinde bildirilen değişken faaliyet alanı kuralları gereği koşul ifadesi içerisinde
 	kullanılamaz
----------------------------------------------------------------------------------------------------------------------*/
/*
class DemoDoWhile02 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz:");
            int val = Integer.parseInt(kb.nextLine());

            System.out.printf("%d * %d = %d%n", val, val, val * val);
        } while (val != 0); //error
    }
}
*/
/*----------------------------------------------------------------------------------------------------------------------
 	Yukarıdaki problem aşağıdaki gibi çözülebilir
----------------------------------------------------------------------------------------------------------------------*/

class DemoDoWhile03 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int val;

        do {
            System.out.print("Bir sayı giriniz:");
            val = Integer.parseInt(kb.nextLine());

            System.out.printf("%d * %d = %d%n", val, val, val * val);
        } while (val != 0);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	Sonsuz Döngü (infinite loop): Koşul ifadesinden dolayı sonlanmayan döngülere denir. Bu durumda hiç sonlanmayan
 	döngüler de sonsuz döngülerdir. Tersine sonsuz döngü olarak tasarlanmış sonlanabilir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
 	while döngü deyimi ile sonsuz dögü aşağıdaki gibi oluşturulabliir
----------------------------------------------------------------------------------------------------------------------*/

class DemoWhile09 {
    public static void main(String [] args)
    {
        while (true) {
            //...
        }
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren countDigits isimli metodu
 	NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz.

 	Örnekteki test kodunda sonsuz döngüye girilmiş ve bir koşula bağlı olarak run metodu sonlandırılmıştır. Bu durumda
 	sonsuz döngüden de çıkılmış olur
----------------------------------------------------------------------------------------------------------------------*/

class ClassWork08 {
    public static void main(String [] args)
    {
        CountDigitsTest.run();
    }

    class CountDigitsTest {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);

            while (true) {
                System.out.print("Bir sayı giriniz:");
                int val = Integer.parseInt(kb.nextLine());
                int count = NumberUtil.countDigits(val);

                System.out.printf("%d sayısının basamak sayısı:%d%n", val, count);

                if (val == 0) {
                    System.out.println("Tekrar yapıyor musunuz?");
                    return;
                }
            }
        }
    }

    class NumberUtil {
        public static int countDigits(int val)
        {
            int count = 0;

            do {
                ++count;
                val /= 10;
            } while (val != 0);

            return count;
        }
    }

}

/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminin genel biçimi:
 	for ([1.kısım]; [2.kısım]; [3.kısım])
 		<deyim>

 	1.kısım: Akış for döngü deyimine geldiğinda bir kez yapılacak kısımdır

 	2.kısım: for döngü deyiminin koşul ifadesidir. Bu ifadenin boolean türden olması gerekir. Bu ifade doğru olduğu
 	sürece döngü yinelenir. Akış for döngü deyimine geldiğinda 1.kısım yapıldıktan sonra kontrol yapılır

 	3.kısım: Döngünün bir adımı tamamlandığında bir sonraki adıma geçmek için yapılacak kontrolden hemen önce yapılır
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor01 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        int i;

        for (i = 0; i < n; ++i)
            System.out.printf("%d ", i);

        System.out.println();
    }
}



/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyimi
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor02 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        int i;

        for (i = n - 1; i >= 0; --i)
            System.out.printf("%d ", i);

        System.out.println();
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyimi
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor03 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        int i;

        for (i = 0; i < n; i += 2)
            System.out.printf("%d ", i);

        System.out.println();
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminin birinci kısmında değişken bildirimi yapılabilir. Buna genel olarak döngü değişkeni denir
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor04 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; ++i)
            System.out.printf("%d ", i);

        System.out.println();
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminin birinci kısmında bildirilen değişken for döngü deyimi boyunca kullanılabilir (görülebilirdir)
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor05 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; ++i) {
            //...
            System.out.printf("%d ", i);
        }

        //System.out.printf("i = %d%n", i); //error
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	Aşağıdaki durum "aynı faaliyet alanı içerisinde aynı isimli yerel değişken bildirimi yapılamaz" kuralının sonucu
 	olarak geçersidir
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor06 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        //int i;

        for (int i = 0; i < n; ++i) //error
            System.out.printf("%d ", i);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	Aşağıdaki durum "farklı faaliyet alanları içerisinde aynı isimde yerel değişken bildirimi yapılabilir" kuralının sonucu
 	olarak geçerlidir
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor07 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; ++i)
            System.out.printf("%d ", i);

        System.out.println();
        System.out.println("---------------------");

        for (int i = 0; i < n; ++i)
            System.out.printf("%d ", i);

        System.out.println();
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	Aşağıdaki durum geçerlidir. Döngü değişkeninin değeri döngüden sonra kullanılmayacaksa döngü değişkeni bildiriminin
 	for döngüsünün birinci kısmında yapılması daha iyi bir tekniktir. Bu durumda döngü değişkenin döngüden önce
 	bildirilmesi döngüden sonra değişkenin değerinin kullanılacağı algısını oluşturur. Yani okunabilirlik artmış olur
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor08 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; ++i)
            System.out.printf("%d ", i);

        System.out.println();
        System.out.println("---------------------");

        for (int i = 0; i < n; ++i)
            System.out.printf("%d ", i);

        System.out.println();
    }
}



/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminde yanlışlıkla noktalı virgül kullanılması durumu. Aşağıdaki örneğin neden error olduğunu
 	düşününüz?
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor09 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; ++i);
        //System.out.printf("%d ", i); //error


        System.out.println();
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminde yanlışlıkla noktalı virgül kullanılması durumu. Aşağıdaki örnekte error oluşmaz
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor10 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; ++i);
        System.out.println("Merhaba");


        System.out.println();
    }
}



/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyimi ile n-kez dönen döngü kalıbı (dizi uyumlu)
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor11 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; ++i)
            System.out.println("Merhaba");

        System.out.println();
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyimi ile n-kez dönen döngü kalıbı (dizi uyumlu)
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor12 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = n - 1; i >= 0; --i)
            System.out.println("Merhaba");

        System.out.println();
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyimi ile n-kez dönen döngü kalıbı
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor13 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 1; i <= n; ++i)
            System.out.println("Merhaba");

        System.out.println();
    }
}



/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminin birinci ve üçüncü kısmında virgül ayracı ile birden fazla ifade yazılabilir
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor14 {
    public static void main(String [] args)
    {
        for (int i = 0, k = 10; i <= 5 && k >= 0; ++i, --k)
            System.out.printf("{i: %d, k: %d}%n", i, k);

        System.out.println();
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminin birinci ve üçüncü kısmında virgül ayracı ile birden fazla ifade yazılabilir
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor15 {
    public static void main(String [] args)
    {
        int i = 0;

        for (System.out.println("Birinci kısım"); i < 5; System.out.println("Üçüncü kısım"), ++i)
            System.out.println("Döngü deyimi");

    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminin birinci kısmında değişken bildirimi yapılmışsa başlka bir ifade yazılamaz
----------------------------------------------------------------------------------------------------------------------*/
/*
class DemoFor16 {
    public static void main(String [] args)
    {

        for (System.out.println("Birinci kısım"), int i = 0; i < 5; System.out.println("Üçüncü kısım"), ++i) //error
        System.out.println("Döngü deyimi");

    }
}
*/
/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminin birinci kısmında bildirilen değişken aynı türden olmak zorundadır
----------------------------------------------------------------------------------------------------------------------*/
/*
class DemoFor17 {
    public static void main(String [] args)
    {

        for (int i = 0, double k = 0.1; i < 10 && k > 3.56; ++i, k -= 0.01)
        System.out.println("{i: %d, k: %f}%n", i, k);

    }
}
*/
/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyimi
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor18 {
    public static void main(String [] args)
    {
        for (double i = 0.1; i < 0.2; i += 0.01)
            System.out.printf("sin(%f) = %f%n", i, Math.sin(i));
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	Hiç sonlanmayacak sanılan ancak öyle olmayan bir döngü örneği. Örnekte i değeri azalarak -2147483648 değerine yani int
 	türünün en küçük değerine geldiğinde artık bir azaldığında 2147483647 değeri elde edilir
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor19 {
    public static void main(String [] args)
    {
        int i;

        for (i = 0; i < 10; --i)
            ; //System.out.printf("i = %d%n", i);

        System.out.printf("Döngü sonrası: i = %d%n", i);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminde birinci kısmının boş bırakılması durumu
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor20 {
    public static void main(String [] args)
    {
        int i = 0;

        for (; i < 10; ++i)
            System.out.printf("%d ", i);

        System.out.println();
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminde üçüncü kısmının boş bırakılması durumu
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor21 {
    public static void main(String [] args)
    {
        for (int i = 0; i < 10; ) {
            System.out.printf("%d ", i);
            ++i;
        }

        System.out.println();
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminde birinci ve üçüncü kısımların boş ırakılması durumu while döngü deyimine benzetilebilir
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor22 {
    public static void main(String [] args)
    {
        int i = 0;

        for (; i < 10; ) {
            System.out.printf("%d ", i);
            ++i;
        }

        System.out.println();
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminde ikinci kısmın boş bırakılması durumunda sonsuz döngü oluşur. Yani koşul her zaman gerçeklenir
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor23 {
    public static void main(String [] args)
    {
        for (int i = 0; ; ++i) {
            System.out.printf("%d%n", i);
            //...
        }
    }
}


/*----------------------------------------------------------------------------------------------------------------------
 	for döngü deyiminde sonsuz döngü oluşturmak için okunabilirlik açısından 3 kısım da boş bırakılır.
----------------------------------------------------------------------------------------------------------------------*/

class DemoFor24 {
    public static void main(String [] args)
    {
        for (;;) {
            //...
        }
    }
}

/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren countDigits isimli metodu
 	NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz.

 	Örnekteki test kodunda sonsuz döngüye girilmiş ve bir koşula bağlı olarak run metodu sonlandırılmıştır. Bu durumda
 	sonsuz döngüden de çıkılmış olur
----------------------------------------------------------------------------------------------------------------------*/

class ClassWork09 {
    public static void main(String [] args)
    {
        CountDigitsTest.run();
    }


    class CountDigitsTest {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);

            for (;;) {
                System.out.print("Bir sayı giriniz:");
                int val = Integer.parseInt(kb.nextLine());
                int count = NumberUtil.countDigits(val);

                System.out.printf("%d sayısının basamak sayısı:%d%n", val, count);

                if (val == 0) {
                    System.out.println("Tekrar yapıyor musunuz?");
                    return;
                }
            }
        }
    }

    class NumberUtil {
        public static int countDigits(int val)
        {
            int count = 0;

            do {
                ++count;
                val /= 10;
            } while (val != 0);

            return count;
        }
    }
}



