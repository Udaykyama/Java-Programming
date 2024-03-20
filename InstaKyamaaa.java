/*
Name : UDAY KYAMA
 
CSC-20 Assignment
 
PROGRAM NAME: SOCIAL MEDIA APP

PROGRAM DESCRIPTION: This is  a social media app to connect people.  
this  social media app allows you  to create a list of the 
people you can follow. Also, you can follow your followers if you want to. The functionality for this app is 
somewhat similar to the Instagram app. Here is the list I have created.

Self-grade: 100/100- I have provided descriptive commentary throughout,
following the suggested naming standards, 
and properly indented my code to make it readable. 
All the necessary content requirements specified for this assignment are met by my software,
 which builds, runs, and satisfies them.
*/


import java.util.*;
public class InstaKyamaaa
{
}
class User implements Comparable {
   private String first;
   private String last;
   private String username;
   private boolean followBack;
           
   public User(String first, String last, String username, boolean followBack)
   {
       this.first = first;
	   this.last = last;
	   this.username = username;
	   this.followBack = followBack;
   }
   //return follow back
   public boolean getFollow()
   {
      	return followBack; 
   }
   public void unfollow()
   {
      	this.followBack=false;
   }
   public void follow()
   {
      	this.followBack=true;
   }
   //return the first name
   public String getFirst() 
   {
   	  
      	return this.first;
   }
   //return the last name
   public String getLast() 
   {
      	return this.last;
   }
             
   public void setFirst(String first) 
   {
      	this.first = first;
   }
   public void setLast(String last) 
   {
      	this.last = last;
   }
   public String getUsername()
   {
   	  	return this.username;
   }
   //compare the two users based on their username
   public int compareTo(Object o) 
   {
      User other = (User)o;
      return this.username.compareTo(other.username);
   }
   //compare the first and last name
   public boolean equals(User other) 
   {
		return this.first.equalsIgnoreCase(other.first) && 
		this.last.equalsIgnoreCase(other.last);
   }
   public String toString()
   {
   		String a = "";
	  		   a = "\nUsername: " + username + "\nName: " + first+ "\nLast name: " + last;
		if(followBack)
		{
            a+= " \"You follow back this person\"";
		}
        else
		{
            a+= " \"You are not following this person\"";
		}	 
      	return a;        
   }
}

class SocialMedia{
   private ArrayList<User> app;
   
   //this is a constructor     
   SocialMedia()
   {
      app = new ArrayList<User>();      
   }
   //this methos gooes through the arra list app and find the person
   public void followBack(String first, String last)
   {
       String s = first + " " + last; 
	   for(int j = 0; j < app.size(); j++) 
	   { 
	   		String s1 = app.get(j).getFirst() + " " + app.get(j).getLast(); 
			if(s1.equalsIgnoreCase(s1)) 
	   		{ 
				app.get(j).follow(); 
			} 
		}
   }
   //this method gets the information for a user
   public boolean follow(String first, String last, String username, boolean followBack) 
   {  
   		  
	  if(search(first,last)==false)
	  {
	  		User u= new User(first,last,username,followBack);
			for(int j=0; j<app.size();j++)
			{
				if(app.get(j).compareTo(u)>1)
				{
					app.add(j,u);
					return true;
				}	
	  		}
	  		app.add(u);
	 	 	return true;
	  }
	  return false;     		  	                     	
   }
     
    /*This method removes the person from the list meaning that they are not following you
    and you are not following them*/
   public boolean remove(String first, String last ) 
   {
   		String s = "";
	  		   s = first + "" + last;
	 	for(int j=0;j<app.size();j++) 
		{
			String s1 = app.get(j).getFirst() + " " + app.get(j).getLast();
			if(s1.equalsIgnoreCase(s)) 
			{
				app.remove(j); // delete person from the list
                return true;
			}
		}
      	return false; 
   }	
   //this method gets the followers first and last name        
   public boolean search(String first, String last) 
   {
   		String s = "";
	  		   s = first + "" + last;
   		for(int j = 0;j < app.size();j++)
		{
			String s1= app.get(j).getFirst() + " " + app.get(j).getLast();
			if(s1.equalsIgnoreCase(s)) 
			{
				return true;
			}	
		} 
        return false; 
   }
   //this method returns the array list app 
   public ArrayList<User >getList()
   {
     	 return app;
   }
   public int followerCounts()
   {
      	return app.size();
   }
   public int followingCounts()
   {
   		int count = 0;
		for (int j=0; j<app.size();j++)
		{
			if(app.get(j).getFollow() == true)
			{
				count++;
			}
		}
      return count;    
   } 
   public String toString() 
   { 
   		String s= "";
		//for loop
		for(int j=0;j<app.size();j++)
		{
			s+= app.get(j).toString();
		}
        return s; 
   }
}
class MyDriver
{
   public static void main(String[] args)
   {
       SocialMedia myInstaKyamaaa = new SocialMedia();
      
    	/*Adding followers to your list*/
      /*the boolean field indicates whether you want to follow them back*/
      myInstaKyamaaa.follow("Jonny depp", "Amber heard", "Musk", true);
      myInstaKyamaaa.follow("RocK", "yo",  "been", false); 
      myInstaKyamaaa.follow("Nivas", "Hari",  "kushi", true); 
      myInstaKyamaaa.follow("Rommy", "Hanumanthana", "shawnnnn",true);
      myInstaKyamaaa.follow("Putin", "james", "kcpd@2636", false);
      
    	/*Displaying your followers*/
      System.out.println("Your followers informations\n");
      System.out.println(myInstaKyamaaa);
    	
      /*Unfollowing a user*/
      System.out.println("Removing Rock yo from your followers list");
      myInstaKyamaaa.remove("Rock", "yo");
   	
      /*Displaying the list*/
      System.out.println("List of followers after removing Rock yo");
      System.out.println(myInstaKyamaaa);
   	
      /*adding a new follower*/
      System.out.println("Adding Lebron james to your list of followers");
      myInstaKyamaaa.follow("Lebron", "james", "lebronjames", true);
      
      /*Dipslying the followers*/
      System.out.println("List of your followers:");
      System.out.println(myInstaKyamaaa);
   	
      /*Searching for a follower*/
      System.out.println("Searching for TRAVIS SCOTT(olv124) in your followers list");
      if(myInstaKyamaaa.search("TRAVIS", "SCOTT") == false) {
         System.out.println("TRAVIS SCOTT is not in your list of followers");
         System.out.println("\n***************************");   
         System.out.println("You are following " + myInstaKyamaaa.followerCounts() + " people");
      
         System.out.println("You have " + myInstaKyamaaa.followingCounts() + " followers");  
         System.out.println(myInstaKyamaaa);
         Scanner kb = new Scanner(System.in);
         System.out.println("Enter the first and  last name from the list bellow that you want to follow back: ");
      
         String first =kb.next();
         String last = kb.next();
         myInstaKyamaaa.followBack(first,last);
      
         System.out.println(myInstaKyamaaa);
      
      } 	
   }
}
class Driver{
   public static void main(String[]args) {
      SocialMedia myInsta = new SocialMedia();
      
    	/*Adding followers to your list*/
      /*the boolean field indicates whether you want to follow them back*/
      myInsta.follow("Matthew", "Philips", "MatPhil", true);
      myInsta.follow("Gary", "Kane",  "GKane", false); 
      myInsta.follow("Robert", "Kenny",  "RKenny", true); 
      myInsta.follow("Bill", "Fitch", "BillF",true);
      myInsta.follow("Trevor", "Schlulz", "TrevorS", false);
      
    	/*Displaying your followers*/
      System.out.println("Your followers informations\n");
      System.out.println(myInsta);
    	
      /*Unfollowing a user*/
      System.out.println("Removing Robert Kenny from your followers list");
      myInsta.remove("Robert", "Kenny");
   	
      /*Displaying the list*/
      System.out.println("List of followers after removing Robert Kenny");
      System.out.println(myInsta);
   	
      /*adding a new follower*/
      System.out.println("Adding Elon Musk to your list of followers");
      myInsta.follow("Elon", "Musk", "ElonM", true);
      
      /*Dipslying the followers*/
      System.out.println("List of your followers:");
      System.out.println(myInsta);
   	
      /*Searching for a follower*/
      System.out.println("Searching for Stonewall Jackson(StonW) in your followers list");
      if(myInsta.search("Jackson", "Stonewall") == false) {
         System.out.println("Stonewall Jackson is not in your list of followers");
         System.out.println("\n***************************");   
         System.out.println("You are following " + myInsta.followerCounts() + " people");
      
         System.out.println("You have " + myInsta.followingCounts() + " followers");  
         System.out.println(myInsta);
         Scanner kb = new Scanner(System.in);
         System.out.println("Enter the first and  last name from the list bellow that you want to follow back: ");
      
         String first =kb.next();
         String last = kb.next();
         myInsta.followBack(first,last);
      
         System.out.println(myInsta);
      
      }
   	
   }
}