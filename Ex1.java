import java.lang.Math;
import java.util.Scanner;
public class Ex1{

	
    private static double calcula(double r) //Para calcular a area do circulo
	{
	    double area = (r^2)*Math.PI;
	    return area;
    }
    
    private static double calcula(double b, double a)//Para calcular a area do retangulo
	{
	    double area = b*a;
	    return area;
    }
    
    private static double calcula(double l1, double l2, double l3){//Para Calcular a area do triangulo
	    double area,semipe;

	    semipe = (l1+l2+l3)/2.0;
	    area = Math.sqrt(semipe*(semipe-l1)*(semipe-l2)*(semipe-l3));

	    return area;
    }

	public static void main(String[] args)
	{
		//criando objeto
		Ex1 area = new Ex1();
		//recebendo argumentos
		if(args.length == 0){
			System.out.println("Numero de argumentos insuficiente");
			return;
		}
		
		//caso seja um circulo
		else if(args.length == 1)
		{
			try{
					double raio = Double.parseDouble(args[0]);
					if(raio>0){
						double circulo = area.calcula(raio);
						String circ =String.format("%.2f",circulo);
						System.out.println("A area do circulo e: " + circ + " unidades de area.");
					}
					else{
						System.out.println("Valor informado invalido para o raio");
					}

			}catch(NumberFormatException e){
				System.out.println("Valor eh invalido:" + e);
			}

		}
		//caso seja um retangulo
		else if(args.length == 2)
		{
			try{
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[1]);
				if( a>0 && b>0){
					double retangulo = area.calcula(a,b);
					String ret =String.format("%.2f",retangulo);
					System.out.println("A area do retangulo e: " + ret + " unidades de area.");
				}
				else{
					System.out.println("Pelo menos um dos valores nao formam um retangulo");
				}

			}catch(NumberFormatException e){
				System.out.println("Pelo menos um dos valores eh invalido:" + e);
			}

		}
		//caso seja um triangulo
		else if(args.length == 3)
		{
			try{
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[1]);
				double c = Double.parseDouble(args[2]);
				if(a>0 && b>0 && c>0)
				{
					double triangulo = area.calcula(a,b,c);
					String tri =String.format("%.2f",triangulo);
					System.out.println("A area do triangulo e: " + tri + " unidades de area.");
				
					//verificando tipo de triangulo
					
					if(a==b && b==c)
					{
						System.out.println("O triangulo e equilatero.");
					}
					else if(a==b || b==c || a==c)
					{
						System.out.println("O triangulo e isoceles.");
					}
					else
					{
						System.out.println("O triangulo e escaleno.");
					}
				}
				else{
					System.out.println("Pelo menos um dos valores nao formam um triangulo");
				}
				
			}catch(NumberFormatException e){
				System.out.println("Pelo menos um dos valores eh invalido:" + e);
			}											
		}
		else{
			System.out.println("Numero de argumentos excessivo");
			return;
		}
		
	}
}
