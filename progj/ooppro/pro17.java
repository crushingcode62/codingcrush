public class MovieDemo {
    public static void main(String[] args) {
        // Create a Movie object
        List actors = new ArrayList<>();
        actors.add("Actor1");
        actors.add("Actor2");

        Movie movie = new Movie("Sample Movie", "Sample Director", actors);

        // Add reviews
        movie.addReview("Excellent movie! Must watch.");
        movie.addReview("The plot was interesting.");

        // Display movie information
        movie.displayMovieInfo();

        // Retrieve and display reviews
        List retrievedReviews = movie.getReviews();
        System.out.println("Retrieved Reviews: " + retrievedReviews);
    }
}
  