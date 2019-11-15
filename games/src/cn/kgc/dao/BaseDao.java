package cn.kgc.dao;

import java.sql.*;
import java.util.List;

/**
 * base dao class
 */
public class BaseDao {
    //every property objecct
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/games?useUnicode=true&charset=utf-8";
    private static  Connection conn = null;
    private static  PreparedStatement psmt = null;
    private static  ResultSet rs = null;
    private static  int i = 0;

    /**
     * get mysql driver
     */
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * get connection object
     * @return  连接对象
     */
    public static Connection getConnection(){
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * select
     * @param sql
     * @param obj
     * @return  返回结果集
     */
    public static ResultSet getQuery(String sql, List obj){
        try {
            psmt = getConnection().prepareStatement(sql);
            if(obj!=null && obj.size()>0){
                for(int i=0;i<obj.size();i++){
                    psmt.setObject(i+1,obj.get(i));
                }
            }
            rs = psmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    /**
     * add,update ,delete
     * @param sql
     * @param obj
     * @return
     */
    public static int getUpdate(String sql,List obj){
        try {
            psmt = getConnection().prepareStatement(sql);
            if(obj!=null && obj.size()>0){
                for(int i=0;i<obj.size();i++){
                    psmt.setObject(i+1,obj.get(i));
                }
            }
            i = psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static void getClose(){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                conn = null;
            }
        }
        if(psmt!=null){
            try {
                psmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                psmt = null;
            }
        }
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                rs = null;
            }
        }
    }
}
