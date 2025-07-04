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
public class SerieB implements Strategy {

    @Override
    public String generarSerie(int n) {
        String s = " ";
        for (int i = 0 ; i<n ; i++){
        s = s + Integer.toString(i * 10) + ",";
        }
        return s;
    }
    
}
