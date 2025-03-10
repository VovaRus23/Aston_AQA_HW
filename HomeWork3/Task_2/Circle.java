public class Circle implements CalcOfGeomParamsShape {
    private int r;
    private String fillColor;
    private String borderColor;

    public Circle(int r, String fillColor, String borderColor) {
        this.r = r;
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
        float p = 2 * pi * r;
        System.out.println("Периметр круга: " + p);
    }

    public void calculS() {
        float s = pi * r * r;
        System.out.println("Площадь круга: " + s);
    }

    public void showInfoAboutCircle() {
        calculP();
        calculS();
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границ: " + getBorderColor());
    }
}
