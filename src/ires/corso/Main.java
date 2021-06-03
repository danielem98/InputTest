package ires.corso;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    System.out.println("Inserisci il primo numero: ");
	    int n1 = in.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        int n2 = in.nextInt();

        System.out.println("Inserisci il terzo numero: ");
        int n3 = in.nextInt();

        if(n1>n2){
            if(n1>n3){
                System.out.println("Il numero maggiore e: " + n1);
            }
            else{
                System.out.println("Il numero maggiore e: " + n1);
            }
        }
        else{
            if(n2>n3){
                System.out.println("Il numero maggiore e: " + n2);
            }
            else{
                System.out.println("Il numero maggiore e: " + n3);
            }
        }
    }
}
