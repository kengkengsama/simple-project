package xbatis.data.sample.mapper;

import xbatis.base.Criteria;
import xbatis.data.sample.entity.Sample;

public interface SampleMapper {

	public Sample get(Criteria criteria);
	
}
