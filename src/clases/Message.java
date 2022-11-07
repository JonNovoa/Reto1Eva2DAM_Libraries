/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author somor
 */
public class Message implements Serializable{
    static final long serialVersionUID = 8467924406848233931L;
    
    private Client cliente;
    private Order ORDER;

    public Message() {
        
    }
        public Message(Client cliente, Order ORDER) {
        this.cliente = cliente;
        this.ORDER = ORDER;
        
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public void setOrden(Order ORDEN) {
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
    public void makeMessage(Client cliente, Order ORDER){

        this.cliente = cliente;
        this.ORDER = ORDER;
    }
    
}
