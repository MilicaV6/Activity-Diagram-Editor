package model;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MovingAdapter extends MouseAdapter {
	private int x;
    private int y;

    @Override
    public void mousePressed(MouseEvent e) {
        
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        doMove(e);
    }   
    
    private void doMove(MouseEvent e) {
        
        int dx = e.getX() - x;
        int dy = e.getY() - y;

        if (zrect.isHit(x, y)) {
            
            zrect.addX(dx);
            zrect.addY(dy);
            repaint();
        }

       

        x += dx;
        y += dy;            
    }
}


}
