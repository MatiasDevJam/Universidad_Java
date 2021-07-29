package operaciones;


public class PruebaArtimetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 5;
        aritmetica1.b = 6;
        aritmetica1.sumar();
        
        var resultado = aritmetica1.sumaConRetorno();
        System.out.println("resultado desde la clase de prueba= " + resultado);
        
        resultado = aritmetica1.sumarConArgumento(8, 5);
        System.out.println("resultado usando argumentos = " + resultado);
    }
}
