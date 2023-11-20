public class Main {
    public static void main(String[] args) {
        BebidaQuenteTemplate cafe = new Cafe();
        BebidaQuenteTemplate cha = new Cha();

        System.out.println("Preparando café:");
        cafe.prepararBebidaQuente();

        System.out.println("\nPreparando chá:");
        cha.prepararBebidaQuente();
    }
}