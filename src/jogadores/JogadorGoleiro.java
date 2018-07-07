package jogadores;

public class JogadorGoleiro extends Jogador {

    private int reflexo;
    private double altura;

    public JogadorGoleiro() {
    }

    public JogadorGoleiro(String nome, int idade, String uniforme, int habilidade, int reflexo, double altura) {
        super(nome, idade, uniforme, habilidade);
        this.reflexo = reflexo;
        this.altura = altura;
    }

    @Override
    public void setHabilidade() {
        this.habilidade = ((habilidade * 5) + ((int) (this.altura * 100) * 2) + (this.reflexo * 3)) / 10;
    }
}
