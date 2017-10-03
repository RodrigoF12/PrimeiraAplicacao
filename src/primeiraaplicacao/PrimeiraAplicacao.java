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
public class PrimeiraAplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro meuCarro = new Carro ();
        
        meuCarro.setchassi("A123B");
        meuCarro.setcor("Azul");
        meuCarro.setModelo("Uno");
        
        System.out.println("chassi" + meuCarro.getchassi());
        System.out.println("cor"  +  meuCarro.getcor());
        System.out.println("modelo" + meuCarro.getmodelo());
     
    }
    
}
