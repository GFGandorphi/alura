
public class ContaPoupanca extends Conta {
	
	// construtores n�o s�o herdados
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	// quando fazendo public ContaCorrente() {}
	// � implicito o construtor da classe m�e:
	// public ContaCorrente() {
	//		super();
	// }

}
