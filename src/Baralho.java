import javax.swing.*;
import java.util.ArrayList;

public class Baralho {
    private String[] naipesCartas = {"Paus", "Ouros", "Copas", "Espadas"};
    private String[] valoresCartas = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
    private static final String coringa = "Coringa";
    private int index;
    private ArrayList<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();

        for (String valorNaipe : naipesCartas) {
            for (String valorCarta : valoresCartas) {
                Carta carta = new Carta(valorNaipe,valorCarta);
                cartas.add(carta);
            }
        }
        for (index = 1; index<=4; index++) {
            Carta carta = new Carta(coringa,coringa);
            cartas.add(carta);
        }

    }

    public void embaralhar(){
        int n = cartas.size();
        long seed = System.currentTimeMillis();
        Math.random();

        for (int i = n - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Carta temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);
        }
    }

    public void distribuirCarta(){
        int n = cartas.size();
        if (n > 0) {
            System.out.println("Carta distribuída: " + cartas.get(n - 1).getCarta());
            cartas.remove(n - 1);
        } else {
            System.out.println("O baralho está vazio.");
        }
    }

    public boolean hasCarta(){
        int n = cartas.size();
        return n>0;
    }

    public void imprimirBaralho(){
        for (Carta carta : cartas){
            System.out.println(carta.getCarta());
        }
        System.out.println("---------");
    }
}
