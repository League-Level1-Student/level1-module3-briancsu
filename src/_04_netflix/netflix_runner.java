package _04_netflix;

public class netflix_runner {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Movie1", 5);
		Movie movie2 = new Movie("Movie2", 4);
		Movie movie3 = new Movie("Movie3", 3);
		Movie movie4 = new Movie("Movie4", 2);
		Movie movie5 = new Movie("Movie5", 1);
		movie2.getTicketPrice();
		NetflixQueue net = new NetflixQueue();
		net.addMovie(movie1);
		net.addMovie(movie2);
		net.addMovie(movie3);
		net.addMovie(movie4);
		net.addMovie(movie5);
		net.printMovies();
		net.getBestMovies();
		net.getMovie(1);
		
	}
}
    