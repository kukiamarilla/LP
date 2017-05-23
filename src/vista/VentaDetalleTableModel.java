
package vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Productos;
import modelo.DetallesVentas;
/**
 *
 * @author gustavo
 */
public class VentaDetalleTableModel extends AbstractTableModel{

    /**
     * Objeto Lista que almacena los Detalles de Compra a mostrar en
     * la tabla
     */
    private List<DetallesVentas> datos = new ArrayList<DetallesVentas>();

    /**
     * Retorna la lista que almacena los detalles de compra
     */
    public List<DetallesVentas> getDatos() {
        return datos;
    }

    /**
     * Establece los detalles de compra a mostrar por este modelo
     */
    public void setDatos(List<DetallesVentas> datos) {
        this.datos = datos;
        this.fireTableDataChanged();
    }

    /**
     * Retorna los nombres de la columnas definidas por el modelo. El modelo
     * consta de 5 columnas. Si se pide una columna fuera del rango se lanza
     * la excepcion no comprobada IndexOfBoundsException
     */
    @Override
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "Cod. Producto";
            case 1:
                return "Descripción";
            case 2:
                return "Precio Un.";
            case 3:
                return "Cantidad";
            case 4:
                return "SubTotal";
        }

        throw new IndexOutOfBoundsException("No existe la columna " + col);
    }

    /**
     * Retorna la clase a la que pertenecen los datos en la columna
     * especificada por el parámetro
     */
    @Override
    public Class getColumnClass(int col) {
        switch (col) {
            case 0:
            case 1:
                return String.class;
            case 2:
            case 4:
                return Double.class;
            case 3:
                return Integer.class;
        }

        throw new IndexOutOfBoundsException("No existe la columna " + col);
    }

    /**
     * Retorna el número de columnas del modelo
     */
    @Override
    public int getColumnCount() {
        return 5;
    }

    /**
     * Retorna el valor almacenado en la celda de la de tabla especificada
     * por los parámetros.<br>
     * En el módelo de datos: la columna 0 indica el código del Producto,
     * la columna 1 la descrpción del producto,
     * la columna 2 el precio unitario,
     * la columna 3 la cantidad a vender
     * y la columna 4 el subtotal del detalle.
     */
    @Override
    public Object getValueAt(int fila, int columna) {
        if (fila < 0 || fila >= datos.size()) {
            throw new IndexOutOfBoundsException("No existe la fila " + fila);
        }

        if (columna < 0 || columna > 4) {
            throw new IndexOutOfBoundsException("No existe la columna " + columna);
        }

        DetallesVentas vd = datos.get(fila);

        switch (columna) {
            case 0:
                if (vd.getProductos() == null) {
                    return null;
                }
                return vd.getProductos().getId();
            case 1:
                if (vd.getProductos() == null) {
                    return null;
                }
                return vd.getProductos().getDescripcion();
            case 2:
                
                return vd.getProductos().getPrecio();
            case 3:
                if (vd.getCantidad() == null) {
                        vd.setCantidad(1);
                }
                return vd.getCantidad();
            default:
                if (vd.getCantidad() == null || vd.getProductos().getPrecio() == null) {
                    return null;
                }
                return vd.getCantidad() * vd.getProductos().getPrecio();
        }
    }

    /**
     * Establece el valor para la celda especificada por los párametros.
     * Sólo pueden establecerce valores para las columnas 0, 2 y 3. Si intenta
     * establecerce un valor en las otros columnas se lanza la excepción
     * IllegalArgumentException. Las columnas 1 a 4 son de solo lectura.
     * Si el valor a establecer no es apropiado,
     * este modelo no acepta el valor.<br>
     * <br>
     * En la columna 0 solo se admiten objetos Producto que no estén en
     * este módelo, asi que no existen dos detalles para un mismo
     * Producto.<br>
     * <br>
     * En la columna 2 solo se admiten valores enteros mayores a cero o el valor
     * null. <br>
     * <br>
     * En la columna 3 solo se admiten valores doubles mayores a cero o el valor
     * null. <br>
     * <br>
     * Este método lanza el evento de celda actualizada
     */
    @Override
    public void setValueAt(Object valor, int fila, int columna) {
        if (fila < 0 || fila >= datos.size()) {
            throw new IndexOutOfBoundsException("No existe la fila " + fila);
        }

        if (columna < 0 || columna > 4) {
            throw new IndexOutOfBoundsException("No existe la columna " + columna);
        }

        DetallesVentas vd = datos.get(fila);
        switch (columna) {
            case 0:
                if (valor != null && !(valor instanceof Productos)) {
                    throw new IllegalArgumentException("El parámetro para la "
                            + "columna " + columna + " deber ser un Producto");
                }
                // no se acepta el cambio si existe otro detalle para el
                // Producto que se quiere establecer
                for (DetallesVentas fd2 : datos) {
                    if (fd2 != vd && fd2.getProductos().getId().equals(
                            ((Productos) valor).getId())) {
                        return;
                    }
                }
                vd.setProductos((Productos) valor);
                // se informa del cambio en todas las columnas generadas
                // por el objeto Producto (id, descripcion, precio)
                
                vd.setCantidad(null);
                fireTableCellUpdated(fila, 0);
                fireTableCellUpdated(fila, 1);
                fireTableCellUpdated(fila, 2);
                fireTableCellUpdated(fila, 3);
                fireTableCellUpdated(fila, 4);
                return;
            case 1:
            case 4:
                throw new IllegalArgumentException("La columna " + columna
                        + " no puede ser editada");
            case 2:
                if (valor != null && !(valor instanceof Double)) {
                    throw new IllegalArgumentException("El parámetro para la "
                            + "columna " + columna + " deber ser Double");
                }
                
                fireTableCellUpdated(fila, 2);
                fireTableCellUpdated(fila, 4);
                return;
            case 3:
                if (valor != null && !(valor instanceof Integer)) {
                    throw new IllegalArgumentException("El parámetro para la "
                            + "columna " + columna + " deber ser Integer");
                }
                vd.setCantidad((Integer) valor);
                fireTableCellUpdated(fila, 3);
                fireTableCellUpdated(fila, 4);
                return;
        }
    }

    /**
     * Retorna el numero de filas.
     */
    @Override
    public int getRowCount() {
        if (datos == null) {
            return 0;
        }
        return datos.size();
    }

    /**
     * Retorna un valor boolean que indica si una celda del modelo es editable.
     * Solo las celdas en las columnas 0, 2 y 3 son editables, por lo que Swing
     * ofrecera un mecanismo de edición adecuado para las mismas según su clase.
     */
    @Override
    public boolean isCellEditable(int fila, int col) {
        if (fila < 0 || fila >= datos.size()) {
            throw new IndexOutOfBoundsException("No existe la fila " + fila);
        }
        if (col < 0 || col > 4) {
            throw new IndexOutOfBoundsException("No existe la columna " + col);
        }
        if (col == 0 || col == 2 || col == 3) {
            return true;
        }
        return false;
    }

    /**
     * Agrega el objeto detalle indicada al final de la lista en este modelo.
     * Este método lanza el evento de fila insertada en el modelo.
     */
    public void agregarDetalle(DetallesVentas vd) {
        if (datos == null) {
            datos = new ArrayList<DetallesVentas>();
        }
        datos.add(vd);
        this.fireTableRowsInserted(datos.size() - 1, datos.size() - 1);
    }

    /**
     * Remueve la fila indicada del modelo. Este método lanza el evento de fila
     * removida en el modelo.
     */
    public void removerDetalle(int fila) {
        if (fila < 0 || fila > datos.size()) {
            throw new IndexOutOfBoundsException("No existe la fila " + fila);
        }
        datos.remove(fila);
        this.fireTableRowsDeleted(fila, fila);
    }

    /**
     * Remueve el objeto detalle del modelo. Este método lanza el evento de fila
     * removida en el modelo.
     */
    public void removerDetalle(DetallesVentas vd) {
        if (datos.contains(vd)) {
            int fila = datos.indexOf(vd);
            datos.remove(fila);
            this.fireTableRowsDeleted(fila, fila);
        }
    }

    /**
     * Actualiza la fila indicada con el detalle recibido como parámetro. Este
     * método lanza el evento de fila actualizada sobre el modelo.
     */
    public void actualizarDetalle(int fila, DetallesVentas vd) {
        if (fila < 0 || fila > datos.size()) {
            throw new IndexOutOfBoundsException("No existe la fila " + fila);
        }
        datos.remove(fila);
        datos.add(fila, vd);
        this.fireTableRowsUpdated(fila, fila);
    }

}
