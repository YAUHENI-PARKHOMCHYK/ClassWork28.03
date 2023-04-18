package homeWork;

public class Rectangle {
    private Point se;
    private Point nw;

    public Rectangle(Point se, Point nw) {
        this.se = se;
        this.nw = nw;
    }

    public Point se() {
        return se;
    }

    public void setPointSe(Point se) {
        this.se = se;
    }

    public Point nw() {
        return nw;
    }

    public void nw(Point nw) {
        this.nw = nw;
    }


        int area()
        {
            int sizeX = se.getX() - nw.getX();
            int sizeY = se.getY() - nw.getY();
            return sizeY*sizeX;
        }


}
