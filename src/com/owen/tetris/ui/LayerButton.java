package com.owen.tetris.ui;

import java.awt.*;

/**
 * Created by mike on 15/12/15.
 */
public class LayerButton extends Layer {

    public LayerButton(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    public void paint(Graphics g) {
        this.createWindow(g);
    }

}
