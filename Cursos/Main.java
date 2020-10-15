import java.util.Scanner;

import Entidades.Persona;
import data.Personadata;

public class Main {

    public static void main(String[] args) {

        Personadata data= new Personadata();
        Scanner input = new Scanner(System.in);
        int opt = 0;
        
        do{
        System.out.println("******Menu de Alexander****");
            System.out.println("1 Lista ");
            System.out.println("2 Nuevo ");
            System.out.println("3 Borrar ");
            System.out.println("4 Get byID ");
            System.out.println("5 Update ");
            System.out.println("0 Salir ");
            System.out.println("Choice option: ");
            opt = input.nextInt();
            System.out.println("You Chosed: "+ opt);
            input.nextLine();

            switch (opt){
                case 1: 
                    System.out.println("Listado de personas");
                    for (Persona d : data.list("")){
                        System.out.println(d.getId()+"\t"+d.getName()
                        + "\t" + d.getSex()+ "\t"+ d.getAge());
                    }
        
                break;
                case 2: 
                    System.out.println("Nueva persona");
                    Persona p= new Persona();
                    System.out.println("nombre: ");
                    p.setName(input.nextLine());
                    System.out.println("sexo: ");
                    p.setSex(input.nextLine());
                    System.out.println("edad: ");
                    try{
                        p.setAge(input.nextInt());
                        data.create(p);
                    }catch (Exception e){
                        input.nextLine();
                        System.out.print("Edad debe ser en numeros Enter para continuar");
                        input.nextLine();
                    }
                
                break;
                case 3:
                    System.out.println("Eliminar Persona");
                    System.out.println("id: ");
                    data.delete(input.nextInt());
                    
                    break;
                case 4:
                int b4 = 1;
                do{
                    System.out.println("Get Persona");
                    System.out.print("id: ");
                    int id=0;
                    try {
                        b4=0;
                        id=input.nextInt();
                        Persona d = data.get(id);
                        if(d!=null){
                            System.out.println("id: "+d.getId());
                            System.out.println("Nombre: "+d.getName());
                        }else {
                            System.out.println("la persona no existe");
                        }
                    } catch (Exception e) {
                        input.nextLine();
                        System.out.print("id no valido, debe ser un numero");
                        b4= 1;
                    }
                }while(b4!= 0);
                    
                    break;
                case 5:
                    System.out.println("Update Persona");
                    System.out.print("id: ");
                    Persona b = data.get(input.nextInt());
                    if (b !=null) {
                        System.out.println("Nombre Current: "+b.getName());
                        System.out.println("Sexo Current: "+b.getSex());
                        System.out.println("Edad Current: "+b.getAge());
                        input.nextLine();
                        System.out.print("nuevo nombre: ");
                        b.setName(input.nextLine());
                        System.out.print("nuevo sexo: ");
                        b.setSex(input.nextLine());
                        System.out.print("nueva edad: ");
                        b.setAge(input.nextInt());
                        data.update(b);
                    } else {
                        System.out.println("No encontrado");
                    }
                    
                    break;

                default: System.out.println("Opcion no valida");
            }
        }while (opt != 0); 
                
            
    }
        

}