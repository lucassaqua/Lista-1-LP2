import java.util.Scanner;
import java.lang.Math;

public class Ex1{

    private static double calcula(double r) //Para calcular a area do circulo
	{
	    double area = (r*r)*Math.PI;
	    return area;
    }
    
    private static double calcula(double b, double a)//Para calcular a area do retangulo
	{
	    double area = a*b;
	    return area;
    }
    
    private static double calcula(double l1, double l2, double l3)//Para Calcular a area do triangulo
    {
	    double area,aux;
	    
	    aux = (l1+l2+l3)/2.0;
	    area = Math.sqrt(aux*(aux-l1)*(aux-l2)*(aux-l3));

	    return area;
    }

	public static void main(String[] args)
	{
		Ex1 area = new Ex1();

		if(args.length == 0)
		{
			System.out.println("Faltam argumentos para a execucao.");
			return;
		}

		else if(args.length == 1)//Se for um circulo
		{
			try{
					double raio = Double.parseDouble(args[0]);
					if(raio>0){
						double circulo = area.calcula(raio);
						String circ =String.format("%.2f",circulo);
						System.out.println("Area do circulo = " + circ );
					}
					else{
						System.out.println("Para o calculo da area do circulo eh necessario um valor de raio > 0");
					}

			}catch(NumberFormatException e){
				System.out.println("Valor invalido:" + e);
			}
		}
		
		else if(args.length == 2)//Se for um retangulo
		{
			try{
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[1]);
				if( a>0 && b>0){
					double retangulo = area.calcula(a,b);
					String ret =String.format("%.2f",retangulo);
					System.out.println("Area do retangulo = " + ret);
				}
				else{
					System.out.println("Todos os lados devem ser positivos para o calculo de area");
				}

			}catch(NumberFormatException e){
				System.out.println("Todos os lados devem ser positivos para o calculo de area: \n" + e);
			}
		}
		
		else if(args.length == 3)//Se for um triangulo
		{
			try{
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[1]);
				double c = Double.parseDouble(args[2]);
				if(a>0 && b>0 && c>0)
				{
					double triangulo = area.calcula(a,b,c);
					String tri =String.format("%.2f",triangulo);
					System.out.println("Area do triangulo = " + tri + "\n");
				
					//checando qual tipo de triangulo
					if(a==b && b==c)
					{
						System.out.println("E ele eh equilatero.");
					}
					else if(a==b || b==c || a==c)
					{
						System.out.println("E ele eh isoceles.");
					}
					else
					{
						System.out.println("E ele eh escaleno.");
					}
				}
				else{
					System.out.println("Todos os lados devem ser positivos para o calculo de area");
				}
				
			}catch(NumberFormatException e){
				System.out.println("Todos os lados devem ser positivos para o calculo de area:\n" + e);
			}											
		}
		else{
			System.out.println("Foram digitados mais argumentos que a classe comporta.");
			return;
		}	
	}
}
