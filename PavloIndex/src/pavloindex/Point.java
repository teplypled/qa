
package pavloindex;


public class Point {
    private double x;
    private double y;
    
    public Point(double X, double Y) {
        this.x = X;
        this.y = Y;
    }

    public double getX() {
        return x;
    }

    public void setX(double X) {
        this.x = X;
    }

    public double getY() {
        return y;
    }

    public void setY(double Y) {
        this.y = Y;
    }

    public double getDistance(Point snd){
        return Math.sqrt((this.x - snd.getX()) * (this.x - snd.getX()) + 
                         (this.y - snd.getY()) * (this.y - snd.getY()));
    }
    
    
}
