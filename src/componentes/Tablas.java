
package componentes;

import domain.Usuario;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Tablas {
    DefaultTableModel modelo;
    
    public DefaultTableModel vaciarTabla(JTable tabla){
        DefaultTableModel modelo1 = (DefaultTableModel) tabla.getModel();
        while (modelo1.getRowCount() > 0){
            modelo1.removeRow(0);            
        }
        return modelo1;
    } 
    
    public void cargarUsuarios(List<Usuario> lista1, JTable tabla){
        int a[] = {40, 80, 80, 80, 150};
        String columna[] = {"ID ", "Usuario", "Nombres", "Apellidos", "Correo"};
        var tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        modelo = new DefaultTableModel(columna, 0);
        // Método de vaciar
        String filas[] = new String[5];
        modelo = new DefaultTableModel(null, columna);        
        for (int i = 0; i < lista1.size(); i++) {
            filas[0] = "" + (i + 1);
            filas[1] = lista1.get(i).getUsuario();
            filas[2] = lista1.get(i).getNombre();
            filas[3] = lista1.get(i).getApellidos();
            filas[4] = lista1.get(i).getEmail();
            modelo.addRow(filas);                        
        }
        tabla.setModel(modelo);
        for (int i = 0; i < columna.length; i++) {
            tabla.getColumnModel().getColumn(i).setPreferredWidth(a[i]);
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);          
        }
        tabla.setShowGrid(true);
    }
    
    public void filter (String valor, JTable tabla){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + valor));
    }
}
