package com.Heather;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by iv2070fj on 3/31/2016.
 */
public class AgileOrWaterfall extends JFrame {
    private JTextField projectNameTextField;
    private JLabel projectNameLabel;
    private JButton recommendButton;
    private JLabel recommendationLabel;
    private JLabel programmersLabel;
    private JCheckBox programmersCheckBox;
    private JCheckBox scheduleCheckBox;
    private JLabel experienceLabel;
    private JLabel locationLabel;
    private JLabel qualityLabel;
    private JLabel modelsLabel;
    private JCheckBox experienceCheckBox;
    private JCheckBox locationCheckBox;
    private JCheckBox qualityCheckBox;
    private JCheckBox modelsCheckBox;
    private JPanel rootPanel;
    private JButton quitButton;

    boolean programmers;
    boolean experience;
    boolean models;
    boolean location;
    boolean schedule;
    boolean quality;



    AgileOrWaterfall(){
        super("Agile or Waterfall Decidor");
        setContentPane(rootPanel);
        setPreferredSize(new Dimension(800,800));
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        recommendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                programmers=programmersCheckBox.isSelected();
                schedule=scheduleCheckBox.isSelected();
                experience=experienceCheckBox.isSelected();
                location=locationCheckBox.isSelected();
                quality=qualityCheckBox.isSelected();
                models=modelsCheckBox.isSelected();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
