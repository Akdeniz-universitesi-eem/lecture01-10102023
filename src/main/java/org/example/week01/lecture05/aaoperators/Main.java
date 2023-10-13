package org.example.week01.lecture05.aaoperators;

public class Main {

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı en fazla 3(üç) basamaklı int türden bir sayının basamakları toplamını döndüren
	digitsSum metodunu döngü kullanmadan yazınız. Metot aldığı argümanın en fazla 3(üç) basamaklı olup olmadığını kontrol
	etmeyecektir. Basmaklar toplamı pozitif olarak döndürülecektir.
----------------------------------------------------------------------------------------------------------------------*/

    class ClassWork01 {
        public static void main(String [] args)
        {
            DigitsSumTest.run();
        }

        class DigitsSumTest {
            public static void run()
            {
                java.util.Scanner kb = new java.util.Scanner(System.in);
                System.out.print("Bir sayı giriniz:");
                int val = Integer.parseInt(kb.nextLine());

                System.out.printf("%d sayısının basamakları toplamı:%d%n", val, NumberUtil.digitsSum(val));
            }
        }

        class  NumberUtil {
            public static int digitsSum(int val)
            {
                int a, b, c;

                a = val / 100;
                b = val % 100 / 10; //val / 10 % 10;
                c = val % 10;

                return Math.abs(a + b + c);
            }
        }

    }

/*----------------------------------------------------------------------------------------------------------------------
	İşaret - aritmetik operatörü tek operandlı (unary) ve önek (prefix) durumunda bir operatördür
----------------------------------------------------------------------------------------------------------------------*/
    class DemoUnaryPrefixSub {
        public static void main(String [] args)
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.print("Bir sayı giriniz:");
            int a = Integer.parseInt(kb.nextLine());
            int b;

            b = -a;

            System.out.printf("a = %d%n", a);
            System.out.printf("b = %d%n", b);
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	İşaret + aritmetik operatörü tek operandlı (unary) ve önek (prefix) durumunda bir operatördür. Bu operatör operandının
	değerini üretir
----------------------------------------------------------------------------------------------------------------------*/
    class DemoUnaryPrefixSum {
        public static void main(String [] args)
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.print("Bir sayı giriniz:");
            int a = Integer.parseInt(kb.nextLine());
            int b;

            b = +a;

            System.out.printf("a = %d%n", a);
            System.out.printf("b = %d%n", b);
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ifade işaret - operatörünün seviyesinde bulunan operatörlerin sağdan sola (right associative) ele
	alınması dolayı geçerlidir
----------------------------------------------------------------------------------------------------------------------*/
    class DemoExample {
        public static void main(String [] args)
        {
            int a;

            a = - - - - - - - - - 10;

            System.out.printf("a = %d%n", a);
        }
    }



/*----------------------------------------------------------------------------------------------------------------------
	++ operatörü tek operandlı ve hem prefix hem de postfix olarak kullanılabilen bir operatördür. Bu operatörün
	prefix ya da postfix kullanımı durumunda operandına ilişkin değişkenin içerisindeki değeri 1(bir) artırır (increment)
----------------------------------------------------------------------------------------------------------------------*/
    class DemoOperator {
        public static void main(String [] args)
        {
            int a;

            a = 10;

            ++a; //a = a + 1;

            System.out.printf("a = %d%n", a);
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	++ operatörünün prefix kullanımında ürettiği değer (işleme giren değer) artırılmış değerdir
----------------------------------------------------------------------------------------------------------------------*/
    class DemoSumPrefix {
        public static void main(String [] args)
        {
            int a, b;

            a = 10;
            b = ++a;

            System.out.printf("a = %d%n", a);
            System.out.printf("b = %d%n", b);
        }
    }
/*----------------------------------------------------------------------------------------------------------------------
	++ operatörünün postfix kullanımında ürettiği değer (işleme giren değer) artırılMAmış değerdir
----------------------------------------------------------------------------------------------------------------------*/
    class DemoSumPostfix {
        public static void main(String [] args)
        {
            int a, b;

            a = 10;
            b = a++;

            System.out.printf("a = %d%n", a);
            System.out.printf("b = %d%n", b);
        }
    }
/*----------------------------------------------------------------------------------------------------------------------
	++ ve -- operatörlerinin bir ifadede kullanımında bazı durumlarda işlem sırası değişebilir. Bu ileride ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Derleyici yukarıdan aşağıya ve soldan sağa olmak üzere anlamlı en uzun ifadeyi alacak şekilde atomlarına ayırma
	işlemini yapar (maximum munch)
----------------------------------------------------------------------------------------------------------------------*/
    class App {
        public static void main(String [] args)
        {
            int a = 10;
            int b = 11;
            int c;

            c = a+++b; //c = a++ + b;

            System.out.printf("a = %d%n", a);//11
            System.out.printf("b = %d%n", b);//11
            System.out.printf("c = %d%n", c);//21
        }
    }
/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Okunabilirlik/algılanabilirlik açısından tek operandlı operatörleri genel olarak operandına bitişik
	yazacağız. İki operandlı operatörleri de bazı özel ama önemli durumlar dışında operand ile operatör arasında yalnızca
	bir tane space karakteri olacak şekilde yazacağız
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Temel karşılaştırma operatörleri 6(altı) tanedir. Bu operatörlerin hepsi binary ve infix durumunda operatörlerdir.
	Bu operatörlerin operandlarına yan etkisi yoktur. Bu operatörlerin ürettiği değer boolean türdendir. Karşılaştırmanın
	doğru ise true, yanlış ise false değerini üretirler
----------------------------------------------------------------------------------------------------------------------*/
    class DemoComparisionOperators {
        public static void main(String [] args)
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.print("Birinci sayıyı giriniz:");
            int a = Integer.parseInt(kb.nextLine());

            System.out.print("İkinci sayıyı giriniz:");
            int b = Integer.parseInt(kb.nextLine());

            System.out.printf("%d > %d -> %b%n", a, b, a > b);
            System.out.printf("%d < %d -> %b%n", a, b, a < b);
            System.out.printf("%d >= %d -> %b%n", a, b, a >= b);
            System.out.printf("%d <= %d -> %b%n", a, b, a <= b);
            System.out.printf("%d == %d -> %b%n", a, b, a == b);
            System.out.printf("%d != %d -> %b%n", a, b, a != b);
        }
    }
/*----------------------------------------------------------------------------------------------------------------------
	Metot çağırma operatörü
----------------------------------------------------------------------------------------------------------------------*/
    class DemoMethodCallOperator {
        public static void main(String [] args)
        {
            int result;

            result = NumberUtil.add(10, 20) * 2;

            System.out.printf("result = %d%n", result);

        }
        class NumberUtil {
            public static int add(int a, int b)
            {
                return a + b;
            }
        }

    }

/*----------------------------------------------------------------------------------------------------------------------
	Mantıksal operatörler 3(üç) tanedir: && (AND), || (OR), ! (NOT)
	&& ve || operatörleri iki operandlı araek durumunda operatörlerdir. ! operatörü tek operandlı önek durumunda operatördür.
	Bu üç operatörün de operandları boolean türden olmalıdır. Bu üç operatörün de ürettiği değer boolean türdendir. Bu
	operatörler matematik'teki mantıksal operatörlerdir.

	&& ve || operatörlerinin doğruluk tabloları aşağıdaki gibidir:

	op1			op2			op1 && op2
	T			T				T
	T			F				F
	F			T				F
	F			F				F


	op1			op2			op1 || op2
	T			T				T
	T			F				T
	F			T				T
	F			F				F
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	&& operatörü
----------------------------------------------------------------------------------------------------------------------*/
    class DemoAndOperator {
        public static void main(String [] args)
        {
            boolean result;

            result = Sample.foo() && Sample.bar();

            System.out.printf("result = %b%n", result);
        }
        class Sample {
            public static boolean foo()
            {
                System.out.println("foo");

                return true;
            }

            public static boolean bar()
            {
                System.out.println("bar");

                return false;
            }
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	|| operatörü
----------------------------------------------------------------------------------------------------------------------*/
    class DemoOrOperator {
        public static void main(String [] args)
        {
            boolean result;

            result = Sample.bar() || Sample.foo();

            System.out.printf("result = %b%n", result);
        }

        class Sample {
            public static boolean foo()
            {
                System.out.println("foo");

                return true;
            }

            public static boolean bar()
            {
                System.out.println("bar");

                return false;
            }
        }

    }

/*----------------------------------------------------------------------------------------------------------------------
	|| operatörünün kısa devre davranışı (short circuit behavior). Kısa devre davranışı doğru sonuca en çabuk ulaşacak
	şekilde çalışmaktır
----------------------------------------------------------------------------------------------------------------------*/
    class DemoShortCircuitBehavior {
        public static void main(String [] args)
        {
            boolean result;

            result = Sample.foo() || Sample.bar();

            System.out.printf("result = %b%n", result);
        }
        class Sample {
            public static boolean foo()
            {
                System.out.println("foo");

                return true;
            }

            public static boolean bar()
            {
                System.out.println("bar");

                return false;
            }
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	&& operatörünün kısa devre davranışı (short circuit behavior)
----------------------------------------------------------------------------------------------------------------------*/
    class DemoSCBofAnd {
        public static void main(String [] args)
        {
            boolean result;

            result = Sample.bar() && Sample.foo();

            System.out.printf("result = %b%n", result);
        }

        class Sample {
            public static boolean foo()
            {
                System.out.println("foo");

                return true;
            }

            public static boolean bar()
            {
                System.out.println("bar");

                return false;
            }
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	&& ve || operatörlerinde doğru sonuca en kısa yoldan ulaşabilmek (yani kısa devre davranışı için) için ifadenin önce
	sol tarafı yapılır. Yani bu operatörler	işlem sırasında işlem önceliğine uymazlar. Ancak işlem önceliğine uyulursa,
	yani matematiksel olarak (ya da daha kabaca kağıt üzerinde) elde edilen sonucu verirler. Şu cümle unutulmamalıdır:
	"&& ve || operatörleri doğru sonuca en kısa yoldan erişirler." Aşağıdaki örnekte && operatörü || operatöründen daha yüksek
	öncelikli olmasına karşın önce || işlemi yapılmaktadır. Ancak && operatörünün önceliğine göre işlem yapıldığında
	elde edilen sonuç aynıdır
----------------------------------------------------------------------------------------------------------------------*/
    class DemoOrAnd {
        public static void main(String [] args)
        {
            boolean result;

            result = Sample.foo() || Sample.bar() && Sample.tar();

            System.out.printf("result = %b%n", result);
        }

        class Sample {
            public static boolean foo()
            {
                System.out.println("foo");

                return true;
            }

            public static boolean bar()
            {
                System.out.println("bar");

                return false;
            }

            public static boolean tar()
            {
                System.out.println("tar");

                return false;
            }
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte işlem sırası ile operatörlerin öncelik sırası aynıdır. Yine en soldaki yapılır. Yani yine
	matematiksel olarak doğru sonuca en kısa yoldan ulaşılır
----------------------------------------------------------------------------------------------------------------------*/
    class DemoOrAnd2 {
        public static void main(String [] args)
        {
            boolean result;

            result = Sample.bar() && Sample.foo() || Sample.tar();

            System.out.printf("result = %b%n", result);
        }
        class Sample {
            public static boolean foo()
            {
                System.out.println("foo");

                return true;
            }

            public static boolean bar()
            {
                System.out.println("bar");

                return false;
            }

            public static boolean tar()
            {
                System.out.println("tar");

                return false;
            }
        }


    }

/*----------------------------------------------------------------------------------------------------------------------
	Bitsel AND (&) ve bitsel OR (|) operatörleri tamsayılar ile kullanıldığında karşılıklı bit değerlerini işleme sokarak
	değer üretirler. Bu operatörler özel olarak boolean ifadeler ile kullanıldıklarında kısa devre özelliği olmayan AND ve
	OR operatörleri biçiminde düşünülebilir. Yine bu operatörler için de en soldaki ifade önce yapılır
----------------------------------------------------------------------------------------------------------------------*/
    class BitwiseOrAnd {
        public static void main(String [] args)
        {
            boolean result;

            result = Sample.foo() | Sample.bar() & Sample.tar();

            System.out.printf("result = %b%n", result);
        }
        class Sample {
            public static boolean foo()
            {
                System.out.println("foo");

                return true;
            }

            public static boolean bar()
            {
                System.out.println("bar");

                return false;
            }

            public static boolean tar()
            {
                System.out.println("tar");

                return false;
            }
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	Bitsel AND (&) ve bitsel OR (|) operatörleri tamsayılar ile kullanıldığında karşılıklı bit değerlerini işleme sokarak
	değer üretirler
----------------------------------------------------------------------------------------------------------------------*/

    class DemoBitwiseAndOr {
        public static void main(String [] args)
        {
            int a = 10; //00000000000000000000000000001010
            int b = 11; //00000000000000000000000000001011
            int c;

            c = a & b; //00000000000000000000000000001010

            System.out.printf("c = 0x%08X%n", c);
            System.out.printf("c = %d%n", c);

            c = a | b; //00000000000000000000000000001011

            System.out.printf("c = 0x%08X%n", c);
            System.out.printf("c = %d%n", c);
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	Mantıksal DEĞİL (logical not) operatörünün doğruluk tablosu:

	 op				!op
	 T				F
	 F				T
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	! operatörü flag değişkenlerle aşağıdaki gibi kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/

    class DemoNot {
        public static void main(String [] args)
        {
            boolean flag = true;

            //...

            flag = !flag;

            System.out.printf("flag = %b%n", flag);
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	Atama (=) operatörü iki operandlı araek durumunda bir operatördür. Bu operatörün birinci operandı değişken olmalıdır.
	Operatörün şüphesiz birinci operandına yan etkisi vardır. Bu operatör sağdan sola (right associative) önceliklidir.
	Atama operatörü ikinci operandına ilişkin değeri üretir
----------------------------------------------------------------------------------------------------------------------*/

    class DemoInitialize {
        public static void main(String [] args)
        {
            int a, b, c;

            a = b = c = 10;

            System.out.printf("a = %d%n", a);
            System.out.printf("b = %d%n", b);
            System.out.printf("c = %d%n", c);
        }
    }
/*----------------------------------------------------------------------------------------------------------------------
	İşlemli atama operatörlerinin genel biçimi:
	<ifade1> <op>= <ifade2> ifadesinin yaklaşık karşılığı

	<ifade1> = <ifade1> op <ifade2>

	a *= b -> a = a * b
	a += b -> a = a + b

----------------------------------------------------------------------------------------------------------------------*/

    class DemoInitializeWithOperations {
        public static void main(String [] args)
        {
            int a = 10, b = 20;

            a += b; // a = a + b;

            System.out.printf("a = %d%n", a);
            System.out.printf("b = %d%n", b);

        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	Noktalı virgül (;) sonlandırıcıdır (terminator). Genel olarak ifadeleri ayırmak için kullanılır. Java'da ;'den
	başka sonlandırıcı karakter yoktur
----------------------------------------------------------------------------------------------------------------------*/

    class DemoTerminate {
        public static void main(String [] args)
        {
            int a = 10;

            ++a; System.out.printf("a = %d%n", a);
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ++ operatörünün ürettiği değer artırılmamış olduğundan a 10 olur
----------------------------------------------------------------------------------------------------------------------*/

    class DemoPrefixInit {
        public static void main(String [] args)
        {
            int a = 10;

            a = a++;

            System.out.printf("a = %d%n", a);
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ++ operatörünün ürettiği değer artırılmış olduğundan a'ya artırıldıktan sonra artırılmış değer atanmış
	olur
----------------------------------------------------------------------------------------------------------------------*/

    class DemoPostFixInit {
        public static void main(String [] args)
        {
            int a = 10;

            a = ++a;

            System.out.printf("a = %d%n", a);
        }
    }

}
