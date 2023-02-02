

public class Architecte extends Personne {

  private String consR;
  private boolean inscOrdre;
  private Adresse adresse;
  private String tel ;



 
  /**
 * @param nom
 * @param prenom
 * @param consR
 * @param inscOrdre
 * @param adresse
 * @param tel
 */

public Architecte (String nom, String prenom, String consR, boolean inscOrdre, Adresse adresse, String tel) {
   super(nom, prenom);
   
   this.nom = nom;
   this.prenom = prenom;
   this.consR = consR;
   this.inscOrdre = inscOrdre;
   this.adresse = adresse ;
   this.tel = tel;

   
  

    if (telVal(tel)) {
    this.tel = tel;
   } 
  else {
    this.tel =" ";
   }
}


private boolean telVal (String telephone) {
    if (telephone.length() >= 10) {
     return false;
    } else {
        for (int i=0; i<telephone.length(); i++)  {
         if (! Character.isDigit(telephone.charAt(i)))
            return false;
        }
        return true;
    }
}

   public void Maj_consR () {
    if (inscOrdre) {
     consR = consR + " inscrit ";

    } else {
     consR = consR + "Non inscrit";
    }

   }
   public String toString () {
    String chaine = "";
    chaine = chaine + this.nom + " " + this.prenom + " ";
    chaine = chaine + this.consR + " ";
    chaine = chaine + this.adresse + " ";
    chaine = chaine + this.tel + " ";

    if (inscOrdre) {
     chaine = chaine + "inscrit" ;
    } else {
     chaine = chaine + "non inscrit";
    }
    return chaine;
   }
 
  public String getConsR() {
    return consR;
}
public void setConsR(String consR) {
    this.consR = consR;
}
public boolean isInscOrdre() {
    return inscOrdre;
}
public void setInscOrdre(boolean inscOrdre) {
    this.inscOrdre = inscOrdre;
}
public String getTel() {
    return tel;
}
public void setTel(String tel) {
    this.tel = tel;
}
  }
 


  