public class VeiculoEstadoQuebrado extends VeiculoEstado {

    private VeiculoEstadoQuebrado () {};
    private static VeiculoEstadoQuebrado  instance = new VeiculoEstadoQuebrado ();
    public static VeiculoEstadoQuebrado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Quebrado";
    }

    public boolean concertar(Veiculo veiculo) {
        veiculo.setEstado(VeiculoEstadoEmConcerto.getInstance());
        return true;
    }


}