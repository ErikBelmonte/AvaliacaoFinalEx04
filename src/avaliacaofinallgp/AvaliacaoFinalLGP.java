package avaliacaofinallgp;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Erik
 */
public class AvaliacaoFinalLGP {
    public static void main(String[] args) {
        double P, a, RT, v, b;
        DecimalFormat f = new DecimalFormat("0.0");
        
        RT = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para RT:"));
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para A:"));
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para V:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para B:"));
        
        P = (((RT /(v-b)) - (a /(v*v))));
        
        JOptionPane.showMessageDialog(null, "O valor para RT é: "+f.format(RT)+"\n O valor para A é: "+f.format(a)
                +"\n O valor para V é: "+f.format(v)+"\n O valor para B é: "+f.format(b)
                +"\n---------------------------------------------\n O valor de P é: "+f.format(P));
    }
    
}
