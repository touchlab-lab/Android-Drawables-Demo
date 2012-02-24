package co.touchlab.android.demo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by IntelliJ IDEA.
 * User: kgalligan
 * Date: 11/4/11
 * Time: 12:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class RelativeLayoutTest extends Activity
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative1);
    }

    public static void callMe(Context c)
    {
        c.startActivity(new Intent(c, RelativeLayoutTest.class));
    }
}