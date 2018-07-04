package hw1;

public class PigLatin {

	public static void main(String[] args) {
		int i;
		char c,c2;
		String temp = "";
		for(i=0;i<args.length;i++){
			if(args[i].charAt(0)=='a'||args[i].charAt(0)=='e'||args[i].charAt(0)=='i'||args[i].charAt(0)=='o'||args[i].charAt(0)=='u'){
				c = args[i].toUpperCase().charAt(0);
				args[i] = args[i].substring(1);
				args[i] = c + args[i] + "ay";
			}
			else if(args[i].length()==1){
				args[i] = args[i].toUpperCase() + "ay";
			}
			else{
				c = args[i].charAt(0);
				c2 = args[i].toUpperCase().charAt(1);
				args[i] = c2 + args[i].substring(2) + c + "ay";
			}
			if(i<args.length-1){
				args[i] = args[i] + " ";
			}
			temp = temp + args[i];
		}
		System.out.print(temp);
	}
}
