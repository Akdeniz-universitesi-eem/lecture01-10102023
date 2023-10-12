package org.example.week01.lecture03;

public class Main {
    public static void main(String[] args) {
        //Klavyeden değer okumak

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int valInt = Integer.parseInt(kb.nextLine());

        System.out.print("Bir sayı giriniz:");
        double valDouble = Double.parseDouble(kb.nextLine());

        System.out.print("Bir sayı giriniz:");
        long valLong = Long.parseLong(kb.nextLine());

        int squareInt = valInt * valInt;
        double squareDouble = valDouble * valDouble;
        long squareLong = valLong * valLong;

        System.out.println(squareInt);
        System.out.println(squareDouble);
        System.out.println(squareLong);

        /*----------------------------------------------------------------------------------------------------------------------
	    Anahtar Notlar: Sabitlerden, operatörlerden ve değişkenlerden oluşan herhangi bir dizilime ifade (expression)
	    denir. Değişkenler ve sabitler tek başına ifade olabilirken, operatörler tek başına ifade olamaz
        ----------------------------------------------------------------------------------------------------------------------*/

    }
}

/*----------------------------------------------------------------------------------------------------------------------
Bir metodun geri dönüş değeri varsa geri dönüş değeri bilgisi yerine bir tür yazılır. Bir metodun geri dönüş
değeri varsa metot çağrısı bittikten sonra çağrıldığı noktaya bir değer ile gelinir. İşte bu değer metodun
çağrıldıktan sonra döndürdüğü değerdir. Bir metodun geri dönüş değeri yoksa geri dönüş değeri bilgisi yerine
void anahtar sözcüğü yazılır. Bir metodun geri dönüş değeri return deyimi ile oluşturulur. return deyiminin
genel biçimi:
    return [ifade];
return deyimi nasıl kullanılırsa kullanılsın metodu sonlandırır. Yani metot içerisindeki akışta return deyimi
görüldüğünde metot sonlanır ve akış çağrılan noktaya geri döner. return deyimine ilişkin ifadenin değeri çağıran
metoda aktarılır. Aşağıdaki örnekte square metodunun geri dönüş değeri 2 ile çarpılmış ve sonuç result değişkenine
atanmıştır
----------------------------------------------------------------------------------------------------------------------*/

class App {
    public static void main(String [] args)
    {
        int result;

        result = NumberUtil.square();

        System.out.println(result);
    }
}
class NumberUtil {
    public static int square()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        return val * val;
    }
}
/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Java derleyicisi genel olarak bir deyime akışın hiçbir zaman gelemeyeceğini anlarsa o yazılan
	deyim için error oluşturur (unreachable code)

    return deyimi nasıl kullanılırsa kullanılsın metodu sonlandırır. Aşağıdaki örnekte return deyiminden sonra akış
	metot içerisinde kalmayacağından error oluşturur
----------------------------------------------------------------------------------------------------------------------*/
/*
class App {
    public static void main(String [] args)
    {
        int result;

        result = NumberUtil.square() * 2;

        System.out.println(result);
    }
}
class NumberUtil {
    public static int square()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        int result = val * val;

        return result;
        System.out.println("unreachable code"); //error
    }
}
*/

/*----------------------------------------------------------------------------------------------------------------------
	Akış return deyimine geldiğinde return deyimine ilişkin ifade önce yapılır, elde edilen değer döndürülür
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	void metotlarda return deyimi zorunlu değildir

	void metotlarda return deyimi istenirse metodu sonlandırmak için tek başına kullanılabilir

		void metotlarda return deyimi ifade ile kullanılamaz
----------------------------------------------------------------------------------------------------------------------*/
class Display {
    public static void main(String [] args)
    {
        DisplayUtil.displaySquare();
    }
}

class DisplayUtil {
    public static void displaySquare()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        int result = val * val;

        System.out.println(result);
    }
}


