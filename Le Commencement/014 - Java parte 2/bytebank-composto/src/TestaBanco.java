
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(); 
		cliente1.nome = "Paulo Silveira";
		cliente1.CPF = "222.222.222-22";
		cliente1.profissao = "programador";

        Conta continha1 = new Conta(); 
        continha1.deposita(100);

        continha1.titular = cliente1; 
        System.out.println(continha1.titular.nome);
        System.out.println(continha1.titular);
        System.out.println(cliente1);
        
        
        Conta continha2 = new Conta();
        continha2.titular = new Cliente();
        continha2.titular.nome = "Marcela";
        
        System.out.println(continha2.titular.nome);
        System.out.println(continha2.titular);
        
        
        // System.out.println(continha1.saldo);
        System.out.println(continha1.getSaldo());
	}
}
