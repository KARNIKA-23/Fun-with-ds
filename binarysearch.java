/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
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
        int arr[] = {3, 3, 4, 6, 9, 9};
        int target = 3;
        int result = binarysearch(arr, target);
        if (result != -1) {
            System.out.println("Found at index " + result);
        }
        else {
            System.out.println("Not found");
        }
    }
}
