import java.util.Random;

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


    //métodos
    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2 &&
        lutador1.getSexo().equals(lutador2.getSexo())) {
            this.setAprovada(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
        }else {
            System.out.println("Lutadores só poderão lutar se forem do mesmo sexo!");
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }

    }

    public void lutar(){
        if (this.getAprovada()) {
            System.out.println("VAI COMEÇAR A LUTA!!!");
            System.out.println("LUTADOR DESAFIADO: ");
            this.getDesafiado().apresentar();
            System.out.println("LUTADOR DESAFIANTE: ");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();

            int vencedor = aleatorio.nextInt(3);
            System.out.println("=======RESULTADO=======");
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
            System.out.println("=======================");
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }
}
