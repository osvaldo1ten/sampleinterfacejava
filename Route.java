public class Route {

	public void andar(Vehicle vehic) {
		vehic.acelerar();
		vehic.virarDireita();
		vehic.virarDireita();
		vehic.seguirEmFrente();
		vehic.virarEsquerda();
		vehic.frear();
	}
}
