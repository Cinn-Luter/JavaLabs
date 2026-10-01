// Чуносов Денис ИТ-1

import java.util.Scanner;

public double fraction (double x) {
    return x % 1;
}

public boolean isPositive (int x) {
    return x > 0;
}

public boolean is2Digits (int x) {
    return Integer.toString(Math.abs(x)).length() == 2;
}

public boolean isDivisor (int a, int b){
    return (b != 0 && a % b == 0) || (a != 0 && b % a == 0);
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
    if (x % 10 == 1 && x % 100 != 11){
        return x + " год";
    } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x % 100 != 12 && x % 100 != 13 && x % 100 != 14)) {
        return x + " года";
    } else return x + " лет";
}

public void printDays(String x) {
    switch (x) {
        case "понедельник":
            IO.println("понедельник");
        case "вторник":
            IO.println("вторник");
        case "среда":
            IO.println("среда");
        case "четверг":
            IO.println("четверг");
        case "пятница":
            IO.println("пятница");
        case "суббота":
            IO.println("суббота");
        case "воскресенье":
            IO.println("воскресенье");
            break;
        default:
            IO.println("это не день недели");
    }
}

public String reverseListNums (int x){
    String st = x + "";
    for (int i = x-1; i >= 0; i--){
        st += " " + i;
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

public void guessGame() {
    Scanner sc = new Scanner(System.in);
    int num = (int)(Math.random() * 10);
    int count = 0;
    int answer = -1;

    IO.print("Угадайте число от 0 до 9: ");
    while (answer != num) {
        if (!sc.hasNextInt()) {
            sc.next();
            IO.print("Это не число. Введите число от 0 до 9: ");
            continue;
        }
        answer = sc.nextInt();
        if (answer < 0 || answer > 9) {
            IO.print("Число должно быть от 0 до 9. Введите число от 0 до 9: ");
            continue;
        }
        count++;
        if (answer < num) {
            IO.print("Не угадали, загаданное число больше. Введите число от 0 до 9: ");
        } else if (answer > num) {
            IO.print("Не угадали, загаданное число меньше. Введите число от 0 до 9: ");
        }
    }

    IO.println("Вы угадали!");
    IO.println("Количество попыток: " + count);
}

public int findFirst (int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) {
            return i;
        }
    }
    return -1;
}

public int maxAbs (int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (Math.abs(arr[i]) > Math.abs(max)) {
            max = arr[i];
        }
    }
    return max;
}

public void reverse (int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
        int t = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = t;
    }
}

public int[] reverseBack (int[] arr) {
    int[] res = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        res[i] = arr[arr.length - 1 - i];
    }
    return res;
}

public int[] concat (int[] arr1, int[] arr2) {
    int[] res = new int[arr1.length + arr2.length];
    for (int i = 0; i < arr1.length; i++) {
        res[i] = arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
        res[arr1.length + i] = arr2[i];
    }
    return res;
}

// функция для вывода массивов
private String arrToString (int[] arr) {
    String st = "[";
    for (int i = 0; i < arr.length; i++) {
        st += arr[i];
        if (i < arr.length - 1) {
            st += ", ";
        }
    }
    return st + "]";
}

void main() {
    IO.println("=== Блок 1 ===");

    double t11 = 5.25;
    IO.println("1.1 Дробная часть. x = " + t11);
    IO.println("Ответ: " + fraction(t11));
    IO.println();

    int t14 = -5;
    IO.println("1.4 Положительность. x = " + t14);
    IO.println("Ответ: " + isPositive(t14));
    IO.println();

    int t15 = 32;
    IO.println("1.5 Двузначность. x = " + t15);
    IO.println("Ответ: " + is2Digits(t15));
    IO.println();

    int t18a = 3;
    int t18b = 6;
    IO.println("1.8 Делимость нацело. a = " + t18a + ", b = " + t18b);
    IO.println("Ответ: " + isDivisor(t18a, t18b));
    IO.println();

    int t19a = 3;
    int t19b = 3;
    int t19c = 3;
    IO.println("1.9 Равенство трёх чисел. a = " + t19a + ", b = " + t19b + ", c = " + t19c);
    IO.println("Ответ: " + isEqual(t19a, t19b, t19c));
    IO.println();

    IO.println("=== Блок 2 ===");

    int t23 = 15;
    IO.println("2.3 Делимость на 3 либо 5. x = " + t23);
    IO.println("Ответ: " + is35(t23));
    IO.println();

    int t25a = 8;
    int t25b = -1;
    int t25c = 4;
    IO.println("2.5 Максимум из трёх. x = " + t25a + ", y = " + t25b + ", z = " + t25c);
    IO.println("Ответ: " + max3(t25a, t25b, t25c));
    IO.println();

    int t27a = 5;
    int t27b = 7;
    IO.println("2.7 Сумма двух чисел. x = " + t27a + ", y = " + t27b);
    IO.println("Ответ: " + sum2(t27a, t27b));
    IO.println();

    int t28 = 31;
    IO.println("2.8 Возраст. x = " + t28);
    IO.println("Ответ: " + age(t28));
    IO.println();

    String t210 = "понедельник";
    IO.println("2.10 Дни недели. x = " + t210);
    IO.println("Ответ: ");
    printDays(t210);
    IO.println();

    IO.println("=== Блок 3 ===");

    int t32 = 5;
    IO.println("3.2 Числа в обратном порядке. x = " + t32);
    IO.println("Ответ: " + reverseListNums(t32));
    IO.println();

    int t34a = 2;
    int t34b = 5;
    IO.println("3.4 Возведение в степень. x = " + t34a + ", y = " + t34b);
    IO.println("Ответ: " + pow(t34a, t34b));
    IO.println();

    int t36 = 1111;
    IO.println("3.6 Одинаковые цифры. x = " + t36);
    IO.println("Ответ: " + equalNum(t36));
    IO.println();

    int t39 = 4;
    IO.println("3.9 Правый треугольник. x = " + t39);
    IO.println("Ответ: ");
    rightTriangle(t39);
    IO.println();

    IO.println("=== Блок 4 ===");

    int[] t41a = {1, 1, 3, 4, 1, 1, 5};
    int t41b = 2;
    IO.println("4.1 Первое вхождение. arr = " + arrToString(t41a) + ", x = " + t41b);
    IO.println("Ответ: " + findFirst(t41a, t41b));
    IO.println();

    int[] t43 = {1, -2, -7, 4, 2, 2, 5};
    IO.println("4.3 Максимум по модулю. arr = " + arrToString(t43));
    IO.println("Ответ: " + maxAbs(t43));
    IO.println();

    int[] t46 = {1, 2, 3, 4, 5};
    IO.println("4.6 Разворот массива. arr = " + arrToString(t46));
    reverse(t46);
    IO.println("Ответ: " + arrToString(t46));
    IO.println();

    int[] t47 = {1, 2, 3, 4, 5};
    IO.println("4.7 Новый развёрнутый массив. arr = " + arrToString(t47));
    IO.println("Ответ: " + arrToString(reverseBack(t47)));
    IO.println();

    int[] t48a = {1, 2, 3};
    int[] t48b = {7, 8, 9};
    IO.println("4.8 Склейка массивов. arr1 = " + arrToString(t48a) + ", arr2 = " + arrToString(t48b));
    IO.println("Ответ: " + arrToString(concat(t48a, t48b)));
    IO.println();

    IO.println("3.10 Угадайка");
    guessGame();
}
