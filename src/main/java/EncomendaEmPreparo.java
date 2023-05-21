public class EncomendaEmPreparo implements EncomendaEstado {
    private EncomendaEmPreparo() {}
    private static EncomendaEmPreparo instance = new EncomendaEmPreparo();
    public static EncomendaEmPreparo getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Em preparo";
    }
}
