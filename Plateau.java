package ping_pong;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Plateau extends JPanel {

	private static final long serialVersionUID = 1L;

	int hauteur, largeur;
	Color couleurFond;
	Balle balle;
	Raquette raquette1, raquette2;

	public Plateau() {
		// super();

		hauteur = 470;
		largeur = 600;
		couleurFond = Color.BLACK;
		balle = new Balle();
		raquette1 = new Raquette(10, 60, 0);
		raquette2 = new Raquette(10, 60, 1);
		setPreferredSize(new Dimension(largeur, hauteur));
	}

	public void paintComponent(Graphics g) {

		// peindre le fond en noir
		g.setColor(couleurFond);
		g.fillRect(0, 0, largeur, hauteur);

		// peindre la balle en blanc
		g.setColor(Color.WHITE);
		g.fillOval(balle.positionX - balle.largeur / 2, balle.positionY - balle.largeur / 2, balle.largeur,
				balle.largeur);

		// peindre les raquettes en blanc
		g.fillRect(10, raquette1.positionY, 10, raquette1.largeur);
		g.fillRect(largeur - 20, raquette2.positionY, 10, raquette2.largeur);

	}

}
