import java.util.Scanner;

public class Looping {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int quantidade = 0, numero;
    float media = 0;
    
    do{
      System.out.println("Digite um número: ");
      numero = sc.nextInt();
      quantidade ++;
      media += numero;
    }while(numero >= 0);

    System.out.println("A quantidade de números digitados é: " + quantidade);
    System.out.println("A média dos números digitados é: " + (media / quantidade));
    
    

  }
      
    
}