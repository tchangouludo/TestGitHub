public class Helloworld2 {
    public static void main (String [] args){
        System.out.println("HELLO WORLD");
        Rectangle rec=new Rectangle(30,15,"RECLudo");
        rec.affiche();
        System.out.println("Il a pour perimetre "+rec.perimetre()+" et pour surface "+rec.surface());
    }
}
