
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta continha1 = new Conta();
		continha1.saldo = 200;
		System.out.println(continha1.saldo);
		// output: 200
		System.out.println(continha1);
		// output: endereço do objeto Conta que continha1 está referenciando
		
		Conta continha2 = new Conta();
		continha2.saldo = 50;
		System.out.println(continha2.saldo);
		// output: 50
		System.out.println(continha2);
		// output: endereço do objeto Conta que continha2 está referenciando
		
		continha2 = continha1;
		continha2.saldo += 100;
		
		System.out.println(continha1.saldo);
		// output: 300
		System.out.println(continha2.saldo);
		// output: 300
		
		// as variáveis continhaX são apenas referências do endereço do Objeto Conta
		
		if (continha1 == continha2) {
			System.out.println("estão referenciando o mesmo objeto");
		}
		
		System.out.println(continha1);
		System.out.println(continha2);
		//output: endereço do objeto Conta que continhaX está referenciando
		
		
	}
}
