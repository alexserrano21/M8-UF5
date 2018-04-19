public class CPersona {
    private String nom;
    private String primer_cognom;
    private String segon_cognom;
    private String numero_secret;
    
    //GET&SET
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrimer_cognom() {
        return this.primer_cognom;
    }

    public void setPrimer_cognom(String primer_cognom) {
        this.primer_cognom = primer_cognom;
    }

    public String getSegon_cognom() {
        return this.segon_cognom;
    }

    public void setSegon_cognom(String segon_cognom) {
        this.segon_cognom = segon_cognom;
    }

    public String getNumero_secret() {
        return this.numero_secret;
    }

    public void setNumero_secret(String numero_secret) {
        this.numero_secret = numero_secret;
    }
    
    //CONSTRUCTOR
    public CPersona(String nom, String primer_cognom, String segon_cognom, String numero_secret) {
        this.nom = nom;
        this.primer_cognom = primer_cognom;
        this.segon_cognom = segon_cognom;
        this.numero_secret = numero_secret;
    }
    //contructor copia
    public CPersona(CPersona persona){
        this(persona.nom, persona.primer_cognom, persona.segon_cognom, persona.numero_secret);
    }
    
}
