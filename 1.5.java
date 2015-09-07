public class Solution {
	public static String Compress(String s) {
		char tell = ' ';
		int n = 0;
		StringBuffer sb = new StringBuffer();
		char[] s_array = s.toCharArray();
		for (char c : s_array) {
			if(c != tell) {
				if (n != 0) {
					sb.append(tell);
					sb.append(n);
				}
				n = 1;
				tell = c;

			} 

			else {
				n++;
			}

		}

		sb.append(tell);
		sb.append(n);

		String s1 = sb.toString();
		if (s1.length() < s.length()) 
			return s1;
		else 
			return s;
	}

	public static void main (String args[]) {
		System.out.println(Solution.Compress("cccaaabbdkk"));
		System.out.println(Solution.Compress(""));
		System.out.println(Solution.Compress("abcdefg"));
		System.out.println(Solution.Compress("aaaaaaaaaaab"));
	}
}
