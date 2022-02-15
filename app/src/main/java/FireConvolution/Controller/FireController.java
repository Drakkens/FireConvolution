package FireConvolution.Controller;

import FireConvolution.Model.ColorPalette;
import FireConvolution.Model.TargetColor;
import FireConvolution.View.View;

import java.awt.*;
import java.util.ArrayList;

public record FireController(View view) {

    public void toggleFire() {
        view.getFlame().setRunning(!view.getFlame().isRunning());
        System.out.println(view.getFlame().isRunning());

    }

    public void changeSparkChance(int chance) {
        view.getFlame().setSparkChance(chance);

    }

    public void changeCoolingChance(int chance) {
        view.getFlame().setCoolingChance(chance);

    }

    public void randomizeColors() {
        ArrayList<TargetColor> randomColors = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println((255 - ((64 * i) - 1)));
            randomColors.add(new TargetColor(255 - ((64 * i) - 1), new Color((int) Math.floor(Math.random() * 255), (int) Math.floor(Math.random() * 255), (int) Math.floor(Math.random() * 255), 255)));
        }
        randomColors.add(new TargetColor(0, new Color(0, 0, 0, 255)));

        ColorPalette colorPalette = new ColorPalette(randomColors);
        view.getFlame().setColorPalette(colorPalette);
    }

}
