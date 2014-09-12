/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exeption;

/**
 *
 * @author Carina
 */
public class FalhaAoConectaoComOBanco extends Exception {
    

        public String getMensagem(){
        return "Falha ao tentar se conectar ao Banco de Dados";
    }
}
