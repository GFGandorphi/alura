
public class ContaPoupanca extends Conta {
	
	// construtores não são herdados
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	// quando fazendo public ContaCorrente() {}
	// é implicito o construtor da classe mãe:
	// public ContaCorrente() {
	//		super();
	// }

}
