public class EncomendaEntregue implements EncomendaEstado {
    private EncomendaEntregue() {};
    private static EncomendaEntregue instance = new EncomendaEntregue();
    public static EncomendaEntregue getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Entregue";
    }
}
