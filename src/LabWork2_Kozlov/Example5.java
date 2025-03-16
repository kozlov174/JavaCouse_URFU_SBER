package LabWork2_Kozlov;

class Rectange{
    private int height;
    private int width;

    public Rectange(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSqare(){
        return height*width;
    }
    public int getPerimeter(){
        return (height+width)*2;
    }

    public static void main(String[] args) {
        Rectange rectange = new Rectange(10, 20);
        System.out.println(rectange.getSqare());
        System.out.println(rectange.getPerimeter());
    }
}


