package pack1;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Var {

	static JFrame jf1;
	static int screenwidth = 800, screenheight = 600;
	static int backgroundY1 = 0, backgroundY2 = -600, backgroundspeed = 9;
	static int x = 400, y = 400;
	static int speedup = 3, speeddown = 3, speedleft = 3, speedright = 3;
	static int schrott = 0, leben = 3, maxleben = 3;
	static int up1anzahl = 0, up2anzahl = 0, up3anzahl = 0;
	static int up1preis = 20, up2preis = 25, up3preis = 30, uplebenpreis = 10;
	static int schildanzahl = 0, schildarraymax = 3;
	static int ammo = 10, maxammo = 10;

	static JButton btnresume, btnshop, btnoption, btnexit;
	static JButton btnmute;
	static JButton btnupgrade1, btnupgrade2, btnupgrade3, btnleben;
	static Label lbl1;
	
	static int gegnerx[] = new int[5], gegnery[] = new int[5];
	static int gegnerspeed[] = new int[5];
	static int schrottx1[] = new int[5], schrotty1[] = new int[5];
	static int schrottx2[] = new int[5], schrotty2[] = new int[5];
	static int schrottx3, schrotty3;
	static int schrottspeed1[] = new int[5], schrottspeed2[] = new int[2], schrottspeed3;
	static int expanimation;
	static int schussx, schussy;
	static int posgegnerx, posgegnery;

	static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
	static boolean kollidiert = false, verloren = false;
	static boolean imSpiel = true, imMenü = false, imOptionen = false, imShop = false;
	static boolean bolschuss = false;
	static boolean schusskollision = false;

	static BufferedImage ib1, ib2;
	static BufferedImage irakete;
	static BufferedImage igegner1;
	static BufferedImage ischrott1, ischrott2, ischrott3;
	static BufferedImage ileben;
	static BufferedImage ischild[] = new BufferedImage[4];
	static BufferedImage iammo;
	static BufferedImage ischuss;
	static BufferedImage igegner_hit;
	
	static Image gifexplosion;
//	static Image gifgegner;

	public Var() {

		try {
			// Background
			ib1 = ImageIO.read(new File("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/b1.png"));
			ib2 = ImageIO.read(new File("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/b1.png"));
			
			// Rakete
			irakete = ImageIO.read(new File("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/rakete2.png"));
			
			// Gegner
			igegner1 = ImageIO.read(new File("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/gegner0.png"));
			igegner_hit = ImageIO.read(new File("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/gegner_hit.png"));
//			gifgegner = Toolkit.getDefaultToolkit().createImage("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/gegner.gif");
			
			// Leben
			ileben = ImageIO.read(new File("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/leben.png"));
			
			// Schrott
			ischrott1 = ImageIO.read(new File("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/schrott1.png"));
			ischrott2 = ImageIO.read(new File("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/schrott2.png"));
			ischrott3 = ImageIO.read(new File("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/schrott3.png"));
			
			// Explosion
//			gifexplosion = Toolkit.getDefaultToolkit().createImage("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/explosion.gif");
			
			//HintergrundMusik
//			Musik.music("C:/Tools/eclipse/workspace/SpaceAdventure/audio/track1.wav");
			
			// Schild
			for(int i = 0; i<ischild.length;i++) {
				ischild[i] = ImageIO.read(new File("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/schild" + (i+1) + ".png" ));
			}
			// Schuss
			ischuss = ImageIO.read(new File("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/schuss0.png"));
//			gifschuss = Toolkit.getDefaultToolkit().createImage("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/schuss.gif");
			//Munition
			iammo = ImageIO.read(new File("C:/Tools/eclipse/workspace/SpaceAdventure/rsc/ammo.png"));
			
		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden!");
		}

		gegnerspeed[0] = 3;
		gegnerspeed[1] = 4;
		gegnerspeed[2] = 3;
		gegnerspeed[3] = 4;
		gegnerspeed[4] = 3;

		schrottspeed1[0] = 2;
		schrottspeed1[1] = 3;
		schrottspeed1[2] = 2;
		schrottspeed1[3] = 4;
		schrottspeed1[4] = 2;

		schrottspeed2[0] = 4;
		schrottspeed2[1] = 5;

		schrottspeed3 = 6;

		
		
	}

}
