package Ejercicio1;

public class Biblioteca {
    //------------[ATRIBUTOS]------------//
    int indice;
    int cantTotal;
    Libro[] libros = new Libro[cantTotal];

    //------------[METODOS]------------//
    public Biblioteca(){
        indice = 0;
        cantTotal = 10;
    }

    public boolean agregarLibro(String titulo, String autor, String isbn, int paginas, int anio){
        if (indice < cantTotal){
            libros[indice].setTitulo(titulo);
            libros[indice].setAnio(anio);
            libros[indice].setAutor(autor);
            libros[indice].setIsbn(isbn);
            libros[indice].setPaginas(paginas);
            libros[indice].agregarEjemplar();
            indice++;
            return true;
        }
        else return false;
    }

    public Libro buscarLibro(String titulo){
        int i = 0;
        boolean bandera = true;
        while (i < libros.length && bandera){
            if (libros[i].getTitulo() == titulo){
                bandera = false;
            }
            else i++;
        }

        if (i >= libros.length){
            return null;
        }

        return libros[i];
    }

    public void agregarEjemplar(String titulo){
        Libro lib = buscarLibro(titulo);
        lib.agregarEjemplar();
    }

    public boolean prestar(String titulo){
        Libro lib = buscarLibro(titulo);
        return lib.prestar();
    }

    public int cantPrestamos(){
        int cant = 0;
        for (int i = 0; i < libros.length; i++){
            cant += libros[i].getPrestados();
        }
        return cant;
    }
}