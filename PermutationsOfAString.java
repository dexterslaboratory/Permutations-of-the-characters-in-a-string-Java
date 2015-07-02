import java.io.*;
import java.util.*;
public class PermutationsOfAString {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		char string[]=in.toCharArray();
		perm(string,0,string.length);
	}
	public static void perm(char[] s,int k,int n){
		if(k==n){
			System.out.println( Arrays.toString(s));
		}
		else{
			for(int i=k;i<n;i++){
				swap(i,k,s);
				perm(s,k+1,n);
				swap(i,k,s);
			}
			
		}
	}
	public static void swap(int i,int j,char[] s){
		char temp = s[i];
		s[i]=s[j];
		s[j]=temp;
	}
}
