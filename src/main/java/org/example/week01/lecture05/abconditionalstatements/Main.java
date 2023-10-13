package org.example.week01.lecture05.abconditionalstatements;

public class Main {

}

/*----------------------------------------------------------------------------------------------------------------------
	if deyiminin genel biçimi:
	if (<boolean türden ifade>)
		<deyim>
	[
	else
		<deyim>
	]

	if deyimi varsa else kısmıyla beraber tek bir deyimdir
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val % 2 == 0)
            System.out.println("Çift sayı girdiniz");
        else
            System.out.println("Tek sayı girdiniz");

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	if deyiminde bileşik deyim kullanımı
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse2 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val % 2 == 0) {
            System.out.println("Çift sayı girdiniz");
            val /= 2;
        }
        else {
            System.out.println("Tek sayı girdiniz");
            val *= 2;
        }


        System.out.printf("val = %d%n", val);
        System.out.println("Tekrar yapıyor musunuz?");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	if deyiminde bileşik deyim kullanımı
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse3 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val % 2 == 0) {
            System.out.println("Çift sayı girdiniz");
            val /= 2;
        }
        else
            System.out.println("Tek sayı girdiniz");

        System.out.printf("val = %d%n", val);
        System.out.println("Tekrar yapıyor musunuz?");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	else kısmı olmayan if deyimi
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse4 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val % 2 == 0)
            val /= 2;

        System.out.printf("val = %d%n", val);
        System.out.println("Tekrar yapıyor musunuz?");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	if deyiminin parantezi sonuna yanlışlıkla noktalı virgül konması durumu
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse5 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val % 2 == 0);
        val /= 2;

        System.out.printf("val = %d%n", val);
        System.out.println("Tekrar yapıyor musunuz?");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte else bir if deyimine ait olmadığından error oluşur
----------------------------------------------------------------------------------------------------------------------*/
/*
class DemoIfElse6 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val % 2 == 0);
        val /= 2;
		else //error
        val *= 2;

        System.out.printf("val = %d%n", val);
        System.out.println("Tekrar yapıyor musunuz?");
    }
}
*/
/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örnekte else kısmı içteki if deyimine aittir (dangling else)
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse7 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val > 0)
            if (val % 2 == 0)
                System.out.println("Pozitif ve çift bir sayı girdiniz");
            else
                System.out.println("Pozitif sayı girmelisiniz");

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	 Yukarıdaki "dangling else" durumu bileşik deyim ile düzeltilebilir
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse8 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val > 0) {
            if (val % 2 == 0)
                System.out.println("Pozitif ve çift bir sayı girdiniz");
        }
        else
            System.out.println("Pozitif sayı girmelisiniz");

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örnekte içteki if deyiminin de else kısmı olduğundan dangling else oluşmaz ve bileşik deyim yazılmayabilir
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse9 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val > 0)
            if (val % 2 == 0)
                System.out.println("Pozitif ve çift sayı girdiniz");
            else
                System.out.println("Pozitif ve tek sayı girdiniz");
        else
            System.out.println("Pozitif sayı girmelisiniz");

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	 if deyiminin parantezinde boolean türden ifadeler için == ve != operatörleri kullanılması iyi bir teknik
	 değildir
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse10 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        Util.displayEvenStatusByFlag(val % 2 == 0);


        System.out.println("Tekrar yapıyor musunuz?");
    }
    class Util {
        public static void displayEvenStatusByFlag(boolean flag)
        {
            if (flag) //if (flag == true)
                System.out.println("Çift sayı");
            else
                System.out.println("Tek sayı");
        }
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	 if deyiminin parantezinde boolean türden ifadeler için == ve != operatörleri kullanılması iyi bir teknik
	 değildir
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse11 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        Util.displayEvenStatusByFlag(val % 2 == 0);


        System.out.println("Tekrar yapıyor musunuz?");
    }
    class Util {
        public static void displayEvenStatusByFlag(boolean flag)
        {
            if (!flag) //if (flag == false)
                System.out.println("Tek sayı");
            else
                System.out.println("Çift sayı");
        }
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki isEven metodunda else kullanımına gerek yoktur. Hatta kullanılmamalıdır. Çünkü return deyimi metodu
	 sonlandırır. Dolayısıyla akış return deyimine geldiğinde artık bir sonraki deyim çalıştırılmaz
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse12 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        Util.displayEvenStatusByFlag(NumberUtil.isEven(val));


        System.out.println("Tekrar yapıyor musunuz?");
    }
    class Util {
        public static void displayEvenStatusByFlag(boolean flag)
        {
            if (flag)
                System.out.println("Çift sayı");
            else
                System.out.println("Tek sayı");
        }
    }
    class NumberUtil {
        public static boolean isEven(int val)
        {
            if (val % 2 == 0)
                return true;
            else
                return false;
        }
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	 Yukarıdaki örnek aşağıdaki yapılabilir
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse13 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        Util.displayEvenStatusByFlag(NumberUtil.isEven(val));


        System.out.println("Tekrar yapıyor musunuz?");
    }

    class Util {
        public static void displayEvenStatusByFlag(boolean flag)
        {
            if (flag)
                System.out.println("Çift sayı");
            else
                System.out.println("Tek sayı");
        }
    }


    class NumberUtil {
        public static boolean isEven(int val)
        {
            if (val % 2 == 0)
                return true;

            return false;
        }
    }

}



/*----------------------------------------------------------------------------------------------------------------------
	 isEven metodunun okunabilirlik/algılanabilirlik ve çoğu zaman önemli olmasa da (bu örnek açısından) göreceli daha
	 etkin yazılmış versiyonu aşağıdaki gibidir
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse14 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        Util.displayEvenStatusByFlag(NumberUtil.isEven(val));

        System.out.println("Tekrar yapıyor musunuz?");
    }

    class Util {
        public static void displayEvenStatusByFlag(boolean flag)
        {
            if (flag)
                System.out.println("Çift sayı");
            else
                System.out.println("Tek sayı");
        }
    }


    class NumberUtil {
        public static boolean isEven(int val)
        {
            return val % 2 == 0;
        }
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örnekte kod tekrarı yapılmadığına yani işi yapan başka bir metodun çağrıldığında dikkat ediniz.
	 Yazılım geliştirmede ZORUNLU OLMADIKÇA kod tekrarı yapılmaması gerekir. Bu kavrama "DO NOT REPEAT YOURSELF"
	 cümlesi kullanılır
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse15 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        System.out.println(NumberUtil.isEven(val));
        System.out.println(NumberUtil.isOdd(val));

        System.out.println("Tekrar yapıyor musunuz?");
    }

    class NumberUtil {
        public static boolean isEven(int val)
        {
            return val % 2 == 0;
        }

        public static boolean isOdd(int val)
        {
            return !isEven(val);
        }
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	 if deyiminde koşul ifadesi doğrudan boolean türdense == veya != karşılaştırması yapmak iyi bir teknik değildir
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse16 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (NumberUtil.isEven(val))
            System.out.println("Çift sayı girdiniz");
        else
            System.out.println("Tek sayı girdiniz");

        System.out.println("Tekrar yapıyor musunuz?");
    }
    class NumberUtil {
        public static boolean isEven(int val)
        {
            return val % 2 == 0;
        }
    }

}



/*----------------------------------------------------------------------------------------------------------------------
	 if deyiminde koşul ifadesi doğrudan boolean türdense == veya != karşılaştırması yapmak iyi bir teknik değildir
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse17 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (!NumberUtil.isEven(val))
            System.out.println("Tek sayı girdiniz");
        else
            System.out.println("Çift sayı girdiniz");

        System.out.println("Tekrar yapıyor musunuz?");
    }
    class NumberUtil {
        public static boolean isEven(int val)
        {
            return val % 2 == 0;
        }

    }
}

/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki ** ile belirtilen if deyimi else kısmı ile birlikte tek bir if deyimidir. Bu if deyiminin else
	 kısmında başka bir if deyimi vardır
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse18 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val > 0) //**
            System.out.printf("%d sayısı pozifitir%n", val);
        else
        if (val == 0)
            System.out.println("Sıfır girdiniz");
        else
            System.out.printf("%d sayısı negatiftir%n", val);

        System.out.println("Tekrar yapıyor musunuz?");
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	 Yukarıdaki örnek daha okunabilir olarak aşağıdaki gibi yazılabilir
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse19 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val > 0) //**
            System.out.printf("%d sayısı pozifitir%n", val);
        else if (val == 0)
            System.out.println("Sıfır girdiniz");
        else
            System.out.printf("%d sayısı negatiftir%n", val);

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki koşullar ayrık koşullardır. Bu durumda doğru çalışsa bile aşağıdaki gibi yazılmamalıdır. else-if
	 biçiminde yazılması (yukarıdaki gibi) hem okunabilirdir hem de gereksiz yere kontrol edilmesi gibi durumlar
	 oluşmaz. Aşağıdaki örnek şüphesiz kolay anlaşılır. Ancak büyük projelerde koşulların anlaşılması aşağıdaki
	 gibi yazımda zaman alabilir
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse20 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val > 0)
            System.out.printf("%d sayısı pozifitir%n", val);
        if (val == 0)
            System.out.println("Sıfır girdiniz");
        if (val < 0)
            System.out.printf("%d sayısı negatiftir%n", val);

        System.out.println("Tekrar yapıyor musunuz?");
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki koşullar ayrık olmadığından örnek bazında else-if yapılması zaten yanlış olur
----------------------------------------------------------------------------------------------------------------------*/

class DemoIfElse21 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        if (val > 11)
            System.out.println("val > 11");
        if (val > 15)
            System.out.println("val > 15");
        if (val > 30)
            System.out.println("val > 30");

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	 Sınıf Çalışması: Katsayıları klavyeden girilen ikinci dereceden bir denklemin köklerini bulup ekrana yazdıran
	 programı yazınız
	 Not: İleride daha iyileri yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/

class ClassWork01 {
    public static void main(String [] args)
    {
        EquationSolverApp.run();
    }


    class EquationSolverApp {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.println("İkinci dereceden denklemin katsayılarını giriniz:");
            System.out.print("a?");
            double a = Double.parseDouble(kb.nextLine());

            System.out.print("b?");
            double b = Double.parseDouble(kb.nextLine());

            System.out.print("c?");
            double c = Double.parseDouble(kb.nextLine());

            EquationSolver.findRoots(a, b, c);
            System.out.println("Tekrar yapıyor musunuz?");
        }
    }

    class EquationSolver {
        public static double getDelta(double a, double b, double c)
        {
            return b * b - 4 * a * c;
        }

        public static void findRoots(double a, double b, double c)
        {
            double delta = getDelta(a, b, c);

            if (delta > 0) {
                double sqrtDelta = Math.sqrt(delta);

                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);

                System.out.printf("x1 = %f, x2 = %f%n", x1, x2);
            }
            else if (delta == 0) {
                double x = -b / (2 * a);

                System.out.printf("x1 = x2 = %f%n", x);
            }
            else
                System.out.println("Gerçek kök yok");
        }
    }
}