package eurovision;

import java.net.URL;
import java.util.Arrays;

/**
 *
 * @author nadia
 */
public class Cancion {

    private String autor;
    private String nombre;
    private URL url;
    private String pais;
    private Paises listaPaises;
    private int puntuacion;  

    public Cancion(String autor, String nombre, URL url, String pais, Paises listaPaises) {
        this.listaPaises = listaPaises;
        setAutor(autor);
        setNombre(nombre);
        setPais(pais); 
        this.url = url;
        /*pensar una comprobacion para saber si es una url*/
        puntuacion = 0;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (!autor.equals("")) {
            this.autor = autor;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.equals("")) {
            this.nombre = nombre;
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        if (listaPaises.getListaPaises().contains(pais)) {
            this.pais = pais;
        } else {
            Vista.noParticipa();
        }

    }
    
    private boolean puntuacionValida(int puntuacion){
        return Arrays.asList(listaPaises.getPuntuaciones()).contains(puntuacion); 
        /*Convierte el array de puntuaciones en un arrayList para comprobar si contiene el valor mediante el método contains de arrayList*/
    }   
    
    public boolean ganarPuntuacion(int puntuacion){
        if (puntuacionValida(puntuacion)){
            this.puntuacion += puntuacion; 
            return true; 
        } else {
            Vista.puntuacionNoValida();
            return false; 
        }
    }
}
