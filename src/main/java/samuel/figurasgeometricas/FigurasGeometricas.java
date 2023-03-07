/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package samuel.figurasgeometricas;
import java.util.Scanner;
/**
 *
 * @author samuelortiz
 */
// Clase FigurasGeometricas
public class FigurasGeometricas {
    
    float area=0,h,b;
    
    
    public void circulo(){
        Scanner entrada =new Scanner (System.in);
        int radi;
        System.out.println("Area del circulo");
        System.out.println("Ingrese el radio del circulo");
        radi=entrada.nextInt();
        area=(float)(radi+3.1416);
        System.out.println("el area es ;"+area);
        
    }
public void cuadrado(){
        Scanner entrada =new Scanner (System.in);
            System.out.println("Area de cuadrado");
            System.out.println("Ingrese la altura");
            h=entrada.nextInt();
            System.out.println("ingrese la base ");
            b=entrada.nextInt();
            area=b*h;
            System.out.println("el area del cuadrado es "+area);
            
            
            
    
    
    
}
    public void triangulo(){
        
        Scanner entrada =new Scanner (System.in);
        System.out.println("Area de triangulo");
                System.out.println("ingresa altura");

        h= entrada.nextInt();
        System.out.println("Ingresa base");
        b=entrada.nextInt();
        area=b*h/2;
                
                 
    }
    public void rectangulo(){
        Scanner entrada =new Scanner (System.in);
        System.out.println("Area cuadrado");
        System.out.println("Ingresa altura");
        h=entrada.nextInt();
        System.out.println("Ingrsa la base");
        b=entrada.nextInt();
        area =h*b;
        System.out.println("el area del rectanguloes "+area);
            
        
        
    }
    public void esfera (){
        
        Scanner entrada =new Scanner (System.in);
        int radi;
        System.out.println("area de circulo");
        System.out.println("ingrese el radio");
        radi=entrada.nextInt();
        area=(float)((4*radi)*3.1416);
        System.out.println("en area es "+ area);
        
        
        
    }
    
    public void cubo(){
Scanner entrada=new Scanner (System.in);
        System.out.println("area del cubo");
        System.out.println("ingresa altura");
        h=entrada.nextInt();
        System.out.println("ingresa base");
        b=entrada.nextInt();
        area=6*h*b;
        System.out.println("el area del cubo es "+area);
        
    
    
    
    
}
    
   public static void main (String[] args){
       
       FigurasGeometricas fig=new FigurasGeometricas();
       fig.circulo();
       fig.cuadrado();
       fig.triangulo();
       fig.rectangulo();
       fig.esfera();
       fig.cubo();
       
       
   }
}

 