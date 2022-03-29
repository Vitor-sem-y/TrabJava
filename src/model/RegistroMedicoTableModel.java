
package model;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import programamedico2.ProgramaMedico2;

/**
 *
 * @author Pedro Henrique
 */
public class RegistroMedicoTableModel extends AbstractTableModel{
    
    private List<ProgramaMedico2> list = new ArrayList<>();
    private final String[] columnNames = {"No. RM", "Nome", 
        "Endereço", "Classe", "Sala"}; // TchuTchu cão, JS é o grandão

    public void setList(List<ProgramaMedico2> list){
        this.list = list;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
