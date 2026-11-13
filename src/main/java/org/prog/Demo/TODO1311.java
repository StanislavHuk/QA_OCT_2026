package org.prog.Demo;

public class TODO1311 {
    /// For гном
//    public static void main(String[] args) {
//        int [] ints = {1, 50, 14, 2, 7, 18, 10, 3, -4, 5};
//        for (int i = 0; i < ints.length;){
//            if (i == 0) {
//                i++;
//            }
//            if (ints[i] < ints[i-1]){
//                int currVal = ints[i];
//                int prevVal = ints[i-1];
//                ints[i] = prevVal;
//                ints[i-1] = currVal;
//                i--;
//            }
//            else {
//                i++;
//            }
//        }
//        System.out.println("=========================");
//        for (int i = 0; i < ints.length; i++){
//            System.out.println(ints[i]);
//        }
//    }
//}

    /// While гном
//public static void main(String[] args) {
//    int [] ints = {1, 50, 14, 2, 7, 18, 10, 3, 5, -1};
//        int i = 0;
//        while (i < ints.length){
//        if (i==0 ) {
//            i++;
//        }
//            if (ints[i] < ints[i-1]){
//                int currVal = ints[i];
//                int prevVal = ints[i-1];
//                ints[i] = prevVal;
//                ints[i-1] = currVal;
//                i--;
//            }
//            else {
//                i++;
//            }
//        }
//        System.out.println("=========================");
//        for (int j = 0; j < ints.length; j++){
//            System.out.println(ints[j]);
//        }
//    }
//}

/// Пузырьком for for
//public static void main(String[] args) {
//    int [] ints = {1, 50, 14, 2, 7, 18, 10, 3, -4, 5};
//    for (int i = 0; i < ints.length; i++){
//        for (int j = 0; j < ints.length -1; j++){
//            if (ints[j] > ints[j+1]){
//                int currVal = ints[j];
//                int prevVal = ints[j+1];
//                ints[j+1] = ints[j];
//                ints[j] = prevVal;
//            }
//        }
//    }
//
//        System.out.println("=========================");
//        for (int k = 0; k < ints.length; k++) {
//            System.out.println(ints[k]);
//        }
//    }
//}

    /// Пузырьком while for
    public static void main(String[] args) {
        int[] ints = {1, 50, 14, 2, 7, 18, 10, 3, -4, 5};

        boolean isSorted = true;

        while (isSorted) {
            isSorted =  false;
            for (int i = 0; i < ints.length -1; i++) {
                if (ints[i] > ints[i + 1]) {
                    int currVal = ints[i];
                    int prevVal = ints[i + 1];
                    ints[i] = prevVal;
                    ints[i + 1] = currVal;
                    isSorted = true;
                }
            }
        }

            System.out.println("=========================");
            for (int k = 0; k < ints.length; k++) {
                System.out.println(ints[k]);
            }
    }
}