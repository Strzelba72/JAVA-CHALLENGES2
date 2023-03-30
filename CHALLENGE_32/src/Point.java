public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance()
    {
        return Math.sqrt((x)*(x)+(y)*(y));

    }
    public double distance(double x, double y)
    {
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
    public double distance(Point var)
    {
        return Math.sqrt((var.x-this.x)*(var.x-this.x)+(var.y-this.y)*(var.y-this.y));
    }

}
