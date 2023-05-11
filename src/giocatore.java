public class giocatore extends Thread{
    
    private String nome;
    private int carta;


    public giocatore(String nome) {
        this.nome = nome;
        
    }

    
    public void run(){
        
        System.out.println("il giocatore "+this.nome+" sta giocando");

        this.carta=(int)(10*Math.random()+1);

        System.out.println("il giocatore "+this.nome+" ha pescato la carta "+this.carta);

        
    }


    public String getNome() {
        return nome;
    }


    public int getCarta() {
        return carta;
    }

    

}
