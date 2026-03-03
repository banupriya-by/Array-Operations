import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int size = scanner.nextInt();

//        Initialization of an array
        int[] array = new int[size];

//        array value taken from user
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value : ");
            array[i] = scanner.nextInt();
        }

//        finding array length
        System.out.println("Length of an array : " + array.length);

//        can change the array value
        array[0] = 100;

//        Printing an array
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n-------------");

//        or printing array using for each loop
        for (int Array : array) {
            System.out.print(Array + " ");
        }


    }
}