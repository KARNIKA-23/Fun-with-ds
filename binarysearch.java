/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class binarysearch {
    public static int binarysearch(int[] arr, int target) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target < arr[mid]) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int result=binarysearch(a,target);
        if(result!=-1){
            System.out.println("Found at index: "+ result);
        }
        else{
            System.out.println("Not found");
        }
        sc.close();       
             /*
        int arr[] = {3, 3, 4, 6, 9, 9};
        int target = 3;
        int result = binarysearch(arr, target);
        if (result != -1) {
            System.out.println("Found at index " + result);
        }
        else {
            System.out.println("Not found");
        }*/
    }
}
