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
        //jogando o campeonato
        System.out.print("============================================================\n");
        System.out.println("Resultado das Partidas: ");
        System.out.print("============================================================\n");
        campeonato.jogarCampeonato();
        // imprimndo a tabela de classficacao
        System.out.print("============================================================");
        System.out.println("\nTabela da fase grupo da Champions League:  " + campeonato.getClassificacao()); 
        System.out.println("============================================================");
        // imprimindo o campeao
        System.out.println(" " + campeonato.getCampeao() ); 
    }
}

