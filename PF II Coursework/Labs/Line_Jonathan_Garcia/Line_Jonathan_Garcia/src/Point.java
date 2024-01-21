public class Point {
    //two fields x and y coordinate initialized to 0
    private double xCoordinate = 0.0;
    private double yCoordinate = 0.0;

    //parameterized constructor that sets the XCoordinate and YCoordinates
    // to the (values) passed INto the constructor
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;

    }
    //two setter methods with passed IN ^ values (double xCoordinate and double yCoordinate)
    public void setXCoordinate(double xCoordinate){

        this.xCoordinate = xCoordinate;

    }

    public void setYCoordinate ( double yCoordinate){
        this.yCoordinate = yCoordinate;

    }
    // two getter methods to return xCoordinate and yCoordinate
    public double getXCoordinate () {
        return xCoordinate;

}

    public double getYCoordinate (){
        return yCoordinate;
    }

}