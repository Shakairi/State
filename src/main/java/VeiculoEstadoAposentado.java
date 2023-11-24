public class VeiculoEstadoAposentado extends VeiculoEstado {

    private VeiculoEstadoAposentado() {}
    ;
    private static VeiculoEstadoAposentado instance = new VeiculoEstadoAposentado();

    public static VeiculoEstadoAposentado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aposentado";
    }


}