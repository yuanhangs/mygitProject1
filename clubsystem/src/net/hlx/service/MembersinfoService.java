package net.hlx.service;

import net.hlx.dao.BaseDao;
import net.hlx.dao.MembersInfoDao;
import net.hlx.entity.Membersinfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author HLX
 * @Date 2019/11/15 15:17
 */
public class MembersinfoService {

    //底层数据
    private MembersInfoDao dao = new MembersInfoDao();

    /**
     * 查询所有数据
     *
     * @return
     * @throws SQLException
     */
    public List<Membersinfo> list() throws SQLException {
        return dao.getAll();
    }


    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    public int delete(int id) {
        return dao.del(id);
    }

    /**
     * 修改数据
     *
     * @param info
     * @return
     */
    public int update(Membersinfo info) {
           return dao.update(info);
    }

    /**
     * 查询数据
     * @param id
     * @return
     * @throws Exception
     */
    public Membersinfo find(int id) throws  Exception {
        return dao.findById(id);
    }

}
