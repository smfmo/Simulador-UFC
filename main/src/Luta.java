
public class Luta  {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if (lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2) {
            this.setAprovada(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
        }else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    public void lutar(){
        if (this.getAprovada()) {
            System.out.println("VAI COMEÇAR A LUTA!!!");
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            int vencedor = (int) (Math.random() * 3); //vai gerar números de 0 a 2

            switch (vencedor){
                case 0: //empate
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1: //vitória desafiado
                    System.out.println("VENCEDOR: " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;

                case 2://vitória desafiante
                    System.out.println("VENCEDOR: " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }
}
