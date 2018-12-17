
import java.util.Scanner;


public class Test {

    public double prix_max;
    public double prix_augmentation;
     
            public void Text(){
                
                
            
            
            
            
            
                
            }
    
    public static void main(String[] args) {
   
            
            double prix_enchere_nouveau;
            double prix_augmentation;
            double p=100;
            int pourcentage;
            
            Scanner clavier = new Scanner(System.in);
            System.out.println("Le nouveau prix d'enchère");
            String prix_enchere_string=clavier.next();
            System.out.println("Le pourcentage");
            String pourcentage_string=clavier.next();       
            
            prix_enchere_nouveau=Double.parseDouble(prix_enchere_string);
            pourcentage=Integer.parseInt(pourcentage_string);
            
            
            prix_augmentation=prix_enchere_nouveau*(pourcentage/p);
            prix_enchere_nouveau=prix_enchere_nouveau+prix_augmentation;
            
            System.out.println(prix_augmentation);
            System.out.println(prix_enchere_nouveau);
            
            
            
           
            
        
        }
}
