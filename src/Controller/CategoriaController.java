
package Controller;

/**
 *
 * @author Jafeth Pérez
 */

import java.util.List;
public class CategoriaController {
    private final CategoriaView vista;
    private final CategoriaDAO dao;

    public CategoriaController(HabitacionesView vista) {
        this.vista = vista;
        this.dao = new CategoriaDAOImpl();
    }

    public void iniciarModulo() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1 -> listar(); 
                case 2 -> vista.mostrarMensaje("Saliendo del menu de habitaciones...");
                default -> vista.mostrarMensaje("Opcion invalida.");
            }
        } while (opcion != 2); 
    }

    private void listar() {
        List<Categoria> lista = dao.listar();
        if (lista.isEmpty()) {
            vista.mostrarMensaje("No hay habitaciones registradas.");
        } else {
            vista.desplegarLista(lista);
        }
    }
}