package eurovision;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

/**
 *
 * @author nadia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Paises p = new Paises(); 
//        URL n = new URL(); 
//        System.out.println(n);
        System.out.println("Quiere abrir la url en su navegador: s|n");
        Scanner sc = new Scanner(System.in); 
        String opcion = sc.next(); 
        if (opcion.equals("s")){
            try {
                Desktop.getDesktop().browse(new URI("https://chat.openai.com/c/16d4a495-ea70-4a8b-9814-126e034728be"));
            } catch (Exception e) {
                e.printStackTrace();
        }
        }
    }
    
    
}
