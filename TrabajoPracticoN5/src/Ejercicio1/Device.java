package Ejercicio1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Device {

    protected boolean Estado;
    protected LocalDateTime Horario;

    public Device(boolean estado, LocalDateTime horario) {
        this.Estado = estado;
        this.Horario = horario;
    }

    public abstract String Lit();
    public abstract String Off();
    public abstract String State();

}
