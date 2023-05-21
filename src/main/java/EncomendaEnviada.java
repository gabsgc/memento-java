public class EncomendaEnviada implements EncomendaEstado {
    private EncomendaEnviada() {}
    private static EncomendaEnviada instance = new EncomendaEnviada();
    public static EncomendaEnviada getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Enviada";
    }
}
