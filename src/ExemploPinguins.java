public class ExemploPinguins {
    public static void main(String[] args) {
        EstrategiaAtirarBola bolaNormal = new BolaDeNeveNormal();
        EstrategiaAtirarBola bolaGigante = new BolaDeNeveGigante();

        Pinguim pinguim1 = new Pinguim("Fofinho", bolaNormal);
        Pinguim pinguim2 = new Pinguim("Pimpo", bolaGigante);

        pinguim1.atirarBola();
        pinguim2.atirarBola();
    }
}