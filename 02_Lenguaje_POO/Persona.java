import java.util.Scanner;

public class Persona{

    public void atributos1(){
        
        String nombre = "Miguel Angel";
        String apellido = "Mejia";
        int edad = 21;
        String genero = "M";

        System.out.println("NOMBRE: "+nombre+"\nAPELLIDO: "+apellido+"\nEDAD: "+edad+"\nGENERO: "+genero+"");
    }

    public void atributos2(){
        Scanner consola = new Scanner(System.in);
        /*String nombre;
        String apellido;
        int edad;
        String genero;*/

        System.out.print("Introduce un NOMBRE: ");
        String nombre = consola.nextLine();

        System.out.print("Introduce un APELLIDO: ");
        String apellido = consola.nextLine();

        System.out.print("Introduce un GENERO: ");
        String genero = consola.nextLine();

        System.out.print("Introduce un EDAD: ");
        int edad = consola.nextInt();

        System.out.print("\nNOMBRE: "+nombre+"\nAPELLIDO: "+apellido+"\nEDAD: "+edad+"\nGENERO: "+genero+"\n");
    }


    public void acciones(){
        System.out.println("\nEsta persona puede: ");
        System.out.println("--Saludar");
        System.out.println("--Comer");
        System.out.println("--Jugar");
        System.out.println("--Estudiar");
        System.out.println("--Leer");
        System.out.println("--Nadar");
        System.out.println("--Hacer Tarea");
        System.out.println("--Viajar\n");
    }
    
    public void saludar(){
        System.out.println("--Le gusta saludar a todas las personas que se encuntra en la calle");
    }

    public void caminar(){
        
        System.out.println("--Esta persona puede caminar y correr");
    }

    public void comer(){
        System.out.println("--Le gusta comer frutas, en especial la sandia");
    }

    public void estudiar(){
        System.out.println("--Le gusta estudiar sobre fisica cuantica");
    }
    
}