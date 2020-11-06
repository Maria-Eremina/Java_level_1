package lesson_2;

public class class_04_11 {
    public static void main(String[] args) {
        System.out.println("education_class_1");
        invertArray();
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        method2();
        method3(a);
        System.out.println("Максимум в массиве: " + arr_max(a) );
        System.out.println("Минимум в массиве: " + arr_min(a) );

    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arr[i] = 1;
                System.out.println(arr[i]);
                continue;
            }
            if(arr[i] == 1) {
                arr[i] = 0;
                System.out.println(arr[i]);
            }
        }

    }

    public static void method2() {
        int[] b = new int[8];
        int x = 1;
        for (int i = 0; i < b.length; i++) {
            b[i] = x;
            x+=3;
            System.out.println(b[i]);
        }
    }

    public static void method3(int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 6) {
                b[i] *= 2;
            }
            System.out.println(b[i]);
        }

    }

    public static int arr_max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
        }

    public static int arr_min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }
}