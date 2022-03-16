import java.util.Scanner;

public class Uri2780{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int D = teclado.nextInt();
        /*
        if (D <= 800){
            System.out.println("1");
        }
        else if (D <= 1400){
            System.out.println("2");
        }
        else{
            System.out.println("3");
        }
        */
        System.out.println( (D<=800)?"1": ((D<=1400)?"2":"3") );

        teclado.close();
    }
}