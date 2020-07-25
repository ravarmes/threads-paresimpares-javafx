
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.control.TextArea;

public class MinhaThreadImpares implements Runnable{

    private final TextArea textAreaImpares;
    int i;
    
    public MinhaThreadImpares(TextArea textAreaImpares){
        this.textAreaImpares = textAreaImpares;
    }
    
    @Override
    public void run(){
        for (i = 1; i <= 1000000; i++) {
            if (i % 2 != 0) {
                //textAreaImpares.appendText("\n" + i);
                Platform.runLater(() -> textAreaImpares.appendText("\n" + i));
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MinhaThreadPares.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    
}
