
public class TestaLoops {
	public static void main(String[] args) {
		
		int contador;
		int total;
		
		contador = 0;
		total = 0;
		
		while (contador <= 10) {
			System.out.println(contador);

			total = total + contador;
			
			// contador += 1;
			contador++;
		}
		
		System.out.println(contador);
		System.out.println(total);
		
		
		for (contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}
		
		// ------------------------------------
		
		int multiplicador;
		int numero;
		
		for (multiplicador = 0; multiplicador <= 10; multiplicador++) {
			for (numero = 1; numero <= 10; numero++) {
				System.out.print(numero * multiplicador + "	");
			}
			System.out.println();
		}
		
		// ------------------------------------
		
		int linha;
		int coluna;
		
		for (linha = 1; linha <= 10; linha++) {
			coluna = 1;
			while (coluna <= linha) {
				System.out.print("*");
				coluna++;
			}
			System.out.println();
		}
	}
}
