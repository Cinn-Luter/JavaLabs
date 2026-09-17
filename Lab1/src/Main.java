// Чуносов Денис ИТ-1

import java.util.Scanner;

public double Fraction (double x) {
    return x % 1;
}

public boolean isPositive (int x) {
    return x >= 0;
}

public boolean is2Digits (int x) {
    return Integer.toString(Math.abs(x)).length() == 2;
}

public boolean isDivisor (int a, int b){
    return a % b == 0 || b % a == 0;
}

public boolean isEqual(int a, int b, int c){
    return a == b && a == c;
}

public boolean is35 (int x){
    if (x % 3 == 0 && x % 5 == 0){
        return false;
    } else return x % 3 == 0 || x % 5 == 0;
}

public int max3 (int x, int y, int z){
    int max = x;
    if (y > max){
        max = y;
    }
    if (z > max){
        max = z;
    }
    return max;
}

public int sum2 (int x, int y){
    int sum = x+y;
    if (10 <= sum && sum <= 19){
        return 20;
    } else return sum;
}

public String age (int x){
    if (x % 10 == 1 && x != 11){
        return x + " год";
    } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x != 12 && x != 13 && x != 14)) {
        return x + " года";
    } else return x + " лет";
}

public void printDays(String x) {
    String[] days = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
    int stInd = -1;

    switch (x) {
        case "понедельник":
            stInd = 0;
            break;
        case "вторник":
            stInd = 1;
            break;
        case "среда":
            stInd = 2;
            break;
        case "четверг":
            stInd = 3;
            break;
        case "пятница":
            stInd = 4;
            break;
        case "суббота":
            stInd = 5;
            break;
        case "воскресенье":
            stInd = 6;
            break;
        default:
            IO.println("это не день недели");
            return;
    }

    for (int i = stInd; i < days.length; i++) {
        IO.print(days[i] + " ");
    }
}

public String reverseListNums (int x){
    String st = Integer.toString(x) + " ";
    for (int i = x-1; i >= 0; i--){
        st += Integer.toString(i) + " ";
    }
    return st;
}

public int pow (int x, int y){
    int power = 1;
    for (int i = 0; i < y; i++){
        power = power * x;
    }
    return power;
}

public boolean equalNum (int x){
    int last = x % 10;
    x = x / 10;
    while (x != 0) {
        if (x % 10 != last){
            return false;
        }
        x = x / 10;
    }
    return true;
}

public void rightTriangle (int x) {
    for (int i = 1; i <= x; i++) {
        for (int j = 0; j < x - i; j++) {
            IO.print(" ");
        }
        for (int j = 0; j < i; j++) {
            IO.print("*");
        }
        IO.println();
    }
}

void main() {
    Scanner sc = new Scanner(System.in);


    //IO.print("Введите число для оставления дробной части (1.1): ");
    //double t11 = sc.nextDouble();
    //IO.println("Ответ: " + Fraction(t11));
    //IO.print("Введите число для определения положительности (1.4): ");
    //int t14 = sc.nextInt();
    //IO.println("Ответ: " + isPositive(t14));
    //IO.print("Введите число для определения двузначности (1.5): ");
    //int t15 = sc.nextInt();
    //IO.println("Ответ: " + is2Digits(t15));
    //IO.print("Введите первое число для определения делимости нацело (1.8): ");
    //int t18_1 = sc.nextInt();
//    IO.print("Введите второе число для определения делимости нацело (1.8): ");
//    int t18_2 = sc.nextInt();
//    IO.println("Ответ: " + isDivisor(t18_1, t18_2));
//    IO.print("Введите первое число для определения равенства (1.9): ");
//    int t19_1 = sc.nextInt();
//    IO.print("Введите второе число для определения равенства (1.9): ");
//    int t19_2 = sc.nextInt();
//    IO.print("Введите третье число для определения равенства (1.9): ");
//    int t19_3 = sc.nextInt();
//    IO.println("Ответ: " + isEqual(t19_1, t19_2, t19_3));
//    IO.print("Введите число для определения делимости на 3 либо 5 (2.3): ");
//    int t23 = sc.nextInt();
//    IO.println("Ответ: " + is35(t23));
//    IO.print("Введите первое число для определения максимального (2.5): ");
//    int t25_1 = sc.nextInt();
//    IO.print("Введите второе число для определения максимального (2.5): ");
//    int t25_2 = sc.nextInt();
//    IO.print("Введите третье число для определения максимального (2.5): ");
//    int t25_3 = sc.nextInt();
//    IO.println("Ответ: " + max3(t25_1, t25_2, t25_3));
//    IO.print("Введите первое число для определения суммы и вхождения в диапазон (2.7): ");
//    int t27_1 = sc.nextInt();
//    IO.print("Введите второе число для определения суммы и вхождения в диапазон (2.7): ");
//    int t27_2 = sc.nextInt();
//    IO.println("Ответ: " + sum2(t27_1, t27_2));
//    IO.print("Введите число для вывода возраста (2.8): ");
//    int t28 = sc.nextInt();
//    IO.println("Ответ: " + age(t28));
//    IO.print("Введите день недели для вывода его и последующих (2.10): ");
//    String t210 = sc.nextLine();
//    IO.print("Ответ: ");
//    printDays(t210);
//    IO.print("Введите число для вывода предыдущих до нуля (3.2): ");
//    int t32 = sc.nextInt();
//    IO.print("Ответ: " + reverseListNums(t32));
//    IO.print("Введите число для возведения в степень (3.4): ");
//    int t34_1 = sc.nextInt();
//    IO.print("Введите степень для возведения (3.4): ");
//    int t34_2 = sc.nextInt();
//    IO.print("Ответ: " + pow(t34_1, t34_2));
//    IO.print("Введите число для определения равенства цифр (3.6): ");
//    int t36 = sc.nextInt();
//    IO.print("Ответ: " + equalNum(t36));
    IO.print("Введите число для построения треугольника (3.9): ");
    int t39 = sc.nextInt();
    IO.println("Ответ: ");
    rightTriangle(t39);
}
