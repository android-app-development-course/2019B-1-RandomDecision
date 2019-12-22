package com.example.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity{
    EditText q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q=findViewById(R.id.question);
    }

    public void start(View view)
    {
        while(true){
            String que=q.getText().toString();
            if (que.isEmpty()){
                Toast.makeText(getApplicationContext(),"问题不能为空",Toast.LENGTH_LONG).show();
                break;
            }
        //提取输入框内容
        EditText l1= findViewById(R.id.like1);
        EditText o1= findViewById(R.id.option1);
        EditText l2= findViewById(R.id.like2);
        EditText o2= findViewById(R.id.option2);
        EditText l3= findViewById(R.id.like3);
        EditText o3= findViewById(R.id.option3);
        EditText l4= findViewById(R.id.like4);
        EditText o4= findViewById(R.id.option4);
        EditText l5= findViewById(R.id.like5);
        EditText o5= findViewById(R.id.option5);
        //设置五个随机数
        Random r1=new Random();
        Random r2=new Random();
        Random r3=new Random();
        Random r4=new Random();
        Random r5=new Random();
        int i1 = r1.nextInt(6)+1;
        int i2 = r2.nextInt(6)+1;
        int i3 = r3.nextInt(6)+1;
        int i4 = r4.nextInt(6)+1;
        int i5 = r5.nextInt(6)+1;
        //判断选项是否为空，为空则将随机数置零
        String io1=o1.getText().toString();
        String io2=o2.getText().toString();
        String io3=o3.getText().toString();
        String io4=o4.getText().toString();
        String io5=o5.getText().toString();
            if (io1.isEmpty()&&io2.isEmpty()&&io3.isEmpty()&&io4.isEmpty()&&io5.isEmpty()){
                Toast.makeText(getApplicationContext(),"所有选项不能为空",Toast.LENGTH_LONG).show();
                break;
            }
        if (io1.length()==0){
            i1=0;
        }
        else if (io2.length()==0){
            i2=0;
        }
        else if (io3.length()==0){
            i3=0;
        }
        else if (io4.length()==0){
            i4=0;
        }
        else if (io5.length()==0){
            i5=0;
        }
        //将提取的偏好度转换成int用于运算
        String sl1=l1.getText().toString();
        String sl2=l2.getText().toString();
        String sl3=l3.getText().toString();
        String sl4=l4.getText().toString();
        String sl5=l5.getText().toString();
        int il1 = Integer.parseInt(sl1);
        int il2 = Integer.parseInt(sl2);
        int il3 = Integer.parseInt(sl3);
        int il4 = Integer.parseInt(sl4);
        int il5 = Integer.parseInt(sl5);
        //计算各选项权重
        il1=il1*i1;
        il2=il2*i2;
        il3=il3*i3;
        il4=il4*i4;
        il5=il5*i5;
            //比较大小，决定结果
            AlertDialog dialog;
            //选项1
            if (il1 > il2 && il1 > il3 && il1 > il4 && il1 > il5) {
                dialog = new AlertDialog.Builder(this).setTitle("决策结果")
                        .setMessage("根据决策，结果为" + io1)
                        .setPositiveButton("确定", null)
                        .create();
                dialog.show();
                break;
            }
            //选项2
            else if (il2 > il1 && il2 > il3 && il2 > il4 && il2 > il5) {
                dialog = new AlertDialog.Builder(this).setTitle("决策结果")
                        .setMessage("根据决策，结果为" + io2)
                        .setPositiveButton("确定", null)
                        .create();
                dialog.show();
                break;
            }
            //选项3
            else if (il3 > il1 && il3 > il2 && il3 > il4 && il3 > il5) {
                dialog = new AlertDialog.Builder(this).setTitle("决策结果")
                        .setMessage("根据决策，结果为" + io3)
                        .setPositiveButton("确定", null)
                        .create();
                dialog.show();
                break;
            }
            //选项4
            else if (il4 > il1 && il4 > il2 && il4 > il3 && il4 > il5) {
                dialog = new AlertDialog.Builder(this).setTitle("决策结果")
                        .setMessage("根据决策，结果为" + io4)
                        .setPositiveButton("确定", null)
                        .create();
                dialog.show();
                break;
            }
            //选项5
            else if (il5 > il2 && il5 > il3 && il5 > il4 && il5 > il1) {
                dialog = new AlertDialog.Builder(this).setTitle("决策结果")
                        .setMessage("根据决策，结果为" + io5)
                        .setPositiveButton("确定", null)
                        .create();
                dialog.show();
                break;
            }
        }
    }
//初始化输入
    public void clear(View v){
        EditText l1= findViewById(R.id.like1);
        EditText o1= findViewById(R.id.option1);
        EditText l2= findViewById(R.id.like2);
        EditText o2= findViewById(R.id.option2);
        EditText l3= findViewById(R.id.like3);
        EditText o3= findViewById(R.id.option3);
        EditText l4= findViewById(R.id.like4);
        EditText o4= findViewById(R.id.option4);
        EditText l5= findViewById(R.id.like5);
        EditText o5= findViewById(R.id.option5);
        q.setText("");
        o1.setText("");
        o2.setText("");
        o3.setText("");
        o4.setText("");
        o5.setText("");
        l1.setText("1");
        l2.setText("1");
        l3.setText("1");
        l4.setText("1");
        l5.setText("1");
    }

}
