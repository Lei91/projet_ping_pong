package ping_pong;

public class Jeu {

	Fenetre f;

	public Jeu(Fenetre f) {
		this.f = f;
	}

	public double pDistance(double x, double y, double x1, double y1, double x2, double y2) {

		double A = x - x1; // position of point rel one end of line
		double B = y - y1;
		double C = x2 - x1; // vector along line
		double D = y2 - y1;
		double E = -D; // orthogonal vector
		double F = C;

		double dot = A * E + B * F;
		double len_sq = E * E + F * F;

		return Math.abs(dot) / Math.sqrt(len_sq);
	}

	public void jeu() {

		while (true) {
			f.p.balle.bouger();
			if (f.p.balle.positionY - f.p.balle.largeur / 2 < 0
					|| f.p.balle.positionY + f.p.balle.largeur / 2 > f.p.hauteur) {
				f.p.balle.changerY();
			}

			if (f.p.balle.positionX - f.p.balle.largeur / 2 < 0
					|| f.p.balle.positionX + f.p.balle.largeur / 2 > f.p.largeur) {
				f.p.balle.changerX();
			}

			/*
			 * test si la balle est en contact avec la raquette1
			 * 
			 */
			double xBalle = f.p.balle.positionX;// + f.p.balle.largeur / 2;
			double yBalle = f.p.balle.positionY;// + f.p.balle.largeur / 2;
			double x1Raquette1 = 20;
			double y1Raquette1 = f.p.raquette1.positionY;
			double x2Raquette1 = 20;
			double y2Raquette1 = f.p.raquette1.positionY + f.p.raquette1.largeur;
			if (pDistance(xBalle, yBalle, x1Raquette1, y1Raquette1, x2Raquette1, y2Raquette1) <= f.p.balle.largeur
					/ 2) {
				f.p.balle.changerX();

			}
			System.out.println(pDistance(xBalle, yBalle, x1Raquette1, y1Raquette1, x2Raquette1, y2Raquette1));
			f.p.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
