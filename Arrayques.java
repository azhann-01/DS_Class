/*
import java.sql.Time;
import java.util.Scanner;

public class Arrayques {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NUMBER OF ELEMENTS:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter element:");
            arr[i]=sc.nextInt();

        }
        System.out.print("THE ENTERED ELEMENTS ARE:"+" ");
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
*/
// WAP to insert an element into an array as per the position

/*    int[] arr=new int[n+1];
    for(int i=0;i<n;i++){
        System.out.println("ENTER THE ELEMENTS");
        arr[i]=sc.nextInt();
    }

    System.out.println("ENTER THE ELEMENT TO BE ADDED:");
    int element = sc.nextInt();

    System.out.println("ENTER THE POSITION TO BE ADDED:");
    int pos = sc.nextInt(); 

    if(pos<0||pos>n+1){
        System.out.println("invalid position");
    }else{
        for(int j=n;j>=pos;j--){
            arr[j]=arr[j-1];
        }

        arr[pos-1]=element;

        System.out.println("THE NEW ARRAY IS:");
        for(int k=0;k>=n;k++){
            System.out.print(arr[k]+" ");
        }

    }
*/


//To delete an element from an array as per the position
 
/*  int[] arr = new int[n];

    System.out.println("Enter array elements:");
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }

    System.out.println("Enter the position to be deleted:");
    int pos = sc.nextInt();

    if(pos < 1 || pos > n){
        System.out.println("Invalid position");
    }
    else{
        for(int j = pos - 1; j < n - 1; j++){
            arr[j] = arr[j + 1];
        }

        System.out.println("The new array is:");
        for(int k = 0; k < n - 1; k++){
            System.out.print(arr[k] + " ");
        }
    }


 

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prime numbers in the array are:");

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= num / 2; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        } 

        sc.close();
    }
}
*/