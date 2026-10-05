/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*public class Selectionsort
{
	public static void main(String[] args) {
		for(int i=0;i<arr.length-1;i++){
		    int min=i;
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[j]<arr[min]){
		            min=j;
		        }
		        }
		        int temp=arr[i];
		        arr[i]=arr[min];
		        arr[min]=temp;
		}
		}
	}
	{5,3,2,1,6,7}*/
public class Selectionsort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 1, 6, 7};

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println("Sorted array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*space complexity=O(1) differ
time complexity=O(n^2)*/