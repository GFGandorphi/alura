
public class ContaCorrente extends Conta implements Tributavel {
	
	// construtores n�o s�o herdados
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	// quando fazendo public ContaCorrente() {}
	// � implicito o construtor da classe m�e:
	// public ContaCorrente() {
	//		super();
	// }
	
	//--------------------------------
	//--- Override metodo mae
	
	@Override // importante deixar o @Override - ele indica que � o mesmo m�todo
	public boolean saca(double valor) {
        return super.saca(valor + 0.2);
        // chama-se a super.saca para evitar repeti��o de c�digo
	}
	
	@Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }

}
