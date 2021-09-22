package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	static int tempKeyHandler = 0;

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		////////////////////////////////
		// Bewegung wenn Taste gedrückt (nach Oben, Unten, Links und Rechts) ##NUM
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveup = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.movedown = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Var.moveleft = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Var.moveright = true;
		}

		/////////////////////////////
		// Bewegung wenn Taste gedrückt (nach Oben, Unten, Links und Rechts) ##WASD
		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movedown = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			Var.moveleft = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			Var.moveright = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_SPACE) {

			if (Var.bolschuss == false && Var.ammo >= 0) {
				Var.bolschuss = true;
				Var.schussx = Var.x + 15;
				Var.schussy = Var.y - 45;
				Var.ammo--;
			}

		}

		if (tempKeyHandler == 0) {
			// Menü
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				Var.imSpiel = false;
				Var.imMenü = true;
				Var.imShop = false;
				Var.imOptionen = false;
				Var.btnresume.setVisible(true);
				Var.btnshop.setVisible(true);
				Var.btnoption.setVisible(true);
				Var.btnexit.setVisible(true);
				tempKeyHandler++;
			}
		} else if (tempKeyHandler == 1) {
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				Var.imSpiel = true;
				Var.imMenü = false;
				Var.imShop = false;
				Var.imOptionen = false;
				Var.btnresume.setVisible(false);
				Var.btnshop.setVisible(false);
				Var.btnoption.setVisible(false);
				Var.btnexit.setVisible(false);

				Var.btnupgrade1.setVisible(false);
				Var.btnupgrade2.setVisible(false);
				Var.btnupgrade3.setVisible(false);
				Var.btnleben.setVisible(false);
				;

				tempKeyHandler--;
				Aktualisierung.tempAktualisierung = 0;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		///////////////////////////////
		// Bewegung stopt wenn Taste nicht mehr gedrückt wird (nach Oben, Unten, Links
		/////////////////////////////// und Rechts) ##NUM
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveup = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.movedown = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Var.moveleft = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Var.moveright = false;
		}
		/////////////////////////////
		// Bewegung stopt wenn Taste nicht mehr gedrückt wird (nach Oben, Unten, Links
		///////////////////////////// und Rechts) ##WASD
		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movedown = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			Var.moveleft = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			Var.moveright = false;
		}
	}

}
