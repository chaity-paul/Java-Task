import java.util.Scanner;

public class SecondLargestElement {
    public static void findSecondLargest(int[] arr){
        int len = arr.length;
        if(arr.length < 2){
            System.out.println("There is less than two elements in the array.");
        }
        else{
            //Initializing largest and secondLargest.
            int largest = arr[0];
            int secondLargest = arr[0];
            for(int i = 1; i < len; i++){
                if(arr[i] != largest){
                    secondLargest = arr[i];
                    break;
                }
            }
            if(largest == secondLargest){
                System.out.println("There is no second largest element..");
            }
            else {
                if (largest < secondLargest) {
                    largest ^= secondLargest;
                    secondLargest ^= largest;
                    largest ^= secondLargest;
                }
                //finding largest and secondLargest element from the array
                for(int i = 2; i < len; i++) {
                    if(arr[i] > largest) {
                        secondLargest = largest;
                        largest = arr[i];
                    }
                    else if(arr[i] > secondLargest && arr[i] != largest) {
                        secondLargest = arr[i];
                    }
                }
                System.out.println("Second largest element of the array is: " + secondLargest);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array (at least 2): ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        findSecondLargest(arr);
    }
}
