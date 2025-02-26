public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean isPalindrome(String str){
		char[] ltrs = str.toLowerCase().replaceAll(" ", "").toCharArray();
		for(int i = 0; i<ltrs.length; i++){
			if(ltrs[i] != ltrs[ltrs.length-i-1]) return false;
		}
		return true;
	}
	public static int getAge(String[] people, int[] ages, String person){
		for(int i = 0; i < people.length; i++){
			if(people[i] == person){
				return ages[i];
			}
		}
		return -1;
	}
	public static int countWords(String str, char chr){
		String[] words = str.split(" ");
		int count = 0;
		for(int i =0; i < words.length; i++){
			if(words[i].contains((Character.toString(chr)))) count++;
		}
		return count;
	}
	
}
