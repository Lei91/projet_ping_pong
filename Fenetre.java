package ping_pong;

import javax.swing.JFrame;

public class Fenetre extends JFrame {

	Plateau p;

	private static final long serialVersionUID = 1L;

	public Fenetre() {

		p = new Plateau();
		addKeyListener(new EcouteurClavier(p));
		add(p);
		setTitle("Super Ping");
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
