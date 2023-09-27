package usecase;

public class Fits {
    private final Photo photo1;
    private final Photo photo2;
    private int x;
    private int y;

    public Fits(Photo photo1, Photo photo2, int x, int y){
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.x = x;
        this.y = y;
    }
    public boolean handle() {
        return (fitsHorizontal() || fitsVertical());
    }

    private boolean fitsHorizontal() {
        return (photo1.area() < x * y && photo2.area() < x * y) ||
                (photo1.area() < y * x && photo2.area() < y * x);
    }

    private boolean fitsVertical() {
        return (photo1.area() < y * x && photo2.area() < y * x) ||
                (photo1.area() < x * y && photo2.area() < x * y);
    }
}

