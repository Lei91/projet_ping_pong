package ping_pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EcouteurClavier implements KeyListener {

	Plateau p;

	public EcouteurClavier(Plateau p2) {

		p = p2;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_Z) {
			if (p.raquette1.positionY > 10)
				p.raquette1.positionY -= 15;

		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			if (p.raquette1.positionY < p.hauteur - p.raquette1.largeur - 10)
				p.raquette1.positionY += 15;

		}

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			if (p.raquette2.positionY > 10)
				p.raquette2.positionY -= 15;

		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			if (p.raquette2.positionY < p.hauteur - p.raquette2.largeur - 10)
				p.raquette2.positionY += 15;

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
