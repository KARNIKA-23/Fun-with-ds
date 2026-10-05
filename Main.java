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
		/*using scanner*/
		Scanner sc	=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int result=linear(a,target);
		if(result!=-1){
		    System.out.println("Found at index: "+ result);
		}
		else{
		    System.out.println("Not found");	
		}
		sc.close();
		/*
		int arr[]={9,8,7,10,5};
		int target=7;
		int result=linear(arr,target);
		if(result!=-1){
		    System.out.println("Found at"+ result
		    );
		}
		else{
		    System.out.println("Not found");
		}*/
	
	}
}
