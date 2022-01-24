public class App {
    public static void main(String[] args) throws Exception {
        Immobile i1 = new Immobile(5, 200, "Via Cittadella 15", "Rovereto");
        Abitazione ab1 = new Abitazione(5, 150, "Via Cittadella 16", "Volano");
        Villa v1 = new Villa(10, 400, "Via Spiazze 36", "Milano", 3, 300, true);
        Appartamento ap1 = new Appartamento(3, 100, "Via Cittadella 12", "Rovereto", 20, 7, 3, true);

        System.out.println(i1);
        System.out.println(ab1);
        System.out.println(v1);
        System.out.println(ap1);
    }
}
