package spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import spring.domain.Curator;
import spring.service.CuratorDao;

@Repository("curatorDaoImpl")
public class CuratorDaoImpl implements CuratorDao{
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private Curator curator;
	public void setCurator(Curator curator) {
		this.curator = curator;
	}
	
	public CuratorDaoImpl() {
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
	public void updataCurator() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delCurator() throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
