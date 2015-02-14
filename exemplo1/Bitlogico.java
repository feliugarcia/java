//package ExercicioPraticoII1;

/**
 *
 * @author fgmolina
 * @Agradecimento Moises
 */
public class Bitlogico { 

/*
 * Variaveis do sistema.
 */
String binary[] = {
    "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
    "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
};


  /*
   * Construtor sem parametros
   */

    public Bitlogico() {
	

    int a = 3; // 0 + 2 + 1 or 0011 in binary
    int b = 6; // 4 + 2 + 0 or 0110 in binary
    int c = a | b;
    int d = a & b;
    int e = a ^ b;
    int f = (~a & b) | (a & ~b);
    int g = ~a & 0x0f;

    System.out.println("        a = " + binary[a]);
    System.out.println("        b = " + binary[b]);
    System.out.println("      a|b = " + binary[b]);
    System.out.println("      a&b = " + binary[d]);
    System.out.println("      a^b = " + binary[e]);
    System.out.println("~a&b|a&~b = " + binary[f]);
    System.out.println("       ~a = " + binary[g]);

    }

  /*
   * Métodos
   */

    private int binaryLength() {
	int i=0;
	do {
	    i++;
	}while(binary[i] != "1111");
	i++;
	return i;
    }

   public void printNumber() {
       int i=0;
       int len = binaryLength();
       for (i=0; i < len ; i++) {
	   System.out.println("Imprime os numeros binarios: "+binary[i]);	   
       }
   }

    public int checkIndex(String number) {
	int i = 0;
	
	while (binary[i] != "1111" && !binary[i].equals(number)) {
	    System.out.println("Imprime os numeros binarios: "+binary[i]+" Valor dados "+number+" Comparacao: "+binary[i].equals(number));	   
	    i++;
	}
	return i;
    }

}
