package org.example.week01.lecture04;


/*----------------------------------------------------------------------------------------------------------------------
	Metot bildiriminde metot isminden sonra parantezler arasında bildirilen değişkenlere parametre değişkenleri denir

	Metodun parametre değişkenlerine değerler metot çağrılırken verilir. Metot çağrılırken parametrelere verilen ifadelere
    "argüman" denir. Bir metot kaç tane parametreye sahipse o kadar sayıda argüman ile çağrılmalıdır. Argümanlardan
    parametrelere aktarım da bir atama işlemidir
----------------------------------------------------------------------------------------------------------------------*/
public class Main {
    public static void main(String[] args) {
        int value = 5;

    }
    class Sample {

        public static void bar(int a)
        {

        }

        //...
    }

    /*----------------------------------------------------------------------------------------------------------------------
		Metotlar ne işe yarar? ya da başka bir deyişle bir problemin çözümü neden metot olarak yazalım?
		Bu soru genel olarak aşağıdaki durumlar açıklanarak özetlenebilir:
		- Bir işi çok fazla yerde yapmak kod tekrarına yol açar. Yazılım geliştirmedeki temel prensip zorunlu olmadıkça
		kod tekrarı yapılmamasıdır (do not repeat yourself.) Bu durumda programcı örneğin metot yazar ve ilgili yerlerde
		bu metodu çağırır.

		- Bir problemin çözümü metot yerine her yerde kodunun yazılması biçiminde ele alınmışsa, bu durumda programcı
		problemin çözümünde bir değişiklik yaparsa veya yanlış yaptığını anlayıp düzeltmeye çalışırsa bu zor olabilir.

		- Bir problemin çözümü metot yerine her yerde kodunun yazılması biçiminde ele alınmışsa, bu durumda kodun
		okunabilirliği de azalabilir.

		- Metot yazılıdığında başka projelere taşınarak da kullanışabilir (code reusability)

		- Metot yazılıp çağrıldığında metodu çağıran kodda (client) metodun nasıl yazıldığına ilişkin detayların önemi olmaz.

		- İleride göreceğimiz nesne yönelimli programlama tekniğine ilişkin kavramlarla kodun paraçlara ayrılması metotlar dışında
		daha yüksek seviyede de yapılabilecektir.
----------------------------------------------------------------------------------------------------------------------*/
}

/*----------------------------------------------------------------------------------------------------------------------
	System.out.printf metodunun ilk argümanı String olmalıdır.  Metot bu argüman dışında istenilen türde ve istenilen sayıda
	argüman ile çağrılabilmektedir. Metodun birinci parametresine ilişkin argümanda % karakteri ile birlikte anlamlı bazı
	karakterler kullanıldığında "yer tutucu (placeholder)" belirtilmiş olur. % ile birlikte kullanılan bu karakterlere
	"format karakterleri (format specifiers)" denir. Metot format karakterleri yeribe String içerisindeki sırasıyla diğer
	geçilen argümanlara ilişkin değerleri koyarak yazıyı elde eder ve ekrana basar. Bazı format karakterleri bir argümana ilişkin
	değere karşılık gelmez. Yazı içerisinde başka bir anlamı olur.


	Anahtar Notlar: printf gibi değişken sayıda argüman alan metotlara "vararg methods" da denilmektedir. Burada bu tarz
	metot yazımı ele alınmayacaktır.
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Tamsayı türlerinin (short, int, long, byte) decimal formatlanması için d format karakteri kullanılır

    printf metodu ekrana basma işleminden sonra imleci bir alt satırın başına geçirmez. Son yazılan karakterden bir sonraya
	çeker. İmleci bir sonraki satırın başına geçirmek için n format karakteri ile %n yer tutucusu yazılabilir. Bu yer tutucu
	bir argümana ilişkin değildir

	printf metodu ekrana basma işleminden sonra imleci bir alt satırın başına geçirmez. Son yazılan karakterden bir sonraya
	çeker. İmleci bir sonraki satırın başına geçirmek için n format karakteri ile %n yer tutucusu yazılabilir. Bu yer tutucu
	bir argümana ilişkin değildir

	printf metodu x, X, h, H format karakterleri ile tamsayı türleri hexadecimal olarak formatlanabilir. Ayrıca o (küçük o)
	format karakteri ile tamsayı türleri octal olarak formatlanabilir

	printf metodunda gerçek sayılar (double ve float) için f format karakteri kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
printf metodunun bir kullanımı
----------------------------------------------------------------------------------------------------------------------*/
class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Arasınav notunuzu giriniz:");
        int midTermGrade = Integer.parseInt(kb.nextLine());
        System.out.print("Final notunuzu giriniz:");
        int finalGrade = Integer.parseInt(kb.nextLine());

        double result = 0.4 * midTermGrade + 0.6 * finalGrade;

        System.out.printf("Arasınav:%d, Final:%d => Sonuç:%.2f%n", midTermGrade, finalGrade, result);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Klavyeden girilen iki tane int türden sayının toplamını ve çarpımını formatlı olarak aşağıdaki
	gibi ekrana basan programı yazınız:


	Girilen sayılar 10 ve 20 ise


	10 + 20 = 30
	10 * 20 = 200
	şeklinde ekrana basılacaktır
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Klavyeden girilen iki tane int türden sayının toplamını ve çarpımını formatlı olarak aşağıdaki
	gibi ekrana basan programı yazınız:
	Girilen sayılar 10 ve 20 ise
	10 + 20 = 30
	10 * 20 = 200
	şeklinde ekrana basılacaktır
----------------------------------------------------------------------------------------------------------------------*/
class ClassWork {
    public static void main(String [] args)
    {
        FindSumMultiplyApp.run();
    }
}
class FindSumMultiplyApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        int a = Integer.parseInt(kb.nextLine());
        System.out.print("İkinci sayıyı giriniz:");
        int b = Integer.parseInt(kb.nextLine());

        System.out.printf("%d + %d = %d%n", a, b, NumberUtil.add(a, b));
        System.out.printf("%d * %d = %d%n", a, b, NumberUtil.multiply(a, b));

    }
}
class NumberUtil {
    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int multiply(int a, int b)
    {
        return a * b;
    }

}
/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Bölme işlemi tamsayılar ile yapıldığında sonuç her zaman tamsayı çıkar. Elde edilen sayının noktadan
	sonraki kısmı yuvarlanmadan atılır

	Anahtar Notlar: Tamsayılar ile bölme işleminde paydanın sıfır olması durumunda exception oluşur.

	Aşağıdaki örneği çeşitli değerler girerek sonuçları gözlemleyiniz
----------------------------------------------------------------------------------------------------------------------*/
class Test {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        int a = Integer.parseInt(kb.nextLine());
        System.out.print("İkinci sayıyı giriniz:");
        int b = Integer.parseInt(kb.nextLine());

        double result;

        result = a / b;

        System.out.printf("%d / %d = %f%n", a, b, result);
    }
}
/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Gerçek sayılar ile bölme işleminde payda sıfır olsa da işlem yapılır. Gerçek sayılar içerisinde
	genel olarak "belirsizlik" için kullanılan "Not a number (NaN)" değeri vardır. Ayrıca sonsuzluk (ya da genel olarak tanımsızlık)
	için kullanılan +Infinity ve -Infinity değerleri de vardır. Bu durumda gerçek sayılar ile bölme işleminde pay sıfırdan
	farklı payda sıfırsa payın işaretine göre + veya - Infinity, pay ve paydanın ikisi birden sıfır ise NaN sonucu
	elde edilir
----------------------------------------------------------------------------------------------------------------------*/
class Demo {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        double a = Double.parseDouble(kb.nextLine());
        System.out.print("İkinci sayıyı giriniz:");
        double b = Double.parseDouble(kb.nextLine());

        double result;

        result = a / b;

        System.out.printf("%f / %f = %f%n", a, b, result);
    }
}

