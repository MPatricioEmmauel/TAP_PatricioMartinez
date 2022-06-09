
package publicaciones;

/**
 *
 * @author Patricio
 */
public class Libro extends Publicaciones{
    private String autor;
    private String ISBN;
    private String edicion;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }


    
}
