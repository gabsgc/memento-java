import java.util.ArrayList;
import java.util.List;

public class Encomenda {
    private EncomendaEstado estado;
    private List<EncomendaEstado> memento = new ArrayList<>();


    public EncomendaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(EncomendaEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public List<EncomendaEstado> getEstados() {
        return this.memento;
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }
}
