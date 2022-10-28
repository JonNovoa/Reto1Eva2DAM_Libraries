/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author somor
 */
public class Message {
    private Client cliente;
    private Enum orden;

    public Message() {
        
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public void setOrden(Enum orden) {
        this.orden = orden;
    }

    public Client getCliente() {
        return cliente;
    }

    public Enum getOrden() {
        return orden;
    }
    
    /**
     * Crea el mensaje con el User y la Orden del servidor
     * @param cliente
     * @param orden 
     */
    public void makeMessage(Client cliente, Enum orden){
        this.cliente = cliente;
        this.orden = orden;
    }
    
}
