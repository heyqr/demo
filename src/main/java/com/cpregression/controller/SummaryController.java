package com.cpregression.controller;

import com.cpregression.dao.RegressionRunInfo;
import com.cpregression.service.RegressionRunInfoService;
import com.cpregression.service.TestCaseInfoService;
import com.cpregression.utils.ResultVOUtil;
import com.cpregression.viewobject.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/summary")
@Slf4j
public class SummaryController {

    @Autowired
    private RegressionRunInfoService regressionRunInfoService;

    @Autowired
    private TestCaseInfoService testCaseInfoService;

    /*
    // get summary list
    @GetMapping("/all")
    public ResultVO<List<RegressionRunInfo>> list(@RequestParam("openid") String openid,
                                                  @RequestParam(value = "page", defaultValue = "0") Integer page,
                                                  @RequestParam(value = "size", defaultValue = "10") Integer size) {

        PageRequest request = PageRequest.of(page, size);
        Page<RegressionRunInfo> runInfoPage = regressionRunInfoService.list();

        return ResultVOUtil.success(orderDTOPage.getContent());
    }
*/
    @GetMapping("/cp")
    public ModelAndView list(@RequestParam(value = "page", defaultValue = "1") Integer page,
                             @RequestParam(value = "size", defaultValue = "20") Integer size,
                             Map<String, Object> map) {
        PageRequest request = PageRequest.of(page - 1, size);
        Page<RegressionRunInfo> orderDTOPage = regressionRunInfoService.findList(request);
        map.put("orderDTOPage", orderDTOPage);
        map.put("currentPage", page);
        map.put("size", size);
        return new ModelAndView("common/summary", map);
    }


}
