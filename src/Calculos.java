import java.util.Scanner;

public class Calculos {
    double alturap, alturae, radioMenor, radioMayor, grados,lado_a, perim = 0, a,
            poligono, lado, diametro, base, altura, area, radio, diagonalMayor,
            diagonalMenor, apotema, baseMayor, baseMenor, arista;

    int num=0, peri=0, ar=0, vol=0, esferas=0, prismas=0, piramides=0;

    Scanner in=new Scanner(System.in);

    public void getPerimeter(){
        do{
            System.out.println("\n");
            System.out.println("    CALCULO DE PERIMETROS");
            System.out.println("1.-Triangulo");
            System.out.println("2.-Cuadrado");
            System.out.println("3.-Poligonos regulares Mayor de 4 Lados");
            System.out.println("4.-Trapecio");
            System.out.println("5.-Rombo");
            System.out.println("6.-Romboide");
            System.out.println("7.-Rectangulo");
            System.out.println("8.-Circulo");
            System.out.println("9.-regresar al MENU PRINCIPAL");
            peri = in.nextInt();

            switch(peri){
                case 1:

                    System.out.println("\n");
                    System.out.println("Perimetro de Triangulo");

                    lado=0;

                    for(int i=1;i<=3;i++){

                        System.out.println("Ecribe el lado "+i+" en cm del TRIANGULO");
                        lado_a = in.nextInt();

                        lado=lado_a+lado;

                    }

                    System.out.println("El Perimetro del TRIANGULO es :"+lado+"cm");
                    break;
                case 2:

                    System.out.println("\n");
                    System.out.println("Perimetro de CUADRADO");

                    System.out.println("Escribe el lado en cm del CUADRADO");
                    lado_a = in.nextInt();

                    perim = lado_a*4;

                    System.out.println("El Perimetro del CUADRADO es :"+perim+"cm");
                    break;
                case 3:

                    System.out.println("\n");
                    System.out.println("Perimetro de POLIGONOS REGULARES");

                    System.out.println("Poligono mayor de 4 lados Â¿de cuantos lados es el POLIGONO?");
                    poligono= in.nextInt();

                    lado=0;
                    if(poligono>=4){

                        for(int i=1;i<=poligono;i++){

                            System.out.println("Pon el lado en cm "+i+" del POLIGONO");
                            lado_a = in.nextInt();

                            lado=lado_a+lado;
                            System.out.println("El Perimetro del POLIGONO es :"+lado+"cm");

                        }
                    }else{
                        System.out.println("ERROR");
                        System.out.println("Los lados debe de ser mayores a 4");
                        System.out.println("");
                    }

                    break;
                case 4:

                    System.out.println("\n");
                    System.out.println("Perimetro de TRAPECIO");

                    lado=0;

                    for(int i=1;i<=4;i++){

                        System.out.println("Pon el lado en cm "+i+" del TRAPECIO");
                        lado_a = in.nextInt();

                        lado=lado_a+lado;
                    }

                    System.out.println("El Perimetro del TRAPECIO es :"+lado+"cm");
                    break;
                case 5:

                    System.out.println("\n");
                    System.out.println("Perimetro de ROMBO");

                    System.out.println("Pon el lado en cm del TRAPECIO");
                    lado=in.nextInt();

                    perim= lado*4;

                    System.out.println("El Perimetro del ROMBO es :"+perim+"cm");
                    break;
                case 6:

                    System.out.println("\n");
                    System.out.println("Perimetro de ROMBOIDE");

                    System.out.println("Pon el lado 1 en cm del ROMBOIDE");
                    lado=in.nextInt();

                    System.out.println("Pon el lado 2 en cm del ROMBOIDE");
                    lado_a=in.nextInt();

                    perim= 2*(lado+lado_a);

                    System.out.println("El Perimetro del ROMBOIDE es :"+perim+"cm");
                    break;
                case 7:

                    System.out.println("\n");
                    System.out.println("Perimetro de RECTANGULO");

                    System.out.println("Pon el lado 1 en cm del RECTANGULO");
                    lado=in.nextInt();

                    System.out.println("Pon el lado 2 en cm del RECTANGULO");
                    lado_a=in.nextInt();

                    perim= 2*(lado+lado_a);

                    System.out.println("El Perimetro del RECTANGULO es :"+perim+"cm");
                    break;
                case 8:

                    System.out.println("\n");
                    System.out.println("Perimetro de CIRCULO");

                    System.out.println("Pon el diametro en cm del CIRCULO");
                    diametro=in.nextInt();

                    perim= 3.1416*diametro;

                    System.out.println("El Perimetro del CIRCULO es :"+perim+"cm");
                    break;
            }
        }while(peri!=9);
    }
    public void getArea(){
        do{
            System.out.println("\n");
            System.out.println("    CALCULO DE AREAS");
            System.out.println("1.-Triangulo");
            System.out.println("2.-Cuadrado");
            System.out.println("3.-Poligonos regulares Mayor de 4 Lados");
            System.out.println("4.-Trapecio");
            System.out.println("5.-Rombo");
            System.out.println("6.-Romboide");
            System.out.println("7.-Rectangulo");
            System.out.println("8.-Circulo");
            System.out.println("9.-regresar al MENU PRINCIPAL");
            ar = in.nextInt();

            switch(ar){
                case 1:

                    System.out.println("\n");
                    System.out.println("Area del Triangulo");

                    System.out.println("Pon la base en cm del TRIANGULO");
                    base=in.nextInt();

                    System.out.println("Pon la base en cm del TRIANGULO");
                    altura=in.nextInt();

                    area=(base*altura)/2;

                    System.out.println("El Area del TRIANGULO es :"+area+"cm2");
                    break;
                case 2:

                    System.out.println("\n");
                    System.out.println("Area de CUADRADO");

                    System.out.println("Pon el lado en cm del CUADRADO");
                    lado=in.nextInt();

                    area = lado*lado;

                    System.out.println("El Area del CUADRADO es :"+area+"cm2");
                    break;
                case 3:

                    System.out.println("\n");
                    System.out.println("Perimetro de POLIGONOS REGULARES");

                    lado=0;

                    System.out.println("Â¿de cuantos lados es el POLIGONO REGULAR?");
                    poligono= in.nextInt();

                    for(int i=1;i<=poligono;i++){

                        System.out.println("Pon el lado en cm "+i+" del POLIGONO REGULAR");
                        lado_a = in.nextInt();

                        lado=lado_a+lado;

                    }

                    System.out.println("escribe la apotema en cm del POLIGONO");
                    apotema = in.nextInt();

                    area=(lado*apotema)/2;

                    System.out.println("El Area del POLIGONO es :"+area+"cm2");
                    break;
                case 4:

                    System.out.println("\n");
                    System.out.println("Perimetro de TRAPECIO");

                    System.out.println("Pon la base mayor en cm del TRAPECIO");
                    baseMayor = in.nextInt();

                    System.out.println("Pon la base menor en cm del TRAPECIO");
                    baseMenor = in.nextInt();

                    System.out.println("Pon la altura en cm del TRAPECIO");
                    altura = in.nextInt();

                    area = ((baseMayor+baseMenor)*altura)/2;

                    System.out.println("El Perimetro del TRAPECIO es :"+area+"cm2");
                    break;
                case 5:

                    System.out.println("\n");
                    System.out.println("Area de ROMBO");

                    System.out.println("Pon la diagonal mayor en cm del ROMBO");
                    diagonalMayor=in.nextInt();

                    System.out.println("Pon la diagonal menor en cm del ROMBO");
                    diagonalMenor=in.nextInt();

                    area=(diagonalMayor*diagonalMenor)/2;

                    System.out.println("El Perimetro del ROMBO es :"+area+"cm2");
                    break;
                case 6:

                    System.out.println("\n");
                    System.out.println("Area de ROMBOIDE");

                    System.out.println("Pon la base en cm del ROMBOIDE");
                    base=in.nextInt();

                    System.out.println("Pon la altura en cm del ROMBOIDE");
                    altura=in.nextInt();

                    area=base*altura;

                    System.out.println("El Perimetro del ROMBOIDE es :"+area+"cm2");
                    break;
                case 7:

                    System.out.println("\n");
                    System.out.println("Area de RECTANGULO");

                    System.out.println("Pon la base en cm del RECTANGULO");
                    base=in.nextInt();

                    System.out.println("Pon la altura en cm del RECTANGULO");
                    altura=in.nextInt();

                    area= base*altura;

                    System.out.println("El Area del RECTANGULO es :"+area+"cm2");
                    break;
                case 8:

                    System.out.println("\n");
                    System.out.println("Area de CIRCULO");

                    System.out.println("Pon el radio en cm del CIRCULO");
                    radio=in.nextInt();

                    area = (radio*radio)*3.1416;

                    System.out.println("El Area del CIRCULO es :"+area+"cm2");
                    break;
            }
        }while(ar!=9);
    }
}
