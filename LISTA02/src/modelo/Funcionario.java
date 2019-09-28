package modelo;

public class Funcionario {
    
    private String nome;
    private double salario;
    private String setor;
    private int rg;
    private String entrada;
    
 public Funcionario(){
     this.nome = nome;
     this.setor = setor;
     this.entrada= entrada;
     this.salario = salario;
     this.rg = rg;
 	 }
   
    // metodos
    
    public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public String getSetor() {
	return setor;
}

public void setSetor(String setor) {
	this.setor = setor;
}

public int getRg() {
	return rg;
}

public void setRg(int rg) {
	this.rg = rg;
}

public String getEntrada() {
	return entrada;
}

public void setEntrada(String entrada) {
	this.entrada = entrada;
}

	public double recebeAumento(double aumento) {
    	return this.salario+aumento;
    	
    }
    
    public double ganhoAnual() {
    	return (this.salario*12);
    }
    
    
}
    


