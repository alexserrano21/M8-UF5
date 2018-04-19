public class CCompteBancari {
    //atributs d'instancia
    private int numero_compte;
    private CPersona propietari;
    private float saldo;
    //atributs de la clase
    private static int seguent_compte = 1234;
    private static float saldo_inicial = 100f; //la f es por seguridad i que el float funcione ok
    
    //GET&SET

    public CPersona getPropietari() {
        return this.propietari;
    }
    public void setPropietari(CPersona propietari) {
        this.propietari = propietari;
    }

    public int getNumero_compte() {
        return this.numero_compte;
    }
    
    //CONSTRUCTORS
    public CCompteBancari(CPersona propietari) {
        this.numero_compte = seguent_compte;
        this.propietari = propietari;
        this.saldo = saldo_inicial;
        seguent_compte ++;
    }
    //contructor copia
    public CCompteBancari(CCompteBancari compte){
        this(compte.propietari);
    }
    
    //metodo estatico de la clase para modificar saldo inicial
    public static void modificarSaldo_inicial(float saldo_inicial_nou){
        saldo_inicial = saldo_inicial_nou;
    } 
    
    //metodo del objeto para conocer el saldo actual
    public float consultarSaldo(){
       return this.saldo;
    }
    
    //metodo del objeto para comprobar numero secreto
    public boolean comprobarNumSecret(String numSecret, String numero_propietari){ //boolean perque ha de retornar true o false
        if(numSecret.equals(numero_propietari)){
            return true;
        }else{
            return false;
        }
    }
    
    //metodo ingresar 
    public boolean Ingressar(float quantitat_ingres, String numSecret){
        if(comprobarNumSecret(numSecret, propietari.getNumero_secret())) {
            this.saldo += quantitat_ingres;
            return true;
        }else{
            return false;
        }
    }
    
    //metodo ingresar 
    public boolean Extreure(float quantitat_extraccio, String numSecret){
        if(comprobarNumSecret(numSecret, propietari.getNumero_secret())) {
            this.saldo -= quantitat_extraccio;
            return true;
        }else{
            return false;
        }
    }
}