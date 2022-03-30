
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.RegistroMedicoTableModel;
import programamedico2.ProgramaMedico2;

/**
 *
 * @author Pedro Henrique e Pedro Lucas
 */
public class RegistroMedicoDAO {
    RegistroMedicoTableModel tableModel = new RegistroMedicoTableModel();
    
    String pathFile = "db.txt";
    String pathFileTemp = "dbTemp.txt";
    String readFile = "";
    
    List <ProgramaMedico2> listRegistroMedico = new ArrayList<>();
    
    private final TableRowSorter<TableModel> sorter = new TableRowSorter<>(tableModel);
    // shaddai shaiu dai ΘθΛΞΟοΣ
}
