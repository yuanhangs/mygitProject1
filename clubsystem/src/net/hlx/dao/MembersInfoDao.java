package net.hlx.dao;

import net.hlx.entity.Membersinfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author HLX
 * @Date 2019/11/15 16:09
 */
public class MembersInfoDao {


    /**
     * 查询所有数据
     * @return
     * @throws SQLException
     */
    public List<Membersinfo> getAll() throws SQLException {
        //sql语句
        String sql = "select * from membersinfo";
        //集合对象
        List<Membersinfo> list = new ArrayList<>();
        //调用方法
        ResultSet rs =BaseDao.getQuery(sql);
        //遍历数据
        while (rs.next()){
            Membersinfo info=new Membersinfo(rs.getInt(1),
                    rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6));
            list.add(info);
        }
        //关闭
        BaseDao.getClose();
        return list;

    }


    /**
     * 查询一条数据
     * @return
     * @throws SQLException
     */
    public Membersinfo findById(int id) throws SQLException {
        //sql语句
        String sql = "select * from membersinfo where id=?";
        //调用方法
        ResultSet rs =BaseDao.getQuery(sql,id);
        //遍历数据
        while (rs.next()){
            Membersinfo info=new Membersinfo(rs.getInt(1),
                    rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6));
         return info;
        }
        //关闭
        BaseDao.getClose();
        return null;

    }



    /**
     * 删除数据
     * @param id
     * @return
     */
    public int del(int id){
        //sql语句
        String sql = "delete from membersinfo where id=?";
        return BaseDao.getUpdate(sql,id);
    }

    /**
     * 修改数据
     * @param info
     * @return
     */
    public int update(Membersinfo info){
        //sql语句
        String sql = "update membersinfo set mname=?,mgender=?,mage=?,maddress=?,memail=? where id=?";
        return BaseDao.getUpdate(sql,info.getMname(),info.getMgender(),info.getMage(),info.getMaddress(),info.getMemail(),info.getId());
    }

}
