package co.touchlab.android.demo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by IntelliJ IDEA.
 * User: kgalligan
 * Date: 10/14/11
 * Time: 1:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class NinePatch extends Activity
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nine_patch);
    }

    public static void callMe(Context c)
    {
        c.startActivity(new Intent(c, NinePatch.class));
    }
}