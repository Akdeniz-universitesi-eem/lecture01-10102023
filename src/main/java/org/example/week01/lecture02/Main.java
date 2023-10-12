package org.example.week01.lecture02;

/*----------------------------------------------------------------------------------------------------------------------
   	Tür (type): Bir değişken için bellekte ne kadar yer ayrılacağını ve içerisindeki değerin hangi formatta tutulacağını
    belirten kavramdır.

    Temel türler (built-in types veya predefined types veya primitive types)

    Tür ismi				Uzunluğu (byte)
    short						2
   *int							4
    long						8
    byte						1

    float						4
   *double						8

    char						2
    boolean						-
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Değişken bildiriminin genel biçimi:
	<tür> <değişken ismi>;

	int a;
	double b;
	boolean c;
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Java'da 3(üç) çeşit değişken vardır:
	1. Yerel değişkenler (local variables)
	2. Parametre değişkenleri (parameter variables)
	3. Sınıf veri elemanları (class member variables)

	Değişkenler için temel kavramlar:
	İsmi: Belli kurallara göre yazılan karakterler topluluğu

	Türü: Değişken için bellekte ne kadar yer ayrılacağı (değişkenin ne kadar kaplayacağı)ve içerisindeki değerin
	hangi formatta tutulduğudur.

	Faaliyet alanı (scope): Bir değişken isminin derleyici tarafından görülebildiği kod aralığıdır. Derleme zamanına
	ilişkindir.

	Ömür (storage duration): Bir değişkenin bellekte kalma süresidir. Çalışma zamanına ilişkin bir bilgidir.

	Temel kavramlar:
	Blok (block): Bir metot içerisinde { ile } arasında kalan kod bölümüdür. Metodun gövdesi de bir blok gibi düşünülebilir

	İlkdeğer verme (initialization): Bir değişkene bildirim noktasında verilen değere denir.
----------------------------------------------------------------------------------------------------------------------*/
public class Main {
    public static void main(String[] args) {
        //Aynı türden yerel değişkenler aralarına virgül konarak bildirilebilirler
        //int a, b, c;

        //Yerel değişkenlere ilk değer verilmesi
        //double pi = 3.14;

        //Yerel bir değişkenin faaliyet alanı bildirildiği yerden bildirildiği bloğun sonuna kadardır

        /*
        {
			int a;
			//...

			{
				a = 30;
			}
		}

		a = 10; //error
        */

        //Aynı faaliyet alanı içerisinde aynı isimde yerel değişken bildirimi yapılamaz
        //		int a;
        //		double a; //error

        /*----------------------------------------------------------------------------------------------------------------------
	    Java'da içerisine değer verilmemiş bir değişken kullanılamaz yani içerisinde değer varmış gibi işleme sokulamaz.
	    Yerel değişkenlere değer verme programcının sorumluğundadır
        ----------------------------------------------------------------------------------------------------------------------*/
        /*
        int a;
		int b;

		b = a * 2; //error

		System.out.println(a); //error
        */

        /*----------------------------------------------------------------------------------------------------------------------
	    Değişken isimleri sayısal bir karakter başlatılamaz

	    Değişken isimleri herhangi bir uygun karakter ile başlatılıp istenildiği kadar sayısal karakter içerebilir

	    Değişken isimlendirmede UNICODE alfabetik karakterler kullanılabilir. Örneğin Türkçe karakterler kullanılabilir

	    Değişken isimlerinde boşluk (whitespace) karakterler kullanılamaz

	    Değişken isimleri büyük-küçük harf duyarlıdır (case sensitive)

	    Değişken isimlerinde _ (alttire, underscore) karakteri kullanılabilir. Hatta değişken ismi alttire ile başlatılabilir

	    Anahtar Notlar: Programlamada artık kullanılması tavsiye edilmeyen durumlar için "deprecated" terimi kullanılır.
	    Bu durumun gerekçeleri farklı farklı olabilir. Ancak programcı açısından genel olarak "deprecated" olan bir durumun
	    kullanılması tercih edilmemelidir

	    Java 9 ile birlikte alttire karakterinin tek başında değişken ismi olarak kullanılması geçersizdir. Bu durum Java 8
	    ile birlikte "deprecated" olmuştur

	        Java'da değişken isimlendirmede $ karakteri kullanılabilir. Hatta isimlşer $ karakteri ile başlatılabilir. $ karakteri
	    tek başına değişken ismi olabilir. Ancak programcı açısından değişken isimlendirmede $ karakteri kullanılmamalıdır.
	    Çünkü derleyici ve bazı kod üreten araçlar isimlendirmede $ karakterini kullanırlar. $ karakteri bu anlamda
	    programcının isimlendirmesi ile derleyicinin ürettiği kodlardaki isimlerin ayrışması ve dolayısıyla isim çakışması
	    olmaması için vardır

	    Anahtar sözcükler tek başına değişken ismi olarak kullanılamaz. Ancak Java'ya daha sonra eklenmiş yerine göre
	    anahtar sözcük biçiminde kullanılan bazı atomlar vardır. Bu tarz eklenen isimler tam anlamıyla anahtar sözcük değildir.
	    Kullanıldığı yere göre değişken ismi olup olmadığı derleyici tarafından tespit edilir Bu tip sözcüklere programlamada
	    "bağlamsal anahtar sözcükler (contextual keywords)" denir

	    Anahtar Notlar: Değişken isimlerinin kolay telaffuz edilebilir, anlamlı ve yeterince uzunlukta olması tavsiye edilir
        ----------------------------------------------------------------------------------------------------------------------*/
    }
}
