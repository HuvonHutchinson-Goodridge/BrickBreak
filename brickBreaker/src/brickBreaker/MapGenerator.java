package brickBreaker;



import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke;

public class MapGenerator {

    public int map[][];
    public int brickWidth;
    public int brickHeight;
    public MapGenerator(int row, int col){
        map = new int[row][col];
        for (int i = 0; i< map.length; i++){
            System.out.println(i);
            for (int j = 0; j<map[0].length;j++){
                System.out.println(j);
                map[i][j] = 1; //1 detects that the brick has not intersected with the ball
                //if you don't want to add a brick change it to 0;
            }
        }
        brickHeight = 150/row;
        brickWidth = 540/col;
    }
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                    g.setStroke((new BasicStroke(3)));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }

        }
    }
    public void setBrickValue(int value, int row, int col){
        map[row][col] = value;
    }
}
