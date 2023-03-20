package JWS;
import java.util.Date;
public class Compte {
    int code;
    double solde;
    Date DateCreation;
    public Compte() {
    }
    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        DateCreation = dateCreation;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public Date getDateCreation() {
        return DateCreation;
    }
    public void setDateCreation(Date dateCreation) {
        DateCreation = dateCreation;
    }
}
