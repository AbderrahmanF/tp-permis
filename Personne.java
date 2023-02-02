
abstract class Personne
{
    private String nom;
    private String prenom;


    public Personne (String nom, String prenom)
    {
        this.nom = validate(nom, 50);
        this.prenom = validate(prenom, 30);
    }
    private String validate(String chaine, Integer taille) {
        // vérifie la taille et renvoie une chaine tronquée
        // si la taille est supérieur à 50
        chaine = chaine.substring(50, taille);
        System.out.println(chaine);
        return chaine;
    }

    public abstract String toString();
}
