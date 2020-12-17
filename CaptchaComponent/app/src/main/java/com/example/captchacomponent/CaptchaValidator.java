import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    public int code = rand.nextInt(2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        int color = Color.GRAY;
        CaptchaValidator captcha = new CaptchaValidator(this,color,code);

        captcha.setValidator(new Validator() {
            @Override
            public boolean isValid(String input) {

                return input.equals(code);
            }

            @Override
            public String getValidText() {
                return "BRA";
            }

            @Override
            public String getInvalidText() {
                return "fel";
            }
        });

        captcha.setListener(new ValidatorListener() {
            @Override
            public void isValid(boolean valid) {
                if (valid = true){
                    //rätt
                    TextView textView = findViewById(R.id.textView2);
                    System.out.println("---11-----------------------");

                }else {
                    System.out.println("fffffeeeeeeeeeeeeeelllllll");
                    //fel
                }
            }
        });
        /*
        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        */
        layout.addView(captcha);
        setContentView(layout);
    }
}