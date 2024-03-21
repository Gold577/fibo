public class Main {
    public static void main(String[] args) {   
int numero = 6;

if (verificarSequencia(numero)) {
System.out.println(numero+" pertence a sequencia.");
} else {           System.out.println(numero+" não pertence a sequencia");
        }
    }

public static boolean verificarSequencia(int numero) {
  int anterior = 0;
  int atual = 1;

      while (atual < numero) {
int prox = anterior + atual;
  anterior = atual;
  atual = prox;

  if (atual == numero) {
return true;
   }
}
return false;
    }
}
