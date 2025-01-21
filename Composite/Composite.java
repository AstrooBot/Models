
public class Composite extends Component {

    @Override
    public void getElements() {
        for (Component component : this.components) {
            cliente.salida.enviar("-");
            component.getElements();
        }
    }

    @Override
    public void Add(Component component) {
        this.components.add(component);
    }

    @Override
    public void Remove(Component component) {
        this.components.remove(component);

    }

}
