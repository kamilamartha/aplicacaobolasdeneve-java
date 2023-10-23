public class Pinguim {
    private String nome;
    private EstrategiaAtirarBola estrategiaAtirarBola;

    public Pinguim(String nome, EstrategiaAtirarBola estrategiaAtirarBola) {
        this.nome = nome;
        this.estrategiaAtirarBola = estrategiaAtirarBola;
    }

    public void atirarBola() {
        System.out.println(nome + " está se preparando para atirar uma bola de neve.");
        estrategiaAtirarBola.atirarBola();
    }
}