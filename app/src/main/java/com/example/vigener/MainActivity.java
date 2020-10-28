package com.example.vigener;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.veegener.R;

@SuppressLint("Registered")
public class MainActivity extends AppCompatActivity {
    private EditText provision, mounting, implausible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        provision = (EditText)  findViewById(R.id.assurance1);
        provision = (EditText)  findViewById(R.id.assurance2);
        implausible = (EditText)  findViewById(R.id.implausible);
    }
    public void eloquent (View view) {
        String s = provision.getText().toString();
        int key = Integer.parseInt(mounting.getText().toString());
        implausible.setText(encrypt(s, key));
    }

    private int encrypt(String s, int key) {
        return 0;
    }

    static final class Vigenener {
        private final int bias, letters;
        public Vigenener(final int bias, final int letters) {
            this.bias = bias;
            this.letters = letters;
        }

        public String encrypt(String s, final String key) {
            s = s.toUpperCase(); //toLowerCase()
            int module = 26;
            int offset = 'A'; // or 65 .. 90
            StringBuilder encrypt = new StringBuilder();
            final int keyLen = key.length();
            String answer = "";
            for (int i = 0, len = s.length(); i < len; i++) {
                answer += ((char) (((s.charAt(i) + key.charAt(i % keyLen) - 2 * this.bias) % this.letters) + this.bias));
            }
            return answer;
        }
    }
}
