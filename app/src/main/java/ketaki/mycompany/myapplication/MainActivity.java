package ketaki.mycompany.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    class Number {

        int num;

        public boolean issquare()
        {
            double squareroot = Math.sqrt(num);
            if(squareroot == Math.floor(squareroot))
                return true;
            else
                return false;
        }
        public boolean istriangularnum()
        {
            int x=1;
            int triangularnum = 1;
            while(triangularnum < num)
            {
                x++;
                triangularnum = triangularnum + x;
            }
            if(triangularnum == num)
                return true;
            else
                return false;

        }
    }


    public void testfunction (View view)
    {
        EditText editText = (EditText)   findViewById(R.id.editText);

        Log.i("info", " button pressed");

        Number  mynumber = new Number();
        mynumber.num = Integer.parseInt(editText.getText().toString());
          String message;
          if(mynumber.issquare() && mynumber.istriangularnum())
          {
              message = editText.getText().toString() + " is square and triangular ";
          }
          else if(mynumber.istriangularnum())
          {
              message = editText.getText().toString() + " is triangular ";
          }
          else if(mynumber.issquare())
          {
              message = editText.getText().toString() + " is square ";
          }
          else
          {
              message  = editText.getText().toString() +" is neither triangular nor square ";
          }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
