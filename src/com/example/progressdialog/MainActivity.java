package com.example.progressdialog;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	private Button btn1,btn2;
	private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				dialog.setTitle("提示信息");
				//dialog.setCancelable(false);  设置对话框不能被取消
				dialog.setMessage("正在下载，请稍后。。。。。");
				dialog.show();
				
			}
		});
        btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dialog.setTitle("提示信息");
				//dialog.setCancelable(false);  设置对话框不能被取消
				dialog.setMessage("正在下载，请稍后。。。。。");
				dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
				dialog.setMax(100);
				dialog.setProgress(60);
				dialog.setSecondaryProgress(80);
				dialog.show();
			}
		});

    }
    private void initView(){
    	btn1 = (Button)this.findViewById(R.id.button1);
    	btn2 = (Button)this.findViewById(R.id.button2);
    	dialog = new ProgressDialog(MainActivity.this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



}
