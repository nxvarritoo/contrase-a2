package contrase�a;

import javax.swing.JOptionPane;

public class contrase�a {
  
    public static void main(String[] args) {
  
        String contrase�a="c++";
   
        final int INTENTOS = 3;
         
        boolean acierto=false;
  
        String password;
        for (int i=0;i<3 && !acierto;i++){
            password=JOptionPane.showInputDialog("Escribe la contrase�a:");
  
            if (password.equals(contrase�a)){
                System.out.println("Contrase�a correcta.");
                acierto=true;
            }
        }
    }
}
