import java.util.ArrayList;

public abstract class Component {

    EntradaTeclado entrada = new EntradaTeclado();
    SalidaTeclado salida = new SalidaTeclado();
    ClienteTeclado cliente = new ClienteTeclado(entrada, salida);

    public Component composite;
    public ArrayList<Component> components = new ArrayList<Component>();

    public abstract void getElements();

    public abstract void Add(Component component);

    public abstract void Remove(Component component);

}
