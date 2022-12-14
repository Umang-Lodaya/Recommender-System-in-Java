
/**
 * GenreFilter can be used to extract movies in specified genre in the method parameter.
 * 
 * @ Umang Kirit Lodaya 
 * @ (25-07-2022)
 */

public class GenreFilter implements Filter {
    private String myGenre;
    
    public GenreFilter (String genre) {
        myGenre = genre;
    }
    
    @Override
    public boolean satisfies(String id) {
        return MovieDatabase.getGenres(id).contains(myGenre);
    }
}
