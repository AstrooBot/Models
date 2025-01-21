public class Carpeta extends Component {
    String nombre;

    public Carpeta(String nombre) {
        this.composite = new Composite();
        this.nombre = nombre;
    }

    @Override
    public void getElements() {
        cliente.salida.enviar(this.nombre + "\n");
        this.composite.getElements();
    }

    @Override
    public void Add(Component component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Remove(Component component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}