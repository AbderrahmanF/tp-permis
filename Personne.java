
abstract public  class Personne
{
    protected String nom;
    protected String prenom;


    public Personne (String nom, String prenom)
    {
        this.nom = validate(nom, 50);
        this.prenom = validate(prenom, 30);
    }
    /**
     * @param chaine
     * @param taille
     * @return
     */
    protected String validate(String chaine, Integer taille) {
        // vérifie la taille et renvoie une chaine tronquée
        // si la taille est supérieur à 50
        chaine = chaine.substring(50, taille);
        System.out.println(chaine);
        return chaine;
    }

    public abstract String toString();
    
    public String getNom() {
       return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
