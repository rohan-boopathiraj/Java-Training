package Assignment1;

public class NumberEx {
	public static void main(String[] args) {
		int input = 15;
		int amstrong = isAmstrong(input);
		int palindrome = isPalindrome(input);
		
		if(amstrong == input) {
			System.out.println("It is an Amstrong Number");
		}
		else if(palindrome == input) {
			System.out.println("It is an Palindrome");
		}
		else {
			System.out.println("Neither Amstrong nor Palindrome");
		}
		
		System.out.println("The prime number btw 1 to 100:");

		for(int i=0; i<101; i++) {
			prime(i);
		}
	}
	
	static int isAmstrong(int input) {

        int n = 153;
        int p = 0;
 
        while (n > 0) {
 
            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }
        return p; 
	}
	
	static int isPalindrome(int input) {
		int remainder, reverse=0;
		while(input>0) {
			remainder = input % 10;
			reverse = (reverse * 10) + remainder;
			input /= 10;
		}
		return reverse;
	}
	
	static void prime(int number) {
		int flag = 0;
		for(int i=1; i<number; i++) {
			if(number % i  == 0) {
				flag++;
			}
		}
			if(flag==1) {
				System.out.println(number);
			}
	
	}
	}
		

