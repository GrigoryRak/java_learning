package com.java_learning.lesson_8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ResetBox {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean right_to_left = false;

    static int counter = 0;

    public static void addComponentsToPane(Container pane) {
        if (right_to_left) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            c.fill = GridBagConstraints.HORIZONTAL;
        }

        JButton plusTen = new JButton("+10");
        if (shouldWeightX) {
            c.weightx = 1;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(plusTen, c);

        JButton minusTen = new JButton("-10");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridy = 1;
        pane.add(minusTen, c);

        JButton minusOne = new JButton("-1");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(minusOne, c);

        JButton plusOne = new JButton("+1");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(plusOne, c);

        JButton reset = new JButton("reset");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.PAGE_END;
        c.gridx = 0;
        c.gridy = 4;       //third row
        pane.add(reset, c);


        Font font = new Font("Arial", Font.BOLD, 20);
        JLabel counterView = new JLabel(String.valueOf(counter));
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        counterView.setFont(font);

        c.insets = new Insets(40, 40, 60, 40);
        pane.add(counterView, c);


        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == plusOne) {
                    counter++;
                } else if (e.getSource() == minusOne) {
                    counter--;
                } else if (e.getSource() == plusTen) {
                    counter = counter + 10;
                } else if (e.getSource() == minusTen) {
                    counter = counter - 10;
                } else if (e.getSource() == reset) {
                    counter = 0;
                }
                refreshCounterView(counterView);
            }
        };

        plusOne.addActionListener(actionListener);
        minusOne.addActionListener(actionListener);
        plusTen.addActionListener(actionListener);
        minusTen.addActionListener(actionListener);
        reset.addActionListener(actionListener);

    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("ResetBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private static void refreshCounterView(JLabel counterView) {
        counterView.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}