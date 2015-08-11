package spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import spring.domain.Curator;
import spring.service.CuratorDao;
import spring.service.CuratorService;

@Service("curatorServiceImpl")
public class CuratorServiceImpl implements CuratorService{

	@Autowired
	@Qualifier("curatorDaoImpl")
	private CuratorDao curatorDao;
	public void setCuratorDao(CuratorDao curatorDao) {
		this.curatorDao = curatorDao;
	}
	
	public CuratorServiceImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public void addCurator() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Curator getCurator() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delCurator() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCurator() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
