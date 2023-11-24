

public class Veiculo {

    private String placa;
    private VeiculoEstado estado;

    public Veiculo() {
        this.estado = VeiculoEstadoDisponivel.getInstance();
    }

    public void setEstado(VeiculoEstado estado) {
        this.estado = estado;
    }

    public boolean disponibilizar() {
        return estado.disponibilizar(this);
    }

    public boolean retirar() {return estado.retirar(this);}

    public boolean aposentar() {
        return estado.aposentar(this);
    }

    public boolean concertar() {
        return estado.concertar(this);
    }

    public boolean quebrar() {
        return estado.quebrar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String nome) {
        this.placa = placa;
    }

    public VeiculoEstado getEstado() {
        return estado;
    }
}