
package eurovision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author nadia
 */
public class Paises {
    
    private ArrayList<String> listaPaises; 
    private int[] puntuaciones; 
    /*Se podría poner como un diccionario, ya que se trata de el pais con su puntuacion actual*/
    
    public Paises(){
        listaPaises = new ArrayList<String>(Arrays.asList("ALBANIA", "ALEMANIA", "ARMENIA", "AUSTRALIA", "AUSTRIA", "AZERBAIYÁN", "BÉLGICA", "BIELORRUSIA", "BULGARIA", "CHIPRE", "CROACIA", "DINAMARCA", "ESLOVENIA", "ESPAÑA", "ESTONIA", "FINLANDIA", "FRANCIA", "GEORGIA", "GRECIA", "HUNGRÍA", "IRLANDA", "ISLANDIA", "ISRAEL", "ITALIA", "LETONIA", "LITUANIA", "MALTA", "MOLDAVIA", "NORUEGA", "PAÍSES BAJOS", "POLONIA", "PORTUGAL", "REINO UNIDO", "REPÚBLICA CHECA", "RUMANIA", "RUSIA", "SAN MARINO", "SERBIA", "SUECIA", "SUIZA", "UCRANIA"));
        /*Lista de paises que participan en eurovisión*/
        puntuaciones = new int[]{1,8,10,12};
    }

    private ArrayList generarPuntuaciones(int ediciones){
        ArrayList<Integer> listaPuntuacionesAnt = new ArrayList<Integer>(); 
        Random r = new Random(); 
        for (int j = 0; j <= ediciones-1; j++) {
            int puntuacion = 0; 
            for (int i = 0; i <= 24; i++) {
                /*25 Ya que son los paises que votan a un solo pais */
                int num = r.nextInt(3);
                puntuacion += puntuaciones[num]; 
            }
            listaPuntuacionesAnt.add(puntuacion);
        }
        return listaPuntuacionesAnt;
    }
    
    public float media(String pais, int ediciones){
        pais = pais.toUpperCase();
        ArrayList<Integer> puntuacionesAnt = generarPuntuaciones(ediciones); 
        int suma = 0; 
        for (int i = 0; i <= ediciones-1; i++){
           suma += puntuacionesAnt.get(i); 
        } 
        float media = (float) suma / ediciones;  
        return media; 
    }
    
    public ArrayList<String> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(ArrayList<String> listaPaises) {
        this.listaPaises = listaPaises;
    }

    public int[] getPuntuaciones() {
        return puntuaciones;
    }
    
}
