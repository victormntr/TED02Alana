package visao;

import javax.swing.JOptionPane;
import modelo.Lampada;
import modelo.LampadaTresEstados;

public class Teste {
    
    Lampada[] uso = new Lampada[1];

  
    public static void main(String[] args) {
        
        String marca; 
        String pre�o;
		int potencia;

             
        marca = JOptionPane.showInputDialog(null,"Digite o Modelo da L�mpada: ");
        pre�o= JOptionPane.showInputDialog(null,"Digite o Pre�o: ");
        boolean ligada = Boolean.parseBoolean((JOptionPane.showInputDialog("Ligar Lampada ?")));
        
        JOptionPane.showMessageDialog(null,"O Resultado:  ("+marca+")("+pre�o+")");
        
    }
    
}