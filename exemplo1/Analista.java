//package ExercicioPraticoII1;

/**
 *
 * @author fgmolina
 */
public class Analista { 
    private String Nome;
    private int Matricula;
    private float nota;
    private String nivel;
    private boolean ap;
    protected Double salario;
    protected Double adicional;
    
    public Analista(String Nome, int Matricula) {
        this.Nome = Nome;
        this.Matricula = Matricula;
        this.nivel = "Junior";
        this.salario = 0.0;
        this.adicional = 0.0;
        
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }


    public int getMatricula() {
        return Matricula;
    }

    public String getNivel() {
        return nivel;
    }

    public boolean getAprovacao() {
	return ap;
    }

    public void setNota(float Nota) {
	this.nota = Nota;
	if (nota < 6.0) {
	    ap = false;
	} else {
	    ap = true;
	}
    }

    public void setNotaExtra() {
	setNota(++this.nota);
    }

    public void setNotaExtra(float Nota) {
	Nota += this.nota;
	setNota(Nota);
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
        if (nivel.equals("Junior")){
            setSalario(1500.0);
        }else if(nivel.equals("Pleno")){
            setSalario(3000.0);
        }
        else if (nivel.equals("Senior")){
            setSalario(5000.0);
	}
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }
    
    public String SalarioTotal(){
       Double salarioTotal = salario+adicional;
       String texto;
        return texto=Double.toString(salarioTotal);
        
    }
    
    public String imprime(){
      return  Nome +"\n"+ Matricula+"\n"+ nivel+"\n"+ salario+"\n"+ adicional+"\n"+ SalarioTotal();
    }
    
    
}
