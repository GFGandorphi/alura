public abstract class Conta { 
    // abstract significa que a classe � conceitual,
	// n�o se pode criar "= new Conta();" (n�o se pode instanciar)
	// n�o � concreto, � abstrato (conceito)
	
	//-------------------------------
    //---- ATRIBUTOS
	
	private double saldo;
    // A partir do momento em que um atributo se torna privado,
    // isso quer dizer que ele n�o pode ser lido ou modificado,
    // a n�o ser na pr�pria classe. Esse � o conceito principal
    // de encapsulamento.
    
    private int agencia;
    private int numero;
    private Cliente titular;
    
    // O que queremos � que total fosse uma vari�vel que n�o ficasse 
    // em cada inst�ncia, mas em algum lugar da classe Conta, algo como
    // um atributo compartilhado e n�o de um objeto especificamente.
    // Para isso, existe a palavra-chave static. O static faz com que o
    // atributo seja da classe, e n�o mais do objeto. Com isso, todo o objeto
    // conta possui acesso a um �nico total.
    private static int total;
    
    //-------------------------------
    //---- CONSTRUTOR
    
    
    // O construtor � executado apenas uma vez no momento em que
    // constru�mos um objeto. N�o h� como executar duas vezes o
    // construtor para um mesmo objeto.
    public Conta( int agencia, int numero) { 
        Conta.total++;
        //System.out.println("o total de contas � " + Conta.total);
        
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("estou criando uma conta " + this.numero);
    }
    
    
    //-------------------------------
    //---- GETTERS AND SETTERS
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public int getNumero() { 
        return this.numero;
    }

    public void setNumero(int novoNumero) { 
        this.numero = novoNumero;
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
    
    public Cliente getTitular() {
		return this.titular;
	}
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    // m�todos est�ticos acessam apenas atributos est�ticos.
    public static int getTotal() {
		return Conta.total;
	}
    
    //-------------------------------
    //---- M�TODOS
    
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