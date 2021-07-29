package beans;

import javax.jws.*;

@WebService
public interface ServicioSumaWS {
    
    @WebMethod
    public int sumar(int a, int b);
}
