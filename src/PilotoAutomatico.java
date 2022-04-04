
public class PilotoAutomatico {
	public static void main(String[] args) {
		int carroX = 160, carroY = 175, carroZ = 190;
		
		if(carroY - carroX > carroZ - carroY) {
			System.out.println("DIMINUIR");
		}
		else if(carroY - carroX < carroZ - carroY) {
			System.out.println("AUMENTAR");
		}
		else {
			System.out.println("MANTER");
		}
	}
}
