package com.example.testapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class TestActivity extends AppCompatActivity {
	//图片数组<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	int[] imagelist = new int[]{
			R.drawable.a_camel, R.drawable.a_cattle, R.drawable.a_chimpanzee, R.drawable.a_giraffe,
			R.drawable.a_kangaroo, R.drawable.a_leopard, R.drawable.a_lion, R.drawable.a_monkey,
			R.drawable.a_ostrich, R.drawable.a_tiger,

			R.drawable.b_black, R.drawable.b_blue, R.drawable.b_brown, R.drawable.b_green,
			R.drawable.b_grey, R.drawable.b_pink, R.drawable.b_purple, R.drawable.b_red,
			R.drawable.b_white, R.drawable.b_yellow,

			R.drawable.c_apple, R.drawable.c_banana, R.drawable.c_cherry, R.drawable.c_lemon,
			R.drawable.c_mango, R.drawable.c_orange, R.drawable.c_peach, R.drawable.c_pineapple,
			R.drawable.c_strawberry, R.drawable.c_watermelon,

			R.drawable.d_0, R.drawable.d_1, R.drawable.d_2, R.drawable.d_3,
			R.drawable.d_4, R.drawable.d_5, R.drawable.d_6, R.drawable.d_7,
			R.drawable.d_8, R.drawable.d_9,

			R.drawable.e_arrow, R.drawable.e_circular, R.drawable.e_cross, R.drawable.e_ellipse,
			R.drawable.e_hexagon, R.drawable.e_rectangle, R.drawable.e_rhombus, R.drawable.e_square,
			R.drawable.e_trapezoid, R.drawable.e_triangle,

			R.drawable.f_bicycle, R.drawable.f_bus, R.drawable.f_car, R.drawable.f_fire_balloon,
			R.drawable.f_helicopter, R.drawable.f_motorcycle, R.drawable.f_ship, R.drawable.f_train};

	int[] rawzh = new int[]{
			R.raw.a_camel_zh, R.raw.a_cattel_zh, R.raw.a_chimpanzee_zh, R.raw.a_graffe_zh,
			R.raw.a_kangaroo_zh, R.raw.a_leopard_zh, R.raw.a_lion_zh, R.raw.a_monkey_zh,
			R.raw.a_ostrich_zh, R.raw.a_tiger_zh,

			R.raw.b_black_zh, R.raw.b_blue_zh, R.raw.b_brown_zh, R.raw.b_green_zh,
			R.raw.b_grey_zh, R.raw.b_pink_zh, R.raw.b_purple_zh, R.raw.b_red_zh,
			R.raw.b_white_zh, R.raw.b_yellow_zh,

			R.raw.c_apple_zh, R.raw.c_banana_zh, R.raw.c_cherry_zh, R.raw.c_lemon_zh,
			R.raw.c_mango_zh, R.raw.c_orange_zh, R.raw.c_peach_zh, R.raw.c_pineapple_zh,
			R.raw.c_strawberry_zh, R.raw.c_watermelon_zh,

			R.raw.d_0_zh, R.raw.d_1_zh, R.raw.d_2_zh, R.raw.d_3_zh,
			R.raw.d_4_zh, R.raw.d_5_zh, R.raw.d_6_zh, R.raw.d_7_zh,
			R.raw.d_8_zh, R.raw.d_9_zh,

			R.raw.e_arraw_zh, R.raw.e_circular_zh, R.raw.e_cross_zh, R.raw.e_ellipse_zh,
			R.raw.e_hexagon_zh, R.raw.e_rectangle_zh, R.raw.e_rhombus_zh, R.raw.e_square_zh,
			R.raw.e_trapzoid_zh, R.raw.e_triangle_zh,

			R.raw.f_bicycle_zh, R.raw.f_bus_zh, R.raw.f_car_zh, R.raw.f_fire_balloon_zh,
			R.raw.f_helicopter_zh, R.raw.f_motorcycle_zh, R.raw.f_ship_zh, R.raw.f_train_zh};
	int[] rawen = new int[]{
			R.raw.a_camel_en, R.raw.a_cattle_en, R.raw.a_chimpanzee_en, R.raw.a_graffe_en,
			R.raw.a_kangaroo_en, R.raw.a_leopard_en, R.raw.a_lion_en, R.raw.a_monkey_en,
			R.raw.a_ostrich_en, R.raw.a_tiger_en,

			R.raw.b_black_en, R.raw.b_blue_en, R.raw.b_brown_en, R.raw.b_green_en,
			R.raw.b_grey_en, R.raw.b_pink_en, R.raw.b_purple_en, R.raw.b_red_en,
			R.raw.b_white_en, R.raw.b_yellow_en,

			R.raw.c_apple_en, R.raw.c_banana_en, R.raw.c_cherry_en, R.raw.c_lemon_en,
			R.raw.c_mango_en, R.raw.c_orange_en, R.raw.c_peach_en, R.raw.c_pineapple_en,
			R.raw.c_strawberry_en, R.raw.c_watermelon_en,

			R.raw.d_0_en, R.raw.d_1_en, R.raw.d_2_en, R.raw.d_3_en,
			R.raw.d_4_en, R.raw.d_5_en, R.raw.d_6_en, R.raw.d_7_en,
			R.raw.d_8_en, R.raw.d_9_en,

			R.raw.e_arraw_en, R.raw.e_circular_en, R.raw.e_cross_en, R.raw.e_ellipse_en,
			R.raw.e_hexagon_en, R.raw.e_rectangle_en, R.raw.e_rhombus_en, R.raw.e_square_en,
			R.raw.e_trapzoid_en, R.raw.e_triangle_en,

			R.raw.f_bicycle_en, R.raw.f_bus_en, R.raw.f_car_en, R.raw.f_fire_balloon_en,
			R.raw.f_helicopter_en, R.raw.f_motorcycle_en, R.raw.f_ship_en, R.raw.f_train_en};
	//录音文件>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	MediaPlayer mediaPlayer;
	private ImageButton buttona;
	private ImageButton buttonb;
	private ImageButton buttonc;
	private ImageButton buttond;
	private Button testzh;
	private Button testen;
	private Button next;
	private Button back;
	private int[][] datalist;
	private int ran[];
	private int rawnumber;

	private void/*int[][]*/ build(int[] a, int[] b, int[] c) {
		datalist = new int[3][a.length];
		for (int i = 0; i < a.length; i++) {
			datalist[0][i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			datalist[1][i] = b[i];
		}
		for (int i = 0; i < c.length; i++) {
			datalist[2][i] = c[i];
		}
	}

	public void ran() {
		ran = new int[4];
		ran[0] = random(0, datalist[0].length);
		for (ran[1] = random(0, datalist[0].length); ran[1] == ran[0]; ) {
			ran[1] = random(0, datalist[0].length);
		}
		for (ran[2] = random(0, datalist[0].length); ran[2] == ran[0] || ran[2] == ran[1]; ) {
			ran[2] = random(0, datalist[0].length);
		}
		for (ran[3] = random(0, datalist[0].length); ran[3] == ran[0] || ran[3] == ran[1] || ran[3] == ran[2]; ) {
			ran[3] = random(0, datalist[0].length);
		}
		rawnumber = ran[random(0, 4)];
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		buttona = (ImageButton) findViewById(R.id.imageButtonA);
		buttonb = (ImageButton) findViewById(R.id.imageButtonB);
		buttonc = (ImageButton) findViewById(R.id.imageButtonC);
		buttond = (ImageButton) findViewById(R.id.imageButtonD);
		testzh = findViewById(R.id.testzh);
		testen = findViewById(R.id.testen);
		next = findViewById(R.id.next);
		back = findViewById(R.id.back);
		build(imagelist, rawzh, rawen);

		testzh.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Toast.makeText(TestActivity.this,"zh",Toast.LENGTH_SHORT).show();
				mediaPlayer = MediaPlayer.create(TestActivity.this, datalist[1][rawnumber]);
				mediaPlayer.setLooping(false);//不循环
				mediaPlayer.start();//开始
			}
		});
		testen.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Toast.makeText(TestActivity.this,"en",Toast.LENGTH_SHORT).show();
				mediaPlayer = MediaPlayer.create(TestActivity.this, datalist[2][rawnumber]);
				mediaPlayer.setLooping(false);//不循环
				mediaPlayer.start();//开始
			}
		});
		next.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				next.setText("下一题");
				ran();
				//Toast.makeText(TestActivity.this,"ran "+ran[0]+ran[1]+ran[2]+ran[3],Toast.LENGTH_SHORT).show();
				buttona.setImageResource(datalist[0][ran[0]]);
				buttonb.setImageResource(datalist[0][ran[1]]);
				buttonc.setImageResource(datalist[0][ran[2]]);
				buttond.setImageResource(datalist[0][ran[3]]);
				buttona.setForeground(getDrawable(R.drawable.clear));
				buttonb.setForeground(getDrawable(R.drawable.clear));
				buttonc.setForeground(getDrawable(R.drawable.clear));
				buttond.setForeground(getDrawable(R.drawable.clear));
				mediaPlayer = MediaPlayer.create(TestActivity.this, datalist[2][rawnumber]);
				mediaPlayer.setLooping(false);//不循环
				mediaPlayer.start();//开始
			}
		});
		back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(TestActivity.this, MainActivity.class);
				startActivity(intent);
			}
		});
		back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(TestActivity.this, MainActivity.class);
				startActivity(intent);
			}
		});
		buttona.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (ran[0] == rawnumber) {
					buttona.setForeground(getDrawable(R.drawable.yes));
				} else {
					buttona.setForeground(getDrawable(R.drawable.no));
				}
			}
		});
		buttonb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (ran[1] == rawnumber) {
					buttonb.setForeground(getDrawable(R.drawable.yes));
				} else {
					buttonb.setForeground(getDrawable(R.drawable.no));
				}
			}
		});
		buttonc.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (ran[2] == rawnumber) {
					buttonc.setForeground(getDrawable(R.drawable.yes));
				} else {
					buttonc.setForeground(getDrawable(R.drawable.no));
				}
			}
		});
		buttond.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (ran[3] == rawnumber) {
					buttond.setForeground(getDrawable(R.drawable.yes));
				} else {
					buttond.setForeground(getDrawable(R.drawable.no));
				}
			}
		});

	}

	private int random(int a, int b) {
		int min = a;
		int max = b;
		Random random = new Random();
		int num = random.nextInt(max) % (max - min + 1) + min;
		return num;
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}