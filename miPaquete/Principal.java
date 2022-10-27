package miPaquete;

public class Principal
{
    public static void main(String[] args)
    {
        Calculadora c = new Calculadora();
        System.out.println("MI CALCULADORA");
        System.out.println("==============");

        System.out.println("12+4=" + c.suma(12, 4));
        System.out.println("12-4=" + c.resta(12, 4));
        System.out.println("12*4=" + c.multiplica(12, 4));
        System.out.println("12/4=" + c.divide(12, 4));
    }
}