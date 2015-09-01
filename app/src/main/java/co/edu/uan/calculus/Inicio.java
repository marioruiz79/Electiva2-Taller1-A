package co.edu.uan.calculus;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View.OnClickListener;
public class Inicio extends Activity implements OnClickListener {

private Button aceptar;
    EditText num1, num2, resultado;
    RadioButton rbSuma,rbResta,rbMulti,rbDivi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        num1 = (EditText) findViewById(R.id.text1);
        num2 = (EditText) findViewById(R.id.text2);
        resultado = (EditText) findViewById(R.id.text3);
        rbSuma= (RadioButton) findViewById(R.id.radioButtonsum);
        rbResta= (RadioButton) findViewById(R.id.radioButtonres);
        rbMulti= (RadioButton) findViewById(R.id.radioButtonmul);
        rbDivi= (RadioButton) findViewById(R.id.radioButtondiv);
        aceptar = (Button)findViewById(R.id.button);
        aceptar.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button) {

            if (rbSuma.isChecked()==true) {calculos(1);}
            if (rbResta.isChecked()==true) {calculos(2);}
            if (rbMulti.isChecked()==true) {calculos(3);}
            if (rbDivi.isChecked()==true) {calculos(4);}
        }


    }

    public void calculos(int op)
    {
float r;
        switch(op) {
            case 1:

                r = Float.parseFloat(num1.getText().toString()) + Float.parseFloat(num2.getText().toString());
                resultado.setText(String.valueOf(r).toString());
                break;
            case 2:
                r = Float.parseFloat(num1.getText().toString()) - Float.parseFloat(num2.getText().toString());
                resultado.setText(String.valueOf(r).toString());
                break;
            case 3:
                r = Float.parseFloat(num1.getText().toString()) * Float.parseFloat(num2.getText().toString());
                resultado.setText(String.valueOf(r).toString());
                break;
            case 4:
                r = Float.parseFloat(num1.getText().toString()) / Float.parseFloat(num2.getText().toString());
                resultado.setText(String.valueOf(r).toString());
                break;

        }


        }



}
