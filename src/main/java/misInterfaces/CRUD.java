package misInterfaces;

import java.util.ArrayList;

public interface CRUD<T> {
    public boolean agregar(T c);
    public boolean eliminar(String codigo);
    public boolean modificar(T c);
    public ArrayList<T> listarTodos();
    public T listarUno(String codigo);
}
