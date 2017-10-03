/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaplicacao;

/**
 *
 * @author Rodrigo Fonseca
 */
public class Carro {

    private String chassi;
    private String cor;
    private String modelo;

    //getters and setters
    public Carro() {

    }
/**
 * Este metodo recebe o chassi do carro
 * @param chassi 
 */
    public void setchassi(String chassi) {
        this.chassi = chassi;
    }

    public String getchassi() {
        return chassi;
    }
/**
 * Este metodo recebe a cor do carro
 * @param cor 
 */
    public void setcor(String cor) {
        this.cor = cor;
    }

    public String getcor() {
        return cor;
    }
/**
 * Este metodo recebe o modelo do carro
 * @param modelo 
 */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getmodelo() {
        return modelo;
    }
}