/**
 * @Title: CrawlProfessionConfigServiceImpl.java
 * @Package com.profession.data.crawl.professionCrawlAdmin.service.impl
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年3月24日
 * @version V1.0
 */
package com.profession.data.crawl.professionCrawlAdmin.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.profession.data.crawl.professionCrawlAdmin.entity.CrawlProfessionConfig;
import com.profession.data.crawl.professionCrawlAdmin.service.CrawlProfessionConfigService;
import com.profession.data.crawl.professionCrawlAdmin.vo.request.crawlConfig.ListRequestParamVo;

/**
 * @ClassName: CrawlProfessionConfigServiceImpl
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年3月24日
 *
 */
@Service
public class CrawlProfessionConfigServiceImpl implements CrawlProfessionConfigService {

	/**
	 * @Title: listCrawlProfessionConfigs
	 * @Description: 查询爬取职业列表
	 * @param requestParamVo 爬虫状态
	 * @return List<CrawlProfessionConfig> 返回类型
	 * @throws
	 */
	@Override
	public List<CrawlProfessionConfig> listCrawlProfessionConfigs(ListRequestParamVo requestParamVo) {
		return null;
	}

}
