//Merhaba, ben Misc.
//�ncelikle beni destekledi�iniz i�in te�ekk�r ederim, istedi�imi ald�m.
//1k abone oldum ve k���k ama g�zel kitleli bir sunucum oldu.
//Bu source'yi umar�m bombo� �eyler yapmak yerine, kendinizi geli�tirmek i�in kullan�rs�n�z.
//Ben buna inanmay� tercih ediyorum.
//Hepinize te�ekk�r ederim, iyi oyunlar dilerim ;)

import org.lwjgl.input.Keyboard;

public class Strafe extends Module {

	public static boolean state = false;
	
	public Strafe() {
		super("Strafe", Keyboard.KEY_X);
	}
	
	   public static boolean getStat() {
		      return state;
		   }

	@Override
	public void onToggled() {
		state = !state;
	}
}
