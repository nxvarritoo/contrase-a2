package contraseņa;

import javax.swing.JOptionPane;

public class contraseņa {
  
    public static void main(String[] args) {
  
        String contraseņa="c++";
   
        final int INTENTOS = 3;
         
        boolean acierto=false;
  
        String password;
        for (int i=0;i<3 && !acierto;i++){
            password=JOptionPane.showInputDialog("Escribe la contraseņa:");
  
            if (password.equals(contraseņa)){
                System.out.println("Contraseņa correcta.");
                acierto=true;
            }
        }
    }
}
