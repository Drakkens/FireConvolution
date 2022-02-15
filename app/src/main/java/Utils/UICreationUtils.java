package Utils;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionListener;

public record UICreationUtils(JPanel container, GridBagConstraints constraints) {

    public void createButton(String content, ActionListener actionListener) {
        JButton button = new JButton(content);
        container.add(button, constraints);
        button.addActionListener(actionListener);

    }

    public void createLabel(String content) {
        JLabel label = new JLabel(content);
        container.add(label, constraints);
    }

    public void createSlider(int min, int max, ChangeListener changeListener) {
        JSlider slider = new JSlider(min, max);
        container.add(slider, constraints);
        slider.addChangeListener(changeListener);
    }

    public void createTextField(String text, int width, DocumentListener documentListener) {
        JTextField jTextField = new JTextField(text, width);
        container.add(jTextField, constraints);
        jTextField.getDocument().addDocumentListener(documentListener);
    }

    public JPanel getContainer() {
        return this.container;
    }
}