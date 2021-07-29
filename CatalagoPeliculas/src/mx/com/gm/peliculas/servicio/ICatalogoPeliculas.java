package mx.com.gm.peliculas.servicio;

public interface ICatalogoPeliculas {
    String NOMBRE_RECURSO = "Peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPrlicula(String buscar);
    
    void iniciarCatalogoPeliculas();
}
