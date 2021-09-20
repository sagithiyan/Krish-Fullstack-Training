public class ReverseSentence{


	public static void main(String args[]){


	String sample_sentence = "They will write to you";
	String reversed_sentence = "";


	String[] words = sample_sentence.split("\\s");

	for(int a=words.length-1;a>=0;a--){

	reversed_sentence = reversed_sentence + words[a] + " ";	
	
	}


	System.out.println(reversed_sentence);

}




}