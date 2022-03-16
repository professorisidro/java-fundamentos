import java.util.Scanner;
public class Uri1159{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;
        int valorTotal;
        int valorInicial;

        do{
            // leia X
            X = teclado.nextInt();
            if (X != 0){  // se X cumpre a regra de ser diferente de zero
                valorTotal = 0;
                if (X %2 != 0){  // o X digitado é par? se sim, não muda... se for impar, vai pro próximo que é o par
                    valorInicial = X+1;
                }
                else{
                    valorInicial = X;
                }
                for (int cont=1;cont<=5; cont++){  // conto 5x e vou somando...
                    valorTotal += valorInicial;
                    valorInicial+=2;
                }
                System.out.println(valorTotal);
            }
        } while (X != 0);
        teclado.close();
    }
}