public class VeiculoEstadoDisponivel extends VeiculoEstado {

    private VeiculoEstadoDisponivel() {};
    private static VeiculoEstadoDisponivel instance = new VeiculoEstadoDisponivel();
    public static VeiculoEstadoDisponivel getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Disponivel";
    }

    public boolean retirar(Veiculo veiculo) {
        veiculo.setEstado(VeiculoEstadoEmServico.getInstance());
        return true;
    }

    public boolean quebrar(Veiculo veiculo) {
        veiculo.setEstado(VeiculoEstadoQuebrado.getInstance());
        return true;
    }

    public boolean aposentar(Veiculo veiculo) {
        veiculo.setEstado(VeiculoEstadoAposentado.getInstance());
        return true;
    }

}
