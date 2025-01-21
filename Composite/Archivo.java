public class Archivo extends Component {
    public String nombre;
    public String extension;

    public Archivo(String nombre, String extension) {
        this.composite = new Composite();
        this.nombre = nombre;
        this.extension = extension;
    }

    public void getElements() {
        cliente.salida.enviar("-" + this.nombre + "." + this.extension + "\n");
        this.composite.getElements();
    }

    @Override
    public void Add(Component component) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void Remove(Component component) {
        throw new UnsupportedOperationException("Not supported.");
    }

}
