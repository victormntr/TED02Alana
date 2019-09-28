package visão;
import javax.swing.JOptionPane;

public class Aluno {

	public static void main(String[] args) {
		
		String[] nome = new String[30]; 
		String[] endereco = new String[30];
		
		String[] matricula = new String[30];
		String[] cpf = new String[11] ; 

		int i;
		
		
		for(i=0;i<2;i++) {
			nome[i] = JOptionPane.showInputDialog(null,"Digite o nome: ");
			endereco[i] =JOptionPane.showInputDialog(null,"Digite o endereco: ");
			matricula[i] = JOptionPane.showInputDialog(null,"Digite o numero da matricula: ");
			cpf[i] = JOptionPane.showInputDialog(null,"Digite o CPF: ");
		}
		
		for(i=0;i<2;i++) {
			JOptionPane.showMessageDialog(null,"("+nome[i]+")("+endereco[i]+")("+matricula[i]+")("+cpf[i]+")");
		}
		
		
		
	}

}
