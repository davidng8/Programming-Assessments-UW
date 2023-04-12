import java.awt.*;
//this program makes a cafeWall illusion
    public class CafeWall {
        final static int MORTAR = 4;
        public static void main(String[] args){
            DrawingPanel picture = new DrawingPanel (650,400);
            picture.setBackground(Color.GRAY);
            Graphics g = picture.getGraphics();
            rows(g, 0, 0, 4, 20); //row a
            rows(g, 50, 70, 5, 30); //row b
            grids(g, 400, 20, 2, 35, 35);//grid c
            grids(g, 10, 150, 4, 25, 0);// grid d 
            grids(g, 250, 200, 3, 25, 10);//grid e
            grids(g, 425, 180, 5, 20, 10);//grid f

}
//this method will draw out the rows with the x's in them.
    public static void rows(Graphics g, int x, int y, int pair, int size ) {
        for(int box = 0; box < pair ; box++){
            g.setColor(Color.BLACK);
            g.fillRect(box * size * 2 + x, y, size, size);
            g.setColor(Color.WHITE);
            g.fillRect(box * (size * 2) + size + x, y, size, size);
            g.setColor(Color.BLUE);
            g.drawLine(box * size * 2 + x, size + y, box * (2 * size) + size + x, y);
            g.drawLine(box * size * 2 + x, y, box * (2 * size) + size + x, y + size);      
        }
    }
//this method will repeat rows using the method above to draw boxes and x's.
    public static void grids(Graphics g, int x, int y, int pair, int size, int offset){
        for(int box = 0; box < pair ; box++){
            rows(g, x + offset ,y + MORTAR * 2 + 1 + size * 2 * (box + 1) - size - MORTAR * 2, pair , size);
            rows(g, x, y + MORTAR * 2 + size * 2 * (box + 1) - size * 2 - MORTAR * 2, pair, size);
        }
    }
}

