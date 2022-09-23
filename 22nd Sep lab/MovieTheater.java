/*Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie, getMovie where you can create movieName, movieStartTime, movieEndTime,
 MovieTicketPrice as instance variables.*/
package operator;

import java.util.Scanner;

class Movie{
    String movieName;
	double MovieStartTime;
	double MovieEndTime;
	double MovieTicketPrice;
    
	public void getMovie() { //for get name
	System.out.println("movie name:"+movieName);
	System.out.println("movie start time: "+MovieStartTime);
	System.out.println("movie end time:"+MovieEndTime);
	System.out.println("movie ticket price:"+MovieTicketPrice);
}
     //for set the name
    public  void setMovie(String movieName,double MovieStartTime,double MovieEndTime,double MovieTicketPrice) {
    	 this.movieName=movieName;
    	 this.MovieStartTime=MovieStartTime;
    	 this.MovieEndTime=MovieEndTime;
    	 this.MovieTicketPrice=MovieTicketPrice;
         }
}

public class MovieTheater {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Movie ob=new Movie();
		ob.setMovie("RRR", 2.45d, 5.45d, 270.00d);
		ob.getMovie();
	}
}
