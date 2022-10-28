package miPaquete;

public class Calculadora {
    double r;
    public double suma(double x, double y)
    {
        r=x+y;
        return r;
    }

    public double resta(double x, double y)
    {
        r=x-y;
        return r;
    }

    public double multiplica(double x, double y)
    {
        r=x*y;
        return r;
    }

    public double divide(double x, double y)
    {
        r=x/y;
        return r;
    }
}