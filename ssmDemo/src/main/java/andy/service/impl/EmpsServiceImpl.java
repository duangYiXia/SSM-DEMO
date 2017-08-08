package andy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import andy.dao.EmpsMapper;
import andy.model.Emps;
import andy.service.IEmpsService;

@Service("empsService")  
public class EmpsServiceImpl implements IEmpsService {  
    @Resource  
    private EmpsMapper empsDao;  
    @Override
    public Emps getEmpsById(int id) {  
        // TODO Auto-generated method stub  
        return this.empsDao.selectByPrimaryKey(id);  
    }    
}  
