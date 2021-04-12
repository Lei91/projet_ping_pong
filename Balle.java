package ping_pong;

public class Balle {

	int positionX = 100;
	int positionY = 200;
	int directionX = 1;
	int directionY = 1;
	int largeur = 20;

	public Balle() {

	}

	public void bouger() {
		positionX += directionX;
		positionY += directionY;
	}

	public void changerY() {
		directionY = -directionY;
	}

	public void changerX() {
		directionX = -directionX;
	}

}
