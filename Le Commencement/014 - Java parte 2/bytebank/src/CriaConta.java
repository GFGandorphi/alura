
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta continha1 = new Conta();
		continha1.saldo = 200;
		System.out.println(continha1.saldo);
		// output: 200
		System.out.println(continha1);
		// output: endere�o do objeto Conta que continha1 est� referenciando
		
		Conta continha2 = new Conta();
		continha2.saldo = 50;
		System.out.println(continha2.saldo);
		// output: 50
		System.out.println(continha2);
		// output: endere�o do objeto Conta que continha2 est� referenciando
		
		continha2 = continha1;
		continha2.saldo += 100;
		
		System.out.println(continha1.saldo);
		// output: 300
		System.out.println(continha2.saldo);
		// output: 300
		
		// as vari�veis continhaX s�o apenas refer�ncias do endere�o do Objeto Conta
		
		if (continha1 == continha2) {
			System.out.println("est�o referenciando o mesmo objeto");
		}
		
		System.out.println(continha1);
		System.out.println(continha2);
		//output: endere�o do objeto Conta que continhaX est� referenciando
		
		
	}
}
