package partida;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setData(int dia, int mes, int ano) {
        //EDITA A DATA        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        //RETORNA DIA
        return this.dia;
    }

    public int getMes() {
        //RETORNA MES
        return this.mes;
    }

    public int getAno() {
        //RETORNA ANO
        return this.ano;
    }
}
