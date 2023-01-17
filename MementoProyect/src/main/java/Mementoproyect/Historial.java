/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mementoproyect;

import java.util.ArrayList;

/**
 *  Administrador de los estados guardados (Administrator/Administrador)
 * @author Federico Alfaro Chaverri
 */
public class Historial {
    
    private ArrayList<Memento> estados;
    
    public void guardar(Memento pMemento){
        estados.add(pMemento);
    }
    
    public Memento restaurar(){
        Memento mementoAnterior = new Memento(); 
        if(!estados.isEmpty()){
            mementoAnterior = estados.remove(estados.size()-1);
        }
        return mementoAnterior;
    }
}
