
public class TestaCondicional {

	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade = 19;
		int pessoas = 0;
		
		if (idade >= 18) {
			System.out.println("Voc� � de maior");
		} else if (pessoas >= 1) {
			System.out.println("Voc� � de menor, mas com papis pode!");
		} else {
			System.out.println("Voc� � de menor, n�o pode!");
		}
		
		if (idade >= 18) System.out.println("Voc� � de maior messs");

		
		// boolean acompanhado = true;
		boolean acompanhado = pessoas >= 1;
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Voc� ta de boa!");
			System.out.println("Ta com algu�m?  " + acompanhado);
		} else {
			System.out.println("Voc� � de menor, n�o pode!");
		}
		
		// Escopo est� definido pelas chaves.
		// uma vari�vel inicializada dentro de chaves s� existe dentro delas.
		
	}
}
