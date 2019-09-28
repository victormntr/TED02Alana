package visão;

import javax.swing.JOptionPane;
import modelo.Funcionario;

public class Teste {
	
	public static void main(String[] args) {
	 
	Funcionario uso = new Funcionario();
	
	 String nome = JOptionPane.showInputDialog(null,"Digite o nome do Funcionário: ");
     String departamento = JOptionPane.showInputDialog(null,"Digite o departamento do Funcionário: ");
     String data_entrada = JOptionPane.showInputDialog(null,"Digite a data de entrada do Banco: ");
     String salarioS = JOptionPane.showInputDialog(null,"Digite seu Salário: ");
     String rg = JOptionPane.showInputDialog(null,"Digite o RG do Funcionário: ");
     String aumento = JOptionPane.showInputDialog(null,"Digite o aumento: ");
     
     
     double aumento1 = Double.parseDouble(aumento);
     double salario = Double.parseDouble(salarioS);
     double exibir = uso.recebeAumento(aumento1);
     double anual = uso.ganhoAnual();
     
     JOptionPane.showMessageDialog(null, "O ganho aumentado:" +exibir);
     JOptionPane.showMessageDialog(null, "O ganho anual é:" +anual);
     
		 }
    
     }

