package Elements;
import java.util.Random;

public class Dado {
    public static int lancarDado(){
        Random random = new Random();
        int valor = random.nextInt(6);
        return valor;
    }
}
