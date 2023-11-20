public class Cafe extends BebidaQuenteTemplate {
    @Override
    void prepararIngredientes() {
        System.out.println("Moendo café");
    }

    @Override
    void adicionarCondimentos() {
        System.out.println("Adicionando açúcar e leite");
    }
}