/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*DSE-01*/
/*linear*/
public class Main
{
public static int linear(int[] arr,int target){
    for (int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
}
	public static void main(String[] args){
		int arr[]={9,8,7,10,5};
		int target=7;
		int result=linear(arr,target);
		if(result!=-1){
		    System.out.println("Found at"+ result
		    );
		}
		else{
		    System.out.println("Not found");
		}
	
	}
}
