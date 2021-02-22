package dto; //dto stands for "data transfer object"

public class Viagem {
    private String destino;

    public Viagem(String lugarDeDestino){
        this.destino = lugarDeDestino;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
