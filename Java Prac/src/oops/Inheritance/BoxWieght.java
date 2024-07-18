package oops.Inheritance;

public class BoxWieght extends Box {
    double wieght;

    public BoxWieght(){
        this.wieght = -1;
    }
    public BoxWieght(double l , double h , double w,double wieght){
        super(l,h,w); // what is this ? call the parent class constructor
        // used to intialise values present in parent class
        this.wieght = wieght;
    }

}
