package accessmodifiers.mobile;

public class Mobile {
	String book="in book";	
 public void sendMsg()
 {
	 String message="Message Sent";	
	 System.out.println(message);
 }
 private int makeCall( int mobileNumber)
 {
	
	 return mobileNumber;
 }
 
 void saveContact(int number)
 {
	 
	 System.out.println("Contact number:"+number+" is Saved "+book); 
 }
 public static void main(String[] args) {
	 
	Mobile actions=new Mobile();
	actions.sendMsg();
	System.out.println("Call made to:"+actions.makeCall(542671));
	actions.saveContact(564658);
}
}


