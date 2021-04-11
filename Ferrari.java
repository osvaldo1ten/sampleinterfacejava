public class Ferrari implements Vehicle{

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou à esquerda");
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou à direita");
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou. Uhuuuuuu");
	}

	@Override
	public void frear() {
		System.out.println("Ferrari freou");		
	}

	@Override
	public void seguirEmFrente() {
		System.out.println("Ferrari está seguindo em frente");
	}

}
