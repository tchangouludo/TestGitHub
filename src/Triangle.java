public class Triangle {
    public String name;
    public double cote1;
    public double cote2;
    public double cote3;
    public Triangle(String name, double cote1, double cote2, double cote3) {
        this.name = name;
        this.cote1 = cote1;
        this.cote2 = cote2;
        this.cote3 = cote3;
    }

    public double perimetre() {
        return cote1 + cote2 + cote3;
    }
}
