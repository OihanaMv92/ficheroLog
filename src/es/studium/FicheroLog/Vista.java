package es.studium.FicheroLog;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;


public class Vista // Ventana elementos graficos.
{

	Frame ventana = new Frame("Fichero de log");
	TextField txtUsuario = new TextField(30);
	Button btnMision = new Button("Mision");
	Button btnVision = new Button("Vision");
	Button btnValores = new Button("Valores");
	
	public Vista()
	{
		ventana.setLayout(new FlowLayout());
		
		ventana.add(txtUsuario);
		ventana.add(btnMision);
		ventana.add(btnVision);
		ventana.add(btnValores);
		
		ventana.setSize(264,104);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
}

