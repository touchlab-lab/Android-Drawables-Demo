package co.touchlab.android.demo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by IntelliJ IDEA.
 * User: kgalligan
 * Date: 10/13/11
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Gradients extends Activity
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gradients);
    }

    public static void callMe(Context c)
    {
        c.startActivity(new Intent(c, Gradients.class));
    }
}