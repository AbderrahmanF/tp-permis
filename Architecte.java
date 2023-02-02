import java.util.*;

 public class Architecte extends Personne {

  private String consR;
  private boolean inscOrdre;

  // private boolean telVal;

 
  public String Architecte (String nom, String prenom, String civilite, String mail, String consR, boolean inscOrdre, Adresse adresse, String telephone) {
   super(nom, prenom);
   this.consR = consR;
   this.inscOrdre = inscOrdre;
   this.adresse = adresse;

   public void setConsR(String consR) {
    this.consR = consR;
   }
 
   public String getConsR() {
    return consR;
   }

   boolean telVal {
   if (telVal(tel)) {
    this.telVal = tel;
   } else {
    this.tel =" ";
    Maj_conseilRegional();
   }
   private boolean telValide (String telephone){
    if (telephone.length() == 10 && telephone.equals(telephone)) {
     return true;
    } else {
     return false;
    }
   }

   public void Maj_conseilRegional () {
    if (inscOrdre) {
     consR = consR + " inscrit au conseil de l'ordre";

    } else {
     consR = consR + "Non inscrit au conseil de l'ordre";
    }

   }
   public String toString () {
    String chaine = "";
    chaine = chaine + this.nom + " " + this.prenom + " ";
    chaine = chaine + this.civilite + " " + this.mail + "";
    chaine = chaine + this.consR;
    chaine = chaine + this.adresse + " ";
    chaine = chaine + this.telephone + " ";

    if (inscOrdre) {
     chaine = chaine + "inscrit" + " ";
    } else {
     chaine = chaine + "non inscrit" + " ";
    }
    return chaine;
   }
  }
 }

//return this.nom+ " " + this.prenom;
