/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

/**
 *
 * @author valde
 */
public class ConttextStrategy {
    private Strategy strategy ;
    
    //cargar clase strategy
    public void setStrategy (Strategy strategy){
            this.strategy = strategy ;
    }
    //ejecutar el algoritmo de la strategy
    public String ejecutarStrategy (int n){
        return this.strategy.generarSerie(n) ;
    }
}
