package com.qf.pet.web;

import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.service.AnimalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
@Controller
@RequestMapping("/qf.pet/animalDetail")
public class AnimalDetailController {
	@Autowired
    private AnimalDetailService animalDetailService;

	@GetMapping("doglist.do")
    public ResultVO findAllDog
}
