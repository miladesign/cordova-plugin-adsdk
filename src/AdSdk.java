package cordova.miladesign;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.util.Log;
import ir.myteam.adsdk.AdCommon;

public class AdSdk extends CordovaPlugin {
	private static final String TAG = "MilaDesign";
	private static Activity mActivity = null;
	public CordovaInterface cordova = null;
	
	@Override
	public void initialize (CordovaInterface initCordova, CordovaWebView webView) {
		 Log.e (TAG, "initialize");
		  cordova = initCordova;
		  super.initialize (cordova, webView);
	}
	
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext CallbackContext) throws JSONException {
		if (action.equals("init")) {
		    mActivity = cordova.getActivity();
		    String developerId = args.getString(0);
		    boolean test = args.getBoolean(1);
		    boolean enable = args.getBoolean(2);
			AdCommon.init(mActivity, developerId, test, enable);
			CallbackContext.success();
			return true;
		}
	    return false;
	}
}