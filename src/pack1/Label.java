package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		if (Var.imSpiel) {

			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.ischrott1, Var.schrottx1[i], Var.schrotty1[i], 48, 48, null);
			}
			for (int i = 0; i <= 1; i++) {
				g.drawImage(Var.ischrott2, Var.schrottx2[i], Var.schrotty2[i], 48, 48, null);
			}

			g.drawImage(Var.ischrott3, Var.schrottx3, Var.schrotty3, 48, 48, null);

			// Gegner
			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 64, 64, null);
			}

			// Schuss
			if (Var.schusskollision == true) {
				g.drawImage(Var.igegner_hit, Var.posgegnerx, Var.posgegnery, 104, 95, null);
			}
			if (Var.bolschuss == true) {
				g.drawImage(Var.ischuss, Var.schussx, Var.schussy, 20, 40, null);
			}

			// Schild
			if (Var.schildanzahl > 0 && Var.schildanzahl <= Var.ischild.length) {
				g.drawImage(Var.ischild[Var.schildanzahl - 1], Var.x - 10, Var.y - 10, 70, 90, null);
			} else if (Var.schildanzahl > Var.ischild.length) {
				g.drawImage(Var.ischild[Var.schildarraymax], Var.x - 10, Var.y - 10, 70, 90, null);
			}

			// Rakete
			g.drawImage(Var.irakete, Var.x, Var.y, 70, 70, null);

			// Schrott-Anzeige
			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString("Schrott: " + Var.schrott, 20, 50);

			// Leben-Anzeige
			g.drawImage(Var.ileben, 550, 475, 100, 100, null);
			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 55));
			g.drawString("" + Var.leben, 670, 545);
			g.setFont(new Font("Arial", Font.BOLD, 25));
			g.drawString("/ " + Var.maxleben, 730, 545);

			// Schuss-Anzeige
			g.drawImage(Var.iammo, 20, 495, 56, 65, null);
			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 55));
			g.drawString("" + Var.ammo, 90, 545);
			g.setFont(new Font("Arial", Font.BOLD, 25));
			g.drawString("/ " + Var.maxammo, 155, 545);

			repaint();

			if (Var.kollidiert) {

				g.drawImage(Var.gifexplosion, Var.x - 10, Var.y - 10, 70, 70, null);

				if (Var.expanimation > 1 && Var.expanimation <= 4) {
					g.setColor(new Color(230, 0, 0, 45));
					g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
				} else if (Var.expanimation >= 6 && Var.expanimation <= 9) {
					g.setColor(new Color(230, 0, 0, 45));
					g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
				}

			}

		} else if (Var.imMen� || Var.imOptionen || Var.imShop) {

			// Hintergrund
			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

			// Schild
			if (Var.schildanzahl > 0 && Var.schildanzahl <= Var.ischild.length) {
				g.drawImage(Var.ischild[Var.schildanzahl - 1], Var.x - 10, Var.y - 10, 70, 90, null);
			} else if (Var.schildanzahl > Var.ischild.length) {
				g.drawImage(Var.ischild[Var.schildarraymax], Var.x - 10, Var.y - 10, 70, 90, null);
			}

			// Rakete
//			g.drawImage(Var.irakete, Var.x, Var.y, 70, 70, null);

			// Schuss
			if (Var.schusskollision == true) {
				g.drawImage(Var.igegner_hit, Var.posgegnerx, Var.posgegnery, 104, 95, null);
			}
			if (Var.bolschuss == true) {
				g.drawImage(Var.ischuss, Var.schussx, Var.schussy, 20, 40, null);
			}

			// Gegner
//			for (int i = 0; i <= 4; i++) {
//				g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 64, 64, null);
//			}

			g.setColor(new Color(100, 100, 100, 128));
			g.fillRect(0, 0, Var.screenwidth, Var.screenheight);

			if (Var.verloren) {
				g.setColor(new Color(0, 230, 115));
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("Schrott: " + Var.schrott, 310, 180);

				repaint();
			}

			if (Var.imShop) {
				g.setColor(new Color(0, 230, 115));
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("Schrott: " + Var.schrott, 310, 180);

				g.drawString("Leben", 75, 340);
				g.drawString("Sch�sse", 75, 415);
				g.drawString("Plasmaschild", 75, 485);

				g.drawString("St. " + Var.up1anzahl, 550, 340);
				g.drawString("St. " + Var.up2anzahl, 550, 415);
				g.drawString("St. " + Var.up3anzahl, 550, 485);

				g.drawString(Var.up1preis + "s", 310, 340);
				g.drawString(Var.up2preis + "s", 310, 415);
				g.drawString(Var.up3preis + "s", 310, 485);

				g.drawString(Var.uplebenpreis + "s", 700, 185);
				g.drawString("Leben + 1", 525, 235);

				g.setColor(Color.BLACK);
				g.drawLine(50, 362, 750, 362);
				g.drawLine(50, 438, 750, 438);

				g.drawLine(300, 300, 300, 500);

				repaint();
			}

			g.setColor(new Color(0, 230, 155));
			g.setFont(new Font("Arial", Font.BOLD, 35));

		}

	}

}
