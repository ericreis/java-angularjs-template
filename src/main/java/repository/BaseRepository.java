package repository;


import repository.config.RepositoryConfig;

import java.sql.*;

/**
 * simple base repository
 * Created by ericreis on 9/27/16.
 */
public class BaseRepository
{
    protected Connection conn;
    protected Statement stmt;

    public BaseRepository()
    {
        try
        {
            Class.forName(RepositoryConfig.JDBC_DRIVER);

            this.conn = DriverManager.getConnection(RepositoryConfig.DB_URL,
                                                    RepositoryConfig.USER,
                                                    RepositoryConfig.PASSWORD);

            this.stmt = this.conn.createStatement();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}