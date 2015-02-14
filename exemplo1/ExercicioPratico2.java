package ExercicioPraticoII1;

/**
 *
 * @author fgmolina
 * @Agradecimento a Moises
 */
public class ExercicioPratico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //P1
        Analista p1 = new Analista ("José", "11321066");
        p1.setNivel("Junior");
        p1.setAdicional(500.0);
        JPromptPane.print("Analista",p1.imprime());
        
        //P2
        Analista p2 = new Analista ("João", "11327775");
        p2.setNivel("Junior");
        p2.setAdicional(300.0);
        JPromptPane.print("Analista",p2.imprime());
        
        
        p1.setNivel("Pleno");
        JPromptPane.print("Promoção", p1.getNome()+" promovido para " + p1.getNivel());
        JPromptPane.print("Analista",p1.imprime()+"\n\n"+ p2.imprime());
        
        p1 = p2;
        //p1.setNivel(p2.getNivel());
        //p1.setAdicional(p2.getAdicional());
        JPromptPane.print("Analista",p1.imprime());
        JPromptPane.print("O que ocorre?",p1.getNome()+ " recebe nivel, salario e adicional de "+ p2.getNome()+ ". Ou seja, ele se f***");
        
        p1.setNivel("Senior");
        JPromptPane.print("Promoção", p1.getNome()+" promovido para " + p1.getNivel());
        JPromptPane.print("uuuhhhu", p1.getNome()+ " diz: Sou foda");
        JPromptPane.print("Analista",p1.imprime()+"\n\n"+ p2.imprime());
        JPromptPane.print("O que ocorre?",p1.getNome()+ " passa a ser Senior e rico. "+ p2.getNome()+ " continua Junior e pobre ");
        
        
        
        
                
    }
    
}
