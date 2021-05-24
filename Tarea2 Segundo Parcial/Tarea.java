import java.util.ArrayList;

public class Tarea
{
    private int estudiantes;
    private ArrayList<Double> notasEstudiantes;
    int contador;
    public Tarea(int estudiantes){
        this.estudiantes = estudiantes;
        contador = 0;
        notasEstudiantes = new ArrayList<Double>();
    }
    
    public void anadirNotas(double nota){
        if(contador < estudiantes){
            notasEstudiantes.add(nota);
            contador++;
        }else{
            System.out.println("limite alcanzado");
        }
    }
    
    public double promedioNotas(){
        double promedio = 0;
        int cantidadNotas = 0;
        for(int i = 0; i < notasEstudiantes.size();i++){
            promedio = promedio + notasEstudiantes.get(i);
            cantidadNotas++;
        }
        promedio= promedio/cantidadNotas;
        return promedio;
    }
    
    public double promedioAprobados(){
        double promedio = 0;
        int cantidadNotasAprobados = 0;
        for(int i = 0; i < notasEstudiantes.size();i++){
            if(notasEstudiantes.get(i) > 51){
                promedio = promedio + notasEstudiantes.get(i);
                cantidadNotasAprobados++;
            }
        }
        promedio= promedio/cantidadNotasAprobados;
        return promedio;
    }
    
    public int cantidadDeReprobados(){
        int reprobados = 0;
        for(int i = 0; i < notasEstudiantes.size();i++){
            if(notasEstudiantes.get(i) < 51){
                reprobados++;
            }
        }
        return reprobados;
    }
    
    public int cantidadDeAprobados(){
        int aprobados = 0;
        for(int i = 0; i < notasEstudiantes.size();i++){
            if(notasEstudiantes.get(i) >= 51){
                aprobados++;
            }
        }
        return aprobados;
    }
    
    public double notaAlta(){
        double notaAlta = 0;
        for (int j = 0; j < notasEstudiantes.size();j++){
            if(notasEstudiantes.get(j) > notaAlta){
                notaAlta = notasEstudiantes.get(j);
            }
        }
        return notaAlta;
    }
}
