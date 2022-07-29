
/**
 * DirectorsFilter can be used to extract movies directed by either of the specified directors
 * in the method parameter.
 * 
 * @ Umang Kirit Lodaya 
 * @ (25-07-2022)
 */

import java.util.*;

public class DirectorsFilter implements Filter {
    String directorsList;
    
    public DirectorsFilter (String directors) {
        directorsList = directors;
    }
    
    @Override
    public boolean satisfies(String id) {
        String[] directorsSplit = directorsList.split(",");
        for (int i=0; i < directorsSplit.length; i++) {
            if (MovieDatabase.getDirector(id).indexOf(directorsSplit[i]) != -1) {
                return true;
            }
        }
        return false;
    }
}
