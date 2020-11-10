import java.util.Scanner;

public class Menu {
    Calculos calculos = new Calculos();

    int num=0;
    Scanner in=new Scanner(System.in);
    public void Shape(){
    do{
        System.out.println("            Bienvenido a Shape          ");
        System.out.println("     1.-Calculo de perímetros");
        System.out.println("     2.-Calculo de areas         ");
        System.out.println("     3.-salir                             ");
        System.out.println("Seleciona una de las opciones anteriores");

        num = in.nextInt();

        switch(num) {

            case 1:
                calculos.getPerimeter();
                break;

            case 2:
                calculos.getArea();
                break;
        }
    }while(num!=3);
    }
}
