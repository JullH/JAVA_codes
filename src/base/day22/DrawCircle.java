package src.base.day22;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{

    private Mypanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle(){
        //初始化面板
        mp = new Mypanel();
        //面板放入画框
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}

//定义面板继承JPanel
class Mypanel extends JPanel{

    /* 1.画板：Mypanel
       2.画笔：g
     */

    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);
        System.out.println(1);
        g.drawOval(10,10,100,100);
    }
}