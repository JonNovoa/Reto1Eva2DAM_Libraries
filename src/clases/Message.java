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
    private Enum ORDER;

    public Message() {
        
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public void setOrden(Enum ORDEN) {
        this.ORDER = ORDEN;
    }

    public Client getCliente() {
        return cliente;
    }

    public Enum getOrden() {
        return ORDER;
    }
    
    /**
     * Crea el mensaje con el User y la Orden del servidor
     * @param cliente
     * @param ORDEN 
     */
    public void makeMessage(Client cliente, Enum ORDER){
        this.cliente = cliente;
        this.ORDER = ORDER;
    }
    
}
