package pnworangecake.plant_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(layout.activity_main);
        }
        public void buttonOnClick(View v){
            Button plantnameaz=(Button) v;
            ((Button) v).setText("Plants A-Z!!!");
            // Got the button working sort of, now need to create an event that takes you to another 'page' sourced from the xml?
        }
}
