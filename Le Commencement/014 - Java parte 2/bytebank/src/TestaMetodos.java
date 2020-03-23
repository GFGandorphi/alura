
public class TestaMetodos {
	
	public static void main(String[] args) {
		
		Conta continha1 = new Conta();
		continha1.saldo = 200;
		continha1.deposita(50);
		System.out.println(continha1.saldo);
		
		boolean deuBao = continha1.saca(20);
		System.out.println(continha1.saldo);
		System.out.println(deuBao);
		
		Conta continha2 = new Conta();
		continha2.saldo = 100;
		
		if(continha1.transfere(30, continha2)) {
			System.out.println("deu bao");
		} else {
			System.out.println("nao deu bao");
		}
		
		System.out.println(continha1.saldo);
		System.out.println(continha2.saldo);
	}
}
