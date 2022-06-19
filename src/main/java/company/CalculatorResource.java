package company;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class CalculatorResource {

    Soma soma = new Soma();
    Subtrai subtrai = new Subtrai();
    Divide divide = new Divide();
    Multiplica multiplica = new Multiplica();

    @Path("sum/{n1}/{n2}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sum(double n1, double n2) {
        return String.valueOf(soma.calcula(n1, n2));
    }

    @Path("subtract/{n1}/{n2}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String subtract(double n1, double n2) {
        return String.valueOf(subtrai.calcula(n1, n2));
    }

    @Path("divide/{n1}/{n2}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String divide(double n1, double n2) {
        return String.valueOf(divide.calcula(n1, n2));
    }

    @Path("multiply/{n1}/{n2}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String multiply(double n1, double n2) {
        return String.valueOf(multiplica.calcula(n1, n2));
    }

}