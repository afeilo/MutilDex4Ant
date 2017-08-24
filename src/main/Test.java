package main;

import java.lang.reflect.Field;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Test extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		try {
			Class<?> class1 = Class.forName("com.nostra13.universalimageloader.BuildConfig");
			 Field[] fields = class1.getFields();
		     for( Field field : fields ){
		         Toast.makeText(Test.this, field.getName(), Toast.LENGTH_SHORT ).show();
		         Log.d("test",field.getName());
		     }
		} catch (Exception e1) {

			Log.d("test", e1.getMessage());
			e1.printStackTrace();
		} 
	}

}
