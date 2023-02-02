
public class Deposant extends Personne {

    private  String civil;
    private String mail;
    private Adresse adresse;
    
    public Deposant(String nom, String prenom, String civil, String mail, Adresse adresse, Deposant deposant){
            super(nom, prenom);

deposant.civil = validate (civil, 10);
deposant.mail = validate (mail, 100);

    }
    
  public String getCivil(){
    return civil;
  }  

  public void setCivil(String civil) {
    this.civil = civil ;
  }

public String  getMail(){
    return mail;
}

public Adresse getAdresse(){
    return adresse;
}

public void setAdresse(Adresse adresse){
    this.adresse = adresse;
}



public String toString(){
    return "Deposant civilite=" +civil+ ", mail= " + mail+  ", adresse= " +adresse+ ", nom=" + nom + ", prenom" + prenom + "";
}

    }

