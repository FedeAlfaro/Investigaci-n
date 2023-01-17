/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Mementoproyect;

/**
 * Clase que genera la información (Originator/originador/creador)
 * @author Federico Alfaro Chaverri
 */
public class Documento {

    private String texto;
    private String creador;

    public Documento(String texto, String creador) {
        this.texto = texto;
        this.creador = creador;
    }
    
    public Documento() {
        this.texto = "No hay creador disponible";
        this.creador = "No hay texto disponible";
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    
    public Memento guardarEstado(){
        return new Memento(texto, creador);
    }
    
    public void restaurarEstado(Memento pMemento){
        texto = pMemento.getTexto();
        creador = pMemento.getCreador();
    }
    
    public String convertirEnMayuscula(){
        if(texto!=null)
            return texto.toUpperCase();
        else
            return texto;
    }
    
    public String convertirEnMinuscula(){
        if(texto!=null)
            return texto.toLowerCase();
        else
            return texto;
    }
}
