import rp.*;

public class Interface {
    public static void main(String[] args) {
        Cottage c = new Cottage();
        c.build("bois");

        Ship s = new Ship();
        Glider g = new Glider();
        s.moveXY(15, 57);
        g.moveXY(45,95);

        c.fly("rien");
        g.fly("vent");
    }
}
