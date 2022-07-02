import java.util.Scanner;

public class Arbol_navidad
{
    private int estrellas = 1;
    private int espacios = 1;
    Scanner sc = new Scanner(System.in);

    public Arbol_navidad()
    {
        try
        {
            System.out.printf("%s \n %s", "Introduce numero de pisos numerico de caracter entero positivo", "-->");
            final int pisos = Integer.parseInt(sc.nextLine());

            if (pisos > 0)
                crear_arbol(pisos);
            else
                System.err.println("Introduzca numero entero positivo");
        }
        catch (Exception e)
        {
            System.err.println("Introduzca numero");
        }
    }

    private void crear_arbol(int pisos)
    {
        for (int i = 0; i < pisos; i++)
        {
            for (int j = 0; j < pisos - espacios; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < estrellas; k++)
            {
                System.out.print("*");
            }
            estrellas += 2;
            espacios++;
            System.out.println();
        }
    }
}
