
import jade.core.AID;
import java.util.Scanner;



public class ComparaisonTest {


    public static void main(String[] args) {
                
        int compteur;
        double prix_enchère_meilleurs;
        double montant_enchère;
        String offreur;
        
        prix_enchère_meilleurs=0;
        montant_enchère=0;
        
        for(int i = 1; i<=4; i++) {
            Scanner clavier = new Scanner(System.in);
            System.out.println("Nom de l'agent");
            String nom=clavier.next();
            System.out.println("Le prix que j'offre");
            String prix_string=clavier.next();       
        
            System.out.println("Offre de : "+prix_string+" de la part de "+nom);
            if(prix_enchère_meilleurs<Double.parseDouble(prix_string)){
            
                 prix_enchère_meilleurs=Double.parseDouble(prix_string);
                 offreur=nom;
                        
            }
        }
        System.out.println("La meilleurs offre est : "+prix_enchère_meilleurs);
            }
    
    }
