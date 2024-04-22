package src.base.day23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @version 1.0
 * @auther JullH
 */

public class BallMove extends JFrame {
    MyPanel mp = null;

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        //JFrame监听键盘
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
}

//画出小球
//KeyListener监听键盘
class MyPanel extends JPanel implements KeyListener {

    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);
    }

    //监听字符
    @Override
    public void keyTyped(KeyEvent e) {


    }

    //按下触发
    @Override
    public void keyPressed(KeyEvent e) {

        //移动
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }

        this.repaint();
    }

    //松开触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}