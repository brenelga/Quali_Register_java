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
public class MCoordinador implements TableModel{
    Vector<Coordinador> coordinador;

    public MCoordinador(Vector<Coordinador> coordinador) {
        this.coordinador = coordinador;
    }
    

    @Override
    public int getRowCount() {
        return coordinador.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo ="";
        switch(columnIndex){
            case 0:
                titulo = "Id";
            break;
            case 1:
                titulo = "Nombre";
            break;
            case 2:
                titulo = "Apellido Paterno";
            break;
            case 3:
                titulo = "Apellido Materno";
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
        Coordinador coo = coordinador.elementAt(rowIndex);
        switch(columnIndex){
            case 0:
                valor = coo.getId();
            break;
            case 1:
                valor = coo.getNombre();
            break;
            case 2:
                valor = coo.getAppat();
            break;
            case 3:
                valor = coo.getApmat();
            break;
        }
        return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Coordinador coo = coordinador.elementAt(rowIndex);
        switch (columnIndex){
            case 0:
                coo.setId(aValue.toString());
            break;
            case 1:
                coo.setNombre(aValue.toString());
            break;
            case 2:
                coo.setAppat(aValue.toString());
            break;
            case 3:
                coo.setApmat(aValue.toString());
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
