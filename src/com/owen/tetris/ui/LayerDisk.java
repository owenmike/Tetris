package com.owen.tetris.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mike on 15/12/15.
 */
public class LayerDisk extends Layer {

    public LayerDisk(int x, int y, int w, int h) {
        super(x, y, w, h);
    }


    public void paint(Graphics g) {
        this.createWindow(g);
        g.drawImage(Img.DISK, this.x + PADDING, this.y + PADDING, null);
    }

}
