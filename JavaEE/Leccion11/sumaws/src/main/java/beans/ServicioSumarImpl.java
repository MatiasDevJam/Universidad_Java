package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "beans.ServicioSumarWS")
public class ServicioSumarImpl implements ServicioSumaWS{

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
    
}
