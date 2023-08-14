/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quali_register_2;

import java.util.Vector;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Brenel Galicia
 */
public class MCarrera implements TableModel {
    Vector <Carrera> carrera;

    public MCarrera(Vector<Carrera> carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public int getRowCount() {
        return carrera.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = "";
        switch(columnIndex){
            case 0:
                titulo = "Id";
            break;
            case 1:
                titulo="Nombre";
            break;
            case 2:
                titulo = "Coordinador";
            break;
        }
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String valor = "";
        Carrera ca = carrera.elementAt(rowIndex);
        switch(columnIndex){
            case 0:
                valor = ca.getId();
            break;
            case 1:
                valor = ca.getNombre();
            break;
            case 2:
                valor = ca.getCoordinador();
            break;
        }
        return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Carrera ca = carrera.elementAt(rowIndex);
        switch(columnIndex){
            case 0:
                ca.setId(aValue.toString());
            break;
            case 1:
                ca.setNombre(aValue.toString());
            break;
            case 2:
                ca.setCoordinador(aValue.toString());
            break;
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }
    
}
