package colecciones;

public class Alumno {

    private int idalumno;
    private String nombre;
    private double estatura;
    private int edad;

    public Alumno() {
    }

    public Alumno(int idalumno, String nombre, double estatura, int edad) {
        this.idalumno = idalumno;
        this.nombre = nombre;
        this.estatura = estatura;
        this.edad = edad;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idalumno=" + idalumno + ", nombre=" + nombre + ", estatura=" + estatura + ", edad=" + edad + '}';
    }
    
    
    public String estadoEdad(){
        if(this.edad>=18){
            return "Mayor de edad";
        }else{
            return "Menor de edad";
        }
    }
    
    
    
    

}
