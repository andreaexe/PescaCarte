public class App {

    public static void main(String[] args )throws Exception{

        giocatore g1= new giocatore("giacomo");
        giocatore g2= new giocatore("Sonam");
        giocatore g3= new giocatore("Piergoffredo");
    
        System.out.println("partita iniziata");
    
        g1.start();
        g2.start();
        g3.start();

        g1.join();
        g2.join();
        g3.join();

        if(g1.getCarta()>g2.getCarta()){
   
            System.out.println("ha vinto il giocatore "+g1.getNome());
        }
        else if(g3.getCarta()>g2.getCarta()){

            System.out.println("ha vinto il giocatore "+g3.getNome());
        }
        else{

            System.out.println("ha vinto il giocatore "+g2.getNome());
        }
    }
   
   
}
