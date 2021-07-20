package com.example.demo.dao;

import com.example.demo.pojo.Department;
import com.example.demo.pojo.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//员工dao
@Repository
public class EmployeDao {

    private static Map<Integer, Employe> employes=null;
    @Autowired
    private DepartmentDao departmentDao;
    static {
        employes=new HashMap<Integer, Employe>();
        employes.put(1001,new Employe(1001,"AA","1222222@qq.com",1,new Department(101,"教学部")));
        employes.put(1002,new Employe(1002,"BB","1222222@qq.com",0,new Department(101,"市场部")));
        employes.put(1003,new Employe(1003,"CC","1222222@qq.com",1,new Department(101,"教研部")));
        employes.put(1004,new Employe(1004,"DD","1222222@qq.com",0,new Department(101,"运营部")));
        employes.put(1005,new Employe(1005,"EE","1222222@qq.com",1,new Department(101,"后期部")));
    }

    //主键自增
    private  static  Integer initid=1006;
    //增加一个员工
    public void save(Employe employe){
        if(employe.getId()==null){
            employe.setId(initid++);
        }

        employe.setDepartment(departmentDao.getDerpartmentsById(employe.getDepartment().getId()));

        employes.put(employe.getId(),employe);

    }

    //查询全部员工信息
    public Collection<Employe> getAll(){
        return employes.values();
    }

    //通过id查询员工
    public Employe getEmployeById(Integer id){
        return employes.get(id);
    }

    //删除员工通过id
    public void deletd(Integer id){
        employes.remove(id);
    }
}
