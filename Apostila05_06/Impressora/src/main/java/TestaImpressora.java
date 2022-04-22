
import com.mycompany.impressora.Impressora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bohrs
 */
public class TestaImpressora {
        public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Impressora impressora = new Impressora();
        impressora.Exibir(51.1f);
        impressora.Exibir(50.1f,52.3f);
        impressora.Exibir(50.1f,"45");
        impressora.Exibir("45",50.1f);
        impressora.Exibir("45","46","47");
        impressora.Exibir(1,2,"49");
    }
}
