public class Point {


    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double distance(Point p2){
        double dx = x - p2.x;
        double dy = y - p2.y;

        return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
