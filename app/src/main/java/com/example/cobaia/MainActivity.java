package com.example.cobaia;



import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	static double numero1, numero2, resultado;
	static EditText   num1, num2;

	static TextView result;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Chamando os objetos.
		 num1 = (EditText) findViewById(R.id.primeironum);
		num2 = (EditText) findViewById(R.id.segundonum);
		result = (TextView) findViewById(R.id.tvResultado);

		final Button soma = (Button) findViewById(R.id.btSoma);
		final Button sub = (Button) findViewById(R.id.btSubtracao);
		final Button multi = (Button) findViewById(R.id.button1);
		final Button divisao = (Button) findViewById(R.id.btdivisao);

		final Button limpar = (Button) findViewById(R.id.btlimpa);
		
		
		
		
		soma.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
					
				numero1 =0;
				numero2 =0;
				// Convertendo o valor de String para Double.
				//numero1 = Double.parseDouble(num1.getText().toString());
				//numero2 = Double.parseDouble(num2.getText().toString());
				recebeValores(); 
				
				
				resultado = numero1 + numero2;
				// Convertendo o valor de Double para String.
					result.setText(String.valueOf(resultado));	
				
				
				
				
				
				
//				
//				else {
//					Toast.makeText(MainActivity.this, "Digite um valor!", Toast.LENGTH_SHORT).show();
//					
//				}
			}
		});
		

		sub.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {


				numero1 =0;
				numero2 =0;
				// Convertendo o valor de String para Double.
				//numero1 = Double.parseDouble(num1.getText().toString());
				//numero2 = Double.parseDouble(num2.getText().toString());
				
				recebeValores(); 
				resultado = numero1 - numero2;

				// Convertendo o valor de Double para String.
				result.setText(String.valueOf(resultado));
				

					//Toast.makeText(MainActivity.this, "Digite um valor!", Toast.LENGTH_SHORT).show();
				
			}
			
		});
		multi.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				numero1 =0;
				numero2 =0;
				
				recebeValores(); 

				// Convertendo o valor de String para Double.
				//numero1 = Double.parseDouble(num1.getText().toString());
				//numero2 = Double.parseDouble(num2.getText().toString());
				
				resultado = numero1 * numero2;

				// Convertendo o valor de Double para String.
				result.setText(String.valueOf(resultado));

				
				
			}
		});
		divisao.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {


				numero1 =0;
				numero2 =0;
					recebeValores(); 
				// Convertendo o valor de String para Double.
				//numero1 = Double.parseDouble(num1.getText().toString());
				//numero2 = Double.parseDouble(num2.getText().toString());
				
					if (numero1 > 0 && numero2 <= 0)
					{
						AlertDialog.Builder Mensagem  = new AlertDialog.Builder(MainActivity.this);
						Mensagem.setTitle("ERRO!");
						Mensagem.setMessage("Não existe divisão por zero, pois isso é uma indeterminação matemática. ");
						Mensagem.setNegativeButton("OK", null);
						Mensagem.show();
						result.setText(String.valueOf("ERRO"));
						
					}
					else {
						
					
					resultado = numero1 / numero2;

				// Convertendo o valor de Double para String.
				result.setText(String.valueOf(resultado));
					}

			}
			
		});
		
	
		limpar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				num1.setText("");
				num2.setText("");
				result.setText("");
				
			}
		});
		
	
	}
	
	public static void recebeValores() {
		boolean valido = false;
		
			try {
				
					
				
				numero1 = Double.parseDouble(num1.getText().toString());
				numero2 = Double.parseDouble(num2.getText().toString());
				valido = true;
				
				} catch (Exception e) {
				valido = false;
				
				
			
		}
	}
	
	
		
		
			//Toast.makeText(MainActivity.this, "Digite um valor!", Toast.LENGTH_SHORT).show();
	

	

}
