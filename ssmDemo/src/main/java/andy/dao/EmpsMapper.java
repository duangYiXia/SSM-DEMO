package andy.dao;

import andy.model.Emps;

public interface EmpsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Emps record);

    int insertSelective(Emps record);

    Emps selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Emps record);

    int updateByPrimaryKey(Emps record);
}