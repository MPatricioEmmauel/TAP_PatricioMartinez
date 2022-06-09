
package principal;
import java.util.ArrayList;
import java.util.Iterator;
import publicaciones.Libro;
import publicaciones.Revista;
import publicaciones.Publicaciones;
import publicaciones.Periodico;
/**
 *
 * @author Patricio
 */
public class ManPublica {
    static ArrayList<Publicaciones> Arrpublica = new ArrayList<Publicaciones>();
    private Libro objLibro;
    private Revista objRevista;
    private Periodico objPeriodico;
    private Publicaciones objPublicaciones;
    
    public ManPublica(String tit, double precio, int np){
       
        objPublicaciones = new Publicaciones();
        objPublicaciones.setTítulo(tit);
        objPublicaciones.setPrecio(precio);
        objPublicaciones.setNoPag(np);
    }
    
    public void alta (String ISBN, String Autor, String edicion){
         objLibro = new Libro();
         objLibro.setTítulo(objPublicaciones.getTítulo());
         objLibro.setPrecio(objPublicaciones.getPrecio());
         objLibro.setNoPag(objPublicaciones.getNoPag());
         objLibro.setAutor(Autor);
         objLibro.setISBN(ISBN);
         objLibro.setEdicion(edicion);
         Arrpublica.add(objLibro);
    }

   public void desplegar(){
     System.out.println("...OBJETOS EN LA PUBLICACION...");
     Iterator<Publicaciones> itrPublica = Arrpublica.iterator();
     while(itrPublica.hasNext()){
         Publicaciones publica = itrPublica.next();
         if (publica instanceof Libro ){
          Libro book = new Libro();
          book = (Libro)publica;
          System.out.println("Titulo: " + book.getTítulo());
          System.out.println("ISBN: " + book.getISBN());
          System.out.println("Autor: " + book.getAutor());
         }
         else if (publica instanceof Revista ){
          Revista maga = new Revista();
          maga = (Revista)publica;
          System.out.println("Titulo: " + maga.getTítulo());
          System.out.println("ISSN: " + maga.getISSN());
          System.out.println("Número : " + maga.getNumero());
         }
         else if (publica instanceof Periodico ){
          Periodico newspaper = new Periodico();
          newspaper = (Periodico)publica;
          System.out.println("Titulo: " + newspaper.getTítulo());
          System.out.println("Editor" + newspaper.getEditor());
          System.out.println("");
          
         }   
     }
   }
   
    public void alta (String ISSN, int num){
         objRevista = new Revista();
         objRevista.setTítulo(objPublicaciones.getTítulo());
         objRevista.setPrecio(objPublicaciones.getPrecio());
         objRevista.setNoPag(objPublicaciones.getNoPag());
         objRevista.setNumero(num);
         objRevista.setISSN(ISSN);
         Arrpublica.add(objRevista);
    }
    public void alta(String editor){
        objPeriodico = new Periodico();
        objPeriodico.setTítulo(objPublicaciones.getTítulo());
        objPeriodico.setPrecio(objPublicaciones.getPrecio());
        objPeriodico.setNoPag(objPublicaciones.getNoPag());
        objPeriodico.setEditor(editor);
         Arrpublica.add(objPeriodico);
        
    }

    public ArrayList Datos() {
        return Arrpublica;
    }

    

}