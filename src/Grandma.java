
public class Grandma {
	
	public String canGrandmaHearYou() {
		int randomNumber = (int) (Math.random() * 5);
		
		//logic to determine if she can hear you
		
		String SheCantHearsYouArr[] = new String[5];
		SheCantHearsYouArr[0] = "HUH? SPEAK UP HONEY";
		SheCantHearsYouArr[1] = "YOU'RE SO FUNNY";
		SheCantHearsYouArr[2] = "... NO, YOU NEED A NAP";
		SheCantHearsYouArr[3] = "WAIT, WHO ARE YOU AGAIN? ";
		SheCantHearsYouArr[4] = "OH HONEY! OF COURSE YOU CAN HAVE CAKE ";
		
	    return SheCantHearsYouArr[randomNumber];
	}
	
	public String grandmaResponse() {
		//logic to determine a response 
		
		String grannyArr[] = new String[5];
		grannyArr[0] = "HUH WHY ARE YOU YELLING AT ME? ";
		grannyArr[1] = "OH YEAH. I LOVE ALIEN TOO! ";
		grannyArr[2] = "NO, NOT SINCE THE WAR? ";
		grannyArr[3] = "IS THAT A NEW WAY OF TALKING TO YOUR GRANNY? ";
		grannyArr[4] = "OH, I CAN HEAR YOU, BUT MY HEARING AIDS ARE ON VACATION TODAY ";
		
		int randomNumber = (int) (Math.random() * grannyArr.length);
		String grandmaResponds = grannyArr[randomNumber];	
		
		
		return grandmaResponds;
		
	}
	

}
