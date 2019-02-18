
package formulario.area.volumen;
import javax.swing.*;
/**
 *
 * @author Alumno
 */
public class FormularioAreaVolumen {


    public static void main(String[] args) {
     int opcion, op;
        double area,volumen,resp1,resp2,resp3,perimetro,radio;
       do {
           
           opcion = Integer.parseInt (JOptionPane.showInputDialog 
        ("Calculadora de Area y Volumen \n" +
                "¿Que desea hacer?\n" +
                "1) Calcular Area \n" +
                "2) Calcular Volumen \n" +
                "3) Salir \n" +
                "\n Ingresa una opcion:"));
           if(opcion==1)
           {
            op= Integer.parseInt (JOptionPane.showInputDialog 
               ("¿De que figura desea calcular su área? \n" +
                "1) Triangulo \n" +
                "2) Circulo \n" +
                "3) Rectangulo \n" +
                "\n 4)Salir \n" +
            "\n Ingresa una opcion:"));
            switch (op)
           {
                   case 1:
                       resp1=Double.parseDouble(JOptionPane.showInputDialog
                              (" FORMULA (A= b*h/2)\n" +
                               " b= base  h= altura\n" +
                               "Ingresa la base:"));
                       resp2=Double.parseDouble(JOptionPane.showInputDialog
                                      ("FORMULA (A=" +resp1+ "*h/2)\n" +
                                       " b= base  h= altura\n" +
                                       "Ingresa la altura:"));
                       area=resp1*resp2/2;
                       JOptionPane.showInputDialog(null,"FORMULA (A=" +resp1+ "*" +resp2+ "/2)\n" +
                                                        "El area del tiangulo equilatero es: " +area);
                    break;
                   case 2:
                       resp1=Double.parseDouble(JOptionPane.showInputDialog
                              (" FORMULA (A = p r²)\n" +
                               " r= radio\n" +
                               " Ingresa el radio del circulo:"));
                       area = 3.1416*Math.pow(resp1, 2);
                       JOptionPane.showInputDialog(null,"FORMULA (A= 3.1416*" +resp1+ "²)\n" +
                                                        "El area del circulo es: " +area);
                        break;
                   case 3:
                       resp1=Double.parseDouble(JOptionPane.showInputDialog
                              (" FORMULA (A= b*h)\n" +
                               " b= base  h= altura\n" +
                               "Ingresa la base:"));
                       resp2=Double.parseDouble(JOptionPane.showInputDialog
                             (" FORMULA (A= " +resp1+ "*h)\n" +
                              " b= base  h= altura\n" +
                               "Ingresa la altura:"));
                       area=resp1*resp2;
                       JOptionPane.showInputDialog(null," FORMULA (A= " +resp1+ "*"+resp2+")\n" +
                                                        "El area del rectangulo regular es: " +area);
                       break;
                   case 4:   
                       System.exit(0);
                       break;  }
             }
                   else
            if(opcion==2)
            {
       op= Integer.parseInt (JOptionPane.showInputDialog 
               ("¿De que figura desea calcular su área? \n" +
                "1) Cilindro \n" +
                "2) Piramide \n" +
                "3)Salir \n" +
            "\n Ingresa una opcion:"));
       switch (op)
           {
                   case 1:
                       resp1=Double.parseDouble(JOptionPane.showInputDialog
                              (" FORMULA (V = p*r²*h)\n" +
                               " r²= radio al cuadrado  h= altura\n" +
                               "Ingresa el radio:"));
                       resp2=Double.parseDouble(JOptionPane.showInputDialog
                                      (" FORMULA (V = 3.1416*" +resp1+ "*h)\n" +
                                       " r²= radio al cuadrado  h= altura\n" +
                                       "Ingresa la altura:"));
                       //" FORMULA (V = p*R2*h)\n" +
                       volumen= 3.1416*Math.pow(resp1, 2)*resp2;
                       JOptionPane.showInputDialog(null," FORMULA (V = 3.1416*" +resp1+ "*" +resp2+")\n" +
                                                        "El volumen del cilindro es: " +volumen);
                    break;
                    case 2:
                       resp1=Double.parseDouble(JOptionPane.showInputDialog
                              (" FORMULA ( V = H*L²/3)\n" +
                               " H= altura L²= lado al cuadrado \n" +
                               "Ingresa la altura:"));
                       resp2=Double.parseDouble(JOptionPane.showInputDialog
                                       (" FORMULA ( V = " +resp1+ "*L²/3)\n" +
                                       "Ingresa el lado:"));
                       // V = h*l²/3)\n" +
                       volumen= resp1*Math.pow(resp2, 2)/3;
                       JOptionPane.showInputDialog(null," FORMULA ( V = " +resp1+ "*" +resp2+ "²/3)\n" +
                                                        "El volumen de la piramide es: " +volumen);
                    break;
       
             }
            }
           }
        while(opcion!=3);
               
    }}
    





   
                
     

