package FireConvolution.View;

import FireConvolution.Controller.FireController;
import FireConvolution.Main;

import javax.swing.*;
import java.awt.*;

public class FireControlPanel extends JPanel  {

    public FireControlPanel(Main main) {
        super(new GridBagLayout());
        new FireController(main.getView());

    }

}
