import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Control extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int y;
            if (Juego.jugador == 1) {
                y = Juego.r1;
            } else {
                y = Juego.r2;
            }
            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:
                    if (y > 5) {
                        Juego.servidor.moverarriba(Juego.jugador);
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (y < 470 - 80) {
                        Juego.servidor.moverabajo(Juego.jugador);
                    }
                    break;
                default:
            }
        }
}
