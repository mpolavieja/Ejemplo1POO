public class Punto {

    private int x;
    private int y;

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void mostrar(){
        System.out.println("Punto [" + x + "," + y + "]");
    }

}
