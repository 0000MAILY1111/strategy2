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
public class SerieA implements Strategy{

    @Override
    public String generarSerie(int n) {
        //aqui la operacion a implementar si es vector serie
        String s = " ";
        for (int i = 0 ; i<n ; i++){
        s = s+ Integer.toString(i * 3) + ",";
        }
        return s;
    }
    
}
