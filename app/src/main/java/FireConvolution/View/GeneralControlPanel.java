package FireConvolution.View;

import FireConvolution.Main;
import Utils.ConstraintsUtils;

import javax.swing.*;
import java.awt.*;

public class GeneralControlPanel extends JPanel {

    public GeneralControlPanel(Main main) {
        super(new GridBagLayout());
        ConstraintsUtils constraintsUtils = new ConstraintsUtils();

        constraintsUtils.resetConstraints();



    }
}
