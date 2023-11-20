abstract class BebidaQuenteTemplate {
    public final void prepararBebidaQuente() {
        ferverAgua();
        prepararIngredientes();
        despejarNaXicara();
        adicionarCondimentos();
    }

    abstract void prepararIngredientes();
    abstract void adicionarCondimentos();

    // Métodos comuns a todas as bebidas quentes
    void ferverAgua() {
        System.out.println("Fervendo água");
    }

    void despejarNaXicara() {
        System.out.println("Despejando na xícara");
    }
}