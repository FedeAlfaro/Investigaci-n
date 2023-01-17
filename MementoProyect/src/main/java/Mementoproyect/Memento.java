/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mementoproyect;

/**
 * Clase que guarda el estado (Memento)
 * @author Usuario
 */
public class Memento {
    private String texto;
    private String creador;

    public Memento(String texto, String creador) {
        this.texto = texto;
        this.creador = creador;
    }
    
    public Memento() {
        this.texto = "";
        this.creador = "";
    }

    public String getTexto() {
        return texto;
    }

    public String getCreador() {
        return creador;
    }
    
}
