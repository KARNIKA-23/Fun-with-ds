/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
public class insertion
{
    public static void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            for (int j=i-1;j>=0;j--){
                if(arr[j]>key){
                    arr[j+1]=arr[j];
                    arr[j]=key;
                    
                }
            }
        }
    }
	public static void main(String[] args) {
		int[]arr={5,3,2,6,7};
		insertion(arr);
		System.out.println(Arrays.toString(arr));
		}
}
/*space complexity=differ
time complexity=O(n^2)*/