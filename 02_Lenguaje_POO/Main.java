public class Main{

    public static void main(String[] args){
        Persona per1 = new Persona();
        Persona per2 = new Persona();
        Persona per3 = new Persona();

        //P1
        System.out.println("***PERSONA 1***");
        per1.atributos1();
        per1.acciones();

        //P2
        System.out.println("***PERSONA 2***");
        per2.atributos1();
        per2.saludar();
        per2.comer();
        per2.caminar();

        //P3
        System.out.println("***PERSONA 3***");
        per3.atributos2();
        per3.acciones();
        
    }
    
}