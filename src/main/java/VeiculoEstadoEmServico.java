public class VeiculoEstadoEmServico extends VeiculoEstado {

    private VeiculoEstadoEmServico() {
    }

    ;
    private static VeiculoEstadoEmServico instance = new VeiculoEstadoEmServico();

    public static VeiculoEstadoEmServico getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em concerto";
    }

    public boolean disponibilizar(Veiculo veiculo) {
        veiculo.setEstado(VeiculoEstadoDisponivel.getInstance());
        return true;
    }

    public boolean quebrar(Veiculo veiculo) {
        veiculo.setEstado(VeiculoEstadoQuebrado.getInstance());
        return true;
    }
}


