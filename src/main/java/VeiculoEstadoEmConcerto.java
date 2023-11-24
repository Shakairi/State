public class VeiculoEstadoEmConcerto extends VeiculoEstado {

    private VeiculoEstadoEmConcerto() {};
    private static VeiculoEstadoEmConcerto instance = new VeiculoEstadoEmConcerto();
    public static VeiculoEstadoEmConcerto getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em concerto";
    }

    public boolean disponibilizar(Veiculo veiculo) {
        veiculo.setEstado(VeiculoEstadoDisponivel.getInstance());
        return true;
    }
}

