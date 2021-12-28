package main.ui;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame f=new JFrame("RPS");

        JButton rock=new JButton("Rock");
        JButton paper=new JButton("Paper");
        JButton scissors=new JButton("Scissors");
        rock.setBounds(50,100,95,30);
        paper.setBounds(200,100,95,30);
        scissors.setBounds(400,100,95,30);
        f.add(rock);
        f.add(paper);
        f.add(scissors);

        JLabel playerScore = new JLabel("Label");
        playerScore.setText("Hey");
        f.add(playerScore);

        f.setSize(1000,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}


