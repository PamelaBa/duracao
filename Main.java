import java.util.Locale;
impor java.util.Scanner; 

public class Main {

	public static void main(String[] args) {

    Locale.setDefault (Locale.US);
    Scanner sc = new Scanner(System.in);

    int inicio, fim, duracao;

    System.out.print("Inico do Jogo: ")
    inicio = sc.nextInt();
    System.out.print("Final do Jogo: ")
    fim = sc.nextInt();


    if (inicio < fim ){

      duracao = fim - inicio;
      
    }

    else {
      duracao = 24 - inicio + fim;
    }

    System.out.println("O JOGO DUROU " +duracao+ " HORA(S)");

    sc.close();




  }
}
