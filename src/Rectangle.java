public class Rectangle {
    public double longueur;
    public double largeur;
    public String nomRec;

    public Rectangle(double longueur, double largeur, String nomRec){
        this.longueur=longueur;
        this.largeur=largeur;
        this.nomRec=nomRec;
    }
    public double perimetre(){
        return 2*(longueur+largeur);
    }
    public double surface(){
        return longueur*largeur;
    }
    public void affiche(){
        System.out.println("Le rectangle "+nomRec+" est de longueur "+longueur+" et de largeur "+largeur);
    }
}
