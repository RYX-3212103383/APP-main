package com.example.testapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    private ImageButton animal;
    private ImageButton color;
    private ImageButton fruit;
    private ImageButton number;
    private ImageButton shape;
    private ImageButton transform;
    private  Button buttontest;
    //定义图片和音频2D数组
    private int[][]datalist;
    private void/*int[][]*/ build(int[] a, int[] b, int[] c){
       datalist=new int[3][a.length];
       for(int i=0;i<a.length;i++){
           datalist[0][i]=a[i];
       }
        for(int i=0;i<b.length;i++){
            datalist[1][i]=b[i];
        }
        for(int i=0;i<c.length;i++){
            datalist[2][i]=c[i];
        }
    //return datalist;
    }
//图片数组<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      int[] animalimage=new int[]{
            R.drawable.a_camel,R.drawable.a_cattle,R.drawable.a_chimpanzee,R.drawable.a_giraffe,
            R.drawable.a_kangaroo,R.drawable.a_leopard,R.drawable.a_lion,R.drawable.a_monkey,
            R.drawable.a_ostrich,R.drawable.a_tiger,};
      int[] colorimage=new int[]{
            R.drawable.b_black,R.drawable.b_blue,R.drawable.b_brown,R.drawable.b_green,
            R.drawable.b_grey,R.drawable.b_pink,R.drawable.b_purple,R.drawable.b_red,
            R.drawable.b_white,R.drawable.b_yellow,};
      int[] fruitimage=new int[]{
            R.drawable.c_apple,R.drawable.c_banana,R.drawable.c_cherry,R.drawable.c_lemon,
            R.drawable.c_mango,R.drawable.c_orange,R.drawable.c_peach,R.drawable.c_pineapple,
            R.drawable.c_strawberry,R.drawable.c_watermelon,};
      int[] numberimage = new int[]{
            R.drawable.d_0,R.drawable.d_1,R.drawable.d_2,R.drawable.d_3,
            R.drawable.d_4,R.drawable.d_5,R.drawable.d_6,R.drawable.d_7,
            R.drawable.d_8,R.drawable.d_9,};
      int[] shapeimage=new int[]{
            R.drawable.e_arrow,R.drawable.e_circular,R.drawable.e_cross,R.drawable.e_ellipse,
            R.drawable.e_hexagon,R.drawable.e_rectangle,R.drawable.e_rhombus,R.drawable.e_square,
            R.drawable.e_trapezoid,R.drawable.e_triangle,};
      int[] transformimage=new int[]{
            R.drawable.f_bicycle,R.drawable.f_bus,R.drawable.f_car,R.drawable.f_fire_balloon,
            R.drawable.f_helicopter,R.drawable.f_motorcycle,R.drawable.f_ship,R.drawable.f_train};
//图片数组>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//录音文件<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    int[] animalzh = new int[]{
        R.raw.a_camel_zh,R.raw.a_cattel_zh,R.raw.a_chimpanzee_zh,R.raw.a_graffe_zh,
        R.raw.a_kangaroo_zh,R.raw.a_leopard_zh,R.raw.a_lion_zh,R.raw.a_monkey_zh,
        R.raw.a_ostrich_zh,R.raw.a_tiger_zh};
    int[] animalen = new int[]{
            R.raw.a_camel_en,R.raw.a_cattle_en,R.raw.a_chimpanzee_en,R.raw.a_graffe_en,
            R.raw.a_kangaroo_en,R.raw.a_leopard_en,R.raw.a_lion_en,R.raw.a_monkey_en,
            R.raw.a_ostrich_en,R.raw.a_tiger_en};
    int[] colorzh = new int[]{
        R.raw.b_black_zh,R.raw.b_blue_zh,R.raw.b_brown_zh,R.raw.b_green_zh,
        R.raw.b_grey_zh,R.raw.b_pink_zh,R.raw.b_purple_zh,R.raw.b_red_zh,
        R.raw.b_white_zh,R.raw.b_yellow_zh};
    int[] coloren = new int[]{
            R.raw.b_black_en,R.raw.b_blue_en,R.raw.b_brown_en,R.raw.b_green_en,
            R.raw.b_grey_en,R.raw.b_pink_en,R.raw.b_purple_en,R.raw.b_red_en,
            R.raw.b_white_en,R.raw.b_yellow_en};
    int[] fruitzh = new int[]{
            R.raw.c_apple_zh,R.raw.c_banana_zh,R.raw.c_cherry_zh,R.raw.c_lemon_zh,
            R.raw.c_mango_zh,R.raw.c_orange_zh,R.raw.c_peach_zh,R.raw.c_pineapple_zh,
            R.raw.c_strawberry_zh,R.raw.c_watermelon_zh};
    int[] fruiten = new int[]{
            R.raw.c_apple_en,R.raw.c_banana_en,R.raw.c_cherry_en,R.raw.c_lemon_en,
            R.raw.c_mango_en,R.raw.c_orange_en,R.raw.c_peach_en,R.raw.c_pineapple_en,
            R.raw.c_strawberry_en,R.raw.c_watermelon_en};
    int[] numberzh = new int[]{
            R.raw.d_0_zh,R.raw.d_1_zh,R.raw.d_2_zh,R.raw.d_3_zh,
            R.raw.d_4_zh,R.raw.d_5_zh,R.raw.d_6_zh,R.raw.d_7_zh,
            R.raw.d_8_zh,R.raw.d_9_zh};
    int[] numberen = new int[]{
            R.raw.d_0_en,R.raw.d_1_en,R.raw.d_2_en,R.raw.d_3_en,
            R.raw.d_4_en,R.raw.d_5_en,R.raw.d_6_en,R.raw.d_7_en,
            R.raw.d_8_en,R.raw.d_9_en};
    int[] shapezh = new int[]{
            R.raw.e_arraw_zh,R.raw.e_circular_zh,R.raw.e_cross_zh,R.raw.e_ellipse_zh,
            R.raw.e_hexagon_zh,R.raw.e_rectangle_zh,R.raw.e_rhombus_zh,R.raw.e_square_zh,
            R.raw.e_trapzoid_zh,R.raw.e_triangle_zh};
    int[] shapeen = new int[]{
            R.raw.e_arraw_en,R.raw.e_circular_en,R.raw.e_cross_en,R.raw.e_ellipse_en,
            R.raw.e_hexagon_en,R.raw.e_rectangle_en,R.raw.e_rhombus_en,R.raw.e_square_en,
            R.raw.e_trapzoid_en,R.raw.e_triangle_en};
    int[] transformzh = new int[]{
            R.raw.f_bicycle_zh,R.raw.f_bus_zh,R.raw.f_car_zh,R.raw.f_fire_balloon_zh,
            R.raw.f_helicopter_zh,R.raw.f_motorcycle_zh,R.raw.f_ship_zh,R.raw.f_train_zh};
    int[] transformen = new int[]{
            R.raw.f_bicycle_en,R.raw.f_bus_en,R.raw.f_car_en,R.raw.f_fire_balloon_en,
            R.raw.f_helicopter_en,R.raw.f_motorcycle_en,R.raw.f_ship_en,R.raw.f_train_en};
//录音文件>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //图片下标序号
    private int count = 0;
    //定义手势监听对象
    private GestureDetector gestureDetector;
    //定义ImageView对象
    private ImageView iv;

//On Create///////////////////////////////////////////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化布局
        iv = (ImageView)findViewById(R.id.imageView);               //获取ImageView控件id
        gestureDetector = new GestureDetector(onGestureListener);   //设置手势监听由onGestureListener处理
        //buttonzh= (Button) findViewById(R.id.buttonzh);            //初始化按钮
        //buttonen= (Button) findViewById(R.id.buttonen);
        animal= (ImageButton) findViewById(R.id.imageButton1);
        color= (ImageButton) findViewById(R.id.imageButton2);
        fruit= (ImageButton) findViewById(R.id.imageButton3);
        number= (ImageButton) findViewById(R.id.imageButton4);
        shape= (ImageButton) findViewById(R.id.imageButton5);
        transform= (ImageButton) findViewById(R.id.imageButton6);
        buttontest=  findViewById(R.id.buttontest);
        build(animalimage,animalzh,animalen);
        //匿名按钮类
        animal.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Toast.makeText(MainActivity.this,"已选类别：动物",Toast.LENGTH_SHORT).show();
                build(animalimage,animalzh,animalen);
                count=0;
                iv.setImageResource(datalist[0][0]);
            }
        });
        color.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Toast.makeText(MainActivity.this,"已选类别：颜色",Toast.LENGTH_SHORT).show();
                build(colorimage,colorzh,coloren);
                count=0;
                iv.setImageResource(datalist[0][0]);
            }
        });
        fruit.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Toast.makeText(MainActivity.this,"已选类别：水果",Toast.LENGTH_SHORT).show();
                build(fruitimage,fruitzh,fruiten);
                count=0;
                iv.setImageResource(datalist[0][0]);
            }
        });
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"已选类别：数字",Toast.LENGTH_SHORT).show();
                build(numberimage,numberzh,numberen);
                count=0;
                iv.setImageResource(datalist[0][0]);
            }
        });
        shape.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Toast.makeText(MainActivity.this,"已选类别：形状",Toast.LENGTH_SHORT).show();
                build(shapeimage,shapezh,shapeen);
                count=0;
                iv.setImageResource(datalist[0][0]);
            }
        });
        transform.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Toast.makeText(MainActivity.this,"已选类别：载具",Toast.LENGTH_SHORT).show();
                build(transformimage,transformzh,transformen);
                count=0;
                iv.setImageResource(datalist[0][0]);
            }
        });
        buttontest.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(MainActivity.this,TestActivity.class);
                startActivity(intent);
            }
        });
    }
//结束/////////////////////////////////////////////////////////////////////////////////////////////
    //当Activity被触摸时回调
    public boolean onTouchEvent(MotionEvent event){
        return gestureDetector.onTouchEvent(event);
    }
    //自定义GestureDetector的手势识别监听器
    private GestureDetector.OnGestureListener onGestureListener
            = new GestureDetector.SimpleOnGestureListener(){
        //当识别的手势是滑动手势时回调onFinger方法
        public boolean onFling(MotionEvent e1,MotionEvent e2,float velocityX,float velocityY){
            //得到手触碰位置的起始点和结束点坐标 x , y ，并进行计算
            float x = e2.getX()-e1.getX();
            float y = e2.getY()-e1.getY();
            //通过计算判断是向左还是向右滑动
            if(x < -100){
                right ();      //想显示多少图片，就把定义图片的数组长度-1
            }else if(x > 100){
                left ();
            }

            iv.setImageResource(datalist[0][count]);  //切换imageView的图片
            return true;
        }
    };

    private void left() { count = (count + (datalist[0].length - 1)) % (datalist[0].length ); }
    private void right() { count++;count%=(datalist[0].length); }

    public void clickl (View v){
        left();
        iv.setImageResource(datalist[0][count]);
        //向左移动一次
    }
        public void clickr (View v){
            right();
            iv.setImageResource(datalist[0][count]);
        //向右移动一次
    }
    public void btnzh (View v){
        mediaPlayer = MediaPlayer.create(MainActivity.this,datalist[1][count]);
        mediaPlayer.setLooping(false);//不循环
        mediaPlayer.start();//开始
        //播放向右移动一次后的音频
    }
    public void btnen (View v){
        mediaPlayer = MediaPlayer.create(MainActivity.this,datalist[2][count]);
        mediaPlayer.setLooping(false);//不循环
        mediaPlayer.start();//开始
        //播放向右移动一次后的音频
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
