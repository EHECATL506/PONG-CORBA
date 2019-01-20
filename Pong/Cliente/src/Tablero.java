import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;


    public class Tablero extends JPanel {
        public Tablero() {
            this.setBackground(Color.BLUE);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2D = (Graphics2D)g;
            g2D.setColor(Color.WHITE);
            g2D.fillOval(Juego.x, Juego.y,30,30);

            g2D.fillRect(10, Juego.r1,25,70);
            g2D.fillRect(894-25, Juego.r2,25,70);

            Font puntuacion = new Font("Arial", Font.ITALIC, 45);
            g2D.setFont(puntuacion);
            g2D.drawString(Integer.toString(Juego.scoreJ1),   (float) getBounds().getCenterX() - 10, 270);
            g2D.drawString(Integer.toString(Juego.scoreJ2),      (float) getBounds().getCenterX() + 25, 270);
        }
    }

