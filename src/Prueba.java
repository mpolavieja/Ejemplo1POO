public class Prueba {

    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto();

        p1.setX(3);
        p1.setY(0);

        p2.setX(-1);
        p2.setY(1);

        /* System.out.println("Punto 1 [" + p1.getX() + "," + p1.getY() + "]");
        System.out.println("Punto 2 [" + p2.getX() + "," + p2.getY() + "]"); */
        p1.mostrar();
        p2.mostrar();
    }
}
