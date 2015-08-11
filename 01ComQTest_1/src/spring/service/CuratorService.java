package spring.service;

import spring.domain.Curator;

public interface CuratorService {
	
	public void addCurator() throws Exception;
	
	public Curator getCurator() throws Exception;
	
	public void delCurator() throws Exception; 
		
	public void updateCurator() throws Exception;
	
}