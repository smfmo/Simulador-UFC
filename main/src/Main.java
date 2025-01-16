public class Main {
    public static void main(String[] args) {
        Lutador[] lutador = new Lutador[6];

        lutador[0] = new Lutador(
                "Pretty Boy",
                "França",
                31, 1.75, 68.9,
                11, 2, 1, "Masculino");

        lutador[1] = new Lutador(
                "PutsCript",
                "Brasil",
                29,1.68,57.8,
                14, 2, 3, "feminino");

        lutador[2] = new Lutador(
                "SnapShadow",
                 "EUA",
                35, 1.65, 80.9,
                12, 2, 1, "masculino");

        lutador[3] = new Lutador(
                "DeadCode",
                "Autrália",
                28, 1.93, 81.6,
                13,0,2, "feminino");

        lutador[4] = new Lutador(
                "Ufocobol",
                "Brasil",
                37, 1.70, 119.3,
                5,4,3, "masculino");

        lutador[5] = new Lutador(
                "Nerdaad",
                "EUA",
                30, 1.81, 105.7,
                12,2,4, "masculino");


        Luta UFC01 = new Luta();
        UFC01.marcarLuta(lutador[0], lutador[1]);
        UFC01.lutar();





    }
}