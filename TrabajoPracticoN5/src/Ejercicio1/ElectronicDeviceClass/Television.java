package Ejercicio1.ElectronicDeviceClass;

import Ejercicio1.Device;
import Ejercicio1.ElectronicDeviceInterface.TelevisionInterface;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Television extends Device implements TelevisionInterface {

    private List<Television> televisionHistory;

    public Television(boolean estado, LocalDateTime horario) {
        super(estado, horario);
        this.televisionHistory=new ArrayList<>();
    }

    @Override
    public String Lit() {
        if(this.Estado){
            return "El dispositivo ya está encendido";
        }else{
            this.Estado=true;
            this.Horario= LocalDateTime.now();//registro horario del dispositivo encendido
            televisionHistory.add(new Television(this.Estado,this.Horario));
        }
        return "Dispositivo encendido";
    }

    @Override
    public String Off() {
        if(this.Estado==false){
            return "El dispositivo ya está apagado";
        }else{
            this.Estado=false;
            this.Horario=LocalDateTime.now();//registro horario de apagado del dispositivo
            televisionHistory.add(new Television(this.Estado,this.Horario));
        }
        return "Dispositivo apagado";
    }

    @Override
    public String State() {
        if(this.Estado){
            return "El dispositivo actualmente está encendido";
        }
        return "El dispositivo actualmente está apagado";
    }


    @Override
    public List<Television> History() {
        return televisionHistory;
    }
}
