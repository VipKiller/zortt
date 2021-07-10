//Merhaba, ben Misc.
//�ncelikle beni destekledi�iniz i�in te�ekk�r ederim, istedi�imi ald�m.
//1k abone oldum ve k���k ama g�zel kitleli bir sunucum oldu.
//Bu source'yi umar�m bombo� �eyler yapmak yerine, kendinizi geli�tirmek i�in kullan�rs�n�z.
//Ben buna inanmay� tercih ediyorum.
//Hepinize te�ekk�r ederim, iyi oyunlar dilerim ;)

public class Timer {
    private long prevMS = 0L;

    public boolean delay(double d) {
        return (this.getTime() - this.prevMS) >= d;
    }

    public void reset() {
        this.prevMS = this.getTime();
    }
    
    public long getTime() {
        return System.nanoTime() / 1000000L;
    }

    public long getDifference() {
        return this.getTime() - this.prevMS;
    }
}