package org.prog.Demo;

public class Session2Demo {
//     Делаем цикл от 1 до 100
    public static void main(String[] args) {
        int i = 0;
        while (i <100) {
            i = i + 1;
            System.out.println("i =" + i);
        }
    }
}

//    Выводим цифры которые делятся на 3,7,13
public static void main(String[] args) {
    int db3 = 0;
    int db7 = 0;
    int db13 = 0;
   for (int i = 1; i <=100; i = i + 1) {
       if (i % 3 == 0) {
           db3 = db3+1;
           System.out.println ("db3:" + db3);
       }
       if (i % 7 == 0) {
           db7 = db7+1;
           System.out.println ("db7:" + db7);
       }
       if (i % 13 == 0) {
           db13 = db13+1;
           System.out.println ("db13:" + db13);
       }
   }
}

    // Вариант 2 если нужно знать сумму чисел делящихся на 3,7,13
    public static void main(String[] args) {
        int db3 = 0;
        int db7 = 0;
        int db13 = 0;
        for (int i = 1; i <=100; i = i + 1) {
            if (i % 3 == 0) {
                db3 = db3 + 1;
            }
            if (i % 7 == 0) {
                db7 = db7 + 1;
            }
            if (i % 13 == 0) {
                db13 = db13 + 1;
            }
        }
        System.out.println("db3:" + db3);
        System.out.println("db7:" + db7);
        System.out.println("db13:" + db13);
    }
}