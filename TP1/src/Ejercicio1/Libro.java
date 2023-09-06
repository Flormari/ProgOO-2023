package Ejercicio1;

public class Libro {
    //atributos
    private String titulo;
    private String autor;
    private String isbn;
    private int paginas;
    private Ejemplar ejemplaresTotales;
    private int anio;
    private int prestados;

    //Tambien se puede crear otra clase "ejemplares" y ahorrarnos los atributos prestados y ejemplaresTotales

    //Metodo

    public Libro(){
        prestados = 0;
        ejemplaresTotales = 0;
    } //Constructor

    //-----------------------[SET]-----------------------
    public void setTitulo (String unTitulo){
        titulo = unTitulo;
    }

    public void setAutor (String unAutor){
        autor = unAutor;
    }

    public void setIsbn (String unIsbn){
        isbn = unIsbn;
    }

    public void setPaginas (int CPaginas){
        paginas = CPaginas;
    }

    public void setAnio (int unAnio){
        anio = unAnio;
    }

    //-----------------------[GET]-----------------------
    public String getTitulo (){
        return titulo;
    }

    public String getAutor (){
        return autor;
    }

    public String getIsbn (){
        return isbn;
    }

    public int getPaginas (){
        return paginas;
    }

    public int getAnio (){
        return anio;
    }

    public int getEjemplares (){
        return ejemplaresTotales;
    }

    public int getPrestados (){
        return prestados;
    }

    //-----------------------[RESTO]-----------------------

    public void verDescripcion(){
        System.out.printf("Nombre del Libro: %s\n", titulo);
        System.out.printf("Autor: %s\n", autor);
        System.out.printf("ISBN: %s\n", isbn);
        System.out.printf("Paginas: %i\n", paginas);
        System.out.printf("Anio: %i\n", anio);
    }

    //Agregar un ejemplar del mismo libro
    public void agregarEjemplar(){
        ejemplaresTotales++;
    }

    public boolean prestar(){
        if (ejemplaresTotales > prestados){
            prestados ++;
            return true;
        }
        else return false;
    }

    public boolean devolver(){
        if (prestados > 0){
            prestados --;
            return true;
        }
        else return false;
    }

    public int Disponibles(){

    }
}
