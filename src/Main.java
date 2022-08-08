public class Main {
    public static void main(String[] args) {
        //clases
        System.out.println("Persona");
        Persona persona = new Persona();
        persona.setEdad(29);
        System.out.println(persona.getEdad());
        persona.setNombre("Andres olider");
        persona.setTelefono(4654654);
       //Cliente
        System.out.println("cliente");
        Cliente cliente = new Cliente();
        cliente.setEdad(29);
        System.out.println(cliente.getEdad());
        cliente.setNombre("felipe");
        System.out.println(cliente.getNombre());
        cliente.setTelefono(312457888);
        System.out.println(cliente.getTelefono());
        cliente.setCredito(800);
        System.out.println(cliente.getCredito());
        //trabajador
        System.out.println("EMPLEADO");
        Empleado empleado = new Empleado();
        empleado.setEdad(29);
        System.out.println(empleado.getEdad());
        empleado.setNombre("oscar");
        System.out.println(empleado.getNombre());
        empleado.setTelefono(312457888);
        System.out.println(empleado.getTelefono());
        empleado.setSalario(800);
        System.out.println(empleado.getSalario());




    }
}

class Persona
{
    private int edad;
    private int telefono;
    private String nombre;

    public void setEdad(int edad){
        this.edad = edad;

    }
    public int getEdad (){
        return this.edad;

    }
    public void setNombre (String nombre){
        this.nombre = nombre;

    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }



}
class Cliente extends Persona{
    int credito;
    public void setCredito(int credito){
        this.credito=credito;

    }
    public int getCredito(){
        return this.credito;
    }
}
class Empleado extends Persona {
    float salario;
    public void setSalario(float salario){
        this.salario=salario;
    }
    public float getSalario(){
        return this.salario;
    }
}
