public class Helloworld2 {
    public static void main (String [] args){
        System.out.println("HELLO WORLD");
        Rectangle rec=new Rectangle(30,15,"RECLudo");
        rec.affiche();
        System.out.println("Il a pour perimetre "+rec.perimetre()+" et pour surface "+rec.surface());
        System.out.println("voici de nouvelle modifications que j'apporte a votre projet");
        Triangle tri = new Triangle("triangle", 20.0, 15.5, 35.5);
        System.out.println("Perimetre du triangle est : " + tri.perimetre());
    }
}
