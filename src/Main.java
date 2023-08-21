public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        //baralho.imprimirBaralho();
        baralho.embaralhar();
        baralho.imprimirBaralho();

        for(int i=1;i<=3;i++){
            baralho.distribuirCarta();
        }
        System.out.println("---------");
        System.out.println(baralho.hasCarta());
        System.out.println("---------");

        for(int i=1;i<=53;i++){
            baralho.distribuirCarta();
        }

        System.out.println("---------");
        System.out.println(baralho.hasCarta());
        System.out.println("---------");

        baralho.imprimirBaralho();
    }
}