package usecase;

public class Photo {

    private final int width;
    private final int height;

    public Photo(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

}
