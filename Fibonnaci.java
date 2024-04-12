public class Fibonnaci {
  public static void main(String[] args) {
    int anterior = 0, atual = 1, termo = 1;
    System.out.println("trinta primeiros termo da sequencia de fibonacci");
    while (termo <= 30){
      System.out.print(atual+" ");
      termo++;
      atual = atual + anterior;
      anterior = atual - anterior;
    }
      
    
  }

}