
public class TestaCondicional {

	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade = 19;
		int pessoas = 0;
		
		if (idade >= 18) {
			System.out.println("Você é de maior");
		} else if (pessoas >= 1) {
			System.out.println("Você é de menor, mas com papis pode!");
		} else {
			System.out.println("Você é de menor, não pode!");
		}
		
		if (idade >= 18) System.out.println("Você é de maior messs");

		
		// boolean acompanhado = true;
		boolean acompanhado = pessoas >= 1;
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Você ta de boa!");
			System.out.println("Ta com alguém?  " + acompanhado);
		} else {
			System.out.println("Você é de menor, não pode!");
		}
		
		// Escopo está definido pelas chaves.
		// uma variável inicializada dentro de chaves só existe dentro delas.
		
	}
}
