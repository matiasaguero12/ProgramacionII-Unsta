package Ejercicio1.ElectronicDeviceClass;

import Ejercicio1.Device;
import Ejercicio1.ElectronicDeviceInterface.ComputerInterface;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Computer extends Device implements ComputerInterface {

    private List<Computer> computerHistory;


    public Computer(boolean estado, LocalDateTime horario) {
        super(estado, horario);
        this.computerHistory=new ArrayList<>();
    }

    @Override
    public String Lit() {
        if(this.Estado){
            return "El dispositivo ya está encendido";
        }else{
            this.Estado=true;
            this.Horario=LocalDateTime.now();//registro horario del dispositivo encendido
            computerHistory.add(new Computer(this.Estado,this.Horario));
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
            computerHistory.add(new Computer(this.Estado,this.Horario));
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
    public List<Computer> History() {
        return computerHistory;
    }
}
