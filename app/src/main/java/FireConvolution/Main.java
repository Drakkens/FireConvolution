package FireConvolution;

import FireConvolution.View.View;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private final View view;

    public Main() {
        super("Its Fire!");
        this.setSize(new Dimension(1920, 1080));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        this.getContentPane().setBackground(Color.GRAY);

        GridBagConstraints constraints = new GridBagConstraints();




        this.view = new View();
        this.add(view, constraints);

    }


    public static void main(String[] args) {
        new Main();
    }

    public View getView() {
        return this.view;
    }
}
