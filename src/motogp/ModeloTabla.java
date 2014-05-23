/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motogp;

import entities.Pilotos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author usuario
 */
public class ModeloTabla extends AbstractTableModel {

    List<Pilotos> list;
    
    public void setDataList(List<Pilotos> list) {
        this.list = list;
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Piloto";
            case 1:
                return "Nacionalidad";
            case 2:
                return "Dorsal";
            case 3:
                return "Equipo";
            case 4:
                return "Moto";
            case 5:
                return "Sueldo";
            case 6:
                return "Vigente Campeón";
            default:
                return "";
        }
    }        
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pilotos piloto = list.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return piloto.getNombre();
            case 1:
                return piloto.getNacionalidad();
            case 2:
                return piloto.getNumeroPiloto();
            case 3:
                return piloto.getEquipo();
            case 4:
                return piloto.getMoto();
            case 5:
                return piloto.getSueldo();
            case 6:
                return piloto.getVigenteCampeon();
            default:
                return null;
        }
    }
}