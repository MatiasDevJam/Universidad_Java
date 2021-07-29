package paquete1;

class Clase1 {

    private String atributoPrivado = "Valor Atributo Privado";
    
    private Clase1(){
        System.out.println("Constructor privado");
    }
    
    public Clase1(String arg){
        this();
        System.out.println("Contructor publico");
    }
    
    private void metodoDefault(){
        System.out.println("metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    

}
