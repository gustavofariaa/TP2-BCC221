package jogadores;

public abstract class Jogador {

    private String nome;
    private int idade;
    private String uniforme;
    private int gols;
    protected int habilidade;
    private Boolean jogando;

    public Jogador() {
    }

    public Jogador(String nome, int idade, String uniforme, int habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.uniforme = uniforme;
        this.gols = 0;
        this.habilidade = habilidade;
        this.jogando = false;
    }

    public void setHabilidade() {
    }

    public void somaGol() {
        //SOMA UM GOL FEITO PARA O JOGADOR
        this.gols++;
    }

    public String getNome() {
        //RETORNA O NOME DO JOGADOR
        return this.nome;
    }

    public int getIdade() {
        //RETORNA A IDADE DO JOGADOR
        return this.idade;
    }

    public String getUniforme() {
        //RETORNA O CAMINHO DA IMAGEM DO UNIFORME DO JOGADOR
        return this.uniforme;
    }

    public int getHabilidade() {
        //RETORNA O VALOR DA HABILIDADE DO JOGADOR
        return this.habilidade;
    }

    public int getGols() {
        //RETORNA QUANTIDADE DE GOLS FEITO PELO JOGADOR
        return this.gols;
    }

    public Boolean getJogando() {
        //RETORNA SE O JOGADOR ESTA JOGANDO OU NAO
        return this.jogando;
    }

    public void setJogando(Boolean jogando) {
        //EDITA SE O JOGADOR VAI JOGAR OU NAO
        this.jogando = jogando;
    }

}
