import java.lang.*;
import java.io.*;

public class main {

    public static void main(String args[]) throws IOException {
	String Nome = new String();
	int Matricula = 0;

	System.out.println("Estoy aqui.");
	
	Analista a = new Analista("Joao",123);
	
	//Nome = a.getNome();
	System.out.println("Nome: "+a.getNome());
	System.out.println("Matricula: "+a.getMatricula());
	System.out.println("Nome: "+Nome+" contem elemento : "+a.getNome().compareTo(Nome));

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Entre com o nome do usuario:");
	Nome = br.readLine();
	System.out.println("Nome2: "+Nome+" contem elemento : "+a.getNome().compareTo(Nome));
	
	a.setNota((float)5.9);
	
	System.out.println("Nome3: "+Nome+" contem elemento : "+a.getNome().equals(Nome));
	
	System.out.println("O usuario: "+a.getNome()+ " Está aprovado? "+a.getAprovacao());

	a.setNotaExtra();
	System.out.println("Nota extra: O usuario: "+a.getNome()+ " Está aprovado? "+a.getAprovacao());

	System.out.println("Entre com o valor da nota do usuario: "+a.getNome());

	a.setNota(Float.parseFloat(br.readLine()));

	System.out.println("O usuario: "+a.getNome()+ " Está aprovado? "+a.getAprovacao());

	a.adicional = 1.0;

	if ((a.salario <= 0.0) || (a.adicional <= 0.0))
	    System.out.println("Sinto muito");
	else 
	    System.out.println("Valor de Salario: "+a.salario+" Adicional: "+a.adicional);

	Bitlogico b = new Bitlogico();

	System.out.println("Tamanho do Vetor binary:");
	b.printNumber();

	System.out.println("Qual o indice do numero binario :"+b.checkIndex("0001"));
   }

}