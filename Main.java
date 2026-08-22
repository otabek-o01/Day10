import java.util.Scanner;

public class Main {

    // Task1  { Str }
    static String Str() {
        System.out.print(" Enter Number :  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = " 2 ";
        if (8 > str.length()) {
            System.out.print(" ACADEMY ");
        } else {
            System.out.print(" PDP ");
        }
        return str2;
    }

    // Task2 { }
    static String result() {
        System.out.print(" Enter Number :  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String st = "";
        // Harflardi ichidan sondi target qilyapti yani sondi sug'irib olyapti
        String str2 = str.replaceAll("[^0-9]", "");
        // sum = 0 tenglayapman
        int sum = 0;
        // numbers ichidagi raqamdi bittalab ko'ramiz
        for (int i = 0; i < str2.length(); i++) {
            // char -> raqamga aylantiramiz sumga qo'shamiz
            sum += str2.charAt(i) - '0';
        }
        System.out.print(sum);
        return st;
    }

    //Task3 { }
    static int Kabisa() {
        System.out.print(" Enter Number :  ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (2026 % 400 == 0 || (2026 % 4 == 0 && 2026 % 100 != 0)) {
            System.out.print(" True ");
        } else {
            System.out.print(" False ");
        }
        return num;
    }

    // Task4 { }
    static String Task4() {
        System.out.print(" Enter String :  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int number = 0;
        int small = 0;
        int big = 0;
        // Har bir belgini bittalab ko'ramiz
        for (int i = 0; i < str.length(); i++) {
            // Agar son bo'lsa
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                number++;
            }
            // Agar kichik harf bo'lsa
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                small++;
            }
            // Agar katta harf bo'lsa
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                big++;
            }
        }
        System.out.println(" Raqamlar : " + number);
        System.out.println(" Kichik harflar : " + small);
        System.out.println(" Katta harflar : " + big);
        return "";
    }


    // Task5 { }
    static String Task5() {
        System.out.print(" Enter Number :  ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        // 1 dan num gacha bo'luvchilarni tekshiramiz
        for (int i = 1; i < num; i++) {
            // Agar num i ga bo'linsa
            if (num % i == 0) {
                sum += i;
            }
        }
        // Bo'luvchiar yig'indisini num bilan solishtiramiz
        if (sum == num) {
            System.out.print(" True ");
        } else {
            System.out.print(" False ");
        }
        return "";
    }


    // Task6 { }
    static String Task6() {
        System.out.print(" Enter String :  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        // Har bir belgini ko'ramiz
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Katta harf bo'lsa kichik qilamiz
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            }
            // Kichik harf bo'lsa katta qilamiz
            else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            }
            // Harf bo'lmasa o'zini qo'shamiz
            else {
                result += ch;
            }
        }
        System.out.print(result);
        return result;
    }


    // Task7 { }
    static String Task7() {
        System.out.print(" Enter Password :  ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean small = false;
        boolean star = false;
        boolean number = false;
        // Password ichidagi belgilarni ko'ramiz
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            // Kichik harf
            if (ch >= 'a' && ch <= 'z') {
                small = true;
            }
            // *
            if (ch == '*') {
                star = true;
            }
            // Son
            if (ch >= '0' && ch <= '9') {
                number = true;
            }
        }
        // Hamma shartni tekshiramiz
        if (password.length() >= 8 && small && star && number) {
            System.out.print(" True ");
        } else {
            System.out.print(" False ");
        }
        return "";
    }


    // Task8 { }
    static String Task8() {
        System.out.print(" Enter String :  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        // Har bir belgini ko'ramiz
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Katta harf bo'lsa * qo'yamiz
            if (ch >= 'A' && ch <= 'Z') {
                result += "*";
            } else {
                result += ch;
            }
        }
        System.out.print(result);

        return result;
    }


    // Task9 { }
    static String Task9() {
        System.out.print(" Enter a :  ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.print(" Enter b :  ");
        double b = sc.nextDouble();
        // Gipotenuzani topamiz
        double c = Math.sqrt(a * a + b * b);
        // Yuzani topamiz
        double S = (a * b) / 2;
        // Perimetrni topamiz
        double P = a + b + c;
        System.out.println(" Gipotenuza : " + c);
        System.out.println(" Yuza : " + S);
        System.out.println(" Perimetr : " + P);

        return "";
    }


    // Task10 { }
    static String Task10() {
        System.out.print(" Enter String :  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        // Har bir belgini ko'ramiz
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Katta yoki kichik harf bo'lsa
            if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z')) {
                count++;
            }
        }
        System.out.print(count);
        return "";
    }


    // Task11 { }
    static String Task11() {
        System.out.print(" Enter Number :  ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = false;
        // 1 dan boshlab kvadratlarni tekshiramiz
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                result = true;
            }
        }
        if (result) {
            System.out.print(" True ");
        } else {
            System.out.print(" False ");
        }
        return "";
    }


    // Task12 { }
    static String Task12() {
        System.out.print(" Enter S :  ");
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        System.out.print(" Enter N :  ");
        int N = sc.nextInt();
        int result = 1;
        // S ni N marta ko'paytiramiz
        for (int i = 0; i < N; i++) {
            result *= S;
        }
        System.out.print(result);
        return "";
    }


    // Task13 { }
    static String Task13() {
        System.out.print(" Enter n :  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(" Enter k :  ");
        int k = sc.nextInt();
        int butun = 0;
        int qoldiq = n;
        // Ayirish orqali bo'lamiz
        while (qoldiq >= k) {
            qoldiq -= k;
            butun++;
        }
        System.out.println(" Butun qism : " + butun);
        System.out.println(" Qoldiq : " + qoldiq);

        return "";
    }


    // Task14 { }
    static String Task14() {
        System.out.print(" Enter String :  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        // Oxiridan boshlab olamiz
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.print(result);
        return result;
    }


    // Task15 { }
    static String Task15() {
        System.out.print(" Enter String :  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int big = 0;
        int small = 0;
        // Harflarni sanaymiz
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Katta harf
            if (ch >= 'A' && ch <= 'Z') {
                big++;
            }
            // Kichik harf
            if (ch >= 'a' && ch <= 'z') {
                small++;
            }
        }
        // Katta harflar ko'p bo'lsa
        if (big > small) {
            System.out.print("PDP");
        } else {
            System.out.print("ACADEMY");
        }
        return "";
    }


    // Task16 { }
    static String Task16() {
        System.out.print(" Enter a :  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(" Enter b :  ");
        int b = sc.nextInt();
        // a yoki b 7 ga teng
        // yoki yig'indisi 7
        // yoki farqi 7
        if (a == 7 ||
                b == 7 ||
                a + b == 7 ||
                a - b == 7 ||
                b - a == 7) {

            System.out.print("true");
        } else {
            System.out.print("false");
        }
        return "";
    }


    // Task17 { }
    static String Task17() {
        System.out.print(" Enter String :  ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        // Har bir belgini ko'ramiz
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Son bo'lmasa chiqaramiz
            if (!(ch >= '0' && ch <= '9')) {
                result += ch;
            }
        }
        System.out.print(result);
        return result;
    }
}
