public class Triangle implements CalcOfGeomParamsShape {
    private float sideA;
    private float sideB;
    private float sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(float sideA, float sideB, float sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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
        float p = sideA + sideB + sideC;
        System.out.println("Периметр треугольника: " + p);
    }

    public void calculS() {
        float halfP = (sideA + sideB + sideC) / 2;
        double s = Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
        System.out.println("Площадь треугольника: " + s);
    }

    public void showInfoAboutRectangle() {
        calculP();
        calculS();
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границ: " + getBorderColor());
    }
}
