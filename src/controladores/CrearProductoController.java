package controladores;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import modelos.DataManager;

public class CrearProductoController {

    public void crearProducto(String... datos) throws SQLException {
        DataManager manejador = new DataManager();
        String sql = String.format("INSERT INTO productos("
                + "nombre, temperatura, valor_base,costo"
                + ") VALUES('%s', '%s', %s, %s)", datos);
        manejador.ejecutarConsulta(sql);
    }

    public DefaultTableModel cargarProductos() throws SQLException {
        String[] columnas = {
            "id",
            "nombre",
            "temperatura",
            "valor_base",
            "Costo"
        };
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        DataManager manejador = new DataManager();
        ResultSet datos = manejador.obtenerDatos("SELECT * FROM productos");
        String[] registro = new String[5];
        while (datos.next()) {
            registro[0] = String.valueOf(datos.getInt("id"));
            registro[1] = datos.getString("nombre");
            registro[2] = String.valueOf(datos.getDouble("temperatura"));
            registro[3] = String.valueOf(datos.getDouble("valor_base"));
            registro[4] = String.valueOf(datos.getDouble("Costo"));
            modelo.addRow(registro);
        }
        manejador.cerrar();
        return modelo;
    }

    public void actualizarProducto(int id, String... datos) throws SQLException {
        DataManager manejador = new DataManager();
        String sql = "UPDATE productos SET "
                + "nombre='" + datos[1] + "', "
                + "temperatura=" + datos[2] + ", "
                + "valor_base=" + datos[3] + ","
                + "costo=" + datos[4] + ""
                + " WHERE id=" + id;

        manejador.ejecutarConsulta(sql);
    }

    public void eliminarProducto(int id) throws SQLException {
        DataManager manejador = new DataManager();
        String sql = "DELETE FROM productos WHERE id=" + id;
        manejador.ejecutarConsulta(sql);
    }
}
