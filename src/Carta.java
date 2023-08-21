public class Carta {
    private String naipeCarta;
    private String valorCarta;

    public String getCarta() {
        return naipeCarta + " " + valorCarta;
    }

    public Carta(String naipeCarta, String valorCarta) {
        this.naipeCarta = naipeCarta;
        this.valorCarta = valorCarta;
    }

}
