public class Line {
    //two Point fields referencing a null object
    private Point startPoint = null;
    private Point endPoint = null;
    //constructor that take two Points and assign them securely with deep copies
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = new Point(startPoint.getXCoordinate(), startPoint.getYCoordinate());
        this.endPoint = new Point(endPoint.getXCoordinate(), endPoint.getYCoordinate());
    }
    // two setter methods to assign the passed in Point to startPoint and one to
    // assign passed in Point to the endPoint field
    public void setStartPoint(Point startPoint) {
        this.startPoint = new Point(startPoint.getXCoordinate(), startPoint.getYCoordinate());

    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = new Point(endPoint.getXCoordinate(), endPoint.getYCoordinate());

    }
    //two getter methods:one to return the startPoint and one to return the endPoint
    public Point getStartPoint() {
        return new Point(startPoint.getXCoordinate(), startPoint.getYCoordinate());
    }

    public Point getEndPoint() {
        return new Point(endPoint.getXCoordinate(), startPoint.getYCoordinate());
    }
    //getLength method to return the length of line using formula D=√(𝑥2 − 𝑥1)2 + (𝑦2 − 𝑦1)
    //2 where D is the distance or length. x1 and y1 are the xCoordinate and yCoordinate of startPoint
    // the x2 and y2 are the xCoordinate and yCoordinate of endPoint
    public double getLength() {
        return Math.sqrt(Math.pow(endPoint.getXCoordinate() - startPoint.getXCoordinate(), 2) +
                Math.pow(endPoint.getYCoordinate() - startPoint.getYCoordinate(), 2));
    }

}
