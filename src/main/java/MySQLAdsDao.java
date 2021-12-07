import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.Driver;

public class MySQLAdsDao implements Ads {
    private Connection connection;



    public MySQLAdsDao(Config config) {
        try{
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()

        );
    } catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() throws SQLException {
        String selectQuery = "SELECT * FROM ads";
        List<Ad> adList = new ArrayList<>();

        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while(resultSet.next()){
                Ad currentAd = new Ad(resultSet.getLong("id"),
                               resultSet.getString("title"),
                               resultSet.getString("description"));

                        adList.add(currentAd);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return adList;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
