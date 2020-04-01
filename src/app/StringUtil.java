package app;

public class StringUtil {

	public static boolean isVazio(String string) {
		if (string == null) {
			return true;
		}

		string = string.trim();
		return string.length() == 0;
	}

	public static String reverso(String string) {
		if (string == null) {
			return string;
		}

		StringBuilder stringB = new StringBuilder(string);
		stringB.reverse();
		return stringB.toString();

	}

}
