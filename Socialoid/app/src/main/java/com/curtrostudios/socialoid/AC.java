package com.curtrostudios.socialoid;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

public final class AC
{
  public static Intent a()
  {
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("market://search?q=pub:\""));
    return localIntent;
  }

  @TargetApi(16)
  public static Intent a(ComponentName paramComponentName)
  {
    Intent localIntent = null;
    if (paramComponentName != null)
    {
      int i = Build.VERSION.SDK_INT;
      localIntent = null;
      if (i < 16);
    }
    try
    {
      Class.forName(paramComponentName.getClassName());
      localIntent = new Intent();
      localIntent.setAction("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
      localIntent.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", paramComponentName);
      return localIntent;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static Intent a(Context paramContext)
  {
    Intent localIntent1 = new Intent();
    localIntent1.setAction("com.curtrostudios.intent.action.SETTINGS");
    localIntent1.addCategory("android.intent.category.PREFERENCE");
    Intent localIntent2 = a(paramContext, localIntent1, true);
    if (localIntent2 != null)
      localIntent2.putExtra("key_launched_from_activity", true);
    return localIntent2;
  }

  public static Intent a(Context paramContext, Intent paramIntent, boolean paramBoolean)
  {
    if (paramBoolean)
      paramIntent.setPackage(paramContext.getPackageName());
    ComponentName localComponentName = paramIntent.resolveActivity(paramContext.getPackageManager());
    if (localComponentName != null)
    {
      Intent localIntent = new Intent(paramIntent);
      localIntent.setComponent(localComponentName);
      return localIntent;
    }
    return null;
  }

  

  public static boolean a(Activity paramActivity, Intent paramIntent)
  {
    if ((paramActivity == null) || (paramIntent == null))
      return false;
    try
    {
      paramActivity.startActivity(paramIntent);
      return true;
    }
    catch (Exception localException)
    {
      localException.toString();
    }
    return false;
  }

  public static boolean a(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    if ((paramActivity == null) || (paramIntent == null))
      return false;
    try
    {
      paramActivity.startActivityForResult(paramIntent, paramInt);
      return true;
    }
    catch (Exception localException)
    {
      localException.toString();
    }
    return false;
  }

  

  
}