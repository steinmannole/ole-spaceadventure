package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class SchrottKollision {
Timer kollision;
	public SchrottKollision() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				//Kupfer
				for(int i=0;i<=4;i++) {
					
					if (Var.x >= Var.schrottx1[i] - 50 && Var.x <= Var.schrottx1[i] + 70 && Var.y >= Var.schrotty1[i] - 50 && Var.y <= Var.schrotty1[i] + 50) {
						
						Var.schrott+=1;
						Var.schrotty1[i]=-200;
					}
					
				}
				
				//Eisen
				for(int i=0;i<=1;i++) {
					
					if (Var.x >= Var.schrottx2[i] - 50 && Var.x <= Var.schrottx2[i] + 70 && Var.y >= Var.schrotty2[i] - 50 && Var.y <= Var.schrotty2[i] + 50) {
						
						Var.schrott+=5;
						Var.schrotty2[i]=-1500;
					}
					
				}
				
				//Gold
				if (Var.x >= Var.schrottx3- 50 && Var.x <= Var.schrottx3 + 70 && Var.y >= Var.schrotty3 - 50 && Var.y <= Var.schrotty3 + 50) {
					
					Var.schrott+=10;
					Var.schrotty3=-4000;
				}
				
			}
			
			
			
		}, 0, 15);
	}

}
