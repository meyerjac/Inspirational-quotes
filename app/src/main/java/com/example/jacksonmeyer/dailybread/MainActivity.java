package com.example.jacksonmeyer.dailybread;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ColorWheel mColorWheel = new ColorWheel();
    private TextView mQuoteTextView;
    private Button mShowQuoteButton;
    private RelativeLayout mRelativeLayout;
    private QuoteBook mQuoteBook = new QuoteBook();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuoteTextView = (TextView) findViewById(R.id.quoteTextView);
        mShowQuoteButton = (Button) findViewById(R.id.showQuoteButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String quote = mQuoteBook.getQuote();
                int color = mColorWheel.getColor();
                mQuoteTextView.setText(quote);
                mRelativeLayout.setBackgroundColor(color);
                mShowQuoteButton.setTextColor(color);
            }
        };
        mShowQuoteButton.setOnClickListener(listener);
    }
}
