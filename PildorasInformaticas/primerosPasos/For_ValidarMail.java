package primerosPasos;
import javax.swing.JOptionPane;

public class For_ValidarMail {
	public static void main(String[] args) {
		
		int arroba=0;
		
		boolean punto=false;
		
		String mail=JOptionPane.showInputDialog("Introduce mail");
		
		for( int i=0; i<mail.length(); i++) {
			
			if(mail.charAt(i)=='@') {
				
				arroba++;
			}
			
			if(mail.charAt(i)=='.') {
				punto=true;
			}
		}
		if(arroba==1 && punto==true) {
			System.out.println("El Mail es correcto");
		}else {
			System.out.println("El mail no es correcto");
		}
	}

}
