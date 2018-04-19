import java.util.ArrayList;
public class A9_E1 {
    public static void main(String[] args) {
       int opcio = 0;
       int cont_comptesBancaris = 0; 
       ArrayList<CCompteBancari> comptesBancaris = new ArrayList();
        do{
            System.out.println("Introdueix una opcio:");
            System.out.println("1 - Crear nou compte");
            System.out.println("2 - Modificar compte");
            System.out.println("3 - Eliminar compte");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Ingressar");
            System.out.println("6 - Extreure");
            System.out.println("7 - Modificar número secret");
            System.out.println("8 - Sortir");
            opcio = cLlegir.datoInt(); //leer opcion
        switch(opcio){
                case 1: System.out.println("Crear nou compte");
                       System.out.println("Introdueix les dades seguents:");
                       System.out.println("Nom");
                       String nom = cLlegir.dato();
                       System.out.println("Primer Cognom");
                       String primer_cognom = cLlegir.dato();
                       System.out.println("Segon Cognom");
                       String segon_cognom = cLlegir.dato();
                       System.out.println("Numero Secret");
                       String numero_secret = cLlegir.dato();
                       if(numero_secret.length()==4){
                           System.out.println("Dades correctes!");
                           comptesBancaris.add(new CCompteBancari(new CPersona(nom, primer_cognom, segon_cognom, numero_secret)));
                           cont_comptesBancaris++;
                       }else{
                           System.out.println("Dades incorrectes!");
                       }
                break; 
                case 2: System.out.println("Modificar compte");
                        if(!comptesBancaris.isEmpty()){
                            System.out.println("Numero del compte a modificar");
                            int numero_compte = cLlegir.datoInt();
                            int cont = 0; //para las entradas al else
                            for(CCompteBancari compte:comptesBancaris){ //es un foreach
                                if(numero_compte == compte.getNumero_compte()) {
                                    System.out.println("Introdueix el numero secret:");
                                    String n_secret = cLlegir.dato();
                                    if(compte.comprobarNumSecret(n_secret, compte.getPropietari().getNumero_secret())){
                                        System.out.println("Introdueix les dades seguents:");
                                        System.out.println("Nom");
                                        String nom_nou = cLlegir.dato();
                                        System.out.println("Primer Cognom");
                                        String primer_cognom_nou = cLlegir.dato();
                                        System.out.println("Segon Cognom");
                                        String segon_cognom_nou = cLlegir.dato();
                                        compte.getPropietari().setNom(nom_nou);
                                        compte.getPropietari().setPrimer_cognom(primer_cognom_nou);
                                        compte.getPropietari().setPrimer_cognom(segon_cognom_nou);
                                    }else{
                                        System.out.println("El numero no es correcte!");
                                    }
                                }else{
                                    cont ++;
                                }
                            }
                            if (cont == cont_comptesBancaris) {
                                System.out.println("El compte no existeix");
                            }
                        }
                break; 
                 case 3: System.out.println("Eliminar compte"); //PETA!!!!!
                        if(!comptesBancaris.isEmpty()){
                            System.out.println("Numero del compte a eliminar");
                            int numero_compte = cLlegir.datoInt();
                            int cont = 0; //para las entradas al else
                            for(CCompteBancari compte:comptesBancaris){ //es un foreach
                                if(numero_compte == compte.getNumero_compte()) {
                                    System.out.println("Introdueix el numero secret:");
                                    String n_secret = cLlegir.dato();
                                    if(compte.comprobarNumSecret(n_secret, compte.getPropietari().getNumero_secret())){
                                        comptesBancaris.remove(compte);//preguntar!!
                                        System.out.println("Compte eliminat correctament!");
                                        break;
                                    }else{
                                        System.out.println("El numero no es correcte!");
                                    }
                                }else{
                                    cont ++;
                                }
                            }
                            if (cont == cont_comptesBancaris) {
                                System.out.println("El compte no existeix");
                            }
                        }
                break; 
                case 4: System.out.println("Consultar saldo");
                         if(!comptesBancaris.isEmpty()){
                            System.out.println("Numero del compte per a la consulta");
                            int numero_compte = cLlegir.datoInt();
                            int cont = 0; //para las entradas al else
                            for(CCompteBancari compte:comptesBancaris){ //es un foreach
                                if(numero_compte == compte.getNumero_compte()) {
                                    System.out.println("Introdueix el numero secret:");
                                    String n_secret = cLlegir.dato();
                                    if(compte.comprobarNumSecret(n_secret, compte.getPropietari().getNumero_secret())){
                                        float valor_saldo = compte.consultarSaldo();
                                        System.out.println("El saldo es: " + valor_saldo); 
                                    }else{
                                        System.out.println("El numero no es correcte!");
                                    }
                                }else{
                                    cont ++;
                                }
                            }
                            if (cont == cont_comptesBancaris) {
                                System.out.println("El compte no existeix");
                            }
                        }
                break; 
                case 5: System.out.println("Ingressar");
                         if(!comptesBancaris.isEmpty()){
                            System.out.println("Numero del compte a fer l'ingres");
                            int numero_compte = cLlegir.datoInt();
                            int cont = 0; //para las entradas al else
                            for(CCompteBancari compte:comptesBancaris){ //es un foreach
                                if(numero_compte == compte.getNumero_compte()) {
                                    System.out.println("Introdueix el numero secret:");
                                    String n_secret = cLlegir.dato();
                                    if(compte.comprobarNumSecret(n_secret, compte.getPropietari().getNumero_secret())){
                                        System.out.println("Introdueix la quantitat a ingressar: ");
                                        float valor_ingreso = cLlegir.datoFloat();
                                        if(compte.Ingressar(valor_ingreso, n_secret)){
                                            System.out.println("Ingres realitzat correctament!");
                                        }else{
                                            System.out.println("L'ingres no s'ha realitzat!");
                                        }
                                    }else{
                                        System.out.println("El numero no es correcte!");
                                    }
                                }else{
                                    cont ++;
                                }
                            }
                            if (cont == cont_comptesBancaris) {
                                System.out.println("El compte no existeix");
                            }
                        }
                break; 
                case 6: System.out.println("Extreure");
                      if(!comptesBancaris.isEmpty()){
                            System.out.println("Numero del compte per a extreure");
                            int numero_compte = cLlegir.datoInt();
                            int cont = 0; //para las entradas al else
                            for(CCompteBancari compte:comptesBancaris){ //es un foreach
                                if(numero_compte == compte.getNumero_compte()) {
                                    System.out.println("Introdueix el numero secret:");
                                    String n_secret = cLlegir.dato();
                                    if(compte.comprobarNumSecret(n_secret, compte.getPropietari().getNumero_secret())){
                                        System.out.println("Introdueix la quantitat a extreure: ");
                                        float valor_extraer = cLlegir.datoFloat();
                                        if(compte.consultarSaldo()>valor_extraer){
                                            if(compte.Extreure(valor_extraer, n_secret)){
                                                System.out.println("Extraccio realitzada correctament!");
                                            }else{
                                                System.out.println("L'ingres no s'ha realitzat!");
                                            }
                                                
                                            }else{
                                                System.out.println("No pots deixar el compte en negatiu");
                                            }     
                                    }else{
                                        System.out.println("El numero no es correcte!");
                                    }
                                }else{
                                    cont ++;
                                }
                            }
                            if (cont == cont_comptesBancaris) {
                                System.out.println("El compte no existeix");
                            }
                        } 
                break; 
                case 7: System.out.println("Modificar número secret");
                        if(!comptesBancaris.isEmpty()){
                            System.out.println("Numero del compte per a extreure");
                            int numero_compte = cLlegir.datoInt();
                            int cont = 0; //para las entradas al else
                            for(CCompteBancari compte:comptesBancaris){ //es un foreach
                                if(numero_compte == compte.getNumero_compte()) {
                                    System.out.println("Introdueix el numero secret:");
                                    String n_secret = cLlegir.dato();
                                    if(compte.comprobarNumSecret(n_secret, compte.getPropietari().getNumero_secret())){
                                        System.out.println("Introdueix el numero secret actual: ");    
                                        String n_secret_actual = cLlegir.dato();
                                        if(compte.comprobarNumSecret(n_secret_actual, compte.getPropietari().getNumero_secret())){
                                            //FALTA MODIFICAR!!
                                        }
         
                                    }else{
                                        System.out.println("El numero no es correcte!");
                                    }
                                }else{
                                    cont ++;
                                }
                            }
                            if (cont == cont_comptesBancaris) {
                                System.out.println("El compte no existeix");
                            }
                        } 
                break; 
                case 8: System.out.println("Sortint del programa...");   
                return; 
            }
        }while(opcio != 8);
    }
}