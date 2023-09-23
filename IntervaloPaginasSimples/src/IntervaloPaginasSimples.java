import java.util.Scanner;

public class IntervaloPaginasSimples {
    public static void main(String[] args) {

        int inicio, fim;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira página: ");
        inicio = scan.nextInt();
        System.out.println("Digite a última página: ");
        fim = scan.nextInt();

        if(inicio %2==0){
            for(int i = inicio; i<= fim; i++){
                if(i%2==0){
                    System.out.print(i);
                    if(i != fim  && i != (fim - 1)){
                        System.out.print(", ");
                    }
                }
            }
            System.out.println("\n");

            for(int i = inicio; i<= fim; i++){
                if(i%2!=0){
                    System.out.print(i);
                    if(i != fim && i != (fim - 1)){
                        System.out.print(", ");
                    }
                }
            }

        } else if (inicio %2!=0) {
            for(int i = inicio; i<= fim; i++){
                if(i%2!=0){
                    System.out.print(i);
                    if(i != fim && i != (fim - 1)){
                        System.out.print(", ");
                    }
                }
            }
            System.out.println("\n");

            for(int i = inicio; i<= fim; i++){
                if(i%2==0){
                    System.out.print(i);
                    if(i != fim && i != (fim - 1)){
                        System.out.print(", ");
                    }
                }
            }
        }
    }
}
