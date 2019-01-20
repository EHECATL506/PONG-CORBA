
import Pong.ClientePongPOA;


public class ClientePongImpl extends ClientePongPOA{
    @Override
    public void actualizar(int barra1, int barra2, int x, int y, int puntos1, int puntos2) {
        Juego.r1 = barra1;
        Juego.r2 = barra2;
        Juego.x = x;
        Juego.y = y;
        Juego.scoreJ1 = puntos1;
        Juego.scoreJ2 = puntos2;
    }


}
