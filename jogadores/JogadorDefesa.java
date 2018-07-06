package jogadores;

public class JogadorDefesa extends Jogador {

    private int cobertura;
    private int desarme;

    public JogadorDefesa() {
    }

    public JogadorDefesa(String nome, int idade, String uniforme, int habilidade, int cobertura, int desarme) {
        super(nome, idade, uniforme, habilidade);
        this.cobertura = cobertura;
        this.desarme = desarme;
    }

    @Override
    public void setHabilidade() {
        this.habilidade = ((habilidade * 5) + (this.cobertura * 3) + (this.desarme * 2)) / 10;
    }
}
