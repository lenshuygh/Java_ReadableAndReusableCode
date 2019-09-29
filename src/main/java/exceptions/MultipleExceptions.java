package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultipleExceptions {
    public static void main(String[] args) {

        // too long
        try {
            readFile();
            executeSqlQuery();
        } catch (FileNotFoundException ex) {
            // handle it
        } catch (IOException e) {
            // handle it
        } catch (SQLException e) {
            //handle it
        }

        // not OK at all because some exceptions shouldn't be caught (runtime -> nullpointer)
        try{
            readFile();
            executeSqlQuery();
        }catch (Exception e){
            // one exception to rule them all
        }

        // better
        try{
            readFile();
            executeSqlQuery();
        }catch (IOException | SQLException ex) {
            // handle it Java7 way
        }
    }

    private static void executeSqlQuery() throws SQLException{
    }

    private static void readFile() throws FileNotFoundException {
    }
}
