package com.myapplication.utils;


import android.app.Activity;
import android.text.TextUtils;


public class VerificationUtil {
	public static boolean isMobileNO(String mobiles) {
		/*
		 * 移动：134、135、136、137、138、139、150、151、157(TD)、158、159、187、188
		 * 联通：130、131、132、152、155、156、185、186 电信：133、153、180、189、（1349卫通）
		 * 总结起来就是第一位必定为1，第二位必定为3或5或8，其他位置的可以为0-9
		 */
		String telRegex = "[1][34578]\\d{9}";// "[a1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
		if (TextUtils.isEmpty(mobiles))
			return false;
		else
			return mobiles.matches(telRegex);
	}

	// 验证手机号码
	public static boolean isPhone(String phone) {
		if (!TextUtils.isEmpty(phone)) {
			if (isMobileNO(phone)) {
				return true;
			}
		}
		return false;
	}

	// 验证账号
	public static boolean isAccountNumber(String accountNumber) {
		if (!TextUtils.isEmpty(accountNumber)) {
			if (accountNumber.length() > 5) {
				return true;
			}
		}
		return false;
	}

	// 验证验证码
	public static boolean isGainCode(String gainCode) {
		if (!TextUtils.isEmpty(gainCode)) {
			if (gainCode.length() != 4 || gainCode.length() != 6) {
				return true;
			}
		}
		return false;
	}

	// 验证密码
	public static boolean isPassword(String password) {
		if (!TextUtils.isEmpty(password)) {
			if (password.length() >= 6 && password.length() <= 20) {
				return true;
			}
		}
		return false;
	}

	// 验证token
	public static boolean isToken(String token) {
		
		if (!TextUtils.isEmpty(token)) {
			return true;
		}
		return false;
	}

	/**
	 * 判断token超时
	 * 
	 * @param activity
	 */
	public static void isToken(Activity activity) {
//		activity.startActivity(new Intent(activity, LoginActivity.class));
//		SPutils.remove(Ckey.TOKEN);
	}
}
