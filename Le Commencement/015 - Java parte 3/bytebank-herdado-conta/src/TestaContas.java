public class TestaContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(100, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(101, 112);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
