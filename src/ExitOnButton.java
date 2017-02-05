import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Игорь on 05.12.2016.
 */
public class ExitOnButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
