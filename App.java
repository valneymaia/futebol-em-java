public class App {
    public static void main(String[] args)throws Exception {
        //Criando o campeonato
        Campeonato campeonato = new Campeonato();
        // Criando os clubes participantes
        Clube bayern = new Clube("Bayern   ");
        Clube barcelona = new Clube("Barcelona");
        Clube inter = new Clube("Inter    ");
        Clube viktoria = new Clube("Viktoria ");
        //Adicionando os clubes ao campeonato
        campeonato.adicionarClube(bayern);
        campeonato.adicionarClube(barcelona);
        campeonato.adicionarClube(inter);
        campeonato.adicionarClube(viktoria);
         // Imprimindo os resultados das partidas
        System.out.println("\nResultado das Partidas da fase grupo da Champions League: ");
        System.out.println("============================================================");
        //jogando o campeonato
        campeonato.jogarCampeonato();
        // imprimndo a tabela de classficacao
        System.out.print("===========================================================\n");
        System.out.print("Tabela da fase de grupo da Champions grupo B:  \n"+ campeonato.getClassificacao());
        System.out.print("\n============================================================");
       // imprimindo o campeao
        campeonato.getCampeao();
       
    

    }

}

