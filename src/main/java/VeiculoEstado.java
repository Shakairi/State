public abstract class VeiculoEstado {

    public abstract String getEstado();

    public boolean disponibilizar(Veiculo veiculo) {
        return false;
    }

    public boolean retirar(Veiculo veiculo) {
        return false;
    }

    public boolean aposentar(Veiculo veiculo) {
        return false;
    }

    public boolean quebrar(Veiculo veiculo) {
        return false;
    }

    public boolean concertar(Veiculo veiculo) {
        return false;
    }

}
