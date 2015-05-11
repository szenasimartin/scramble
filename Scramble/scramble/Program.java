package scramble;

public class Program {
	public String scramble(String input){
		
		String result="";
		//Split the words
		String[] words=input.split(" ");
		String tempWord;
		String tempWord2;
		char firstChar;
		char lastChar;
		String lastS = "";
		boolean endCrop;
		int cropValue;
		int size;
		for(int i=0;i<words.length;i++){
			//Scan every word
			tempWord="";
			tempWord2="";
			lastS="";
			cropValue=1;
			endCrop=false;
			size=words[i].length();
			lastChar=words[i].charAt(size-1);
			firstChar=words[i].charAt(0);
			//The word contains one,two or three letter, don't need reverse
			if(size<4){
				tempWord=words[i]+" ";
			} else {
				//Cut every char from the end of the word, until a valid char
				while(!endCrop){
					lastS=words[i].substring(size-cropValue, size);
					if((lastS.charAt(0)=='.')||
							(lastS.charAt(0)=='?')||
							(lastS.charAt(0)==',')||
							(lastS.charAt(0)=='!')){
						cropValue++;
					} else endCrop=true;
				}
				
					tempWord2= new StringBuilder(words[i].substring(1, size-cropValue)).reverse().toString();
					tempWord=firstChar+tempWord2+lastS+" ";
			}
			//Build the result
			result=result+tempWord;
		}
		result=result.substring(0, result.length()-1);
		return result;
	}

}
