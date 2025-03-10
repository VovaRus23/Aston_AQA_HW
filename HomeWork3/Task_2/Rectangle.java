public class Rectangle implements CalcOfGeomParamsShape {
    private int len;
    private int width;
    private String fillColor;
    private String borderColor;

    public Rectangle(int len, int width, String fillColor, String borderColor) {
        this.len = len;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void calculP() {
        int p = 2 * (len + width);
        System.out.println("Периметр прямоугольника: " + p);
    }

    public void calculS() {
        int s = len * width;
        System.out.println("Площадь прямоугольника: " + s);
    }

    public void showInfoAboutRectangle() {
        calculP();
        calculS();
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границ: " + getBorderColor());
    }
}
