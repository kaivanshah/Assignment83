package com.kaivanshah.assignment83;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AlertDialogLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_ShowDialog, btn_Yes, btn_No;
    TextView text;
    final Context context = this;
    Dialog alertDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_ShowDialog = (Button) (this.findViewById(R.id.btn_ShowDialog));
        alertDialog = new Dialog(context);
        alertDialog.setContentView(R.layout.alertdialog);
        btn_Yes = (Button) alertDialog.findViewById(R.id.btn_Yes);
        btn_No = (Button) alertDialog.findViewById(R.id.btn_No);

        btn_ShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.show();
            }
        });

        btn_Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        btn_No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
    }
}
