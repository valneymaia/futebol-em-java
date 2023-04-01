import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Campeonato {
    private List<Clube> clubes;

    public Campeonato() {
        this.clubes = new ArrayList<Clube>();
    }
    //adicionar os clubes criados
    public void adicionarClube(Clube clube){
        this.clubes.add(clube);
    }
    //faz o arranjo das partidas mandante e visitante
    public void jogarCampeonato(){
        for(Clube m : clubes) {
            for(Clube v : clubes) {
                Clube clubeMandante = m;
                Clube clubeVisitante = v;
                if(clubeMandante != clubeVisitante) {
                    jogarPartida(clubeMandante,clubeVisitante);
                }
            }
        }
    }
    //sorteia os numeros de gols do mandante e visitantee faz verificao dos resultados
    private void jogarPartida(Clube clubeMandante, Clube  clubeVisitante){
        Random rand = new Random();
        int golsM= rand.nextInt(6);
        int golsV= rand.nextInt(6);
        //printa o resultados das partidas dos mandantes e visitante
        System.out.println(clubeMandante.nomeTime + " " + golsM + " X " + golsV + " " + clubeVisitante.nomeTime );
        //checar os gols e salva o resultado da partida
        if(golsM>golsV){
            clubeMandante.ganharJogo(golsM, golsV);
            clubeVisitante.perderJogo(golsV, golsM);
        }else if (golsM<golsV){
            clubeMandante.perderJogo(golsM, golsV);
            clubeVisitante.ganharJogo(golsV, golsM);
        }else{
            clubeMandante.empatarJogo(golsM, golsV);
            clubeVisitante.empatarJogo(golsV, golsM);
        }
    }
    //implemtaçao para printar a classicaçao usando metodo void
    /*public void getClassificacao() {
        Collections.sort(clubes, Clube.comparePontos);
       // for(Clube clube : clubes) {  //teste de ordenaçao quando empatava nos pontos
        //    System.out.println(clube.getNomeTime() + "Pontos: " + clube.getPontos() + ", saldo de gols: " + clube.getSaldodeGols());
       // }
        System.out.println("\nTabela da fase de grupo da Champions grupo B: \n");
        Collections.sort(clubes, Clube.compareSaldo);
        for(Clube clube : clubes) {
            System.out.println("---------------------------------------------------------");
            System.out.println("|"+clube.getNomeTime() + "\t  |Pontos: |" + clube.getPontos() + "|\t saldo de gols: |" + clube.getSaldodeGols()+"|");
        } 
        System.out.println("---------------------------------------------------------");
    }*/
    // printar a  classificacao como string 
    public String getClassificacao() {
        Collections.sort(clubes, Clube.comparePontos);
       // for(Clube clube : clubes) {  //teste de ordenaçao quando empatava nos pontos
        //    System.out.println(clube.getNomeTime() + "Pontos: " + clube.getPontos() + ", saldo de gols: " + clube.getSaldodeGols());
       // }
        Collections.sort(clubes, Clube.compareSaldo);
         StringBuilder sb = new StringBuilder();
         int posicao = 1;
        for (Clube clube : clubes) {
            sb.append("\n"+posicao + ". " + clube.getNomeTime() + " - |Pontos: " + clube.getPontos() + "  |Saldo de gols: " + clube.getSaldodeGols() +"|");
            posicao++;
        } 
    return sb.toString();
    }
    //printa o campeoa, mas adptei para champions league printando tambem o segundo e terceiro lugar
    public void getCampeao(){ 
        System.out.println("\n\t\tPARABENS CAMPEAO: "+ clubes.get(0).getNomeTime());
        System.out.println("============================================================");
        System.out.println("Time campeão da fase de grupo da Champions League:  " + clubes.get(0).getNomeTime());
        System.out.println("Time estar classificado para oitavas: " + clubes.get(1).getNomeTime());
        System.out.println("Time estar classificado vai jogar Europa League: "+ clubes.get(2).getNomeTime());
        System.out.println("============================================================");  
    }

}

   
