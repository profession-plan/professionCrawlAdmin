/**
 * @Title: AreaServiceImpl.java
 * @Package com.profession.data.crawl.professionCrawl.service.impl
 * @Description: 区域业务接口实现
 * @author 熊正胜
 * @date 2019年4月5日
 * @version V1.0
 */
package com.profession.data.crawl.professionCrawlAdmin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profession.data.crawl.professionCrawlAdmin.entity.Area;
import com.profession.data.crawl.professionCrawlAdmin.mapper.AreaMapper;
import com.profession.data.crawl.professionCrawlAdmin.service.AreaService;

/**
 * @ClassName: AreaServiceImpl
 * @Description: 区域业务接口实现
 * @author 熊正胜
 * @date 2019年4月5日
 *
 */
@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaMapper areaMapper;
	
	/**
	 * @Title: getArea
	 * @Description: 获取区域对象
	 * @param areaId 区域id
	 * @param @return 参数
	 * @return Area 返回类型
	 * @throws
	 */
	@Override
	public Area getArea(Long areaId) {
		Area area = areaMapper.selectByPrimaryKey(areaId);
		return area;
	}

}
