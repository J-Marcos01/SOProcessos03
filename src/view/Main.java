package view;

import javax.swing.JOptionPane;

import controller.DistroController;

public class Main 
{
	public static void main(String[] args) {
		
		DistroController dis = new DistroController();
		
		int opc=0;
		
		while(opc!=9)
		{
			opc=Integer.parseInt(JOptionPane.showInputDialog("Digite :\n1-Para exibir distribuiçao so OS\n9-Finalizar."));
			switch(opc)
			{
			case 1:
			{
				dis.exibeDistro();
				break;
			}
			case 9:
			{
				System.out.println("Fim");
				break;
			}
			default:
			{
				System.err.println("Valor Invalido");
			}
			}
		}
		
	}
}
