//Write a Java program to display. Expected Output
//25 != 39
//25 < 39
//25 <= 39
public class JavaTest14 {
    public static void main(String[] args){
        int a = 25;
        int b = 39;

        if ( a == b )
            System.out.printf( "%d == %d\n", a, b );
        if ( a != b )
            System.out.printf( "%d != %d\n", a, b );
        if ( a < b )
            System.out.printf( "%d < %d\n", a, b );
        if ( a > b )
            System.out.printf( "%d > %d\n", a, b );
        if ( a <= b )
            System.out.printf( "%d <= %d\n", a, b );
        if ( a >= b )
            System.out.printf( "%d >= %d\n", a, b );
    }

}
