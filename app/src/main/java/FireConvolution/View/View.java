/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FireConvolution.View;

import FireConvolution.Model.Flame;

import java.awt.*;

/**
 *
 * @author joanf
 */
public class View extends Canvas {
    private final Flame flame;

    public Flame getFlame() {
        return flame;
    }

    public View() {
        super();
        Dimension dim = new Dimension(520, 720);

        this.flame = new Flame((int) dim.getWidth(), (int) dim.getHeight());
        setSize(dim.width, dim.height);

        this.setVisible(true);


    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(flame, 0, 0, this);
    }
}
