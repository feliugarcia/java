package ExercicioPraticoII1;

import java.util.HashMap;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 * Interface para leitura e escrita de dados pelo teclado via 
 *
 * @author fgmolina
 * @version 3.0
 */
public class JPromptPane extends JOptionPane {
    
    private static class TabelaTipos {
        
        public HashMap<String,Integer> tabela = new HashMap<>();
        
        public TabelaTipos() {
            tabela.put("x", ERROR_MESSAGE); 
            tabela.put("i", INFORMATION_MESSAGE); 
            tabela.put("?", QUESTION_MESSAGE);
            tabela.put("!", WARNING_MESSAGE);
            tabela.put("", PLAIN_MESSAGE);
        }
        
        public Integer retornaTipo(String tipo) {
            
            return tabela.get(tipo);
        }
    }
    
    private static final TabelaTipos tabela = new TabelaTipos();
    
    private static final String erroSemDado = "Nenhum dado informado!";
    private static final String erroNaoReal = "O dado informado não é número real!";
    private static final String erroNaoIntg = "O dado informado não é número inteiro!";
    
    /**
     * @param titulo
     * @param prompt
     * @param tipo
     */
    public static void print(String titulo, String prompt, String tipo) {

        showMessageDialog(null, prompt, titulo, tabela.retornaTipo(tipo));
    }

    /**
     * @param titulo
     * @param prompt
     */
    public static void print(String titulo, String prompt) {

        print(titulo, prompt, "i");
    }

    /**
     * Métodos para leitura a partir do teclado em janelas 
     * 
     * @param prompt
     * @return 
     */
    public static Integer readInt(String prompt) {

        return readInt(prompt, null, "?");
    }

    public static Integer readInt(String prompt, String titulo, String tipo) {

        String entrada;
        Boolean existeErro;
        Integer numeroInt = 0;

        do {
            existeErro = false;
            try {
                entrada = showInputDialog(null, prompt, titulo, tabela.retornaTipo(tipo)).trim();
                numeroInt = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                print(erroNaoIntg, "ERRO", "x");
                existeErro = true;
            } catch (NullPointerException e) {
                print(erroSemDado, "ERRO", "x");
                existeErro = true;
            }
        } while (existeErro);
        return numeroInt;
    }

    public static Double readDouble(String prompt) {

        String entrada;
        Boolean existeErro;
        Double numeroDouble = 0.0;

        do {
            existeErro = false;
            try {
                entrada = showInputDialog(prompt).trim();
                numeroDouble = Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                showMessageDialog(null, erroNaoReal, "ERRO", ERROR_MESSAGE);
                existeErro = true;
            } catch (NullPointerException e) {
                showMessageDialog(null, erroSemDado, "ERRO", ERROR_MESSAGE);
                existeErro = true;
            }
        } while (existeErro);
        return numeroDouble;
    }

    public static Double readDouble(String prompt, String titulo, int tipo) {

        String entrada;
        Boolean existeErro;
        Double numeroDouble = 0.0;

        do {
            existeErro = false;
            try {
                entrada = showInputDialog(null, prompt, titulo, tipo).trim();
                numeroDouble = Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                showMessageDialog(null, erroNaoReal, "ERRO", ERROR_MESSAGE);
                existeErro = true;
            } catch (NullPointerException e) {
                showMessageDialog(null, erroSemDado, "ERRO", ERROR_MESSAGE);
                existeErro = true;
            }
        } while (existeErro);
        return numeroDouble;
    }

    public static String readString(String prompt) {

        String entrada = new String();
        Boolean existeErro;

        do {
            existeErro = false;
            try {
                entrada = showInputDialog(prompt).trim();
            } catch (NullPointerException e) {
                showMessageDialog(null, erroSemDado, "ERRO", ERROR_MESSAGE);
                existeErro = true;
            }
        } while (existeErro);
        return entrada;
    }

    public static String readString(String prompt, String titulo, int tipo) {

        String entrada = new String();
        Boolean existeErro;

        do {
            existeErro = false;
            try {
                entrada = showInputDialog(null, prompt, titulo, tipo).trim();
            } catch (NullPointerException e) {
                showMessageDialog(null, erroSemDado, "ERRO", ERROR_MESSAGE);
                existeErro = true;
            }
        } while (existeErro);
        return entrada;
    }

    public static Character readChar(String prompt) {

        String entrada = new String();
        Boolean existeErro;

        do {
            existeErro = false;
            try {
                entrada = showInputDialog(prompt).trim();
            } catch (NullPointerException e) {
                showMessageDialog(null, erroSemDado, "ERRO", ERROR_MESSAGE);
                existeErro = true;
            }
        } while (existeErro);
        return entrada.charAt(0);
    }

    public static Character readChar(String prompt, String titulo, int tipo) {

        String entrada = new String();
        Boolean existeErro;

        do {
            existeErro = false;
            try {
                entrada = showInputDialog(null, prompt, titulo, tipo).trim();
            } catch (NullPointerException e) {
                showMessageDialog(null, erroSemDado, "ERRO", ERROR_MESSAGE);
                existeErro = true;
            }
        } while (existeErro);
        return entrada.charAt(0);
    }
}