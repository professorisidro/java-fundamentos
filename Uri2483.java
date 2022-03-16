import java.util.Scanner;

public class Uri2483{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int I = teclado.nextInt();
        System.out.print("Feliz Nat");
        for (int cont = 0; cont < I ; cont++){
            System.out.print("a");
        }
        System.out.println("l!");
        teclado.close();
    }
}