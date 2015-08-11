package spring.service;

import spring.domain.Curator;

public interface CuratorDao {

	public void addCurator() throws Exception;
	
	public Curator getCurator() throws Exception;
	
	public void updataCurator() throws Exception;
	
	public void delCurator() throws Exception;
	
}
