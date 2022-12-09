import java.util.Arrays;
import java.util.Scanner;

// Задача 2: Реализуйте алгоритм сортировки пузырьком числового массива, 
//результат после каждой итерации запишите в лог-файл.


public class task2 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = myScan.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива через пробел: ");
        for (int i = 0; i < size; i++){
            int elements =  myScan.nextInt();
            arr[i] = elements; 
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < size; i++) {
            for (int j =0; j < size-1; j++) {
                if (arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }        
        }
        System.out.println(Arrays.toString(arr));
        myScan.close();
    }
}