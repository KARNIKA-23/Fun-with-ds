/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A {
    int a;
    int b;

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class constructorprivate {
    public static void main(String[] args) {

        A obj = new A(20, 30);

        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}