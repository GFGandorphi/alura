public abstract class Conta { 
    // abstract significa que a classe é conceitual,
	// não se pode criar "= new Conta();" (não se pode instanciar)
	// não é concreto, é abstrato (conceito)
	
	//-------------------------------
    //---- ATRIBUTOS
	
	private double saldo;
    // A partir do momento em que um atributo se torna privado,
    // isso quer dizer que ele não pode ser lido ou modificado,
    // a não ser na própria classe. Esse é o conceito principal
    // de encapsulamento.
    
    private int agencia;
    private int numero;
    private Cliente titular;
    
    // O que queremos é que total fosse uma variável que não ficasse 
    // em cada instância, mas em algum lugar da classe Conta, algo como
    // um atributo compartilhado e não de um objeto especificamente.
    // Para isso, existe a palavra-chave static. O static faz com que o
    // atributo seja da classe, e não mais do objeto. Com isso, todo o objeto
    // conta possui acesso a um único total.
    private static int total;
    
    //-------------------------------
    //---- CONSTRUTOR
    
    
    // O construtor é executado apenas uma vez no momento em que
    // construímos um objeto. Não há como executar duas vezes o
    // construtor para um mesmo objeto.
    public Conta( int agencia, int numero) { 
        Conta.total++;
        //System.out.println("o total de contas é " + Conta.total);
        
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
    
    // métodos estáticos acessam apenas atributos estáticos.
    public static int getTotal() {
		return Conta.total;
	}
    
    //-------------------------------
    //---- MÉTODOS
    
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