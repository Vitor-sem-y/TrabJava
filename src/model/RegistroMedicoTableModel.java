
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
            return list.size();
    }

    @Override
    public int getColumnCount() {
            return columnNames.length;
      
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return list.get(rowIndex).getRm();
            case 1:
                return list.get(rowIndex).getPaciente();
            case 2:
                return list.get(rowIndex).getEndereco();
            case 3:
                return list.get(rowIndex).getClasse();
            case 4:
                return list.get(rowIndex).getSala();
            default:
                return null;
        }
    }
}