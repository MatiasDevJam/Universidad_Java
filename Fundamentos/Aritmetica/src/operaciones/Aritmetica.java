package operaciones;

public class Aritmetica {
    int a;
    int b;
    
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
}
    public int sumaConRetorno(){
        return this.a + this.b;
    }
    
    public int sumarConArgumento(int a, int b){
        this.a = a;
        this.b = b;
        return this.sumaConRetorno();
    }
}
