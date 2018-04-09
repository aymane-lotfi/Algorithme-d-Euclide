
import java.util.Scanner;
import java.io.FileWriter;
class Algo Euclide {
	public static void main (String[] args){
	   FileWriter writer = new FileWriter("test.csv");
	   Scanner sc = new Scanner(System.in);
	    System.out.println("- Calcul du PGCD -  made by 3 Lotfi Aymane ");
	    System.out.println("A=");
	    int a= sc.nextInt();
	    System.out.println("B=");
	    int b = sc.nextInt();
	 @override
	    System.out.println();
	 
	    final int nb1 = a;
	    final int nb2 = b;
	 
	    if ( a < b ){
	        a = nb2;
	        b = nb1;
	    }
	    int r = a%b;
	    int result = b;
	    while ( r !=0 ) {
	        result = r;
	        r = a%b;
	        a=b;
	        b=r;
	    }
	    System.out.print("PGCD(" + nb1 + ", " + nb2 + ") = " +result);
	}}