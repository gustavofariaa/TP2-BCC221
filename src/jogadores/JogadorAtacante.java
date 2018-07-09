package jogadores;

public class JogadorAtacante extends Jogador {

    private int velocidade;
    private int tecnica;

    public JogadorAtacante() {
    }

    public JogadorAtacante(String nome, int idade, String uniforme, int habilidade, int velocidade, int tecnica) {
        super(nome, idade, uniforme, habilidade);
        this.velocidade = velocidade;
        this.tecnica = tecnica;
    }

    @Override
    public void setHabilidade() {
        //EDITA O VALOR DA HABILADE DO JGOADOR ATACANTE
        this.habilidade = ((habilidade * 5) + (this.velocidade * 2) + (this.tecnica * 3)) / 10;
    }
}
