package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

     Main() {
        setSize(900,400);
         setVisible(true);
         setTitle("игра");

    }


    public void paint (Graphics q ) {
        q.drawRect(200,200,50,77);

    }

    public static void main(String[] args) {
        Main m = new Main();

    }
}
