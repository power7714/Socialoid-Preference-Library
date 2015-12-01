package com.curtrostudios.socialoidlibrary;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.net.Uri;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class SocialoidPref extends DialogPreference implements OnClickListener
{
  private static String gUrl;
  private static String yUrl;
  private static String fUrl;
  private static String fUrl2;
  private static String tUrl;
  private static String tUrl2;
  D d;
  AC ac;

  

  public SocialoidPref(final Context context, final AttributeSet attrs)
  {
    super(context, attrs);
    init(attrs);
    //Use setWidgetLayoutResource to display the setting how you
    //want it in the settings screen
    setWidgetLayoutResource(R.layout.socialoid_pref);
    //Set the title of the setting
    TypedArray a = context.obtainStyledAttributes(attrs,
            R.styleable.SocialPreference);
    String title = a.getString(R.styleable.SocialPreference_titleDef);
    if (title != null) {
        setTitle(title);
    }
    a.recycle();
    //Set the summary for the setting
    TypedArray b = context.obtainStyledAttributes(attrs,
            R.styleable.SocialPreference);
    String summary = b.getString(R.styleable.SocialPreference_summaryDef);
    if (summary != null) {
        setSummary(summary);
    }
    b.recycle();
    //setSummary(summary);
    //Here you set the title for the Dialog
    TypedArray c = context.obtainStyledAttributes(attrs,
            R.styleable.SocialPreference);
    String dialogTitle = c.getString(R.styleable.SocialPreference_dialogTitle);
    if (dialogTitle != null) {
        setDialogTitle(dialogTitle);
    }
    c.recycle();
    //setDialogTitle(dialog);
    //Here you declare the layout for the Dialog
    setDialogLayoutResource(R.layout.pref_social_dialog);
    //setNegativeButtonText(R.string.Cancel);
  }

  
  
  //Void a,b,c,and d are called when each icon is pressed
  //on the setting or when each list item is selected within the dialog.
  //allowing the user to select each social site from the setting or the dialog.
  //each action includes an intent that launches the corresponding social site.
  private void a(View paramView, int paramInt)
  {
    if (paramView != null)
    {
      View localView = paramView.findViewById(paramInt);
      if (localView != null)
        localView.setOnClickListener(new View.OnClickListener()
        {
        	public final void onClick(View paramView)
        	  {
        	    this.gPlus();
        	  }

        	private void gPlus()
        	  {
        	    Dialog localDialog = getDialog();
        	    if (localDialog != null)
        	      localDialog.dismiss();
        	    Context localContext = getContext();
        	    if (localContext != null)
        	    {
        	      Intent localIntent = new Intent();
        	      localIntent.setAction("android.intent.action.VIEW");
        	      //Important: put your G+ page where it says "gplus_account_here" or it won't work
        	      localIntent.setData(Uri.parse(gUrl));
        	      localContext.startActivity(localIntent);
        	      
        	    }
        	  }
        });
    }
  }

  private void b(View paramView, int paramInt)
  {
    if (paramView != null)
    {
      View localView = paramView.findViewById(paramInt);
      if (localView != null)
        localView.setOnClickListener(new View.OnClickListener()
        {

			@Override
			public void onClick(View v) {
				this.faceBook();
				
			}
			private void faceBook()
			  {
			    Dialog localDialog = getDialog();
			    if (localDialog != null)
			      localDialog.dismiss();
			    Context localContext = getContext();
			    if (localContext != null)
			    {
			      Intent localIntent1 = new Intent();
			      localIntent1.setAction("android.intent.action.VIEW");
			      //Important: put your FaceBook id and page in their respective locations
			      //or it won't work.
			      localIntent1.setData(Uri.parse(fUrl));
			      Intent localIntent2 = ac.a(localContext, localIntent1, false);
			      if (localIntent2 == null)
			      {
			        localIntent2 = new Intent();
			        localIntent2.setAction("android.intent.action.VIEW");
			        localIntent2.setData(Uri.parse(fUrl2));
			      }
			      localContext.startActivity(localIntent2);
			    }
			  }
        	
        	
			
      });
  }
}

  private void c(View paramView, int paramInt)
  {
    if (paramView != null)
    {
      View localView = paramView.findViewById(paramInt);
      if (localView != null)
        localView.setOnClickListener(new View.OnClickListener()
        {

			@Override
			public void onClick(View v) {
				this.twitter();
			}
			private void twitter()
			  {
			    Dialog localDialog = getDialog();
			    if (localDialog != null)
			      localDialog.dismiss();
			    Context localContext = getContext();
			    if (localContext != null)
			    {
			      Intent localIntent1 = new Intent();
			      localIntent1.setAction("android.intent.action.VIEW");
			      //Important: put your Twitter screen name where it says
			      //"screen_name_here" or it won't work
			      localIntent1.setData(Uri.parse(tUrl));
			      Intent localIntent2 = ac.a(localContext, localIntent1, false);
			      if (localIntent2 == null)
			      {
			        localIntent2 = new Intent();
			        localIntent2.setAction("android.intent.action.VIEW");
			        localIntent2.setData(Uri.parse(tUrl2));
			      }
			      localContext.startActivity(localIntent2);
			    }
			  }
        });
    }
  }

  private void d(View paramView, int paramInt)
  {
    if (paramView != null)
    {
    	View localView = paramView.findViewById(paramInt);
        if (localView != null)
          localView.setOnClickListener(new View.OnClickListener()
          {

			@Override
			public void onClick(View paramView) {
				this.youTube();
			}
			private void youTube()
			  {
			    Dialog localDialog = getDialog();
			    if (localDialog != null)
			      localDialog.dismiss();
			    Context localContext = getContext();
			    if (localContext != null)
			    {
			      Intent localIntent = new Intent();
			      localIntent.setAction("android.intent.action.VIEW");
			      //Important: Put your YouTube channel name where it 
			      //says "username_here" or it won't work
			      localIntent.setData(Uri.parse(yUrl));
			      localContext.startActivity(localIntent);
			    }
			  }
        	  
          });
    }
  }

  
//This instantiates the view for the dialog
  //and allows each icon to be clickable
  protected final View onCreateDialogView()
  {
    View localView = super.onCreateDialogView();
    
    //For example: when a(localView, d.tv_social_gplus); is
    //called, public void a(); is started taking the user
    //to the related social site or app
    a(localView, d.tv_social_gplus);
    b(localView, d.tv_social_facebook);
    c(localView, d.tv_social_twitter);
    d(localView, d.tv_social_ytube);
    return localView;
  }

  //This instantiates the view for the setting within the setting
  //screen and allows each icon to be clicked, invoking
  //the corresponding action.
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    
    ((TextView)localView.findViewById(android.R.id.title)).setTextColor(Color.YELLOW);
    ((TextView)localView.findViewById(android.R.id.title)).setTextSize(20f);
    ((TextView)localView.findViewById(android.R.id.summary)).setTextColor(Color.YELLOW);
    ((TextView)localView.findViewById(android.R.id.summary)).setTextSize(16f);
    
    a(localView, d.iv_social_gplus);
    b(localView, d.iv_social_facebook);
    c(localView, d.iv_social_twitter);
    d(localView, d.iv_social_ytube);
    return localView;
  }

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}

		@Override
		protected void onPrepareDialogBuilder(Builder builder) {
		    super.onPrepareDialogBuilder(builder);
		    builder.setNegativeButton(null, null);
		}
		
		private void init(final AttributeSet attrs) { 
			if (attrs != null) { 
				String packageName = "http://schemas.android.com/apk/res-auto"; 
				gUrl = attrs.getAttributeValue(packageName, "gplus");
				yUrl = attrs.getAttributeValue(packageName, "ytube");
				tUrl = attrs.getAttributeValue(packageName, "twit");
				tUrl2 = attrs.getAttributeValue(packageName, "twit2");
				fUrl = attrs.getAttributeValue(packageName, "fb");
				fUrl2 = attrs.getAttributeValue(packageName, "fb2");
				} 
			} 


}