public class EncomendaEmRota implements EncomendaEstado {
    private EncomendaEmRota() {}
    private static EncomendaEmRota instance = new EncomendaEmRota();
    public static EncomendaEmRota getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Em rota de entrega";
    }
}
