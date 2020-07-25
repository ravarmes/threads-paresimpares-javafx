
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.control.TextArea;

public class MinhaThreadPares implements Runnable{

    private final TextArea textAreaPares;
    int i;
    
    public MinhaThreadPares(TextArea textAreaPares){
        this.textAreaPares = textAreaPares;
    }
    
    @Override
    public void run(){
        for (i = 1; i <= 1000000; i++) {
            if (i % 2 == 0) {
                //textAreaPares.appendText("\n" + i);
                Platform.runLater(() -> textAreaPares.appendText("\n" + i));
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MinhaThreadPares.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    
}
