package org.example.week01.lecture01;

/*----------------------------------------------------------------------------------------------------------------------
	JVM (Java Virtual Machine) byte kodu JIT (Just In Time) derleyerek sisteme ilişkin aşağı seviyeli (makine kod denebilir)
	koda dönüştürür. Bu parça aslında byte kodun nasıl yorumlanacağına (interpret) yönelik soyutlanmış kavramı belirtir.

	JRE (Java Runtime Environment) genel olarak java ile yazılmış bir uygulamayı çalıştırmak (run) için gereken araçları
	ve uygulamaları	içeren bir pakettir. Yani bir Java programı yazıldığında bu programın çalıştırılabilmesi için
	JRE'ye ihtiyaç vardır. JRE içerisinde bir çok araç (tool) bulunmaktadır. JVM'de JRE içerisinde bulunur.

	JDK (Java Development Kit) geliştirme (development) ve çalıştırma (run) için gereken araçları (tool) barındırır
----------------------------------------------------------------------------------------------------------------------*/
public class Main {
    public static void main(String [] args)
    {
        System.out.println("Hello, World");
        Sample.foo();
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    Atom (token):
    Bir programlama dilinde kendi başına anlamlı olan en küçük birime atom denir. Atomlar 6(altı) gruba ayrılır.
    1. Anahtar sözcükler (keywords, reserved words): Dil için özel bir anlamı olan yani dil tarafından bilinen ve birçoğu
    doğrudan değişken ismi olarak kullanılmayan atomlardır. Örneğin: package, class, static

    2. Değişkenler (identifiers, variables): İsmini programcının belirlediği ve isimlendirme kuralları olan atomlardır.
    Örneğin: App, System, String

    3. Operatörler (Operators): Bir işleme yol açan ve bu işlem sonucunda bir değer üreten atomlardır. Örneğin:
    a * b ifadesinde * operatör atomdur.

    4. Sabitler (literals, constants): Program içerisinde doğrudan yazılmış sayılara denir. Örneğin: a + 7 ifadesinde
    7 bir sabittir.

    5. String'ler (string literals): İki tırnak içerisindeki yazılar tırnaklarıyla birlikte string atomudur

    6. Ayıraçlar (delimiters, punctuators): Yukarıdaki gruplar dışında tüm atomlara denir

    Boşluk karakterleri (whitespaces): Klavyeden basıldığında boşluk algısı yaratan karakterlerdir. Klavyeden
    basılan boşluk karakterleri "space, tab, enter" karakterleridir.

    Java programlama dilinde yazım kuralları şunlardır:
    1. Atomlar arasında istenildiği boşluk bırakılabilir
    2. Anahtar sözcükler ve değişkenler dışında kalan atomlar istenildiği kadar bitişik yazılabilir. Anahtar sözcükler
    ve değişken atomlar arasında en az bir boşluk karakteri olmalıdır
----------------------------------------------------------------------------------------------------------------------*/
class Foo 													{
    public static void






    main					(					String[








                                                         ] args)
    {
        System.out.println("Hello, World");
    }







}
/*----------------------------------------------------------------------------------------------------------------------
    Atomlar istenildiği kadar bitişik yazılabilir
----------------------------------------------------------------------------------------------------------------------*/
class Bar{public static void main(String[]args){System.out.println("Hello, World");}}

/*----------------------------------------------------------------------------------------------------------------------
    Anahtar Notlar: Java'da derleme zamanı (compile time) ve çalışma zamanı (run time) denilen iki birbiriyle ilişkili
    ancak ayrı olan kavramlar vardır. Derleme zamanı derleme sırasında geçen zamanda olan işlemleri temsil eder, çalışma
    zamanı da programın çalışması sırasında (yani zaten derlenmiş ve byte kod oluşmuş) yapılan işlemleri temsil eder.
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
    Derleyicinin hata mesajları:
	1. Uyarılar (warnings): Byte kodun oluşmasına engel olmayan, olası mantık hatalarının programcıya bildirilmesi amacıyla
	kullanılan teşhis mesajlarıdır. Programcı uyarıları dikkate almalıdır. Özel bir durum yoksa uyarı mesajlarının
	oluşumuna yol açan kodlar düzeltilmelidir.

	2. Gerçek hatalar (errors): Dilin sentaks ve semantik kurallarına uyulmamasından dolayı verilen mesajlardır. Bu durumda
	byte code üretilmez. Programcının bu hataları düzeltip derlemesi gerekir

	3. Ölümcül hatalar (fatal errors): Derleme işleminin bile tamamlanmasını engelleyebilecek hatalardır. Bu durumda
	programıcının yazdığı kod açısından yapacak bir şeyi yoktur. Çünkü henüz kod derlenememiştir. Programcının ölümcül
	hataya yol açan sorunu ortadan kaldırması ve derleme işlemi yapması gerekir.

    Programın çalışma zamanı sırasında oluşan genel olarak hatalı durumlara "exception" denir. Exception oluştuğunda
    durumunda program sonlanır. Bu durumunda detayları ileride "exception işlemleri (exception handling)" konusunda
    ele alınacaktır.
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
    Bildirim (declaration): Bildirim bir ismin derleyiciye tanıtılmasıdır. Derleyici bildirim ile o ismin ne anlama
    geldiğini anlar ve derlemede ona yönelik işlem yapar.
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	paket bildiriminin genel biçimi:
	package <paket ismi>;
	Örneğin:
	package csd;

	Sınıf bildiriminin genel biçimi:
	[erişim belirleyici] class <sınıf ismi> {
		//...
	}

	class Sample {
		//...
	}

	class Mample {
		//...
	}

	Java'da alt programlara metot denir. Alt programın ne yapacağının yazılmasına "metot bildirimi (method declaration)" denir.
	Alt programın kodlarının çalıştırılmasına ise "metot çağırma (method call)" denir.
	Metot bildiriminin genel biçimi:

	[erişim belirleyici] [static] <geri dönüş değeri bilgisi> <metot ismi>([parametreler])
	{
		//...
	}

	Açıklamalar:
 	- Erişim belirleyici şunlardan biri olabilir: public, protected, no-modifier (hiçbir şey yazmamak), private.

	- Metotların erişim belirleyicilerine ilişkin konuya gelene kadar tüm metotlarımızı public olarak bildireceğiz.

	- Bir metot static olarak bildirilmezse non-static olur. non-static metotlara ilişkin konuya gelena kadar
	tüm metotlarımızı static olarak bildireceğiz

	- erişim belirleyici ve static anahtar sözcüğü aynı sentaks seviyesindedir. Yani yer değiştirilebilir. Ancak
	okunabilirlik açısından biz erişim belirleyiciyi önce yazacağız

	- Metodun geri dönüş değeri bilgisi metot isminden önce mutlaka yazılmalıdır.

	- Metot bildiriminde metot isminde sonra parantez içerisinde ismine "parametre (parameter)" denilen değişkenler
	bildirilebilir. Bu konu ileride ele alınacaktır.

	- Metot bildiriminde küme parantezleri arasında metodun kodları yazılır.

	Metot çağırmanın genel biçimi:
	[paket ismi].[sınıf ismi].<metot ismi>([argümanlar]);

	Anahtar Notlar: System.out.println("Hello, World"); çağrısında System bir sınıf, out bir referans println de
	non-static bir metodudur. Bu konunun detayları ileride anlaşılacaktır.
----------------------------------------------------------------------------------------------------------------------*/
class Sample {
	public static void foo()
	{
		System.out.println("foo");
		Mample.tar();
	}

	public static void bar()
	{
		System.out.println("bar");
	}
}
class Mample {
	public static void tar()
	{
		System.out.println("tar");
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	Çağıran metodun (caller) ait olduğu sınıf ile çağrılan metodun (callee)  ait olduğu sınıf aynı pakette ise
	çağırma sırasında paket ismi yazılmayabilir

	Çağıran metot ile çağrılan metot aynı sınıfta ise bu durumda paket ismi yazılmamışsa sınıf ismi de yazılmayabilir
----------------------------------------------------------------------------------------------------------------------*/