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
 * @author Jesus Brenel
 */
public class ModAsignatura implements TableModel{
Vector<Asignaturas> asignatura;

    public ModAsignatura(Vector<Asignaturas> asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public int getRowCount() {
        return asignatura.size();
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
                    titulo = "Nombre";
            break;
            case 2:
                    titulo = "Grado";
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
        Asignaturas as = asignatura.elementAt(rowIndex);
        switch (columnIndex){
            case 0: 
                valor = as.getId();
            break;
            case 1:
                valor = as.getNombre();
            break;
            case 2:
                valor = as.getGrado();
            break;
        }
        return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Asignaturas as = asignatura.elementAt(rowIndex);
        switch(rowIndex){
            case 0:
                as.setId(aValue.toString());
            break;
            case 1:
                as.setNombre(aValue.toString());
            break;
            case 2:
                as.setGrado(aValue.toString());
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
