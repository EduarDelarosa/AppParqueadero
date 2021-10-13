package parqueaderotaller1s;


public class ParqueaderoTaller1S {

    
    private String placa, horaEntrada, horaSalida;
   
    public ParqueaderoTaller1S(String placa, String horaEntrada, String horaSalida){
        this.placa = placa;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public String getHoraEntrada(){
        return horaEntrada;
    }
    
    public String getHoraSalida(){
        return horaSalida;
    }
    
    public void SetPlaca(String placa){
         this.placa = placa;
    }
    
    public void setHoraEntrada(String horaEntrada){
        this.horaEntrada = horaEntrada;
    }
    
    public void setHoraSalida(String horaSalida){
        this.horaSalida = horaSalida;
    }
    
    
    
}
