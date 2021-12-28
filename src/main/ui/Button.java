package main.ui;

import javax.swing.*;
import java.awt.*;

public class Button extends JFrame {
      JButton load = new JButton("Load");
      JButton save = new JButton("Save");
      JButton unsubscribe = new JButton("Unsubscribe");
      JLabel playerScore = new JLabel("Label");


              public Button() {
                 super("Button Frame");
                 setSize(340, 170);
                 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 JPanel pane = new JPanel();
                 pane.setLayout(new BorderLayout());
                 pane.add(load, BorderLayout.WEST);
                 pane.add(save, BorderLayout.CENTER);
                 pane.add(unsubscribe, BorderLayout.EAST);
                 pane.add(playerScore, BorderLayout.NORTH);
                 add(pane);
                 setVisible(true);
             }

            private static void setLookAndFeel() {
                 try {
                         UIManager.setLookAndFeel(
                                     "javax.swing.pilaf.nimbus.NimbusLookAndFeel"
                        );
                     } catch (Exception exc) {
                        System.out.println(exc.getMessage());
                    }
         }

           public static void main(String[] arguments) {
                 setLookAndFeel();
           Button bf = new Button();
          }
 }
