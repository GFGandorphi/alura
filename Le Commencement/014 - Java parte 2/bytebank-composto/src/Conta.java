public class Conta { 
    private double saldo;
    // A partir do momento em que um atributo se torna privado,
    // isso quer dizer que ele não pode ser lido ou modificado,
    // a não ser na própria classe. Esse é o conceito principal
    // de encapsulamento.
    int agencia;
    int numero;
    Cliente titular;
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public void deposita(double valor) {
    	this.saldo += valor;
    }
    
    public boolean saca(double valor) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	}
    	return false;
    }
    
    public boolean transfere(double valor, Conta destino) {
    	if(this.saldo >= valor) {
    		this.saca(valor);
    		destino.deposita(valor);
    		return true;
    	}
    	return false;
    }
}