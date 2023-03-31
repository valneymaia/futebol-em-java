import java.util.Comparator;

public class Clube {
    public String nomeTime;
    public int pontos;
    public int saldodeGols;
    public int golsM;
    public int golsV;
    //contrutor Clube
    public Clube(String nome){
        this.nomeTime = nome;
        this.pontos = 0;
        this.saldodeGols = 0;
    }
    //funcao que pega a vitoria e soma os pontos e saldo de gols
    public void ganharJogo(int golsM, int golsV){
        this.pontos = pontos + 3;
        this.golsM += golsM;
        this.golsV += golsV;
        this.saldodeGols = (this.golsM - this.golsV);
    }
    //funcao que pega o empate e soma os pontos e saldo de gols
    public void empatarJogo(int golsM, int golsV){
        this.pontos = pontos + 1;
        this.golsM += golsM;
        this.golsV += golsV;
        this.saldodeGols = (this.golsM - this.golsV);
    }
    //funcao que pega a derrota e soma os pontos e saldo de gols
    public void perderJogo(int golsM, int golsV){
        this.pontos = pontos + 0;
        this.golsM += golsM;
        this.golsV += golsV;
        this.saldodeGols = (this.golsM - this.golsV);
    }
    //comparador dos saldos
    public static Comparator<Clube> compareSaldo = new Comparator<Clube>() {
        public int compare(Clube c1, Clube c2) {
            if(c1.getPontos() == c2.getPontos()) {
                return c2.getSaldodeGols() - c1.getSaldodeGols();
            }
            return 0;
        }    
    };
    //comparador dos pontos
    public static Comparator<Clube> comparePontos = new Comparator<Clube>() {
        public int compare(Clube c1, Clube c2) {
            return c2.getPontos() - c1.getPontos();
        }    
    };
    //metodos
    public String getNomeTime() {
        return this.nomeTime;
    }
    public int getPontos() {
        return this.pontos;
    }
    public int getSaldodeGols() {
        return this.saldodeGols;
    }
    public int getGolsM() {
        return this.golsM;
    }
    public int getGolsV() {
        return this.golsV;
    }
}
