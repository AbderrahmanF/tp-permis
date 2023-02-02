public class Adresse {
 private String rue;
 private String Ville;
 private String CP;

 public Adresse(String rue, String ville, String cP){
    this.rue = validate(rue, 100);
    this.Ville = validate(ville, 20);
    this.CP = validate(CP, 5);
}
private String validate (String  chaine, Integer taille){
    chaine = chaine.substring(0, Math.min(chaine.length(), taille));
    return chaine;
}
public String toString(){
    return rue + "," + Ville + " " + CP ; 
}
    
}
