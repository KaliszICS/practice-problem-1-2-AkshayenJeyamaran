public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex (int[] numbers, int index)  {
		try {
			int int1;
			int1 = numbers[index];
			return true;
		} catch (Exception e) {
        	return false; 
		}
	}
	public static int divide(int int1, int int2) {
    try {
        int int3 = int1 / int2;
        return int3;
    } catch (Exception e) {
        return 0;
    }
	}

	public static int safeConvertStringtoInt (String s) {
    try {
        int int3 = Integer.parseInt(s);
        return int3;
    } catch (Exception e) {
        return 0;
    }
	}
}