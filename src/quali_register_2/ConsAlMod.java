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

public class ConsAlMod implements TableModel {
    Vector <ConsAlu> alumno;
    
    public ConsAlMod(Vector <ConsAlu> alumno){
        this.alumno = alumno;
    }
    @Override
    public int getRowCount() {
        return alumno.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo ="";
        switch (columnIndex){
            case 0:
                    titulo = "Matricula";
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
            case 4:
                    titulo = "Grado";
            break;
            case 5: 
                    titulo = "Grupo";
            break;
            case 6:
                    titulo = "Carrera";
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
        ConsAlu al = alumno.elementAt(rowIndex);
        switch (columnIndex){
            case 0:
                   valor = al.getMatricula();
            break;
            case 1:
                   valor = al.getNombre();
            break;
            case 2:
                   valor = al.getApellidoP();
            break;
            case 3:
                   valor = al.getApellidoM();
            break;
            case 4:
                    valor = al.getGrado();
            break;
            case 5:
                    valor = al.getGrupo();
            break;
            case 6:
                    valor = al.getCarrera();
            break;
        }
        return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        ConsAlu al =alumno.elementAt(rowIndex);
        switch(columnIndex){
            case 0:
                al.setMatricula(aValue.toString());
            break;
            case 1:
                al.setNombre(aValue.toString());
            break;
            case 2:
                al.setApellidoP(aValue.toString());
            break;
            case 3:
                al.setApellidoM(aValue.toString());
            break;
            case 4:
                al.setGrado(aValue.toString());
            break;
            case 5:
                al.setGrupo(aValue.toString());
            break;
            case 6:
                al.setCarrera(aValue.toString());
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
