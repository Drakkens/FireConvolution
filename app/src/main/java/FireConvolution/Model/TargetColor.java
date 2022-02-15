package FireConvolution.Model;

import java.awt.*;

public class TargetColor {
    private int temperature;
    private Color color;

    public TargetColor(int temperature, Color color) {
        this.temperature = temperature;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getTemperature() {
        return temperature;
    }
}
