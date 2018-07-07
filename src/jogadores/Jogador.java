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
        this.gols++;
        //System.out.println(this.nome + " " + this.gols);
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getUniforme() {
        return this.uniforme;
    }

    public int getHabilidade() {
        return this.habilidade;
    }

    public int getGols() {
        return this.gols;
    }

    public Boolean getJogando() {
        return this.jogando;
    }

    public void setJogando(Boolean jogando) {
        this.jogando = jogando;
    }

}
