
public class ContaCorrente extends Conta implements Tributavel {
	
	// construtores não são herdados
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	// quando fazendo public ContaCorrente() {}
	// é implicito o construtor da classe mãe:
	// public ContaCorrente() {
	//		super();
	// }
	
	//--------------------------------
	//--- Override metodo mae
	
	@Override // importante deixar o @Override - ele indica que é o mesmo método
	public boolean saca(double valor) {
        return super.saca(valor + 0.2);
        // chama-se a super.saca para evitar repetição de código
	}
	
	@Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }

}
